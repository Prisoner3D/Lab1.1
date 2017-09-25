/**
 * @name Thomas Zhou
 * ControlStructures - Lab 1.1
 * AP Computer Science A
 */
public class ControlStructures {

	public static void main(String[] args) {
		//primePrinter(1,229);
		//primePrinter(1,229,true);
		
		fooBarBaz();
		//fooBarBaz(200, 210);
		
		//first50Prime();
	}
/**
 * primePrinter searches through an interval and prints the prime numbers between them.
 * 
 * @param min The minimum value of the prime numbers to be printed.
 * @param max The maximum value of the prime numbers to be printed.
 */
	public static void primePrinter(int min, int max)
	{
		int primeNumbers = 0;
		int number = min;
		while (number <= max)
		{
			if (isPrime(number))
			{
				System.out.print(number + " ");
				primeNumbers++;
				if (primeNumbers % 10 == 0)
				{
					System.out.println();
				}
			}
			number++;
		}
	}
	
	public static void primePrinter(int min, int max, boolean onlyLast)
	{
		if (onlyLast)
		{
			int number = max;
			while (number >= min)
			{
				if (isPrime(number))
				{
					System.out.println(number);
					break;
				}
				number--;
			}
		}
		else
		{
			int primeNumbers = 0;
			int number = min;
			while (number <= max)
			{
				if (isPrime(number))
				{
					System.out.print(number + " ");
					primeNumbers++;
					if (primeNumbers % 10 == 0)
					{
						System.out.println();
					}
				}
				number++;
			}
		}
	}
	
	public static void first50Prime()
	{
		int primeNumbers = 0;
		int number = 1;
		while (primeNumbers < 50)
		{
			if (isPrime(number))
			{
				System.out.print(number + " ");
				primeNumbers++;
				if (primeNumbers % 10 == 0)
				{
					System.out.println();
				}
			}
			number++;
		}
	}
	
	public static boolean isPrime(int number)
	{
		if (number <= 1) 
		{
			return false;
		}
		boolean prime = true;
		int min = 2;
		int max = number / 2;
		while (min <= max && prime == true && number != min)
		{
			if (number % min == 0)
			{
				prime = false;
			}
			min++;
		}
		return prime;
	}
/**
 * fooBarBaz prints out the numbers between 1 and 500, substituting any numbers that are divisible by 3 with 'foo', 
 * any numbers that are divisible by 7 with 'bar', and any numbers divisible by 10 with 'baz'.
 */
	public static void fooBarBaz()
	{
		int count = 1;
		while (count <= 500)
		{
			String combination = "";
			if (count % 3 == 0)
			{
				combination += "foo";
			}
			if (count % 7 == 0)
			{
				combination += "bar";
			}
			if (count % 10 == 0)
			{
				combination += "baz";
			}
			if (combination == "")
			{
				System.out.println(count);
			}
			else
			{
				System.out.println(combination);
			}
			count++;
		}
	}
/**	
 * fooBarBaz prints out the numbers between min and max, substituting any numbers that are divisible by 3 with 'foo', 
 * any numbers that are divisible by 7 with 'bar', and any numbers divisible by 10 with 'baz'.
 * 
 * @param min The value which the method starts at.
 * @param max The value at which the method stops.
 */
	public static void fooBarBaz(int min, int max)
	{
		int count = min;
		while (count <= max)
		{
			String combination = "";
			if (count % 3 == 0)
			{
				combination += "foo";
			}
			if (count % 7 == 0)
			{
				combination += "bar";
			}
			if (count % 10 == 0)
			{
				combination += "baz";
			}
			if (combination == "")
			{
				System.out.println(count);
			}
			else
			{
				System.out.println(combination);
			}
			count++;
		}
	}
}