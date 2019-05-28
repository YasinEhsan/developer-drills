package wordCounting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenericWordCount {

	public static void main(String args[]) throws FileNotFoundException {

		Scanner terminal = new Scanner(System.in);
		System.out.println("Give the name of a file for analysis:");
		String fileName = terminal.next();
		Scanner input = new Scanner(new File(
				"C:\\Documents and Settings\\alex\\Desktop\\" + fileName));
		input.useDelimiter("\\W+");

		Counter<String> words[] = (Counter<String>[]) new Counter[2]; 
		  // two counters a polymorphic array
		
		words[0] = new Counter<String>();
		words[1] = new SortedCounter<String>();

		while (input.hasNext()) {
			String word = input.next();
			for (int i = 0; i < 2; i++)
				words[i].put(word.toLowerCase());
		}

		for (int i = 0; i < 2; i++)
			for (String word : words[i].keySet())
				System.out.println(words[i].get(word) + "\t" + word);

		input.close();
		terminal.close();
	}
}