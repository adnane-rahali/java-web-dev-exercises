package exercises.school;

import java.util.Objects;

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

    public String getGradeLevel(){
        if(this.numOfCredits < 30){
            return "Freshman";
        }
        if(this.numOfCredits < 60){
            return "Sophomore";
        }
        if(this.numOfCredits < 90){
            return "Junior";
        }
        else{
            return "Senior";
        }
    }

    public void addGrade(int num, double grade){
        this.updateGPA(num, grade);
        this.numOfCredits += num;
    }

    private void updateGPA(int num, double grade){
        double weightedSum = this.gpa * numOfCredits;
        double newWeightedSum = weightedSum + (num*grade);
        this.gpa = newWeightedSum/(this.numOfCredits+num);
    }

    public static void main(String[] args){
        Student a = new Student("a", 1, 12, 4.0);
        System.out.println(a.gpa);
        a.addGrade(3, 3.0);
        System.out.println(a.gpa);
        System.out.println(a.numOfCredits);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }
}
