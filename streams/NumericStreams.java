package streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {

	public static void main(String[] args) {
		
		//IntSream,LongStream,DoubleStream are streams of primitive dataypes //we will get mathematical operation function in this class
		//which we will not get in Stream<Integer> class
		// TODO Auto-generated method stub
		IntStream intnums=IntStream.of(1,2,3,4,5,6);
		intnums.forEach(System.out::println);
		
		intnums=IntStream.iterate(0, i->i+2).limit(10);
		intnums.forEach(System.out::println);
		
		//coverting primitve intstream to integer object stream using box method of primitive IntStream class
//		Stream<Integer> intobjstrm=intnums.boxed();
//		
//		List<Integer> lst=Arrays.asList(23,45,67,89);
//		//converting object stream to primitve integer stream
//		IntStream stmpr=lst.stream().mapToInt((Integer i)->i.intValue());
		
		intnums=IntStream.range(0, 20);
		intnums.forEach(System.out::println);
		
		intnums=IntStream.rangeClosed(0, 20);
		intnums.forEach(System.out::println);
		
		DoubleStream doublenums = DoubleStream.of(1.1,2.2,3.3,4.4,5.5);
		doublenums.forEach(System.out::println);
		
		//converting longstream to doublestream
		doublenums = LongStream.range(0,5).asDoubleStream();
		doublenums.forEach(System.out::println);
		
		int sum = IntStream.rangeClosed(0,10).sum();
		System.out.print(sum);//this wil calculate sum of 10 numbers
		
		OptionalInt max = IntStream.rangeClosed(0,10).max();
		
		if(max.isPresent())
		System.out.println("max of first 10 integers:"+max.getAsInt());
		
		OptionalDouble avg = IntStream.rangeClosed(0,10).average();
		
		if(avg.isPresent()) {
			System.out.println("average of first 10 integers:"+avg.getAsDouble());
			
		}
	}
	


}


//package streams;
//import java.util.OptionalDouble;
//import java.util.OptionalInt;
//import java.util.stream.DoubleStream;
//import java.util.stream.IntStream;
//import java.util.stream.LongStream;
//
//public class NumericStreams {
//	
//	public static void main(String[] args)
//	{
//		IntStream intnums = IntStream.of(1,2,3,4,5);
//		intnums.forEach(System.out::println);
//		
//		System.out.println("------------------------");
//		intnums = IntStream.iterate(0,i->i+2).limit(10);
//		intnums.forEach(System.out::println);
//		
//		
//		
//		System.out.println("------------------------");
//		intnums = IntStream.range(0,5);
//		intnums.forEach(System.out::println);
//		
//		System.out.println("------------------------");
//		intnums = IntStream.rangeClosed(0,5);
//		intnums.forEach(System.out::println);
//		
//		//repeat same for LongStream
//		//DoubleStream
//		DoubleStream doublenums = DoubleStream.of(1.1,2.2,3.3,4.4,5.5);
//		doublenums.forEach(System.out::println);
//		
//		System.out.println("------------------------");
//		doublenums = DoubleStream.iterate(0,i->i+2.0).limit(10);
//		doublenums.forEach(System.out::println);
//		
//		System.out.println("------------------------");
//		doublenums = DoubleStream.generate(new Random()::nextDouble).limit(10);
//		doublenums.forEach(System.out::println);
//		
//		System.out.println("------------------------");
//		doublenums = LongStream.range(0,5).asDoubleStream();
//		doublenums.forEach(System.out::println);
//		
//		System.out.println("------------------------");
//		doublenums = LongStream.rangeClosed(0,5).asDoubleStream();
//		doublenums.forEach(System.out::println);
//		
//		//sum(),min(),max(),average()
//		int sum = IntStream.rangeClosed(0,1000).sum();
//		System.out.println("sum of first 1000 integers:"+sum);
//		
//		OptionalInt min = IntStream.rangeClosed(0,1000).min();
//		
//		if(min.isPresent())
//		System.out.println("min of first 1000 integers:"+min.getAsInt());
//		
//		OptionalInt max = IntStream.rangeClosed(0,1000).max();
//		
//		if(max.isPresent())
//		System.out.println("max of first 1000 integers:"+max.getAsInt());
//		
//	    OptionalDouble avg = LongStream.rangeClosed(0,1000).asDoubleStream().average();
//		System.out.println("avg of first 1000 integers:"+(avg.isPresent()?avg.getAsDouble():0.0));
//		
//	}
//
//}
