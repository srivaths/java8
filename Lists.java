import java.util.*;
public class Lists {
	public static void main(String[] x) {
		List<Integer> aList = Arrays.asList(1, 2, 3, 4, 5);
		
		// Java 1.4
		for(int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
		
		// Java 5
		for(Integer anItem:aList) {
			System.out.println(anItem);
		}
		
		// Java 8
		aList.forEach((Integer anItem) -> System.out.println(anItem));
		aList.forEach(anItem -> System.out.println(anItem));
		aList.forEach(System.out::println);
		
		// TODO: how to use the consumer interface?
	}
}