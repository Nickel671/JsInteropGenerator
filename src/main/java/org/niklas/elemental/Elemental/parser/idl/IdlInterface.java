package org.niklas.elemental.Elemental.parser.idl;

import java.util.ArrayList;
import java.util.HashMap;

public class IdlInterface extends WithName{
	
	private ArrayList<String> extender = new ArrayList<String>();
	private ArrayList<IdlAttribute> attributes = new ArrayList<IdlAttribute>();
	private ArrayList<IdlOperation> operations = new ArrayList<IdlOperation>();
	
	public ArrayList<String> getExtender() {
		return extender;
	}
	public ArrayList<IdlAttribute> getAttributes() {
		return attributes;
	}
	public ArrayList<IdlOperation> getOperations() {
		return operations;
	}
	
	
}
