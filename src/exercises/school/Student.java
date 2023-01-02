package exercises.school;

public class Student {
    private String name;
    private int studentId;
    private int numOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numOfCredits = numOfCredits;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    private void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumOfCredits() {
        return numOfCredits;
    }

    private void setNumOfCredits(int numOfCredits) {
        this.numOfCredits = numOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    private void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static void main(String[] args){
        Student a = new Student("a", 1, 12, 4.0);
        System.out.println(a.gpa);
    }
}
