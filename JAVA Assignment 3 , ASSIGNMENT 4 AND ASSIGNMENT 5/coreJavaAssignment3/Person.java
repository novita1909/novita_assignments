package com.coreJavaAssignment3;

public class Person implements Comparable<Person>
{
	String name;
	double  height;
	double weight;
	

	

	@Override
	public String toString() {
		return "[name=" + name + ", weight=" + weight + ", height=" + height + "] \n";
	}




	public Person(String name, double height, double weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}







	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getHeight() {
		return height;
	}




	public void setHeight(double height) {
		this.height = height;
	}




	public double getWeight() {
		return weight;
	}




	public void setWeight(double weight) {
		this.weight = weight;
	}




	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
	if(this.weight>o.weight)
		return -1;
	else if(this.weight==o.weight)
	{
		if(this.height>o.height)
		{
			return -1;
		}
		else if(this.height<o.height)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	else
		return 1;
	}

}
