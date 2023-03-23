package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.Scanner;

public class App{

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/
public static void twisters(){
    for (int i=1; i<=110; i++ ){
     if (i%2==0){
      System.out.print("Tweetle");
     if (i%4==0){
      System.out.print("Beetle");
      }
     if (i%6==0){
      System.out.print("Poodle");
      } 
    }
     else {
      System.out.print(" "+i +" " );
     }
}
  
}


/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
 * @param string
*
*/
public static void phoneKeypad(String string ){
    String result= " ";
    char str=' ';
    switch (str){
    case 'A': case'a':
    case 'B': case 'b':
    case 'C': case'c':
     result +="2";
    case 'D': case'd':
    case 'E': case 'e':
    case 'F': case'f':
      result +="3";
    case 'G': case'g':
    case 'H': case 'h':
    case 'I': case'i':
       result +="4"; 
    case 'J': case'j':
    case 'K': case 'k':
    case 'L': case'l':
       result +="5";  
    case 'M': case'm':
    case 'N': case 'n':
    case 'O': case'o':
       result +="6";  
    case 'P': case'p':
    case 'Q': case 'q':
    case 'R': case'r':
    case 'S': case 's':
       result +="7";   
    case 'T': case't':
    case 'U': case 'u':
    case 'V': case'v':
        result +="8"; 
    case 'W': case'w':
    case 'X': case 'x':
    case 'Y': case'y':
    case 'Z': case 'z':  
        result +="9";   
        break;   
    }
    
    System.out.println(result);

    }




 
    public static void main(String [] args) {
        

        /* Write your code here */
     
       //call method twisters()
       twisters();
       System.out.println(" ");
       //prompt user to enter a string 
       Scanner input =new Scanner (System.in);
       System.out.print("pleas Enter a string");
       //call method phoneKeypad(string)
       phoneKeypad(input.nextLine());


    }

}
