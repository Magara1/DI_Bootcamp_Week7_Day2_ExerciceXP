package Exercice3;

import java.text.DecimalFormat;

public class Account {
	
	//class attributes
	
	private int id;
	
	private Customer customer;
	
	private double balance = 0;
	
	
	//constructor
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
			
	}

// constructor with parameters
	
	public Account(int id, Customer customer, double balance) {
		super();
		this.id = id;
		this.customer = customer;
		this.balance = balance;
	}
	
	//getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//to String
	
	@Override
	public String toString() {
	     //this.custumer.toString() + "balance=$ " + this.balance;
        DecimalFormat df = new DecimalFormat("0.00");
        return this.customer.toString() + "balance=$"+ df.format(this.balance);
		}
	
	public String getCustomerName() {
		return this.customer.getName();
	}
	
	public Account deposit(double amount) {
		this.balance += amount;
		
		return this;
	}
	
	
	
	 public Account withdraw(double amount) {
	        if (this.balance >= amount) {
	            this.balance -= amount;
	        } else {
	            System.out.println("\"amount withdrawn\n"
	                    + "exceeds the curent balance!\"");
	        }

	        return this;
	    }
	
	
	
	}


	

