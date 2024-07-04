package com.StremApiDemo.org;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremApiDemo {

	public static void main(String[] args) {
		//Acquire the stream of values
		Stream<Integer> s1=Stream.of(1,2,3,4,5,6,2,5,7);
		//Terminal operation Count() count the values
		System.out.println("Total values:"+s1.count());
		s1=Stream.of(1,2,3,4,5,6,2,5,7);
		//finding distinct values- intermediate operation distinct()
		Stream<Integer> Disnum=s1.distinct();
		//counting distinct values
		long cnt=Disnum.count();
		System.out.println("Total Distinct Values:"+cnt);
		
		//skip
		//Acquire a stream-stream of values
		s1=Stream.of(1,2,3,4,5,6,2,5,7);
		cnt=s1.skip(3).count();
		System.out.println("Total distinct values:"+cnt);
		//IilegalArgumentException if we give skip(-2)
		
		//limit
		s1=Stream.of(1,2,3,4,5,6,2,5,7);
		cnt=s1.limit(5).count();
		System.out.println("total values using limit" +cnt);
		
		//Terminal opn collect
		s1=Stream.of(1,2,3,4,5,6,2,5,7);
		List<Integer> Disnum1=s1.limit(3).collect(Collectors.toList());
		System.out.println(Disnum1);
		
		//foreach perform opn on each value of stream
		s1=Stream.of(1,2,3,4,5,6,2,5,7);
		s1.forEach(System.out::print);
		
		
	}

}
