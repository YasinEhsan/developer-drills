package wordCounting;

import java.util.Set;
import java.util.TreeMap;

public class SortedCounter<K extends Comparable<K>> extends Counter<K> {

	public SortedCounter() {
		counts = new TreeMap<K, Integer>();
	}

	// overridden method reports that the set is sorted
	public Set<K> keySet() {
		System.out.println("This uses a SortedCounter");
		return counts.keySet();
	}

	// SortedCounter method not present in a Counter
	public K first() {
		return ((TreeMap<K, Integer>) counts).firstKey();
	}
}
