public class AreOfTriangle {
	double area,height,base;
	public void area(double area,double height,double base) {
		this.area=area;
		this.height=height;
		this.base=base;
	}
	public void area(double base,double height ) {
		double area=(0.5*base*height);
		System.out.println("Area= "+area);
		
	}

}
