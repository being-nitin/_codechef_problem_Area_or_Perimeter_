package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Write a program to obtain length (L) and breadth (B) of a rectangle and check whether its area
	is greater or perimeter is greater or both are equal.

    Input:
    First line will contain the length (L) of the rectangle.
    Second line will contain the breadth (B) of the rectangle.

    Output:
    Output 2 lines.

    In the first line print "Area" if area is greater otherwise print "Peri" and if they are equal
    print "Eq".(Without quotes).

    In the second line print the calculated area or perimeter (whichever is greater or anyone if it
    is equal).

    Constraints
    1≤L≤1000
    1≤B≤1000
    Sample Input:
    1
    2
    Sample Output:
    Peri
    6

 */
  Scanner sc = new Scanner(System.in);
  int length,breadth,perim,area;
  length = sc.nextInt();
  breadth = sc.nextInt();
  perim = 2*(length+breadth);
  area = length*breadth;
  if(perim>area) {
      System.out.println("Peri");
      System.out.println(perim);
  }
  else if(perim<area){
      System.out.println("Area");
      System.out.println(area);
  }
  else{
      System.out.println("Eq");
      System.out.println(area);
  }
    }
}
// it will give if peri if perimeter will be greater than area.
// it will give Area if Area will be greater than perimeter.