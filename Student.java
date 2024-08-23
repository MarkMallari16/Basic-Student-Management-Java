/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

/**
 *
 * @author Athlon 3000g
 */
public class Student {
    
    private static int idCounter = 100;
    private int studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String course;

    public Student(String firstName, String middleName, String lastName, String course) {
        this.studentId = idCounter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.course = course;
    }

    //getting and setting student data
    public int getId() {
        return studentId;
    }

    public void setId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName(String middleName) {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void displayStudentDetails() {
        System.out.println("ID: " + studentId);
        System.out.println("Fullname: " + lastName + ", " + firstName + " " + middleName);
        System.out.println("Course: " + course);
    }
}
