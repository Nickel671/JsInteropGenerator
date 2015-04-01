package org.niklas.elemental.Elemental.parser.listener;

import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.niklas.elemental.Elemental.parser.WebIdlBaseListener;
import org.niklas.elemental.Elemental.parser.WebIdlParser;
import org.niklas.elemental.Elemental.parser.WebIdlParser.AttributeContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.CallbackRestContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.ImplementsStatementContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.InheritanceContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.Interface1Context;
import org.niklas.elemental.Elemental.parser.WebIdlParser.OperationContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.TypedefContext;
import org.niklas.elemental.Elemental.parser.idl.IdlAttribute;
import org.niklas.elemental.Elemental.parser.idl.IdlInterface;
import org.niklas.elemental.Elemental.parser.idl.IdlOperation;



public class IdlListener extends WebIdlBaseListener {
	HashMap<String, IdlInterface> interfaces;
	HashMap<String,String> typeDef;
	public IdlListener(HashMap<String, IdlInterface> interfaces,HashMap<String,String> typeDef){
		this.interfaces = interfaces;
		this.typeDef = typeDef;
	}
	
	IdlInterface current;
	
	@Override
	public void enterInterface1(Interface1Context ctx) {
		String interfaceName = ctx.Identifier().toString();
		if(interfaces.containsKey(interfaceName)){
			current = interfaces.get(interfaceName);
		}else{
			current = new IdlInterface();
			current.setName(interfaceName);
			interfaces.put(interfaceName, current);
		}
	}
	
	@Override
	public void enterInheritance(InheritanceContext ctx) {
		if(ctx.Identifier() != null && current != null && typeDef.containsKey(ctx.Identifier().getText()))
			current.getExtender().add(typeDef.get(ctx.Identifier().getText()));
	}
	
	@Override
	public void enterAttribute(AttributeContext ctx) {
		try{
			IdlAttribute attribute = new IdlAttribute();
			attribute.setName(ctx.Identifier().getText());
			attribute.setType(ParserUtils.getType(ctx.type(),typeDef));
			if(attribute.getType().equals("Object"))
				attribute.setConatinsObjectType(true);
			if(ctx.readOnly().getText().equals("readonly"))
				attribute.setOnlyGetter(true);
			current.getAttributes().add(attribute);
		}
		catch(Exception e){}
	}
	
	@Override
	public void enterOperation(OperationContext ctx) {
		IdlArgumentListener argList = new IdlArgumentListener(typeDef);
		if(ctx.operationRest().argumentList() != null){
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(argList, ctx.operationRest().argumentList());
		}
		IdlOperation operation = new IdlOperation();
		operation.setName(ctx.operationRest().optionalIdentifier().getText());
		operation.setType(ParserUtils.getType(ctx.operationRest().returntype(),typeDef));
		operation.setArguments(argList.getArguments());
		if(argList.isContainsObjectType() || operation.getType().equals("Object"))
			operation.setContainsObjectType(true);
		current.getOperations().add(operation);
	}
	
	@Override
	public void enterImplementsStatement(ImplementsStatementContext ctx) {
		String interfaceName = ctx.Identifier(0).getText();
		if(interfaces.containsKey(interfaceName)){
			current = interfaces.get(interfaceName);
		}else{
			current = new IdlInterface();
			current.setName(interfaceName);
			interfaces.put(interfaceName, current);
		}
		if(typeDef.containsKey(ctx.Identifier(1).getText()))
		current.getExtender().add(typeDef.get(ctx.Identifier(1).getText()));
	}
	
	@Override
	public void enterCallbackRest(CallbackRestContext ctx) {
		String interfaceName = ctx.Identifier().toString();
		if(interfaces.containsKey(interfaceName)){
			current = interfaces.get(interfaceName);
		}else{
			current = new IdlInterface();
			current.setName(interfaceName);
			interfaces.put(interfaceName, current);
		}
		IdlOperation runOperation = new IdlOperation();
		runOperation.setName("run");
		IdlArgumentListener argList = new IdlArgumentListener(typeDef);
		if(ctx.argumentList() != null){
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(argList, ctx.argumentList());
		}
		runOperation.setArguments(argList.getArguments());
		runOperation.setType(ParserUtils.getType(ctx.returntype(),typeDef));
		current.getOperations().add(runOperation);
	}
	
	
	
	
	
	
	
	
}
