package Week4;

import java.util.Arrays;

public class Week4CodingProject {

public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
//		Coding Steps
//		1. Create an array of int called ages that contains the following 
//		values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//		Any time you create a new array, this is an easy way to do it without
//		listing every number by index.

//		a. Programmatically subtract the value of the first element in the 
//		array from the value in the last element of the array (i.e. do not use ages[7] 
//		in your code). Print the result to the console.  
		System.out.println("Question 1a:");
		System.out.println(ages [ages.length - 1] - ages [0]); 
		
//		You could subtract the first number (index[0]) from the last number (index[7], but the 
//		instructions tell us not to do that. So the above code is a universal code to use
//		instead of having to go back and change the last index each time a new number is added
//		to the array. Note: the last element of an array is ages.length - 1. So in this equation,
//		the last element = 93, and the first element = 3. So 93 - 3 = 90.

//		b. Create a new array of int called ages2 with 9 elements (ages2 will be 
//		longer than the ages array, and have more elements).  
		
		int [] ages2 = {5, 10, 13, 16, 18, 20, 21, 25, 30};
//		Again, this is just what we did for question 1...just with different numbers

//		i. Make sure that there are 9 elements of type int in this new array.  
//		I used nine random nummbers in the array 
		
//		ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the 
//		value of the first element in the new array ages2 from the last element of ages2). 
		System.out.println("Question 1b:");
		System.out.println(ages2 [ages2.length - 1] - ages2 [0]);
//		Again, this is just like what we did in question 1a.
//		Last element = 30; first element = 5; 30 - 5 = 25.
		
//		iii. Show that using the index values for the elements is dynamic (works for 
//		arrays of different lengths).
//		I show this is 1a, and ii.
		
//		c. Use a loop to iterate through the array and calculate the average age. Print 
//		the result to the console.
		int total = 0;
		for (int age : ages) {
		total += age;
		}
		int average = 0;
		average = (total / ages.length);
		System.out.println("Question 1c:");
		System.out.println(average);
//		Average = the sum of the numbers divided by the amount of numbers. The total is 230; the
//		total numbers in the element is 8. So 230 / 8 = 28.75. But the answer prints out as 28 
//		since I used the int instead of double
				
//		2. Create an array of String called names that contains the following values: 
//		“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//		Just like what we did in the above examples with int...only this time we are using
//		a String since we are using names in this question, instead of numbers

//		a. Use a loop to iterate through the array and calculate the average number of 
//		letters per name. Print the result to the console.
		
		double sum = 0;
		for (String name : names) {
			sum += name.length();
		}
		System.out.println("Question 2a:");
System.out.println(sum / names.length);	
//		Again, doing the same thing as above, except with words instead of numbers. The total 
//		letters combined = 23 (3, 5, 3, 5, 4, 3). And then 23 / 6 (the total names in the array)
//		= 3.833333333. It shows the exact number since I used a double instead of int. 

//		b. Use a loop to iterate through the array again and concatenate all the names 
//		together, separated by spaces, and print the result to the console.

	String allNames = "";
		for (int i = 0; i < names.length; i++) {
			allNames += names[i] + " ";
		}
		System.out.println("Question 2b:");
			System.out.println(allNames);
//		This loop is showing that allNames are = allNames + names[i]. Meaning that as long as
//		"i" is less than the length of each name, then it will print out each name. I used + quotes
//		after the [i] to put a space in between the names. 
			
//		3. How do you access the last element of any array?

//			To get the first element, you can access it using index 0. 
//			To get the last element, you can access it using the index array.length - 1

//		4. How do you access the first element of any array?

//			To get the first element, you can access it using index 0. 
//			For example:
//				if we are referring to Question 1, 
//					System.out.println(ages[0]);

//		5. Create a new array of int called nameLengths. Write a loop to iterate over 
//		the previously created names array and add the length of each name to the 
//		nameLengths array.

			int [] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length(); 
			}
			System.out.println("Question 5:");
System.out.println(Arrays.toString(nameLengths));
//		To find the length of each name, I needed to create the "i" variable in order for the loop
//		to run through each name and give the "length" of each. Similar to my explanation in 2b. 
//		I printed out the length to the console: [3, 5, 3, 5, 4, 3].


//		6. Write a loop to iterate over the nameLengths array and calculate the sum of 
//		all the elements in the array. Print the result to the console.
			
			sum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				sum += nameLengths[i];
			}
			System.out.println("Question 6:");
			System.out.println("The sum of lengths in nameLengths = " + sum);
//			To add all the numbers I just printed to the console, I had to write the equation:
//			sum = sum + nameLengths.[i];. Meaning as long as "i" is less than the length of
//			nameLengths, it will work. If "i" was showing > nameLengths.length, it wouldn't run
//			since 0 will never be greater than any length of letters. 
			
//			7. Write a method that takes a String, word, and an int, n, as arguments and 
//			returns the word concatenated to itself n number of times. (i.e. if I pass in 
//			“Hello” and 3, I expect the method to return “HelloHelloHello”).
			System.out.println("Question 7:");
			System.out.println(repeatWord("Hello", 7));
//			See below question 8 for my code and explanation
			
//			8. Write a method that takes two Strings, firstName and lastName, and returns a 
//			full name (the full name should be the first and the last name as a String 
//			separated by a space).
			
			System.out.println("Question 8:");
			System.out.println(fullName("Brittney", "Chavez"));
			
			int [] numbers3 = {25, 20, 30, 35};
			System.out.println("Question 9:");
			System.out.println(greaterThan100 (numbers3));
			
			double [] numbers = {2.2, 3.6, 5.5, 6.7, 9.0, 10.1};
			System.out.println("Question 10:");
			System.out.println(theAverage (numbers));
			
			double [] digits1 = {12, 14, 17, 18, 22};
			double [] digits2 = {6, 8, 21, 22, 31};
			System.out.println("Question 11:");
			System.out.println(whichArrayIsGreater (digits1, digits2));
			
			boolean isHotOutside = true;
			double moneyInPocket = 10.25; 
			System.out.println("Question 12:");
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
			
			boolean isMonday = false;
			boolean isTuesday = true;
			int tempOutside = 26;
			System.out.println("Question 13:");
			System.out.println(willCanBeer(isMonday, isTuesday, tempOutside));
		} //End of main
	
//		7. Write a method that takes a (String, word), and an (int, n), as arguments and 
//		returns the word concatenated to itself n number of times. (i.e. if I pass in 
//		“Hello” and 3, I expect the method to return “HelloHelloHello”).
			
	public static String repeatWord(String word, int n) {
		String repeatWord = "";
		for (int i = 0; i < n; i++) {
			repeatWord += word;
		} return repeatWord;
	}
//		I am writing the method here as opposed to up above, because I can't write a method inside 
//		of another method. 
//		Just like in previous questions, again I am using the += for this method. Meaning, 
//		repeatWord = repeatWord + word. So this means that since I wrote up above question 8 
//		(in the first method), that the repeatWord = Hello, and "n" (number of times) = 7, the 
//		loop will continue to run/repeat "Hello" until "i" > n (7). So  this results in Hello being
//		repeated 7 times. 
			
//		8. Write a method that takes two Strings, firstName and lastName, and returns a 
//		full name (the full name should be the first and the last name as a String 
//		separated by a space).
	
public static String fullName(String firstName, String lastName) {
		

 return firstName + " " + lastName;
}
//		This is a relatively easy question to code since it's really straightforward. So I did 
//		exactly what it asked me to...wrote a String with my firstName, and lastName. And then 
//		returning exactly what it asks for...my first name with a space between my last name.
			
//		9. Write a method that takes an array of int and returns true if the sum of all 
//		the ints in the array is greater than 100.

public static boolean greaterThan100(int [] arr) {
	int sum = 0;
	for (int i = 0; i < arr.length; i++) {
		sum += arr[i];
	}
	return (sum > 100);
}
//		For this question, I created an array with these numbers: int [] numbers3 = {25, 20, 30, 35};
//		So the sum of them is 110...so this should print true, since 110 is greater than 100.
//		Just like prior questions, I am using the "i" variable again. So we have sum = sum + arr[i].
//		Meaning that as long as "i" is less than the array, it'll run. When we return 110 > 100, that
//		does in fact run as true, since 110 is greater than 100. 
			
//		10. Write a method that takes an array of double and returns the average of all 
//		the elements in the array.

public static double theAverage (double [] numbers) {
	double sum = 0;
	for (double number : numbers) {
		sum += number;
	}
	return sum / numbers.length;
	
}
//		Average = the sum of all the numbers, divided by the total numbers in the array. For this
//		array, I used this: double [] numbers = {2.2, 3.6, 5.5, 6.7, 9.0, 10.1};
//		The sum of all these numbers is 37.1. The total numbers in the array is 6.
//		So 37.1 / 6 = 6.183333. To code that, we are looking for each number in the numbers array...
//		which is equivalent to: for (double number : numbers). sum += number is the same as:
//		sum =  sum + number. So each time this loop runs, it's adding each number to the previous
//		number in the array, until it reaches the total sum of the array. And to return the average, 
//		I divided the sum (of the array) by the total numbers in the array .length).

//		11. Write a method that takes two arrays of double and returns true if the average 
//		of the elements in the first array is greater than the average of the elements in 
//		the second array.

public static boolean whichArrayIsGreater (double [] digits1, double [] digits2) {
	double sum1 = 0;
	for (double digit1 : digits1) {
		sum1 += digit1; 
	
	}
	double sum2 = 0;
	for (double digit2 : digits2) {
		sum2 += digit2; 

}
		return (sum1/digits1.length) > (sum2/digits2.length);
		
}
//		This is very similar to the question above (10), except I have to find the average of two
//		arrays (as opposed to one), and then see if the first array average is greater than the 
//		second array average. My arrays were: double [] digits1 = {12, 14, 17, 18, 22};
//		double [] digits2 = {6, 8, 21, 22, 31};. I did the same code asI did in question 10, and
//		then returned the average of the first array, and the second array, and then saw if the 
//		average of the first array was greater than the average of the second array. 
//		First array: 83 / 5 = 16.6
//		Second array: 88 / 5 = 17.6. So the average of array 1 is not greater than the average of
//		array 2. Therefore false is returned. 

//		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a 
//		double moneyInPocket, and returns true if it is hot outside and if moneyInPocket 
//		is greater than 10.50.
	
		public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50)
				return true;
					else 
				return false;
}
//		So for this method to return true, it has to be hot outside, and there needs to be at least
//		$10.51. It can't be either or...it has to be both to run as true. This question was really
//		simple logic...I wrote it just as I read it. For this question, I made the variables as
//		follows: boolean isHotOutside = true;
//		double moneyInPocket = 10.25; 
//		So based off the logic, this is false, because only one of the variables ends up being true. 
//		And it does in fact end up running as false. 
		
//		13. Create a method of your own that solves a problem. In comments, write what the 
//		method does and why you created it.

//		In order for the brewers to be able to can their new beers, the temperature outside must
//		be 27 F or below, and it must either be a Monday or a Tuesday. If not, then they 
//		cannot can. 
		
		public static boolean willCanBeer (boolean isMonday,  boolean isTuesday, int tempOutside) {
			if ((isMonday || isTuesday) == true && tempOutside <= 27)
				return true;
			else
				return false;
		}
		
//		The method tests if the brewers can can their beer if it is either Monday or Tuesday,
//		and the temperature outside is less than or equal to 27 F. The reason I created this method
//		is because I work in the brewing industry. Many people probably don't know that canning 
//		usually happens on the first two days of the week since the rest of the week is dedicated 
//		to brewing beer and planning for the busy weekend ahead. Also, if the temperature of the
//		glycol is too high, you cannot can beer, because the beer will be mostly all foam. 
//		This was similar to the question above (question 12), but I included an either or for the 
//		first part of the problem. These are what I entered in for the variables:
//		boolean isMonday = false;
//		boolean isTuesday = true;
//		int tempOutside = 26;
//		This ends up running as true since it as to be either Monday or Tuesday, which it is
//		Tuesday, and the temperature is 26, which is less than 27. 
		
//		This coding project didn't ask me to, but I did end up printing everything out to the console
//		so that I could check if I coded correctly. I am not confident AT ALL with my coding skills 
//		(or lack there of), so I wanted to make sure this was done correctly. 
				
}
