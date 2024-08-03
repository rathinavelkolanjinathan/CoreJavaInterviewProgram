package org.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CountTest {

	public static void main(String[] args) {
		final CountTest co = new CountTest();
		// co=new CountTest(); //The final local variable co cannot be assigned. It must
		// be blank and not using a compound assignment

		System.out.println("HashCode::"+co.hashCode());
		// System.out.println(co1.hashCode());
		List list = new ArrayList();
		list.add(21);
		list.add(22);
		list.add(23);


		Stream<Integer> st = list.stream();
		Stream<Integer> ll = st.filter((x) -> x % 2 == 0);
		System.out.println("Result::"+ll.count());
	}
}
