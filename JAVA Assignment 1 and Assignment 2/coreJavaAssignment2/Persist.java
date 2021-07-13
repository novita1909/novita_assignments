package com.coreJavaAssignment2;

abstract class Persistence
{
	abstract void persist();
}

class FilePersistence extends Persistence
{

	@Override
	void persist() {
	System.out.println("This is the persist method of FilePersistence class");	
	}
	
}

class DatabasePersistence extends Persistence
{

	@Override
	void persist() {
	System.out.println("This is the persist method of DatabasePersistence class");	
	}
	
}
public class Persist {

	public static void main(String[] args) {
     Persistence filepersist=new FilePersistence();
     filepersist.persist();
     
     Persistence databasepersist=new DatabasePersistence();
     databasepersist.persist();
	}

}
