package org.niklas.elemental.Elemental.parser.listener;

import java.util.HashMap;

import org.niklas.elemental.Elemental.parser.WebIdlBaseListener;
import org.niklas.elemental.Elemental.parser.WebIdlParser;
import org.niklas.elemental.Elemental.parser.WebIdlParser.ReturntypeContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.SingletypeContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.UniontypeContext;

public class IdlTypeListener extends WebIdlBaseListener{
	private String typeValue = "Object";
	private HashMap<String,String> typeDef;
	public IdlTypeListener(HashMap<String,String> typeDef) {
		this.typeDef = typeDef;
	}
	@Override
	public void enterSingletype(SingletypeContext ctx) {
		
		String queryString = ctx.getText().replace("?", "");
		if(typeDef.containsKey(queryString)){
			typeValue = typeDef.get(queryString);
		}
	}
	@Override
	public void enterUniontype(UniontypeContext ctx) {
		typeValue = "Object";
	}
	
	@Override
	public void enterReturntype(ReturntypeContext ctx) {
		if(ctx.getText().equals("void"))
			typeValue = "void";
	}
	public String getTypeValue() {
		return typeValue;
	}
	
}
