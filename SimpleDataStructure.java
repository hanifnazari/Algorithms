package Assignment2;

import java.util.*;


public class SimpleDataStructure{

	private String [] friends;

	private int counter;

	public SimpleDataStructure()
	{
		friends= new String[5]; counter=0;
	}
	/*Appends the other friend name to the end of this list.*/
	public boolean add(String other){

		if(counter == friends.length){
			
		String [] dest = friends;
		
		friends = new String[friends.length*2];
		
			for(int i=0; i<dest.length; i++){
				friends[i] = dest[i];
			}
			
		}
		
		friends[counter] = other;
			
		counter++;
		
		
		return true;

			

	}
	/** returns the name at the specified index*/ 
	public String get(int index){

		return friends[index];
	}
	/** removes the first occurrence of the specified element in this list if the list contains the name*/
	public boolean remove( String name){

		for(int i=0;i<counter; i++)
		{
			if( friends[i].equals(name)){ friends[i]=null;
			return true;
			}
		}
		return false;
	}

	/** prints all names in the array friends*/ 

	public void printFriends()
	{
		for(int i=0;i<friends.length; i++){
			if(friends[i]!=null){
				System.out.print(friends[i]+ " " );

				System.out.println();
			}
		}
	}

	public static void main( String [] arg){
		SimpleDataStructure myfriends = new SimpleDataStructure();
		
		myfriends.add("Kalle");
		myfriends.add("Hanif");
		myfriends.add("Johan");
		myfriends.add("Felix");
		myfriends.add("Hnaif");
		myfriends.add("khan");
		
		myfriends.printFriends();
	}
}
