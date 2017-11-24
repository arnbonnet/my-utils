package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyUtils {

	public static int sum(List<Integer> list) {
		if(list == null || list.isEmpty()) {
			return 0;
		}
		
		return list.stream()
				.mapToInt(i -> i == null ? 0 : i)
				.sum();
	}

	public static Object emptyToNull(String s) {
		return s.isEmpty()?null:s;
	}

	public static List<Integer> filterEvenNumbers(List<Integer> list) {
		if(list == null || list.isEmpty()) {
			return new ArrayList<>();
		}
		return list.stream()
				.filter(i -> i == null ? false : i%2==0)
				.collect(Collectors.toList());
	}

	public static List<Float> transformSquarePlusPointFive(List<Integer> list) {
		if(list == null || list.isEmpty()) {
			return new ArrayList<>();
		}
		
		return list.stream()
				.filter(i -> i != null)
				.map(i -> i.floatValue() * i.floatValue() + 0.5F)
				.collect(Collectors.toList());
	}

}
