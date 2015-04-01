package org.niklas.elemental.Elemental.parser;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class WebIdlMozillaFetcher {
	
	private final String url = "http://mxr.mozilla.org/mozilla-central/";
	CloseableHttpClient httpclient = HttpClients.createDefault();
	public WebIdlMozillaFetcher(){
		
	}
	
	
	public void fetchWebIdl() {
		String repository = urlRequest("source/dom/webidl/");
		List<String> urlsToIDLS = getAllWebIdlsUrls(repository);
		urlsToIDLS.forEach(string -> saveIdlFile(string,urlRequest(string)));
		
	}
	
	public void saveIdlFile(String name,String file){
		if(name.contains("Moz")) return;
		name = name.replace("source/dom/webidl/", "").replace("?raw=1", "");
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
	
	private List<String> getAllWebIdlsUrls(String s){
		Pattern pattern = Pattern.compile("source/dom/webidl/+\\w+[.]webidl");
		Matcher matcher = pattern.matcher(s);
		ArrayList<String> ret = new ArrayList<String>();
		while(matcher.find()){
			ret.add(matcher.group()+"?raw=1");
		}
		return ret;
	}
	
	private String urlRequest(String url) {
		HttpGet httpGet = new HttpGet(this.url+url);
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
