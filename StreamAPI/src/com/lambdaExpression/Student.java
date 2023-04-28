package com.lambdaExpression;

import java.util.ArrayList;

public class Student {
	
	    private int id;
	    private String name;
	    private String course;
	    
	    public Student(int id, String name, String course) {
	        this.id = id;
	        this.name = name;
	        this.course = course;
	    }
	    
	    public int getId() {
	        return id;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public String getCourse() {
	        return course;
	    }
	    
	    public static void main(String[] args) {
	    	
	        ArrayList<Student> students = new ArrayList<Student>();
	             
	        students.add(new Student(101, "John", "Art"));
	        students.add(new Student(102, "Akash", "Engg"));
	        students.add(new Student(103, "Karan", "Msc"));
	        students.add(new Student(104, "Arjun", "Science"));
	        
	        
	        int searchId = 102;
	        String searchCourse = "Engg";
	        String studentName = students.stream()
	                .filter(s -> s.getId() == searchId && s.getCourse().equals(searchCourse))
	                .map(Student::getName)
	                .findFirst()
	                .orElse("Student not found");
	       
	        System.out.println("Student name: " + studentName);
	    }
	}


	
