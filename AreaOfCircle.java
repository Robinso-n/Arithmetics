package oop;
class Area1{
	double area,radius;
	
	
	public Area1(double area) {
		this.area=area;
	}
	
	public void Area(double radius) {
		area=((3.142)*(radius*radius));
		System.out.println("The Area of a circle of Radius "+radius+" is: "+area);
		
	}
}
class AreaOfCircle{
	public static void main(String[] args) {
		Area1 A =new Area1(0);
		A.Area(14.0);
		
	
}}