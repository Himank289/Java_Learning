package interfaceex;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InstanceethodRefForPrintlnMethod {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		Consumer con=(a)->System.out.println(a);
		
		
		//System.out.println is ref to a  println instance method (inside PrintStream class) which is 
		//out is an instance of printstreamclasss of io package
		//println is an instance method which can be  overriden method def of consumer inteface
		Consumer con1=System.out::println; //example of instancemethod 
		
		List<Integer> lst=Arrays.asList(10,20,50,70);
		lst.forEach(con);
		lst.forEach(System.out::println);

		PrintStream out=new PrintStream(new File("abc.java"));
		lst.forEach(out::println);
		
		
		
		System.out.println("*********StaticMethodRefMath*******");
		System.out.println("Static method reference");	
		//static method reference by using Classname :: static method 
		int maxno=lst.stream().reduce(0,Math::max);
		System.out.println(maxno);
		
		//using 
		int max=lst.stream().reduce(0,(x,y)->Math.max(x, y));
		System.out.println(max);
		
	}

}
