package org.college;

public class Student extends Department {
	
	static void StudentName()
	{
		
		System.out.println("Student name is Umapriya");
		
		
	}
	
	static void StudentDept()
	{
		

		System.out.println("Student dept id IT");
		
		
	}
	static void StudentId()
	{
		

		System.out.println("Student id is 056");
		
		
	}
	
	
    public static void main(String[] args) 
    
    {
    	 
    	Student std=new Student();
    	StudentName();
    	StudentDept();
    	StudentId();
    	std.collegeName();
    	std.collegeCode();
    	std.collegeRank();
    	std.DeptName();
    	
    	
    	
    }
    
	
	
	
	
	

}
