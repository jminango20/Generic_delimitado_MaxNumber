package services;

import java.util.List;

public class CalculationService {
	
	public static Integer max(List<Integer> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List can not be empty");
		}
		Integer max = list.get(0);
		for(Integer item:list) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
