public class Student {
    private String name;
    private int id;
    private ArrayList<String> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Enrolled Courses: " + courses);
    }
}

public class GraduateStudent extends Student {
    private String researchArea;

    public GraduateStudent(String name, int id, String researchArea) {
        super(name, id);
        this.researchArea = researchArea;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Research Area: " + researchArea);
    }
}
