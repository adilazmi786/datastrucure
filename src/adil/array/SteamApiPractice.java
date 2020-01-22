package adil.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SteamApiPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> number = Arrays.asList(2,3,4,5);

		List<Integer> square= number.stream().map(x->x*x).collect(Collectors.toList());
		number.stream().map(x->x*x).forEach(y->System.out.print(y));

		System.out.println(square);
		
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> searchNames=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(searchNames);
		
		List<String> sortedNames=names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNames);
		int a=2,b=3;
		System.out.println(a==2?2:b);
	}

}
