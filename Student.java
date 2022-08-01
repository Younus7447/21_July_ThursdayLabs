class Student {
	private int id;
	private String name; 
	private String address;
	private long phone;
	private String gender;
	private String dob;
	private short height; 
	private byte weight;
	private String degree;
	private short year; 
	private double gpa; 
	private boolean tution; 
	private boolean scholar;



	public Student(int id, String name, String address, long phone, String gender, String dob, short height,
			byte weight, String degree, short year, double gpa, boolean tution, boolean scholar) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
		this.height = height;
		this.weight = weight;
		this.degree = degree;
		this.year = year;
		this.gpa = gpa;
		this.tution = tution;
		this.scholar = scholar;
	}
	
	public String toString() {
		return " id=" + id + "\n name=" + name + "\n address=" + address + "\n phone=" + phone + "\n gender="
				+ gender + "\n dob=" + dob + "\n height=" + height + "\n weight=" + weight + "\n degree=" + degree
				+ "\n year=" + year + "\n gpa=" + gpa + "\n tution=" + tution + "\n scholar=" + scholar;
	}

	public static void main(String[] args) {
		Student s1 = new Student(78765654, "Omkar", "Mumbai", 1253026489,
				"male", "02/10/2000", (short)156, (byte)60, "B.Tech", (short)2022, 8.39, true, true);
		System.out.println("*** Student Information ***");
		System.out.println(s1);
	}

}