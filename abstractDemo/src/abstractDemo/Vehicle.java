package abstractDemo;

abstract class Vehicle {
	 abstract void start();

}

class Car extends Vehicle{
	 void start() {
		 System.out.println(" start with key");
	 }
}
class  Scooter extends Vehicle{
	void start() {
		System.out.println(" start with kick");
		
	}
	public static void main(String[] args) {
		Vehicle v= new Scooter();
		v.start();
		Scooter sc=new Scooter();
		
		sc.start();
		
		Car c=new Car();
		c.start();
		
	
	}
	
}

