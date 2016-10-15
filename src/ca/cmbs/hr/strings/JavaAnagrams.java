package ca.cmbs.hr.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class JavaAnagrams {

	public static void main(final String... args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			solveProblem(br, args);
		} catch (final IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	private static void solveProblem(final BufferedReader br, final String... args) throws IOException {
		final String s1 = br.readLine();
		final String s2 = br.readLine();

		final List<Character> s1Chars = s1.chars().mapToObj(i -> Character.valueOf((char) i))
				.map(ch -> Character.toLowerCase(ch))
				.collect(Collectors.toList());
		final List<Character> s2Chars = s2.chars().mapToObj(i -> Character.valueOf((char) i))
				.map(ch -> Character.toLowerCase(ch))
				.collect(Collectors.toList());
		s1Chars.sort(Character::compareTo);
		s2Chars.sort(Character::compareTo);

		System.out.println(s1Chars.equals(s2Chars) ? "Anagram" : "Not Anagrams");
	}
}
