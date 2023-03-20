package Constructorsexamples;

public class MainWallArea {

	public static void main(String[] args) {
		
		WallArea wall = new WallArea(2.3,8.9);
		System.out.println("area= " + wall.getArea());
		 
		 wall.setHeight(-1.5);
		System.out.println("width= " + wall.getWidth());
		 System.out.println("height= " + wall.getHeight());
		System.out.println("area= " + wall.getArea());
	}

}
