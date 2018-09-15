
public class Dog extends Animal {
	
	String name;
	
	Dog(String dogName, int legNum){
		this.name = dogName;
		this.legs = legNum;
	}
	
	public String toString(){
		return this.name;
	}
}
