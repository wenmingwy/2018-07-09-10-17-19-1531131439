package practice06;

import practice06.Person;

public class Teacher extends Person{
	private int klass;

	public Teacher(String name, int age, int klass) {
		super(name, age);
		this.klass = klass;
	}

	
	public Teacher(String name, int age) {
		super(name, age);
	}


	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}

	@Override
	public String introduce() {
		if(klass == 0) {
			return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", this.getName(), this.getAge());
		} else {
			return String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", this.getName(), this.getAge(), this.klass);
		}
		
	}
}
