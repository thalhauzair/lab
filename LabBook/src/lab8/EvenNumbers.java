package lab8;

import java.util.*;
import java.io.*;

public class EvenNumbers {
	public static void printEven(String source) throws FileNotFoundException {
		Scanner content = new Scanner(new File(source));
		String s = new String();
		while (content.hasNext()) {
			s = content.nextLine();
			String[] str = s.split(",");
			for (String r : str) {
				if (Integer.parseInt(r) % 2 == 0) {
					System.out.println(r);
				}
			}
		}
		content.close();

	}

	public static void main(String[] args) throws FileNotFoundException {

		String s = "D:/Text/number.txt";
		printEven(s);
	}

}
