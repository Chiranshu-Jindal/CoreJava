package com.project.HashMap;
import java.util.HashMap;
import java.util.ArrayList;
public class populatedsocietydata {
	
	HashMap<Integer, ArrayList<person>> populateData() {
       HashMap<Integer, ArrayList<person>> map = new HashMap<>();
	salarystructure s1 = new salarystructure();
	s1.setSalary(20000);
	s1.setOccupation("software engineer");
	
	salarystructure s2 = new salarystructure();
	s2.setSalary(10000);
	s2.setOccupation("software engineer");
	
	salarystructure s4 = new salarystructure();
	s4.setSalary(25000);
	s4.setOccupation("accountant");
	
	salarystructure s5 = new salarystructure();
	s5.setOccupation("housewife");
	
	person p1 = new person();
	p1.setName("rohit");
    p1.setMobile("89xxxxxx83");
    p1.setEmail("rohit4@gmail.com");
    p1.setRelations(Relation.FATHER);
    p1.setAge(38);
    p1.setsalarystu(s1);
    
	person p2 = new person();
	p2.setName("pooja");
    p2.setMobile("93xxxxxx56");
    p2.setEmail("xyz@gmail.com");
    p2.setRelations(Relation.MOTHER);
    p2.setAge(33);
    p2.setsalarystu(s2);
    
    person p3 = new person();
    p3.setName("chirag");
    p3.setEmail("xx@gmail.com");
    p3.setRelations(Relation.SON);
    p3.setAge(10); 
       
    person p4 = new person();
    p4.setName("rahul");
    p4.setEmail("xx@yahoo.com");
    p4.setMobile("78xxxxxx90");
    p4.setRelations(Relation.HUSBAND);
    p4.setAge(25);
    p4.setsalarystu(s4);;
    
    person p5 = new person();
    p5.setName("rachita");
    p5.setEmail("xx@yahoo.com");
    p5.setMobile("67xxxxxx93");
    p5.setRelations(Relation.WIFE);
    p5.setsalarystu(s5);
    
    ArrayList<person> appartment1 = new ArrayList<person>();
    appartment1.add(p1);
    appartment1.add(p2);
    appartment1.add(p3);
        
    ArrayList<person> appartment2 = new ArrayList<person>();
    appartment2.add(p4);
    appartment2.add(p5);
    
    map.put(101,appartment1);
	map.put(102,appartment2);
    
	return map;	
	 }
}