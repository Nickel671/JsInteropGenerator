package org.niklas.elemental.Elemental.parser;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.SSLContextBuilder;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WhatwgFetcher {
	CloseableHttpClient httpclient;

	private final String url = "https://html.spec.whatwg.org/";
	private final String urlDom = "https://dom.spec.whatwg.org/";
	public WhatwgFetcher(){
		try {
			httpclient = HttpClients.custom().
			        setHostnameVerifier(new AllowAllHostnameVerifier()).
			        setSslcontext(new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy()
			        {
			            public boolean isTrusted(X509Certificate[] arg0, String arg1) throws CertificateException
			            {
			                return true;
			            }
			        }).build()).build();
		} catch (KeyManagementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		extractHtmlIdl(url,"HTML");
		extractHtmlIdl(urlDom,"Dom");
	}
	private void extractHtmlIdl(String url,String name) {
		String rawHtml = urlRequest(url);
		Document doc = Jsoup.parse(rawHtml);
		Elements idlClasses = doc.getElementsByClass("idl");
		
		StringBuilder builder = new StringBuilder();
		
		idlClasses.forEach(e -> builder.append(e.text()+"\n"));
		saveIdlFile(name+".webidl",builder.toString());
	}
	public void saveIdlFile(String name,String file){
		String pathName = "src/main/resources/org/niklas/elemental/Elemental/idls/"+name;
		try{
			File a = new File(pathName);
			
			
			a.createNewFile();
			PrintWriter out = new PrintWriter(a);
			out.print(file);
			out.flush();
		}catch(Exception e){
			
		}
	}
	private String urlRequest(String url) {
		HttpGet httpGet = new HttpGet(url);
		CloseableHttpResponse response1;
		String ret = "";
		try {
			response1 = httpclient.execute(httpGet);
			 HttpEntity entity1 = response1.getEntity();
			 ret = EntityUtils.toString(entity1);
			 response1.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return ret;
		
	}
}
