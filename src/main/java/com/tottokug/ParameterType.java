package com.tottokug;

public enum ParameterType {
	STRING("String"), NUMBER("Number");

	String type;

	private ParameterType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.type;
	}

}
