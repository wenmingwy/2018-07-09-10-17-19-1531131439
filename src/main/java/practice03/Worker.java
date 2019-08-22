package practice03;
public class Worker extends Person{
	public Worker(String name, int age) {
		super(name, age);
	}
	//重写注解
	@Override
	public String introduce() {
		return String.format("I am a Worker. I have a job.");
	}
}
