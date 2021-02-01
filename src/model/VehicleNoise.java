import model.Bus;
import model.Car;
import model.Minivan;
import model.Train;
import model.Motorcycle;
import model.MuscleCar;
import model.Aircraft;
import model.Bicycle;
import model.Limo;
import model.Truck;
import model.Unicycle;

public class VehicleNoise {
	//add your vehicle class to the model package
	//only push this file and the vehicle class you created

	public static void main(String[] args) {
		Car honda = new Car();
		System.out.println(honda.makeNoise());
    
		Minivan toyota = new Minivan();
		System.out.println(toyota.makeNoise());

		Bus bus = new Bus();
		System.out.println(bus.makeNoise());
		
		Aircraft helicopter = new Aircraft();
		System.out.println(helicopter.makeNoise());
		
		Train trainy = new Train();
		System.out.println(trainy.makeNoise());

		Motorcycle indian = new Motorcycle();
		System.out.println(indian.makeNoise());
		
		Limo convertibleLimo = new Limo();
		System.out.println(convertibleLimo.noise());
		
		Truck silverado = new Truck();
		System.out.println(silverado.makeNoise());
    
		Bicycle bike = new Bicycle();
		System.out.println(bike.makeNoise());
		
		MuscleCar dodgeChallenger = new MuscleCar();
		System.out.println(dodgeChallenger.makeNoise());
		
		Unicycle wheelie = new Unicycle();
		System.out.println(wheelie.makeNoise());


	}
}
