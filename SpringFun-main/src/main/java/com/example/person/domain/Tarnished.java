package com.example.person.domain;

public class Tarnished {

	private Integer ID;
	private String Name;
	private Integer Maidens;
	private Boolean GraceTouched;
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Tarnished [ID=" + ID + ", Name=" + Name + ", Maidens=" + Maidens + ", GraceTouched=" + GraceTouched
				+ ", getID()=" + getID() + ", getName()=" + getName() + ", getMaidens()=" + getMaidens()
				+ ", getGraceTouched()=" + getGraceTouched() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Tarnished(Integer iD, String name, Integer maidens, Boolean graceTouched) {
		super();
		ID = iD;
		Name = name;
		Maidens = maidens;
		GraceTouched = graceTouched;
	}
	public Integer getMaidens() {
		return Maidens;
	}
	public void setMaidens(Integer maidens) {
		Maidens = maidens;
	}
	public Boolean getGraceTouched() {
		return GraceTouched;
	}
	public void setGraceTouched(Boolean graceTouched) {
		GraceTouched = graceTouched;
	}
}
