package testAnt;

import java.util.Date;

import org.testng.annotations.Test;

public class Guru99AntClass {

	@Test
	public  void  Guru99AntTestNGMethod(){
		System.out.println("HELLO GURU99 ANT PROGRAM");
		System.out.println("TODAY's DATE IS->"+ currentDate() );
	}
	
	public static String currentDate(){
		return new Date().toString();
	}
}
