package ca.ciccc.java.model;

public enum DressCode {

	JERSEY("jersey"), FANCY("fancy"), ANYTHING("anything"), UNIFORM("uniform");

	private String description;

	private DressCode(String s) {

		this.description = s;

	}

	public String getString() {

		return description;

	}

}
