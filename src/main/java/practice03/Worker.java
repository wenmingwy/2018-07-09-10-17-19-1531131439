package practice03;
import practice03.Person;

public class Worker extends Person{
	private String Worker = "Worker";
	private String job = "job";

	public Worker(String name , int age) {
		super(name,age);
	}

	@Override
	public String introduce() {
		 return String.format("I am a %s. I have a %s.", Worker,job);
	}
}

 
