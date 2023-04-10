package Learning.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ListIntro {

	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>();
		list.add(10);
		list.add(12);
		list.add(10);  // duplicated are allowed
		// list.add("Varun");
		list.add(14);
		System.out.println(list);
	}

}
//Array List imolementing your class of Interface
//Array List Dynamic In Nature