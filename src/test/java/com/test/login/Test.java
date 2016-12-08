package com.test.login;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Test  {
	
	
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	// print n! permutation of the elements of array a (not in order)
    public static void perm2(String s) {
        int n = s.length();
        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = s.charAt(i);
        perm2(a, n);
    }

    private static void perm2(char[] a, int n) {
        if (n == 1) {
            System.out.println(a);
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            perm2(a, n-1);
            swap(a, i, n-1);
        }
    }  

    // swap the characters at indices i and j
    private static void swap(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }


	public static void main(String args[]) {
		
		perm2("abc");
		
		/*Date date = new Date(1426921200000L);
		
		System.out.println(date.toString());*/

        /*String s1 = "2HAI0";
        String s2 = "HAI20B15  5t7";

        String regEex = "[^0-9]+";

        s1 = s1.replaceAll(regEex, ",");
        System.out.print(" Value " + s1);

        s2 = s2.replaceAll(regEex, ",");
        System.out.print(" Value " + s2);

        StringTokenizer stringTokenizer = new StringTokenizer(s2);
        List<Integer> list = new ArrayList<Integer>();
        while (stringTokenizer.hasMoreTokens()) {
            String s = stringTokenizer.nextToken(",");
            list.add(Integer.parseInt(s));
        }

        System.out.print("Sum of nos is "+sum(list));*/


    }

    public static int sum(List<Integer> list) {
        int temp = 0;

        for (Integer value : list) {
            temp = temp + value;
        }
        return temp;
    }
	
}
