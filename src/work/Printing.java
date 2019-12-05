package work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;
import java.*;
import java.math.*;

public class Printing {

	public static void main(String[] Args) {

		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 21; i++) {
			numbers.add(i);
		}

		System.out.println("Max: " + Collections.max(numbers));
		System.out.println("Min: " + Collections.min(numbers));

		List<Integer> evenNumbers = new ArrayList<>();
		for (int j = 0; j < 21; j++) {
			if (j % 2 == 0) {
				evenNumbers.add(j);
			}
		}
		System.out.println("Even: " + evenNumbers);

		List<Integer> oddNumbers = new ArrayList<>();
		for (int j = 0; j < 21; j++) {
			if (j % 2 != 0) {
				oddNumbers.add(j);
			}
		}
		System.out.println("Odd: " + oddNumbers);
		int sum = 0;
		for (Integer i : numbers) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
		
		List <Integer> squareList = new ArrayList <>();
		for (Integer i : numbers) {
			squareList.add(i*i);
		}
	
		
		System.out.println();

		numbers.stream().reduce((number1, number2) -> Math.max(number1, number2)).get();
		numbers.stream().reduce((number1, number2) -> Math.min(number1, number2)).get();
		numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		numbers.stream().reduce((number1, number2) -> number1 + number2).get();
		numbers.stream().map(num -> num * num).filter(num -> num % 2 == 0).reduce((num1, num2) -> Math.min(num1, num2))
				.get();

		System.out.println(
				"Max value: " + numbers.stream().reduce((number1, number2) -> Math.max(number1, number2)).get());
		System.out.println(
				"Min value: " + numbers.stream().reduce((number1, number2) -> Math.min(number1, number2)).get());
		System.out
				.println("Even numbers: " + numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()));
		System.out.println("Odd numbers: " + numbers.stream().filter(num -> num % 2 != 0).collect(Collectors.toList()));
		System.out.println("Sum: " + numbers.stream().reduce((number1, number2) -> number1 + number2).get());
		System.out.println("Minimum of the even squared: " + numbers.stream().map(num -> num * num)
				.filter(num -> num % 2 == 0).reduce((num1, num2) -> Math.min(num1, num2)).get());
	}
}
