package exercice2;

public class Point2D {
	//class attributes
	
	private float x = 0.0f;
	
	private float y = 0.0f;

	//constructeur par defaut
	
	public Point2D() {
		super();
		// TODO Auto-generated constructor stub
	}

	//constructeur avec parametres
	
	public Point2D(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	//class method
	
	public void setXY(float x,float y) {
		this.setX(x);
		this.setY(y);
	}
	
	
	public float[] getXY() {
		return new float[] {this.x, this.y};
	}
	
	//toString
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + this.x + " , " + this.y + ")";
	}
	
	
	
	

}
