package assignment_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoteControlCompetition {

	public static void main(String[] args) {
		ProductionRemoteControlCar car1 = new ProductionRemoteControlCar();
		ProductionRemoteControlCar car2 = new ProductionRemoteControlCar();
		ProductionRemoteControlCar car3 = new ProductionRemoteControlCar();
		
		car1.setNumberOfVictories(1);
		car2.setNumberOfVictories(7);
		car3.setNumberOfVictories(3);
		
		List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
		unsortedCars.add(car1);
		unsortedCars.add(car2);
		unsortedCars.add(car3);
		
		System.out.println("Before ranking : ");
		for(ProductionRemoteControlCar car : unsortedCars) {
			System.out.println("Car with victories : "+car.getNumberOfVictories());
		}
		
		List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
		
		System.out.println("\nAfter Ranking : ");
		for(ProductionRemoteControlCar car : rankings) {
			System.out.println("Car with victories : "+car.getNumberOfVictories());
		}
		
	}

}

interface RemoteControlCar{
	void drive();
	int getDistanceTravelled();
}

class ProductionRemoteControlCar implements RemoteControlCar,Comparable<ProductionRemoteControlCar>{
	
	private int distanceTravelled;
	private int numberOfVictories;

	@Override
	public void drive() {
		distanceTravelled+=10;
	}

	@Override
	public int getDistanceTravelled() {
		return distanceTravelled;
	}
	
	public void setNumberOfVictories(int numberOfVictories) {
		this.numberOfVictories = numberOfVictories;
	}
	
	public int getNumberOfVictories() {
		return numberOfVictories;
	}

	@Override
	public int compareTo(ProductionRemoteControlCar car) {
		return Integer.compare(car.getNumberOfVictories(), getNumberOfVictories());
	}
	
}

class ExperimentalRemoteControlCar implements RemoteControlCar{
	private int distanceTravelled;

	@Override
	public void drive() {
		distanceTravelled+=20;	
	}

	@Override
	public int getDistanceTravelled() {
		return distanceTravelled;
	}
	
}

class TestTrack{
	public static void race(RemoteControlCar car) {
		car.drive();
	}
	
	public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
		Collections.sort(cars,(a,b)->b.getNumberOfVictories()-a.getNumberOfVictories());
		return cars;
	}
}





