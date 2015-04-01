package org.niklas.elemental.Elemental.parser.idl;


public abstract class WithNameAndType extends WithName{
	private String type;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		
		
		this.type = type;
	}
	public String toString() {
		return getType()+" "+getName();
	}
}
