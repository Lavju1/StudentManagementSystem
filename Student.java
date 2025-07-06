public class Student {
    private int id;
    private String name;
    private String department;
    private double cgpa;

    // Constructors, Getters & Setters
    public Student(String name, String department, double cgpa) {
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    public Student(int id, String name, String department, double cgpa) {
        this(name, department, cgpa);
        this.id = id;
    }

    // Getters...
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getCgpa() { return cgpa; }
}

