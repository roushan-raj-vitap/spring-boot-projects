package com.example.CustomerServicedemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Customers.CustomerCare;

import java.util.Scanner;
@SpringBootApplication
public class CustomerServicedemoApplication {

	public static void main(String[] args) {

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

			 Tasks:
		 *  1. Load the beans from ApplicationContext.xml
		 *  2. Display all the departments available and get the input from user.
		 *  3. Get the message from user and store it into the respective department.
		 *  
		 */
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to our Customer Care application");
		System.out.print("Please enter your name");
		String username = sc.nextLine();
		System.out.println("Thank you for reaching us"+username);
		System.out.println("Please select a department to connect to\n1. Payment Department\n2. Query Department\n3. Sales Department\n0. Exit");
		int selectedDepartment = sc.nextInt();
		sc.nextLine();
		CustomerCare customer = null;
		switch(selectedDepartment) {
		case 1:{
			customer = (CustomerCare)(context.getBean("paymentDepartment"));
			break;
		}
		case 2:{
			customer = (CustomerCare)(context.getBean("queryDepartment"));
			break;
		}
		case 3:{
			customer = (CustomerCare)(context.getBean("salesDepartment"));
			break;
		}
		case 0:{
			return;
		}
		default:System.out.println("Please enter valid input");
		}
		customer.setCustomerName(username);
		customer.getService();
		System.out.println("How may I assist you with your payment inquiry");
		String problem = sc.nextLine();
		
		customer.setProblem(problem);
		customer.getProblem();
		
	}
}
