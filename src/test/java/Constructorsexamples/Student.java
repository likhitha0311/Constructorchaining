package Constructorsexamples;

public class Student 
{
private String id;
private String name;
private int age;
private String section;

public Student(String id, String name, int age, String section) {

	this.id = id;
	this.name = name;
	this.age = age;
	this.section = section;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", section=" + section + "]";
}




}
