package ca.cmbs.hr.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaStringsIntroduction {

	public static void main(final String... args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			solveProblem(br, args);
		} catch (final IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	private static void solveProblem(final BufferedReader br, final String... args) throws IOException {
		final String a = br.readLine();
		final String b = br.readLine();

		System.out.println(a.length() + b.length());
		System.out.println(a.compareTo(b) > 1 ? "Yes" : "No");
		System.out.println(capitalizeFirstLetter(a) + ' ' + capitalizeFirstLetter(b));

	}

	private static String capitalizeFirstLetter(final String s) {
		if (s.length() == 0) {
			return s;
		}
		return s.substring(0, 1).toUpperCase() + s.substring(1, s.length());
	}
}
