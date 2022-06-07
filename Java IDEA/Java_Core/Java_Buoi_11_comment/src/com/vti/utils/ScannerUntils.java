package com.vti.utils;

import java.util.Scanner;

public class ScannerUntils {

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @param errString
	 */
	private static void printErrString(String errString) {
		System.out.println(errString);
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @param scanner
	 * @param errString
	 * @return
	 */
	public static int inputInt(Scanner scanner, String errString) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @param scanner
	 * @param errString
	 * @return
	 */
	public static float inputFloat(Scanner scanner, String errString) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @param scanner
	 * @param errString
	 * @return
	 */
	public static double inputDouble(Scanner scanner, String errString) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	/**
	 * This method is .
	 * 
	 * @Description: .
	 * @author: NNDuy
	 * @create_date: May 24, 2020
	 * @version: 1.0
	 * @modifer: NNDuy
	 * @modifer_date: May 24, 2020
	 * @param scanner
	 * @param errString
	 * @return
	 */
	public static String inputString(Scanner scanner, String errString) {
		while (true) {
			try {
				String input = scanner.nextLine().trim();
				if (input != null && !input.isEmpty()) {
					return input;
				}
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}
}
