package shuffle;

import java.util.*;

/**
 * This program demonstrates the random shuffle and sort algorithms.
 * 
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
public class ShuffleTest {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 49; i++)
			numbers.add(i);
		//混排
		Collections.shuffle(numbers);
		List<Integer> winningCombination = numbers.subList(0, 6);
		System.out.println("混排前："+winningCombination);
		Collections.sort(winningCombination);
		System.out.println("排序后： "+winningCombination);
	}
}
