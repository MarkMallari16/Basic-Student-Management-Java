/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement;

import java.util.Scanner;

/**
 *
 * @author Athlon 3000g
 */
public class Main {

    public static void displayChoices() {
        System.out.println("\nStudent Management System\n");
        System.out.println("1. Add Student");
        System.out.println("2. View All Students");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner input = new Scanner(System.in);

        int choice;
        
        
        do {
            displayChoices();
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Student First Name: ");
                    String studentFirstName = input.nextLine();

                    System.out.print("Enter Student Middle Name: ");
                    String studentMiddleName = input.nextLine();

                    System.out.print("Enter Student Last Name: ");
                    String studentLastName = input.nextLine();

                    System.out.print("Enter Course: ");
                    String course = input.nextLine();

                    Student student = new Student( studentFirstName, studentMiddleName, studentLastName, course);

                    studentManagement.addStudent(student);
                    break;
                case 2:
                    studentManagement.showStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to update: ");
                    int updateId = input.nextInt();
                    input.nextLine();
                    studentManagement.updateStudent(updateId);
                    break;
                case 4:
                    System.out.print("Enter Student ID to delete: ");
                    int deleteId = input.nextInt();

                    studentManagement.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("\nExititng....");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        } while (choice != 5);
    }

}
