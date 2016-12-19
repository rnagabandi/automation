package com.automation.number;

import java.util.HashSet;

/**
 * @author Raghavender
 *
 */
public class NumberGen {

	static HashSet<String> numbers = new HashSet<String>();

	/**
	 * @param num
	 * @return true or false
	 * @Description It will check whether the given number is duplicate or not
	 */
	public synchronized static boolean isNumberDuplicate(String num) {
		if (numbers.contains(num))
			return true;
		return false;
	}

	/**
	 * @param noOfDigits
	 * @return number in String format
	 * @Description It will generate the random number based on the input digts
	 *              length, i.e. US - 10 Digit
	 */
	public static String getRandomNumber(int noOfDigits)
			throws NegativeNumberException {

		if (noOfDigits < 1) {
			throw new NegativeNumberException(
					"Test Failed due to negative number");
		}

		String curentTime = String.valueOf(System.nanoTime());

		if (curentTime.length() > noOfDigits) {

			String number = String.valueOf(System.nanoTime()).substring(0,
					noOfDigits);

			while (true) {
				if (isNumberDuplicate(number)) {
					number = String.valueOf(System.nanoTime()).substring(0,
							noOfDigits);
				} else {
					numbers.add(number);
					break;
				}
			}

			return number;
		} else {
			int diff = noOfDigits - curentTime.length();
			String number = curentTime + getRandomNumber(diff);
			while (true) {
				if (isNumberDuplicate(number)) {
					number = String.valueOf(System.nanoTime()).substring(0,
							noOfDigits);
				} else {
					numbers.add(number);
					break;
				}
			}

			return number;
		}
	}

	/**
	 * @param number
	 * @return String
	 * @Description Below method will convert the number to US format
	 */
	public static String convertToUSFormat(String number) {

		if (number.length() != 10) {
			return null;
		}
		return "(" + number.substring(0, 3) + ") " + number.substring(3, 6)
				+ "-" + number.substring(6);
	}

	public static void main(String[] args) {

		try {
			for (int i = 0; i < 1000; i++)
				System.out.println(convertToUSFormat(getRandomNumber(10)));

		} catch (NumberFormatException e) {
			System.out.println("Given numder is getaive number");
		} catch (Exception e) {
			System.out.println("Test Failed due to run time exception");
		}

	}
}
