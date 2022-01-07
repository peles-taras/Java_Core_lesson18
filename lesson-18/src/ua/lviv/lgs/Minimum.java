package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class Minimum {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void stringToInteger(List list) {
		list.add("String inside Integer ArrayList");
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		Minimum m =new Minimum();
		m.stringToInteger(arr);
		System.out.println(arr);
	}
}
