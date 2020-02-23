package lab7;

import java.util.*;

public class StringArray {

	public static void usingStringArray() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] products = new String[n];
		for (int i = 0; i < products.length; i++) {
			products[i] = sc.next();
		}
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
		Arrays.sort(products);
		System.out.println("After sorting");
		for (String s : products) {
			System.out.println(s);
		}
		sc.close();
	}

	public static void usingArrayList() {
		List<String> sa = new ArrayList<>();
		sa.add("Mobiles");
		sa.add("Laptops");
		sa.add(1, "Monitors");
		sa.add("Mouse");
		sa.add("Machine");
		sa.add(1, "Keyboards");
		sa.add(1, "Keyboard");
		System.out.println(sa);
		Collections.sort(sa);
		System.out.println("After sorting");
		for (String s : sa) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {

		usingStringArray();
		usingArrayList();

		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1, " ");

	}
}
