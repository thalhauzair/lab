package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {

	static String removeDuplicate(String str, int n) {
		char str3[] = str.toCharArray();
		int index = 0;
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < i; j++) {
				if (str3[i] == str3[j]) {
					break;
				}
			}
			if (j == i) {
				str3[index++] = str3[i];
			}
		}
		return String.valueOf(Arrays.copyOf(str3, index));
	}

	static String replaceOddCharacters(String str) {
		char[] str1 = str.toCharArray();
		for (int i = 1; i < str1.length; i = i + 2) {
			str1[i] = '#';
		}
		String str2 = new String(str1);
		return str2;

	}

	static String replaceOddToUpper(String str) {
		char[] str1 = str.toCharArray();
		for (int i = 1; i < str1.length; i = i + 2) {
			str1[i] = Character.toUpperCase(str1[i]);
		}
		String str2 = new String(str1);
		return str2;

	}

	static boolean isPositive(String str){
		char[] str1 = str.toCharArray();
		for(int i=0;i<str1.length;i++){
			for(int j=i+1;j<str1.length;j++) {
				if(str1[i]>str1[j]){
					//count++;
					return false;
				}
				
			}
		}
return true;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		/*int n = str.length();
		System.out.println("1.Replace odd positions with #");
		System.out.println("2.Remove duplicate characters in the String");
		System.out.println("3.Change odd characters to upper case");
		System.out.println("4.Add the String to itself");
		System.out.println("Enter choice");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println(replaceOddCharacters(str));
			break;
		case 2:
			System.out.println(removeDuplicate(str, n));
			break;
		case 3:
			System.out.println(replaceOddToUpper(str));
			break;
		case 4:
			str = str.concat(str);
			System.out.println(str);
			break;

		}

*/		System.out.println(isPositive(str));
		sc.close();
	}
}
