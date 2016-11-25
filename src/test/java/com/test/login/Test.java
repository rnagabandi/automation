package com.test.login;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class Test  {

	public static void main(String args[]) {
		
		
		
		Date date = new Date(1426921200000L);
		
		System.out.println(date.toString());

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
