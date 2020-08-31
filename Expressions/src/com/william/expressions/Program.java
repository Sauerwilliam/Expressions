package com.william.expressions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); 
        String numbers = read.readLine();//"4x + 3 + 5";//System.in.();

        String[] words = numbers.split(" ");

        
        for (String word: words)
        {
            int x = word.indexOf("x");

            

            System.out.println("X = " + x);
            if (x == -1)
            {
                System.out.println(word);
            }

            if (x >= 1)
            {


                String sub = word.substring(0, x);
                String subs = word.substring(x);


                System.out.println(sub);
                System.out.println(subs);




            }

        }
	}

}
