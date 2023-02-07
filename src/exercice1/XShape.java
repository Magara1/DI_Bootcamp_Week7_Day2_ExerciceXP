package exercice1;

class XShape extends Shape {

	  private String name;
	  
	// Default Constructor

	  public XShape(String name){ 
		  
		  super(name);
	        this.name = name;
	  }

	  // Overridden Method
	  public String getName() {
	    // write your code here

	    return super.getName() + this.name ;
	  }

	}