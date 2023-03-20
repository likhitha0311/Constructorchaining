package Composition;

public class MainBedroom {

	public static void main(String[] args) {
		
		Wall wall1 = new Wall("West");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("North");
		 
		Ceiling ceiling = new Ceiling(12, 55);
		 
		Bed bed = new Bed("Modern", 4, 3, 2, 1);
		 
		Lamp lamp = new Lamp("Classic", false, 75);
		 
		BedRoom bedRoom = new BedRoom("Likhitha", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
		bedRoom.makeBed();
		 
		bedRoom.getLamp().turnOn();
	

	}

}

class Lamp{
private	String style;
private		boolean battery ;
private		int globRating;
public Lamp(String style, boolean battery, int globRating) 
{
	
	this.style = style;
	this.battery = battery;
	this.globRating = globRating;
}
public String getStyle() {
	return style;
}

public boolean isBattery() {
	return battery;
}

public int getGlobRating() {
	return globRating;
}

public void turnOn()
{
	System.out.println("Lamp is turned on");
}



}

class Bed{
	private  String style;
	private int pillows, height, sheets, quilt ;
	public Bed(String style, int pillows, int height, int sheets, int quilt) {
		super();
		this.style = style;
		this.pillows = pillows;
		this.height = height;
		this.sheets = sheets;
		this.quilt = quilt;
	}
	public String getStyle() {
		return style;
	}
	public int getPillows() {
		return pillows;
	}
	public int getHeight() {
		return height;
	}
	public int getSheets() {
		return sheets;
	}
	public int getQuilt() {
		return quilt;
	}
	
	public void make()
	{
		System.out.println("Bed is prepared");
}
}

class Ceiling{
	private int  height ;
	private int paintedColor;
	public Ceiling(int height, int paintedColor) {
		super();
		this.height = height;
		this.paintedColor = paintedColor;
	}
	public int getHeight() {
		return height;
	}
	public int getPaintedColor() {
		return paintedColor;
	}
	
	
}

class Wall{
	private String direction;

	public Wall(String direction) {
		super();
		this.direction = direction;
	}

	public String getDirection() {
		return direction;
	}
	
}