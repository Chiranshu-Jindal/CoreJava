package com.project.HashMap;

import java.util.*;
//import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Mainclass {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		HashMap<Integer, ArrayList<person>> map = new HashMap<>();
		
	person p1 = new person();
	p1.setName("rohit");
    p1.setMobile("89xxxxxx83");
    p1.setEmail("xxx@gmail.com");
    p1.setRelations(Relation.FATHER);
		
	person p2 = new person();
	p2.setName("pooja");
    p2.setMobile("93xxxxxx56");
    p2.setEmail("xx@gmail.com");
    p2.setRelations(Relation.MOTHER);
    
    person p3 = new person();
    p3.setName("chirag");
    p3.setMobile("98xxxxxx32");
    p3.setEmail("xx@gmail.com");
    p3.setRelations(Relation.SON);
       
    person p4 = new person();
    p4.setName("rahul");
    p4.setEmail("xx@yahoo.com");
    p4.setMobile("78xxxxxx90");
    p4.setRelations(Relation.HUSBAND);
    
    person p5 = new person();
    p5.setName("rachita");
    p5.setEmail("xx@yahoo.com");
    p5.setMobile("67xxxxxx93");
    p5.setRelations(Relation.WIFE);
    
    ArrayList<person> list1 = new ArrayList<person>();
    list1.add(p1);
    list1.add(p2);
    list1.add(p3);
    
    ArrayList<person> list2 = new ArrayList<person>();
    list2.add(p4);
    list2.add(p5);
    
    map.put(101,list1);
	map.put(102,list2);

    System.out.println("enter the room no.:-");
	int userkey = input.nextInt();		
		
	if(map.containsKey(userkey)) {	
		System.out.println("Item details for key: "+ userkey);
		ArrayList<person> retrievedItem = map.get(userkey);
		for(person p:retrievedItem)
		{
        System.out.println("Name: " + p.getName());
        System.out.println("email: " + p.getEmail());
        System.out.println("mobile: " + p.getMobile());
        System.out.println("Relation: " + p.getRelations());
		}
	}
		else
		{
			System.out.println("the key is not present");
		}
		input.close();
        
 
	}
}



   

		
		
		
	

		
		
