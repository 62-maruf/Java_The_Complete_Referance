/*
**Question:** Write a Java program to demonstrate the use of a `final` method. 
Create a class named `Bike` with a final method `run()`, then create a subclass named `Honda` that attempts to override the `run()` method.
What happens when you compile the program?
*/



class Bike{

final void run(){System.out.println("running");}  

}

class Honda extends Bike{

void run(){System.out.println("running safely with 100kmph");}

public static void main(String args[]){

Honda obj= new Honda();

obj.run();

}

}
