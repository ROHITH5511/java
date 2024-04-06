package Project;
// imported arraylist //
import java.util.ArrayList;
// imported scanner class for user input //
import java.util.Scanner;

public class Student {
	// initiated private attributes for the student details // 
	private String Name;   
	private int Roll_no;
	private int Contact_no;
	private String Gender;
	private String Section;
	// constructor for  the student objects //
	public Student(String name, int roll_no, int contact_no, String gender, String section) {
		
		this.Name = name;
		this.Roll_no = roll_no;
		this.Contact_no = contact_no;
		this.Gender = gender;
		this.Section = section;
	}
    // Initiated getter methods for accessing private Attributes //
	public String getName() {
		return Name;
	}
	public int getRoll_no() {
		return Roll_no;
	}
	public int getContact_no() {
		return Contact_no;
	}
	public String getGender() {
		return Gender;
	}
	public String getSection() {
		return Section;
	}
	public static void main(String[] args) {
		Scanner rk = new Scanner (System.in);
		// ArrayList to store student objects //
		ArrayList <Student> Students = new ArrayList <>();
		int choice;
		do {
			System.out.println();
			System.out.println("Enter your choice:-  \n 1.Add Student  \n 2.list of Student \n 3.Search Student \n 4.Quit");
			// for the  user input choice //
			choice = rk.nextInt();
			// for newline character //
			rk.nextLine();
			// switch case initiated  for  the choice of user input//
			switch(choice) {
			case 1:
				// adding the student details to case1 //
				System.out.println("Add Student");
				System.out.print("Enter student name: ");
				String name = rk.nextLine();
				System.out.print("Enter student roll number: ");
				int roll_no = rk.nextInt();
				rk.nextLine(); 
				System.out.print("Enter student contact number: ");
				int contact_no = rk.nextInt();
				rk.nextLine(); 
				System.out.print("Enter student gender: ");
				String gender = rk.nextLine();
				System.out.print("Enter student section: ");
				String section = rk.nextLine();
				// created new student object //
				Student student = new Student(name, roll_no, contact_no, gender, section);
				// adding the student for the arraylist //
				Students.add(student); 
				System.out.println("Student added successfully!");
				break;
			case 2:
				// listing the added details of students //
				System.out.println("List of Student");
				System.out.println();
				// if else statement initiated for checking the arraylist is empty and for loop initiated for finding the list of students in arraylist // 
				if (Students.isEmpty()) {
		            System.out.println("No students found.");
		        } else {
		            for (int i = 0; i < Students.size(); i++) {
		                Student list = Students.get(i);
		                System.out.println("Name: "+ list.getName());
		                System.out.println("Roll Number: "+ list.getRoll_no());
		                System.out.println("Contact Number: "+list.getContact_no());
		                System.out.println("Gender: "+ list.getGender());
		                System.out.println("Section: "+list.getSection());
		                System.out.println();
		            }
		        }
				break;
			case 3:
				// finding the student details of arraylist by entering the name of student //
				System.out.print("Enter Nameof the Student to search: ");
				// taking user input for searching with name of student //
				String Name = rk.next();
				boolean found = false;
				//  for loop of finding the ArrayList to search for the student //
				 for (int i = 0; i < Students.size(); i++) {
					 Student details = Students.get(i);
					
				
					System.out.println("Student found:");
					System.out.println("Name: " + details.getName());
					System.out.println("Roll Number: " + details.getRoll_no());
					System.out.println("Contact Number: " + details.getContact_no());
					System.out.println("Gender: " + details.getGender());
					System.out.println( "Section: " + details.getSection());
					found = true;
					// Exiting loop after finding the  match // 
					break;
					
				 }
				// if statement for displaying the message if student details not found //
				 if (!found) {
					 System.out.println("Student with Name " + Name + " not found.");
					 }	 
				 break;
							
			case 4:
				System.out.println("Exiting Student Management System");
				break;
			default :
				System.out.println("invalid input");
			}
		}
		// Continuing the loop until the user chooses to quit //
		while (choice!=4);
		// closing the scanner class //
		rk.close();
	}
}

