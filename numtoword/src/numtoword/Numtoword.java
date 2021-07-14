/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numtoword;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Numtoword {

// A function that prints 
// given number in words  
static void convert_to_words(char[] num) 
{ 
    int len = num.length;  
  
  
  
  
    String[] single_digits = new String[]{ "zero", "one",  
                                        "two", "three", "four", 
                                        "five", "six", "seven",  
                                            "eight", "nine"}; 
  
    String[] two_digits = new String[]{"", "ten", "eleven", "twelve",  
                                        "thirteen", "fourteen", 
                                        "fifteen", "sixteen", "seventeen", 
                                        "eighteen", "nineteen"}; 
  
    String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty",  
                                            "fifty","sixty", "seventy",  
                                            "eighty", "ninety"}; 
  
    String[] tens_power = new String[] {"hundred", "thousand"}; 
  
    /* Used for debugging purpose only */
    System.out.print(String.valueOf(num)+": "); 
    HashMap<String,String> h=new HashMap<String,String>();
  
    /* For single digit number */
    if (len == 1)  
    { 
        String s1=single_digits[num[0] - '0'];
        System.out.println(single_digits[num[0] - '0']); 
        h.put(String.valueOf(num), s1);
        return; 
    } 
  
    /* Iterate while num 
        is not '\0' */
    int x = 0; 
    while (x < num.length)  
    { 
  
        /* Code path for first 2 digits */
        if (len >= 3) 
        { 
            if (num[x]-'0' != 0) 
            { 
                System.out.print(single_digits[num[x] - '0']+" "); 
                System.out.print(tens_power[4 - 3]+" ");  
                // here len can be 3 or 4 
            } 
            --len; 
        } 
  
        /* Code path for last 2 digits */
        else
        { 
            /* Need to explicitly handle  
            10-19. Sum of the two digits 
            is used as index of "two_digits" 
            array of strings */
            if (num[x] - '0' == 1)  
            { 
                int sum = num[x] - '0' +  
                    num[x] - '0'; 
                System.out.println(two_digits[sum]); 
                 h.put(String.valueOf(num), two_digits[sum]);
                return; 
            } 
  
            /* Need to explicitely handle 20 */
            else if (num[x] - '0' == 2 &&  
                    num[x + 1] - '0' == 0) 
            { 
                System.out.println("twenty"); 
                 h.put(String.valueOf(num), "twenty");
                return; 
            } 
  
            /* Rest of the two digit  
            numbers i.e., 21 to 99 */
            else
            { 
                String ho="";
                int i = (num[x] - '0'); 
                if(i > 0) 
                {  System.out.print(tens_multiple[i]+" "); 
                ho=ho+tens_multiple[i]+" ";}
                else
                { System.out.print(""); 
                ho=ho+"";}
                ++x; 
                if (num[x] - '0' != 0) 
                {   System.out.println(single_digits[num[x] - '0']); 
                    ho=ho+single_digits[num[x] - '0'];}
                h.put(String.valueOf(num), ho);
            } 
        } 
        ++x; 
    } 
    System.out.println(h);
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
convert_to_words("9923".toCharArray()); 
convert_to_words("523".toCharArray()); 
convert_to_words("89".toCharArray()); 
convert_to_words("8989".toCharArray()); 
} 

    
}
