package ca.cmbs.hr.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaSubstring {

	public static void main(final String... args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			solveProblem(br, args);
		} catch (final IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	private static void solveProblem(final BufferedReader br, final String... args) throws IOException {
		final String s = br.readLine();
		final String[] indeces = br.readLine().split(" ");
		final int i = Integer.parseInt(indeces[0]), j = Integer.parseInt(indeces[1]);

		System.out.println(s.substring(i, j));
	}
}
