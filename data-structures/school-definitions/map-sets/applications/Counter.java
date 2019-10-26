package wordCounting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Counter<T> {

	protected Map<T, Integer> counts;

	public Counter() {
		counts = new HashMap<T, Integer>();
	}

	public void put(T x) {
		if (!counts.containsKey(x))
			counts.put(x, 1);
		else
			counts.put(x, counts.get(x) + 1);
	}

	public Integer get(T x) {
		return counts.get(x);
	}

	public Set<T> keySet() {
		System.out.println("Using an unsorted Counter:");
		return counts.keySet();
	}

}