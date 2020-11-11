import java.util.*;
import java.io.*;
//
//public class APSample {
//	public static void main(String[] args){
//
//	}
//
//	/**
//	 * ZU17W4W8
//	 * AS
//	 * A)
//	 * @param name
//	 * @param type
//	 * @param age
//	 * @return
//	 */
//	private Animal createNewAnimal(String name, String type, double age){
//		int cost;
//		int amount = 0;
//		//finds the amount of animals of the same type
//		for(Animal a:allAnimals){
//			if(a.getType().equals(type)){
//				amount++;
//			}
//
//		}
//		//checks for the cost
//		if(amount < 5 && age < 1){
//			cost = 25;
//		}else if(amount >= 5 && age < 1){
//			cost = 20;
//		}else{
//			cost = 15;
//		}
//		Animal result = new Animal(name, type, age, cost);
//		return result;
//	}
//
//	/**
//	 * B)
//	 * @param name
//	 * @param type
//	 * @param age
//	 */
//	public void addAnimal(String name, String type, double age){
//		Animal result = createNewAnimal(name, type, age);
//		boolean completed = false;
//		for(int i = 0; i < allAnimals.size(); i++){
//			if(result.getAge() < allAnimals.get(i).getAge()){
//				allAnimals.add(i, result);
//				return;
//			}
//		}
//		allAnimals.add(result);
//	}
	/*
	C)
	Header:
	public Animal getAnimalWithMostInterest(){

	}

	A new variable would be added to the Animal class would be a questions field.

	private int questions;

	Each animal would then need a getter, and an increment questions method in the Animal class

	public int getQuestions(){} // return questions
	public void incrementQuestions(){} // increment/add 1 to questions, everytime someone asked a question

	The current contructor for Animals would have to be modified so it set questions to 0 upon creation.
	A new constructor could also be added to Animals that would have questions as a field in the constructor, so the user could
	set if the animal had already been asked questions about previously
	i.e
	public Animal(String n, String type, double a, int c, int q){
	}
	This way an animal could be created without a specification of questions and it is automatically set to 0, or they could also specify a value

	Once these modifications are created. getAnimalWithMostInterest could be easily completed in animal shelter
	the function would be public and loop through allAnimals using a for-loop.
	It would also use a variable result (Animal) to store the resulting animal
	As it loops it checks if the current animal.getQuestions() is larger than the result.getQuestions().
	if it is, is updates result animal to be the current animal and continues, otherwise it would just continue
	Once the loop ends it return the resulting animal.


	 */
//}
