package org.niklas.elemental.Elemental.parser.listener;

import java.util.HashMap;

import org.niklas.elemental.Elemental.parser.WebIdlBaseListener;
import org.niklas.elemental.Elemental.parser.WebIdlParser.CallbackRestContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.DictionaryContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.Enum1Context;
import org.niklas.elemental.Elemental.parser.WebIdlParser.Interface1Context;
import org.niklas.elemental.Elemental.parser.WebIdlParser.TypedefContext;

public class SupportedTypPreListener extends WebIdlBaseListener{
	private HashMap<String, String> typeMapper = new HashMap<String, String>();
	public SupportedTypPreListener() {
		typeMapper.put("boolean", "boolean");
		typeMapper.put("byte", "byte");
		typeMapper.put("octet", "byte");
		typeMapper.put("short", "short");
		typeMapper.put("unsignedshort", "short");
		typeMapper.put("long", "int");
		typeMapper.put("unsignedlong", "int");
		typeMapper.put("longlong", "long");
		typeMapper.put("unsignedlonglong", "long");
		typeMapper.put("float", "float");
		typeMapper.put("unrestrictedfloat", "float");
		typeMapper.put("double", "double");
		typeMapper.put("unrestricteddouble", "double");
		typeMapper.put("DOMString", "String");
		typeMapper.put("any","Object");
		typeMapper.put("void", "void");
		typeMapper.put("Object", "Object");
		typeMapper.put("date", "java.util.Date");
		typeMapper.put("DOMTimeStamp", "Object");
		typeMapper.put("sequence", "Object");
	}
	
	@Override
	public void enterInterface1(Interface1Context ctx) {
		insertNewType(ctx.Identifier().getText(), ctx.Identifier().getText());
	}
	
	@Override
	public void enterDictionary(DictionaryContext ctx) {
		
	}
	
	@Override
	public void enterCallbackRest(CallbackRestContext ctx) {
		insertNewType(ctx.Identifier().getText(),ctx.Identifier().getText());
	}

	
	
	@Override
	public void enterTypedef(TypedefContext ctx) {
		
		if(ctx.type().singletype() == null){
			insertNewType(ctx.Identifier().getText(), "Object");
		}else{
			if(!ctx.type().singletype().getText().contains("sequence"))
			insertNewType(ctx.Identifier().getText(), ctx.type().singletype().getText().replace("?", ""));
		}
	}
	@Override
	public void enterEnum1(Enum1Context ctx) {
		insertNewType(ctx.Identifier().getText(), "String");
	}
	
	private void insertNewType(String key,String value) {
		if(!typeMapper.containsKey(key))
			typeMapper.put(key, value);
	}
	
	public HashMap<String, String> getTypeMapper() {
		return typeMapper;
	}
}
