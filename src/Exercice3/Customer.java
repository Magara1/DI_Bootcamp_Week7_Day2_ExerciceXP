package Exercice3;

public class Customer {
	
	//class attributes
	
	private int ID;
	
	private String name;
	
	private char gender;

	
	//constructor without parametrer
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructor with parametrer
	
	public Customer(int iD, String name, char gender) {
		super();
		ID = iD;
		this.name = name;
		this.gender = gender;
	}
	
	
	//getters and setters
	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.name+ "(" + this.ID + ")" + ")";
	}
	
	

	
	
	
	

}
