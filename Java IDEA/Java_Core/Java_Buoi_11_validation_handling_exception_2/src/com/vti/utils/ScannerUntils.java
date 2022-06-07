package com.vti.utils;

import java.util.Scanner;

public class ScannerUntils {
	private static void printErrString(String errString) {
		System.out.println(errString);
	}

	public static int inputInt(Scanner scanner, String errString) {
		while (true) {
			try {
				return Integer.parseInt(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	public static float inputFloat(Scanner scanner, String errString) {
		while (true) {
			try {
				return Float.parseFloat(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

	public static double inputDouble(Scanner scanner, String errString) {
		while (true) {
			try {
				return Double.parseDouble(scanner.nextLine());
			} catch (Exception e) {
				printErrString(errString);
			}
		}
	}

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
