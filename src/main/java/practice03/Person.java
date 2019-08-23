//写一个Person类，要有name，age属性，
//要有一个introduce方法， introduce方法返回一个字符串形如：
//My name is Tom. I am 21 years old.

//package practice01;
//
//public class Person {
//	public void introduce() {
 //	}
//}
package practice03;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getAge() {
		return age;
	}
//	public void setAge(int age) {
//		this.age = age;
//	}	
	public String introduce() {
		return String.format("My name is %s. I am %d years old.", this.name, this.age);
	}
}
