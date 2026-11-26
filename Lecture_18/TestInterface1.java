/*
Question: Write a Java program to demonstrate the use of an interface. 
Create an interface named Drawable with a method draw(). 
Implement the interface in two classes, Rectangle and Circle, and display their respective drawing messages.
Use the Circle class object in the main method to call the draw() method.
  */


interface Drawable{

void draw();

}

//Implementation: by second user

class Rectangle implements Drawable{

public void draw(){System.out.println(“Drawing rectangle");}

}

class Circle implements Drawable{

public void draw(){System.out.println(“Drawing circle");}

}

//Using interface: by third user

class TestInterface1{

public static void main(String args[]){

Circle d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()

d.draw();

}

}
