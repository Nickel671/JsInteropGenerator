package org.niklas.elemental.Elemental.parser.listener;

import java.util.ArrayList;
import java.util.HashMap;

import org.niklas.elemental.Elemental.parser.WebIdlBaseListener;
import org.niklas.elemental.Elemental.parser.WebIdlParser;
import org.niklas.elemental.Elemental.parser.WebIdlParser.ArgumentContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.ArgumentNameContext;
import org.niklas.elemental.Elemental.parser.WebIdlParser.TypeContext;
import org.niklas.elemental.Elemental.parser.idl.IdlOperationArgument;

public class IdlArgumentListener extends WebIdlBaseListener{

	private ArrayList<IdlOperationArgument> arguments = new ArrayList<IdlOperationArgument>();
	private IdlOperationArgument current;
	private HashMap<String,String> typeDef;
	private boolean containsObjectType = false;
	public IdlArgumentListener(HashMap<String,String> typeDef) {
		this.typeDef = typeDef;
	}
	@Override
	public void enterArgument(ArgumentContext ctx) {
		current = new IdlOperationArgument();
	}
	
	@Override
	public void enterType(TypeContext ctx) {
		current.setType(ParserUtils.getType(ctx,typeDef));
		
	}
	
	@Override
	public void enterArgumentName(ArgumentNameContext ctx) {
		current.setName(ctx.getText());
	}
	@Override
	public void exitArgument(ArgumentContext ctx) {
		arguments.add(current);
		if(current.getType().equals("Object")) containsObjectType = true;
	}

	public ArrayList<IdlOperationArgument> getArguments() {
		return arguments;
	}
	public boolean isContainsObjectType() {
		return containsObjectType;
	}
	public void setContainsObjectType(boolean containsObjectType) {
		this.containsObjectType = containsObjectType;
	}
}
