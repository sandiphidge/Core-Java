package LearningSetInterface;

import java.util.TreeSet;

public class TreeSetIntro {

	public static void main(String[] args) {
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(5);
		
		System.out.println(treeSet);
		
		TreeSet<String> treeSet2 = new TreeSet<>();
		treeSet2.add("Vikram");
		treeSet2.add("Akhil");
		treeSet2.add("Manoj");
		
		System.out.println(treeSet2);
		}
	}


