package car;

public class Car {
	
	private int wheels;
	private String manufacturer;
	private String type;

	public Car(int wheels, String manufacturer, String type) { 
		this.wheels = wheels;
		this.manufacturer = manufacturer;
		this.type = type;
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public String getType() {
		return type;
	}
	
	public void setWheels(int newWheels) {
		this.wheels = newWheels;
	}
	
	public void setManufacturer(String newManufacturer) {
		this.manufacturer = newManufacturer;
	}
	
	public void setType(String newType) {
		this.type = newType;
	}	
	
	public static void main(String[] args) {
		Car waggie = new Car(2, "Hilda", "TDI");
		System.out.println("De auto is van de producent " + waggie.getManufacturer() + "!");
		waggie.setManufacturer("Hilda met haar dikke BMW");
		System.out.println("De auto is van de producent " + waggie.getManufacturer() + "!");
		
	}
	
}
