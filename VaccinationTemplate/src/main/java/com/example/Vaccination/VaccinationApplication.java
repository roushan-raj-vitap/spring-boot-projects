package com.example.Vaccination;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	Scanner scanner = new Scanner(System.in);
//    	User user = (User)(context.getBean("fatherCovid"));
    	System.out.println("Welcome to the Vaccination Application");
    	
    	while(true) {
    	System.out.println("Please choose your vaccine preference:\n1. Covid\n2. Polio\n3. Typhoid");
    	System.out.println("");
    	int vaccineChoice = scanner.nextInt();
    	String vaccineType = "";
    	switch(vaccineChoice) {
    	case 1:{
    		vaccineType = "Covid";
    		break;
    	}
    	case 2:{
    		vaccineType = "Polio";
    		break;
    	}
    	case 3:{
    		vaccineType = "Typhoid";
    		break;
    	}
    	default:{
    		System.out.println("Please enter the valid number");
    	}
    	}
    	System.out.println("Whom do you want to vaccinate");
    	System.out.println("1. Father\n2. Mother\n3. Self\n4. Spouse\n5. Exit");
    	int userChoice = scanner.nextInt();
    	String userType = "";
    	switch(userChoice) {
    	case 1:{
    		userType = "father";
    		break;
    	}
    	case 2:{
    		userType="mother";
    		break;
    	}
    	case 3:{
    		userType = "self";
    		break;
    	}
    	case 4:{
    		userType="spouse";
    		break;
    	}
    	case 5:return;
    	}
    	// Clear the scanner buffer
        scanner.nextLine(); // To consume the newline character

        System.out.println("Please enter " + userType + " details");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Appointment date (YYYY-MM-DD): ");
        String date = scanner.next();

        System.out.print("Appointment time (HH:MM AM/PM): ");
        String time = scanner.next();

        System.out.print("Appointment location: ");
        scanner.nextLine(); // To consume the newline character
        String location = scanner.nextLine();

        String parameter = userType + vaccineType;

        // Setting user inputs
        User user = (User) context.getBean(parameter);
        TimeAndLocation timeAndLocation = new TimeAndLocation();
        timeAndLocation.setDetails(time, location, date);
        user.setUserDetails(name, age, timeAndLocation);
        user.setAppointment();

//        // Display the appointment details
//        System.out.println("Appointment booked successfully for " + name + ":");
//        System.out.println("Vaccine: " + vaccineType);
//        System.out.println("Date: " + date);
//        System.out.println("Time: " + time);
//        System.out.println("Location: " + location);
        System.out.println("Do you want to register for someone Else\n1. Yes\n2. No");
        int nextUser = scanner.nextInt();
        if(nextUser==2) {
        	break;
        }
    }
}
}