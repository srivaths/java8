import java.util.*;
import java.util.function.*;
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
		
		// Java 8 using Consumer
    //  -- forEach defined in Iterable
    aList.forEach(new Consumer<Integer>() {
      public void accept(Integer r) {
        System.out.println(r);
      }
    });
		
		// Java 8 - Simplified further
		aList.forEach((Integer anItem) -> System.out.println(anItem));
		aList.forEach(anItem -> System.out.println(anItem));
		aList.forEach(System.out::println);
	}
}
