package org.stringprogram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		String input = "ABbcaDdeff".toLowerCase();
		char cc = firstNonRepeatChar(input);
		System.out.println(cc);

	}

	public static char firstNonRepeatChar(String input) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : input.toCharArray()) {
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);

		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeated Character");
	}

}
