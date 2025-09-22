 
class Student { 
	int rollNo;
	String name;
	int age;
	String grade;
	Student() {
		super();
		this.rollNo = 5;
		this.name = "om";
		this.age = 11;
		this.grade = "A+";
	}
	
	Student(int rollNo, String name, int age, String grade) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	String getGrade() {
		return grade;
	}

	void setGrade(String grade) {
		this.grade = grade;
	}

	void display () {
		System.out.println("Student name is : "+this.name);
		System.out.println("Roll Number is : "+this.rollNo);
		System.out.println("Age is : "+this.age);
		System.out.println("Grade  is : "+this.grade);
	}	
}//student ends here

class SchoolStudent extends Student{
	int standard;
	String subject;
	String section;
	SchoolStudent() {
		super();
		this.standard = 12;
		this.subject = "English";
		this.section = "B";
	}
	SchoolStudent(int rollNo, String name, int age, String grade,int standard, String subject, String section) {
		super(rollNo,name,age,grade);
		this.standard = standard;
		this.subject = subject;
		this.section = section;
	}
	int getStandard() {
		return standard;
	}
	void setStandard(int standard) {
		this.standard = standard;
	}
	String getSubject() {
		return subject;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	String getSection() {
		return section;
	}
	void setSection(String section) {
		this.section = section;
	}
	
	void display () {
		super.display();
		System.out.println("Standard : "+this.standard);
		System.out.println("Subject : "+this.subject);
		System.out.println("Section : "+this.section);

	}
	

}//school student class ends here

class ResearchScholar extends Student {
	String thesisTopic;
	String guideName;
	int publication;
	ResearchScholar() {
		super();
		this.thesisTopic =  "ABC";
		this.guideName = "XYZ";
		this.publication = 54;
	}
	ResearchScholar(int rollNo, String name, int age, String grade,String thesisTopic, String guideName, int publication) {
		super(rollNo,name,age,grade);
		this.thesisTopic = thesisTopic;
		this.guideName = guideName;
		this.publication = publication;
	}
	String getThesisTopic() {
		return thesisTopic;
	}
	void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}
	String getGuideName() {
		return guideName;
	}
	void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	int getPublication() {
		return publication;
	}
	void setPublication(int publication) {
		this.publication = publication;
	}
	
	void display () {
		super.display();
		System.out.println("Thesis topic is : "+this.thesisTopic);
		System.out.println("Guide Name is : "+this.guideName);
		System.out.println("Publication is : "+this.publication);
	}
}//ResearchScholar ends here

class CollegeStudent extends Student{
	String course;
	int semister;
	int creditEarn;
	CollegeStudent() {
		super();
		this.course = "BCA";
		this.semister = 5;
		this.creditEarn = 9;
	}
	
	CollegeStudent(int rollNo, String name, int age, String grade,String course, int semister, int creditEarn) {
		super(rollNo,name,age,grade);
		this.course = course;
		this.semister = semister;
		this.creditEarn = creditEarn;
	}

	String getCourse() {
		return course;
	}

	void setCourse(String course) {
		this.course = course;
	}

	int getSemister() {
		return semister;
	}

	void setSemister(int semister) {
		this.semister = semister;
	}

	int getCreditEarn() {
		return creditEarn;
	}

	void setCreditEarn(int creditEarn) {
		this.creditEarn = creditEarn;
	}
	
	void display () {
		super.display();
		System.out.println("Course name : "+this.course);
		System.out.println("Semister : "+this.semister);
		System.out.println("Credit earn : "+this.creditEarn);
	}
	
}//college Student ends here
class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.display();

        System.out.println();	
        
        Student s2 = new Student (3,"ketan",20,"c");
        s2.display();
        System.out.println();
      
        SchoolStudent ss1 = new SchoolStudent ( );
        ss1.display();
        
        System.out.println();
        
        SchoolStudent ss2 = new SchoolStudent (5,"Aniket",20,"b",12,"Math","A");
        ss2.display();
        
        System.out.println();
        
        ResearchScholar r1 = new ResearchScholar ();
        r1.display();
        
        System.out.println();
        
        ResearchScholar r2 = new ResearchScholar (6,"chaitanya",24,"a","abc","xyz",91);
        r2.display();
        
        System.out.println();
        
        CollegeStudent c1 = new CollegeStudent ();
        c1.display();
        
        System.out.println();
        
        CollegeStudent c2 = new CollegeStudent (8,"Pramod",20,"A","BCA",5,9);
        c2.display();
   
    }
}
	
	
