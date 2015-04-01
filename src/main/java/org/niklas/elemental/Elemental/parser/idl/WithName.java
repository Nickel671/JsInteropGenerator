package org.niklas.elemental.Elemental.parser.idl;

public abstract class WithName {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return getName();
	}
}
