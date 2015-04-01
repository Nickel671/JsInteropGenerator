package org.niklas.elemental.Elemental.parser.idl;

import java.util.ArrayList;

public class IdlOperation extends WithNameAndType{
	private ArrayList<IdlOperationArgument> arguments = new ArrayList<IdlOperationArgument>();
	private boolean containsObjectType = false;
	public ArrayList<IdlOperationArgument> getArguments() {
		return arguments;
	}
	public void setArguments(ArrayList<IdlOperationArgument> arguments) {
		this.arguments = arguments;
	}
	public boolean isContainsObjectType() {
		return containsObjectType;
	}
	public void setContainsObjectType(boolean containsObjectType) {
		this.containsObjectType = containsObjectType;
	}
}
