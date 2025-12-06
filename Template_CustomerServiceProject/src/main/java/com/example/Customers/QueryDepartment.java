package com.example.Customers;

/*
     This class is an implementation of a CustomerCare Interface based on the selection 
     in the console the department type is selected.You need to complete this class 
     based on the following tasks.

     Tasks:
       1. Override the methods of CustomerCare Interface:
       2. Build your logic for all the method based on the description given in CustomerCare Interface.
 */
public class QueryDepartment implements CustomerCare {
	
	private String department= "Payment department";
    private String customerName;
    private String issue; 
    private double refId; 
    public String getDepartment() {
    	return department ;
    }
    public void getService() {
    	System.out.println(" Welcome "+customerName+", you have reached the "+department+".");
    	System.out.println("How may I assist you with your query inquiry?");
    }
	
	/** This method sets the name of the user from the console. **/
	public void setCustomerName(String name) {
		this.customerName =  name;
	}
	
	/** This method sets the issue for the department given by the user e.g. "I have an issue with my receipt". **/
	public void setProblem(String problem) {
		this.issue = problem;
	}
	
	/** This method returns the custom response to the user based on the name and the selected department. e.g. " Dear John your  issue is registered with Payments" **/
	public void getProblem() {
		this.refId = Math.random()*(1000-1+1)+1;
		this.refId = Math.round(refId);
		System.out.println(" Dear "+customerName+" your  issue for "+ issue+" has been recorded with our"+department+" your reference id is"+refId);
	}

}
