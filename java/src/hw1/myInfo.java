package hw1;

public class myInfo {
	private String lastName;
	private String firstName;
	private int age;
	private String gender;
	
	public void setName(String first, String last){
		this.lastName=last;
		this.firstName=first;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public void setGender(String sex){
		this.gender=sex;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public String getGender(){
		return this.gender;
	}
}
