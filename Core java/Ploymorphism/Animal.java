
class Animal {
	String name;
	int age;
	String species;
	String habitat;
	double weight;
	String diet;
	
	Animal() {
		this.name = "Leo";
		this.age = 5;
		this.species = "Lion";
		this.habitat = "Savannah";
		this.weight = 190.5;
		this.diet = "Carnivore";
	}

	Animal(String name, int age, String species, String habitat, double weight, String diet) {
		super();
		this.name = name;
		this.age = age;
		this.species = species;
		this.habitat = habitat;
		this.weight = weight;
		this.diet = diet;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	String getSpecies() {
		return species;
	}

	void setSpecies(String species) {
		this.species = species;
	}

	String getHabitat() {
		return habitat;
	}

	void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	double getWeight() {
		return weight;
	}

	void setWeight(double weight) {
		this.weight = weight;
	}

	String getDiet() {
		return diet;
	}

	void setDiet(String diet) {
		this.diet = diet;
	}
	
	void display () {
		System.out.println("Animal name is : "+this.name);
		System.out.println("Age is : "+this.age);
		System.out.println("Species : "+this.species);
		System.out.println("Weight is : "+this.weight);
		System.out.println("Diet is : "+this.diet);
		
		
	}
	
	
}//Animal ends here

class Dog extends Animal {
	String breed;
	String color;
	double height;
	Dog() {
		super();
		this.breed =  "German Shepherd";
		this.color = "Black and Tan";
		this.height = 65.0;
	}
	Dog(String name, int age, String species, String habitat, double weight, String diet,String breed, String color, double height) {
		super(name,age,species,habitat,weight,diet);
		this.breed = breed;
		this.color = color;
		this.height = height;
	}
	String getBreed() {
		return breed;
	}
	void setBreed(String breed) {
		this.breed = breed;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	void display () {
		super.display();
		System.out.println("Breed is : "+this.breed);
		System.out.println("Color is : "+this.color);
		System.out.println("Height is : "+this.height);
	}
	
}//Dog ends here

class Bird extends Animal {
	double wingSpan;
	String beakType;
	boolean canMigrate;
	Bird() {
		super();
		this.wingSpan = 2.3;
		this.beakType = "Hooked";
		this.canMigrate = true;
	}
	Bird(String name, int age, String species, String habitat, double weight, String diet,double wingSpan, String beakType, boolean canMigrate) {
		super(name,age,species,habitat,weight,diet);
		this.wingSpan = wingSpan;
		this.beakType = beakType;
		this.canMigrate = canMigrate;
	}
	double getWingSpan() {
		return wingSpan;
	}
	void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}
	String getBeakType() {
		return beakType;
	}
	void setBeakType(String beakType) {
		this.beakType = beakType;
	}
	boolean isCanMigrate() {
		return canMigrate;
	}
	void setCanMigrate(boolean canMigrate) {
		this.canMigrate = canMigrate;
	}
	void display () {
		super.display();
		System.out.println("WingSpan is : "+this.wingSpan);
		System.out.println("Beak Type is : "+this.beakType);
		System.out.println("CanMigrate is : "+this.canMigrate);
	}	
	
}//Bird ends here

class Cat extends Animal {
	String furColor;
	String eyeColor;
	double clawLength;
	Cat() {
		super();
		this.furColor = "Golden";
		this.eyeColor ="Amber";
		this.clawLength = 4.5;
	}
	Cat(String name, int age, String species, String habitat, double weight, String diet,String furColor, String eyeColor, double clawLength) {
		super(name,age,species,habitat,weight,diet);
		this.furColor = furColor;
		this.eyeColor = eyeColor;
		this.clawLength = clawLength;
	}
	String getFurColor() {
		return furColor;
	}
	void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	String getEyeColor() {
		return eyeColor;
	}
	void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	double getClawLength() {
		return clawLength;
	}
	void setClawLength(double clawLength) {
		this.clawLength = clawLength;
	}
	void display () {
		super.display();
		System.out.println("FurColor is : "+this.furColor);
		System.out.println("Eyecolor is : "+this.eyeColor);
		System.out.println("Clawlenght is : "+this.clawLength);
	}		
}//Cat ends here

class TestAnimal {
	public static void main (String [] args) {
		Animal a1 = new Animal ();
		a1.display();
		
		System.out.println();
		
		a1 = new Animal("Ella",12,"Elephant","Grasslands",5400.0,"Herbivore");
		a1.display();
		
		System.out.println();
		
		a1 = new Dog ();
		a1.display();
		
		System.out.println();
		
		a1 = new Dog ("Ella",12,"Elephant","Grasslands",5400.0,"Herbivore","Arabian Horse","Brown",150.0);
		a1.display();
		
		System.out.println();
		
		a1 = new Bird ();
		a1.display();
		
		System.out.println();
		
		a1 = new Bird ("Ella",12,"Elephant","Grasslands",5400.0,"Herbivore",1.1,"Cone-shaped",false);
		a1.display();
		
		System.out.println();
		
		a1 = new Cat ();
		a1.display();
		
		System.out.println();
		
		a1 = new Cat("Ella",12,"Elephant","Grasslands",5400.0,"Herbivore","Black","Green",2.8);
		a1.display();
		
		
	}
}