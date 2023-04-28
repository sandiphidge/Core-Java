package Junit;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Java_learning.Demo;
import Java_learning.EmployeeUtil;
//import Java_learning.Key_Value;
import Java_learning.Test2;;

public class Junit_Testing {
                                             
  	Demo d;
  	Test2 t2;
  	EmployeeUtil empUtil;
  //	Key_Value keyValue;
	//	@Test
		//public void check() {
			//boolean result = true;
			//assertTrue(result); -->
		//	}
	@BeforeEach
//	public void setUp() {
//		 d = new Demo ();
	public void setup() {
		d= new Demo();
		t2 = new Test2();
		empUtil = new EmployeeUtil();
		//Key_Value = new Key_Value();
		 
	}
	//AssertEqual
//	@Test
////	public void testsumofDigit() {
////		int num = 1234;
////		int expectedOutput = 10;
////		Assertions.assertEquals(expectedOutput,d.sum0fDigit(num));
////				}
////	//assertTrue or AssertFalse
////	@Test
////	public void testisEven() {
////		int num = 20;
////		@SuppressWarnings("unused")
////		boolean expectedOutput = true;
////		Assertions.assertTrue(d.inEven(num));
////	}
////	@Test
////	public void testsumOfElements() {
////		int[] arr = {1,2,4,5,6};
////		int expectedOutput = 19;
////		assertEquals(expectedOutput,t2.sumOfElements(arr));
	//}
           //AssertArrayEqual
//	public void testOrderByFirstName() {
//		List<Employee> emps = new ArrayList<>();
//		emps.add(new Employee(1,"Varun","Kumar"));
//		emps.add(new Employee(2,"Akash","Swaroop"));
//		emps.add(new Employee(3,"Manoj","Kumar"));
//		
//		String[] expectedArray = {"Akash","Manoj","Varun"};
//		Assertions.assertArrayEquals(expectedArray,empUtil.OrderByFirstName(emps));
//			
//	}
	
	  // assertnull:looking null object
//@Test
//
//	public void testshowMap(){
//		String key = "key3";
//		assertNull(keyValue.showMap(key));
//		//assertNotNull(keyValue.showMap(key));
//	}
//	//assertsame (str2,str)
//	public void testAssertSame() {
//		String str = "Java";
//		String str2 = str;
//		assertSame(str2,str);
//		
		
	}
	
	