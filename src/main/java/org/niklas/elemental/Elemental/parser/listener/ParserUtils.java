package org.niklas.elemental.Elemental.parser.listener;

import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class ParserUtils {

	public static String getType(ParserRuleContext ctx,HashMap<String,String> typeDef){
		IdlTypeListener listener = new IdlTypeListener(typeDef);
		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(listener, ctx);
		return listener.getTypeValue();
	}
}
