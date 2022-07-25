package com.greatlearning.dsa.lab3.ques1;

import java.util.Stack;

public class BalancingBrackets {
	static boolean checkingBracketsBalancing(String balancingBrackets) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < balancingBrackets.length(); i++) {
			char character = balancingBrackets.charAt(i);

			if (character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}

			if (stack.isEmpty())
				return false;

			char C;

			switch (character) {
			case '}':
				C = stack.pop();
				if (C == '(' || C == '[')
					return false;
				break;
			case ']':
				C = stack.pop();
				if (C == '{' || C == '(')
					return false;
				break;
			case ')':
				C = stack.pop();
				if (C == '[' || C == '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}

	public static void main(String[] args) {
		String balancingBrackets = "([[{" + "}]])";

		boolean result;

		result = checkingBracketsBalancing(balancingBrackets);

		if (result)
			System.out.println("The enter Srting has Balanced Brackets");
		else
			System.out.println("The enter Srting do not contain Balanced Brackets");

	}
}
