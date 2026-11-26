/*
**Question:** Write a Java program to demonstrate the use of a `final` variable.
Create a class named `Bike`, declare a final variable `speedlimit` with an initial value of `90`, and try to change its value to `400` inside the `run()` method.
What happens when you compile the program?
*/

class Bike{

final int speedlimit=90;//final variable

void run(){

speedlimit=400;

}

public static void main(String args[]){

Bike obj=new Bike();

obj.run();

} 

tell me question  for this code .
