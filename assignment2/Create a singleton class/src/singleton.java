import java.io.*;
import java.util.*;
public class singleton 
{
	// Create private attribute that refers to a singleton object
	private static singleton single=new singleton();
	
	//Create private constructor that restricts the object to create object
	//outside the class.
	private singleton()
	{
		
	}
	//Allows us to create and access the object we created.
	public static singleton getInstance()
	{
		return single;
	}
	public void getInfo()
	{
		System.out.println("In Singleton class...!!!");
	}

}

