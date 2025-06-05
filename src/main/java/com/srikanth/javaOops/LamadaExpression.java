package com.srikanth.javaOops;

/*Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface
 
  Java Lambda Expression Syntax:
  
(argument-list) -> {body}  
Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.
  
  */

interface Drawable {
	//public void draw();
	public void draw(int a);

}

public class LamadaExpression {

	public static void main(String[] args) {
		int width = 10;

		// with lambda
		Drawable d2 = (a) -> {
			System.out.println("Drawing " + a);
		};
		d2.draw(1089);
	}
}
