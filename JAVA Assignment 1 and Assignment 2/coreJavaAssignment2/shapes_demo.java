package com.coreJavaAssignment2;

abstract class Shape
{
	abstract String draw(int parameter);
}

class Line extends Shape
{

	@Override
	String draw(int parameter) {
		
		return "Line is created of "+parameter+"cms";
		
	}	
}

class Rectangle extends Shape
{

	@Override
	String draw(int parameter) {
		// TODO Auto-generated method stub
		return "Rectangle is created of "+parameter+"cms";
	}
	
}

class Cube extends Shape
{

	@Override
	String draw(int parameter) {
		// TODO Auto-generated method stub
		return "Cube is created of "+parameter+"cms";
		}
	
}
public class shapes_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape=new Line();
		System.out.println(shape.draw(9));
		
		Shape shape1=new Rectangle();
		System.out.println(shape1.draw(10));
		
		Shape shape2=new Cube();
		System.out.println(shape.draw(15));
		
		

	}

}
