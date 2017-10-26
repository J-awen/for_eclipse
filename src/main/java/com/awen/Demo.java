package com.awen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		System.out.println("abbbbc".replaceAll("^a[abc]*c$", "*"));
		Pattern pattern = Pattern.compile("^a[abc]*c$");
		Matcher matcher = pattern.matcher("abbbbc");
		boolean result = matcher.find();
	}
}
