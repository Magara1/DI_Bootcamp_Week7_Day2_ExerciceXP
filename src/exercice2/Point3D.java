package exercice2;

public class Point3D extends Point2D {
	
	private float z = 0.0f;

	public Point3D() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
		// TODO Auto-generated constructor stub
	}

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	//class method
	
	public void setXYZ(float x, float y, float z) {
		setXY(x, y);
		this.z = z;
	}
	
	public float[]getXYZ(){
		return new float[] {getX(), getY(), this.z};
	}
	
	

}
