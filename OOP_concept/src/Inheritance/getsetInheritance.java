package Inheritance;
class Rectangular{
	int len;
	int wid;
	int hie;
	
	public void setHie(int hie) {
		this.hie = hie;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	
	public void area() {
		System.out.println("Area of Rectangle is "+(len*wid));
	}
	
	public void volume() {
		System.out.println("Volume of rectangle is "+(len*wid*hie));
	}
}
class cuboid extends Rectangular{
	public cuboid() {

	}

	public void areaCub(){
		System.out.println("Area of Cuboid is "+((2*len*wid)+(2*len*hie)+(2*wid*hie)));
	}
	public void volumecub() {
		System.out.println("Volume of Cuboid is "+(len*wid*hie));
}
}
public class getsetInheritance {

	public static void main(String[] args) {
		cuboid C =new cuboid();
		C.area();
		C.areaCub();
		C.volume();

	}

}

