
abstract public class Animal implements Comparable<Animal> {
	int legs;
	
	public int getLegs(){
		return this.legs;
	}
	public int compareTo(Animal a){
		return this.legs - a.legs;
	}
}
