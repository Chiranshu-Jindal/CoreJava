package com.project.HashMap;

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		populatedsocietydata data = new populatedsocietydata();
		HashMap<Integer, ArrayList<person>> societydata = new HashMap<>();
		societydata=data.populateData();
			
	    System.out.print("enter the room no.:-");
		int userkey = input.nextInt();		
			
		if(societydata.containsKey(userkey)) {	
			ArrayList<person> retrievedItem = societydata.get(userkey);
			System.out.println("Total numbers of person in the appartment no.: "+ userkey + " are " + retrievedItem.size());
			for(int i = 0 ; i< retrievedItem.size();i++)
			{
				person p = retrievedItem.get(i);
				salarystructure s = p.getsalary();
	            System.out.println("person "+ (i+1) +","+p.getName()+"," + p.getRelations()+","+p.getEmail()+","+p.getAge()+","+ p.getMobile()+","+s.getoccupation()+","+s.getsalary());
			}
		}
			else
			{
				System.out.println("the room number is wrong");
			}
			input.close();
	        
			
		}
	}