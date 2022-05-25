package com.VTI.backend;

public class Question1 {
	public static void main(String[] args) {

		int[] numbers = { -1, 1, 3, 5, -5, -8 };
		int maxValue = getMaxValue(numbers);
//		int minValue = getMinValue(numbers);
//logiA
//		logic B


		System.out.println("Max Value: " + maxValue);
//		System.out.println("Min Value: " + minValue);
	}


	public static int getMaxValue(int[] numbers) {
		int maxValue = 0;
		try{
			// logia
			 maxValue = numbers[6];
			for (int i = 1; i < numbers.length; i++) {
				if (numbers[i] > maxValue) {
					maxValue = numbers[i];
				}
			}
			String a = "Hello";
			Integer b = 1;
			int c= 2;
			try {

			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.out.println("Array");
			}

			catch (Exception e) {
				e.printStackTrace();
				System.out.println("Array");
			}



			//logic B
//			data type
			//logic
		}
		catch (Exception e){
			e.printStackTrace();


		}

		return maxValue;

	}

	public static int getMinValue(int[] numbers) {
		int minValue = numbers[0];
		for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers[i] > minValue) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
}
