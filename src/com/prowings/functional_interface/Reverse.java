package com.prowings.functional_interface;

public class Reverse {
	public static void rev(char s[], int l, int r)
	{
		for (int i = l; i < r / 2; i++) {
			char temp = s[i];
			s[i] = s[r - 1 - i];
			s[r - 1 - i] = temp;
		}
	}
	public static void reverse(char s[])
	{
		// creating character array of size
		// equal to length of string
		char[] temp = new char[s.length];
		int x = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z'|| s[i] >= 'A' && s[i] <= 'Z') {
				// storing elements in array
				temp[x] = s[i];
				x++;
			}
		}

		// reversing the character array
		rev(temp, 0, x);

		x = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] >= 'a' && s[i] <= 'z'
				|| s[i] >= 'A' && s[i] <= 'Z') {
				// updating the origional string
				s[i] = temp[x];
				x++;
			}
		}

		String revStr = new String(s);
		System.out.println("reversed string is: " + revStr);
	}

	public static void main(String[] args)
	{
//		String str = "Ab,c,de!$";
		String str = "a,b%cde&xy";
		char[] charArray = str.toCharArray();
		reverse(charArray);
	}
}