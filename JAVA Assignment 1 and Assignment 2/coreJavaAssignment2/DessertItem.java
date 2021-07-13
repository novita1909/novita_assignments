package com.coreJavaAssignment2;



public abstract class DessertItem 
{
  public abstract double getCost(int numberOfQuantities);
  
}

class Candy extends DessertItem
{

	@Override
	public double getCost(int numberOfQuantities) {
		// TODO Auto-generated method stub
		return numberOfQuantities*60;
		}
	
}

class Cookie extends DessertItem
{

	@Override
	public double getCost(int numberOfQuantities) {
		// TODO Auto-generated method stub
		return numberOfQuantities*70;
	}
	
}


class IceCream extends DessertItem
{

	@Override
	public double getCost(int numberOfQuantities) {
		// TODO Auto-generated method stub
		return numberOfQuantities*50;
	}
	
}