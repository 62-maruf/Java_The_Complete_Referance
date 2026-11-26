/*
Question: Write a Java program to demonstrate the use of an abstract class and an abstract method.
Create an abstract class named Bike with an abstract method run().
Then create a subclass named Honda that implements the run() method and displays "running safely".
*/

abstract class Bike{

abstract void run();

}

class Honda extends Bike{

void run(){System.out.println("running safely");}

public static void main(String args[]){

Honda obj = new Honda();

obj.run();

}

}
