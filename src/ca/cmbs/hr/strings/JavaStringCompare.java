package ca.cmbs.hr.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class JavaStringCompare {

	public static void main(final String... args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			solveProblem(br, args);
		} catch (final IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	private static void solveProblem(final BufferedReader br, final String... args) throws IOException {
		final String s = br.readLine();
		final int len = Integer.parseInt(br.readLine());

		final List<String> substrings = new LinkedList<>();
		for (int i = 0; i <= s.length() - len; i++) {
			substrings.add(s.substring(i, i + len));
		}

		substrings.sort((s1, s2) -> s1.compareTo(s2));
		System.out.println(substrings.get(0));
		System.out.println(substrings.get(substrings.size() - 1));
	}
}
