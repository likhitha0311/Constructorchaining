package ArrayListPackage;

public class Placestovisit 
{
private String place;
private double distance;

public Placestovisit(String place, double distance) 
{
	
	this.place = place;
	this.distance = distance;
}

public String getPlace() {
	return place;
}

public double getDistance() {
	return distance;
}

@Override
public String toString() {
	return "Placestovisit [place=" + place + ", distance=" + distance + "]";
}

}
