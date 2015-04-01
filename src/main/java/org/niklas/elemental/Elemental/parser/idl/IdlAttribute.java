package org.niklas.elemental.Elemental.parser.idl;


public class IdlAttribute extends WithNameAndType{

	private boolean onlyGetter = false;
	private boolean conatinsObjectType = false;
	
	

	public boolean isOnlyGetter() {
		return onlyGetter;
	}
	public void setOnlyGetter(boolean onlyGetter) {
		this.onlyGetter = onlyGetter;
	}
	public boolean isConatinsObjectType() {
		return conatinsObjectType;
	}
	public void setConatinsObjectType(boolean conatinsObjectType) {
		this.conatinsObjectType = conatinsObjectType;
	}
}
