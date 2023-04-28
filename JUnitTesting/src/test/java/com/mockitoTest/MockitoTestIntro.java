package com.mockitoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.mockitotest.entity.StudentDetails;
import com.mockitotest.interfaces.StudentService;

public class MockitoTestIntro {
	
	@Mock
	
	StudentService studentService;
	
	
	
	
	StudentDetails studentDetails;
   
	public void setUp(){
		studentDetails =new StudentDetails(studentService);
	}
	
	@Test
	public void testgetAverageMarks() {
		Mockito.when(studentService.getTotalMarks()).thenReturn(500);
		Mockito.when(studentService.getTotalStudents()).thenReturn(10);
	
		
		int expectedOutput = 50;
		assertEquals(expectedOutput,studentDetails.getAverageMarks());
		
		
		
		
	}
}
