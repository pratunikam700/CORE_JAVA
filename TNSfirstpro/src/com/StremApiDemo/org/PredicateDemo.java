package com.StremApiDemo.org;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //predicate functional interface has test() method which accepts any object and return boolean value
		//accept Integer and return true if number is positive
		Predicate<Integer> predicateobj=(n)->n>0;
		Stream<Integer> numstream=Stream.of(1,2,3,4,-4,-3,6);
		//filter() accepts predicate object - filters only positive values
		numstream=numstream.filter(predicateobj);
		numstream.forEach(System.out::println);//for(Integer n:numStream) System.out.println(n);
		
		//consumer functional interface has accept() method which accept value and does not return anything
		Consumer<String> consumerobj=(s)->System.out.println(s.toUpperCase());
		Stream<String> city=Stream.of("Nashik","pune","nagpur");
		//foreach perfom action on each elements of stream
		city.forEach(consumerobj);
		
		//supplier functional interface has get() method which returns an object but does not accept any value
		
		Supplier<Integer> supplierobj=()->{return (10);};
		System.out.println(supplierobj.get());
		
		Supplier<String> supplier=()->"Hello pratu!!";
		System.out.println(supplier.get());
		
		Function<String,Integer> f1=(s)->s.length();
		city=Stream.of("Nashik","pune","nagpur");
		//map() intermediate function receives functions as parameter
		numstream=city.map(f1);
		numstream.forEach(System.out::println);
		System.out.println("______________________________");
		
		numstream=Stream.of(1,2,3,4,5);
		numstream=numstream.map((n)->n*n*n);
		numstream.forEach(System.out::println);
		System.out.println("______________________________");
		
		numstream=Stream.of(1,2,3,4,5);
		Function<Integer,Double> sqrt=(n)->Math.sqrt(n);
		Stream<Double> sqrtunc=numstream.map(sqrt);
		List<Double> sqrtList=sqrtunc.collect(Collectors.toList());
		System.out.println(sqrtList);
		
		System.out.println("------------------------------------");
		numstream=Stream.of(1,2,3,4,5);
		Optional<Integer> sum=numstream.reduce((a,b)->a+b);
		if(sum.isPresent())
			System.out.println("sum is:"+sum);
		
		BinaryOperator<Integer> sumfunc= (a,b)->a+b;
		numstream=Stream.of(10,20,30,40);
		sum=numstream.reduce(sumfunc);
		if(sum.isPresent())
			System.out.println("Sum is"+sum.get());
		
		
	}

}
