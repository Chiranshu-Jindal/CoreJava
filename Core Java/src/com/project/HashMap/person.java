package com.project.HashMap;
class person{
    private String name;
    private String mobile;
    private String email;   
    private Relation relations;
    private int age;
    private salarystructure salary;
    private salarystructure occupation;
    
    public void setName(String name) {
    	this.name=name;
    }

    public void setMobile(String mobile) {
    	this.mobile=mobile;
    }
    
    public void setEmail(String email) {
    	this.email=email;
    }
    
    public void setRelations(Relation relations) {
    	this.relations=relations;
    }
    
    public void setAge(int age){
    	this.age =age;
    }
    
    public void setsalary(salarystructure salary) {
    	this.salary=salary;
    }
    
    public void setoccupation(salarystructure occupation) {
    	this.occupation=occupation;
    }
    
    public String getName(){
    	return name;
    }
    
    public String getMobile() {
    	return mobile;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public Relation getRelations() {
    	return relations;
    }
    
    public int getAge() {
    	return age;
    }
    public salarystructure getsalary() {
    	return salary;
    }
    
    public salarystructure getoccupation() {
    	return occupation;
    }
    
    
    
}


