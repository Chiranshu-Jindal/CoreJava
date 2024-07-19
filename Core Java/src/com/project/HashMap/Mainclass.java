package com.project.HashMap;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Populatedsocietydata data = new Populatedsocietydata();
		HashMap<Integer, ArrayList<Person>> societydata = new HashMap<>();
		societydata=data.populateData();
			
	    System.out.print("enter the room no.:-");
		int userkey = input.nextInt();		
			
		if(societydata.containsKey(userkey)) {	
			double totalincome=0;
			ArrayList<Person> retrievedItem = societydata.get(userkey);
			System.out.println("Total numbers of person in the appartment no.: "+ userkey + " are " + retrievedItem.size());
			for(int i = 0 ; i< retrievedItem.size();i++)
			{
				Person p = retrievedItem.get(i);
				Salarystructure s = p.getsalarystu();
	            System.out.print("person "+ (i+1) +","+p.getName()+"," + p.getRelations()+","+p.getEmail()+","+p.getAge()+","+ p.getMobile());
	            
	            if(s!=null) {
	            	System.out.print(","+s.getOccupation());
	            	System.out.print(","+s.getsalary());
	            	totalincome += s.getsalary();
	            }
	        System.out.println();
		  	}
			System.out.println("total income of this appartment is "+totalincome);
		}
			else
			{	
				System.out.println("the room number is wrong");
			}
			input.close();
	        
			
		}
	}