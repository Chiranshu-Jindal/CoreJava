package com.project.HashMap;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Populatedsocietydata {
    HashMap<Integer, ArrayList<Person>> populateData() 
      {
       HashMap<Integer, ArrayList<Person>> map = new HashMap<>();
       ArrayList<Person> list = new ArrayList<Person>();
		try{
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\chish\\OneDrive\\Desktop\\populatedsocietydata.csv"));
			String read="";
			while((read=reader.readLine())!= null) {
				String[] token = read.split(",");
			   if(token.length>=9) {
			    int appartmentnumber=Integer.parseInt(token[0]);
			    String personnumber=token[1];
			    String Name=token[2];
			    String relation=token[3];
			    String Email=token[4];
			    int age=Integer.parseInt(token[5]);
			    String mobile=token[6];
			    String occupation=token[7];
			    double salary=Double.parseDouble(token[8]);
			        
			    Salarystructure s1 = new Salarystructure();
			    s1.setSalary(salary);
			    s1.setOccupation(occupation);	
			    
			    Person p1=new Person();
			    p1.setName(Name);
			    p1.setMobile(mobile);
			    p1.setEmail(Email);
			    p1.setRelations(Relation.valueOf(relation.toUpperCase()));
			    p1.setAge(age);
			    p1.setsalarystu(s1);
			    
//			    map.computeIfAbsent(appartmentnumber, k -> new ArrayList<>()).add(p1);
			    if (!map.containsKey(appartmentnumber)) {
			        map.put(appartmentnumber, new ArrayList<>());
			    }
			        map.get(appartmentnumber).add(p1);
			    
			   }
			   }
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	return map;
      }
}
      
//	Salarystructure s1 = new Salarystructure();
//	s1.setSalary(20000);
//	s1.setOccupation("software engineer");
//	
//	Salarystructure s2 = new Salarystructure();
//	s2.setSalary(10000);
//	s2.setOccupation("software engineer");
//	
//	Salarystructure s4 = new Salarystructure();
//	s4.setSalary(25000);
//	s4.setOccupation("accountant");
//	
//	Salarystructure s5 = new Salarystructure();
//	s5.setOccupation("housewife");
//	
//	Person p1 = new Person();
//	p1.setName("rohit");
//    p1.setMobile("89xxxxxx83");
//    p1.setEmail("rohit4@gmail.com");
//    p1.setRelations(Relation.FATHER);
//    p1.setAge(38);
//    p1.setsalarystu(s1);
//    
//	Person p2 = new Person();
//	p2.setName("pooja");
//    p2.setMobile("93xxxxxx56");
//    p2.setEmail("xyz@gmail.com");
//    p2.setRelations(Relation.MOTHER);
//    p2.setAge(33);
//    p2.setsalarystu(s2);
//    
//    Person p3 = new Person();
//    p3.setName("chirag");
//    p3.setEmail("xx@gmail.com");
//    p3.setRelations(Relation.SON);
//    p3.setAge(10); 
//       
//    Person p4 = new Person();
//    p4.setName("rahul");
//    p4.setEmail("xx@yahoo.com");
//    p4.setMobile("78xxxxxx90");
//    p4.setRelations(Relation.HUSBAND);
//    p4.setAge(25);
//    p4.setsalarystu(s4);;
//    
//    Person p5 = new Person();
//    p5.setName("rachita");
//    p5.setEmail("xx@yahoo.com");
//    p5.setMobile("67xxxxxx93");
//    p5.setRelations(Relation.WIFE);
//    p5.setsalarystu(s5);
//    
//    ArrayList<Person> appartment1 = new ArrayList<Person>();
//    appartment1.add(p1);
//    appartment1.add(p2);
//    appartment1.add(p3);
//        
//    ArrayList<Person> appartment2 = new ArrayList<Person>();
//    appartment2.add(p4);
//    appartment2.add(p5);
//    
//    map.put(101,appartment1);
//	map.put(102,appartment2);
   