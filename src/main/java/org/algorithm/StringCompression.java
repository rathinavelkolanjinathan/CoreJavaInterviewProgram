package org.algorithm;

public class StringCompression {
	public static String compress(String st) {

		int count = 0;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < st.length(); i++) {
			count++;
			if (i + 1 >= st.length() || st.charAt(i) != st.charAt(i + 1)) {

				builder.append(st.charAt(i));
				builder.append(count);
				count = 0;
			}

		}
		return  builder.toString() ;
	}

	public static void main(String[] args) {
		String st1 = compress("kollaann");
		System.out.println("count>>>>" + st1);
	}

}
