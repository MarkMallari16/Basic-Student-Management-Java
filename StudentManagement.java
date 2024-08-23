/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Athlon 3000g
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    private ArrayList<Student> students;

    public StudentManagement() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully");
    }

    public void showStudents() {
        if (students.isEmpty()) {
            System.out.println("*****************************************");
            System.out.println("|          No students found.           |");
            System.out.println("*****************************************");
        } else {
            System.out.println("\nStudents Information");
            for (Student student : students) {
                student.displayStudentDetails();
            }
        }
    }

    public void updateStudent(int studentId) {

        for (Student student : students) {
            if (student.getId() == studentId) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter New First Name: ");
                student.setFirstName(input.nextLine());

                System.out.print("Enter New Middle Name: ");
                student.setMiddleName(input.nextLine());

                System.out.print("Enter New Last Name: ");
                student.setLastName(input.nextLine());

                System.out.print("Enter New Course: ");
                student.setCourse(input.nextLine());

                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    public void deleteStudent(int studentId) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

}
