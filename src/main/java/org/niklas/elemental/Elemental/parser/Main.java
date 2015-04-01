package org.niklas.elemental.Elemental.parser;




import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.niklas.elemental.Elemental.codegenerator.InterfaceCreator;
import org.niklas.elemental.Elemental.parser.idl.IdlInterface;
import org.niklas.elemental.Elemental.parser.listener.IdlListener;




import org.niklas.elemental.Elemental.parser.listener.SupportedTypPreListener;

import com.google.gwt.thirdparty.guava.common.base.Charsets;








public class Main {

	private static String folderPath = "../Elemental/src/main/resources/org/niklas/elemental/Elemental/idls/";
	public static void main(String[] args) {
		
		InterfaceCreator creator = new InterfaceCreator();
		//new WhatwgFetcher();
		//new WebIdlMozillaFetcher().fetchWebIdl();
		String data = mergeFiles();
		HashMap<String, IdlInterface> interfaces = new HashMap<String, IdlInterface>();
		parseFile(data,interfaces);
		interfaces.values().forEach(e -> creator.createJsInterop(e));
		
	}
	
	static String mergeFiles(){
		StringBuilder builder = new StringBuilder();
		try {
			Files.walk(Paths.get(folderPath)).forEach(file -> {
				if(Files.isRegularFile(file)){
					
					try {
						String fileData = readFile(file.toString(),Charsets.UTF_8);
						builder.append(fileData+"\n");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return builder.toString();
	}
	static void parseFile(String data,HashMap<String, IdlInterface> interfaces){
		
		
			WebIdlLexer lexer = new WebIdlLexer(new ANTLRInputStream(data));
			WebIdlParser parser = new WebIdlParser(new CommonTokenStream(lexer));
			
			ParseTree tree = parser.definitions();
			
			ParseTreeWalker walker = new ParseTreeWalker();
			SupportedTypPreListener typeParser = new SupportedTypPreListener();
			walker.walk(typeParser, tree);
			walker.walk(new IdlListener(interfaces,typeParser.getTypeMapper()), tree);
			
		
	}
	static String readFile(String path, Charset encoding) 
			  throws IOException 
			{
				
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, encoding);
			}

}
