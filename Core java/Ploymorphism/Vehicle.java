
class Vehicle {
	String vehicleNo;
	String brand;
	String model;
	String color;
	String fuelType;
	int engineCapacity;
	Vehicle() {
		this.vehicleNo = "MH12AB1234" ;
		this.brand = "Honda";
		this.model = "City";
		this.color = "White";
		this.fuelType = "Petrol";
		this.engineCapacity = 1497;
	}
	Vehicle(String vehicleNo, String brand, String model, String color, String fuelType, int engineCapacity) {
		super();
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.fuelType = fuelType;
		this.engineCapacity = engineCapacity;
	}
	String getVehicleNo() {
		return vehicleNo;
	}
	void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	String getModel() {
		return model;
	}
	void setModel(String model) {
		this.model = model;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	String getFuelType() {
		return fuelType;
	}
	void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	int getEngineCapacity() {
		return engineCapacity;
	}
	void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	void brake () {
		System.out.println("Brake is responded");
	}
	
	void display () {
		System.out.println("Vehicle number is : "+this.vehicleNo);
		System.out.println("Brand is : "+this.brand);
		System.out.println("Model is : "+this.model);
		System.out.println("Color is : "+this.color);
		System.out.println("Fuel type is : "+this.fuelType);
	}
	
}//Vehicle ends here

class Car extends Vehicle {
	int seatingCapacity;
	double trunkspace;
	String transmissionType;
	Car() {
		super();
		this.seatingCapacity = 5;
		this.trunkspace = 485.0;
		this.transmissionType = "Manual";
	}
	Car(String vehicleNo, String brand, String model, String color, String fuelType, int engineCapacity ,int seatingCapacity, double trunkspace, String transmissionType) {
		super(vehicleNo,brand,model,color,fuelType,engineCapacity);
		this.seatingCapacity = seatingCapacity;
		this.trunkspace = trunkspace;
		this.transmissionType = transmissionType;
	}
	int getSeatingCapacity() {
		return seatingCapacity;
	}
	void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	double getTrunkspace() {
		return trunkspace;
	}
	void setTrunkspace(double trunkspace) {
		this.trunkspace = trunkspace;
	}
	String getTransmissionType() {
		return transmissionType;
	}
	void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}
	
	void brake () {
		System.out.println("Car brake responded");
	}
	
	void display() {
		super.display();
		System.out.println("Seating capacity :"+this.seatingCapacity);
		System.out.println("TrunkSpace is : "+this.trunkspace);
		System.out.println("Transmission type : "+this.transmissionType);
		
	}
	
	
}//car class ends here

class Truck extends Vehicle {
	double loadCapacity;
	int noOfAxeles;;
	boolean traileAttached;
	Truck() {
		super();
		this.loadCapacity = 7.0;
		this.noOfAxeles = 2;
		this.traileAttached = false;
	}
	
	Truck(String vehicleNo, String brand, String model, String color, String fuelType, int engineCapacity,double loadCapacity, int noOfAxeles, boolean traileAttached) {
		super(vehicleNo,brand,model,color,fuelType,engineCapacity);
		this.loadCapacity = loadCapacity;
		this.noOfAxeles = noOfAxeles;
		this.traileAttached = traileAttached;
	}

	double getLoadCapacity() {
		return loadCapacity;
	}

	void setLoadCapacity(double loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	int getNoOfAxeles() {
		return noOfAxeles;
	}

	void setNoOfAxeles(int noOfAxeles) {
		this.noOfAxeles = noOfAxeles;
	}

	boolean isTraileAttached() {
		return traileAttached;
	}

	void setTraileAttached(boolean traileAttached) {
		this.traileAttached = traileAttached;
	}
	
	void brake () {
		System.out.println("Truck brake responded");
	}
	
	void display () {
		super.display();
		System.out.println("Load capacity is : "+this.loadCapacity  );
		System.out.println("No of axeles is : "+this.noOfAxeles);
		System.out.println("Trailer attached :"+this.traileAttached);
	}
	
}//truck class ends here

class Bike extends Vehicle {
	double mileage;
	boolean helmetRequired;
	int gearCount;
	Bike() {
		super();
		this.mileage = 90;
		this.helmetRequired = true;
		this.gearCount = 4;
	}
	Bike(String vehicleNo, String brand, String model, String color, String fuelType, int engineCapacity,double mileage, boolean helmetRequired, int gearCount) {
		super(vehicleNo,brand,model,color,fuelType,engineCapacity);
		this.mileage = mileage;
		this.helmetRequired = helmetRequired;
		this.gearCount = gearCount;
	}
	double getMileage() {
		return mileage;
	}
	void setMileage(double mileage) {
		this.mileage = mileage;
	}
	boolean isHelmetRequired() {
		return helmetRequired;
	}
	void setHelmetRequired(boolean helmetRequired) {
		this.helmetRequired = helmetRequired;
	}
	int getGearCount() {
		return gearCount;
	}
	void setGearCount(int gearCount) {
		this.gearCount = gearCount;
	}
	void brake () {
		System.out.println("Bike brake responded");
	}
	void display () {
		super.display();
		System.out.println("Mileage is : "+this.mileage);
		System.out.println("Helmet Required : "+this.helmetRequired);
		System.out.println("Gear count is : "+this.gearCount);
	}
	
}//bike class ends here




class TestVehicle {

	public static void main(String[] args) {
		 Vehicle v1 =  new Vehicle ();
		 v1.display();
		 v1.brake();
		 
		 System.out.println();
		 
		 v1 = new Car ("MH31GH2468","Maruti","Swift","Red","Petrol",1197,5,286.0,"Manual");
		
		 v1.display();
		 v1.brake();
		 System.out.println();
		 
		 v1 = new Truck ("MH12TR1234", "Tata", "LPT 1512", "White", "Diesel", 4200, 7.0, 2, false);
		 v1.display();
		 v1.brake();
		 System.out.println();
		 
		 v1 =new Bike ("MH31BK2468","Bajaj","Pulsar 150","Black","Petrol",150,70,true,5);
		 v1.display();
		 v1.brake();
		 

	}

}
