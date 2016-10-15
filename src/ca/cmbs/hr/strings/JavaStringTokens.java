package ca.cmbs.hr.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;

public class JavaStringTokens {

	public static void main(final String... args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			solveProblem(br, args);
		} catch (final IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	private static void solveProblem(final BufferedReader br, final String... args) throws IOException {
		final String s = br.readLine().trim();
		final Pattern regex = Pattern.compile("[ .,'_@?!]+");

		System.out.println(Arrays.stream(regex.split(s)).count());
		Arrays.stream(regex.split(s)).forEach(System.out::println);
	}
}
