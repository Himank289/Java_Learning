package streams;

import java.util.*;
//https://medium.com/@mesfandiari77/parallel-stream-in-java-ac47c54176e0 for studying parallel streams
public class UsingParallelStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//we use parallel stream in case of stream object and parallel function in case of primitve integer / values 


		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		int sum = numbers.parallelStream()
		                .mapToInt(Integer::intValue)
		                .sum();
		System.out.println(sum);
	}

}
