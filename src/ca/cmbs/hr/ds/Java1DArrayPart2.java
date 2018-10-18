package ca.cmbs.hr.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java1DArrayPart2 {

	public static void main(final String... args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			solveProblem(br, args);
		} catch (final IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}

	private static void solveProblem(final BufferedReader br, final String... args) throws IOException {
		final int numTestCases = Integer.parseInt(br.readLine());
		final String s2 = br.readLine();

		final List<Character> s1Chars = s1.chars().mapToObj(i -> Character.valueOf((char) i))
				.map(ch -> Character.toLowerCase(ch)).collect(Collectors.toList());
		final List<Character> s2Chars = s2.chars().mapToObj(i -> Character.valueOf((char) i))
				.map(ch -> Character.toLowerCase(ch)).collect(Collectors.toList());
		s1Chars.sort(Character::compareTo);
		s2Chars.sort(Character::compareTo);

		System.out.println(s1Chars.equals(s2Chars) ? "Anagram" : "Not Anagrams");
	}

	private static boolean executeTestCase(final TestCase testCase) {

		// TODO
		return false;
	}

	private static class TestCase {
		private final int len;
		private final int jumpLen;
		private final int[] startingBoard;

		public TestCase(final String paramLine, final String boardLine) {
			final String[] params = paramLine.split(" ");
			len = Integer.parseInt(params[0]);
			jumpLen = Integer.parseInt(params[1]);
			startingBoard = Arrays.stream(boardLine.split(" ")).mapToInt(Integer::parseInt).toArray();
		}
	}

	private static class Board {
		private final int[] board;
		private final int currentPos;

		public Board(final int[] initBoard) {
			this.board = Arrays.copyOf(initBoard, initBoard.length);
			currentPos = 0;
		}

	}

	private static enum Move {
		FORWARD(0b10), BACKWARD(0b100), JUMP(0b1000);

		private final int flag;

		private Move(final int flag) {
			this.flag = flag;
		}

		public int getFlag() {
			return flag;
		}
	}

}
