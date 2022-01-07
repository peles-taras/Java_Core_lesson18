package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Map<K, V> {

	Scanner sc = new Scanner(System.in);
	MyEntry<K, V> me = new MyEntry<K, V>(null, null);
	TreeMap<K, V> tm = new TreeMap<>();

	public static void menu() {
		System.out.println("1 - Додавали новий об’єкт в мапу");
		System.out.println("2 - Видаляли об’єкт мапи за ключем ");
		System.out.println("3 - Видаляли об’єкт мапи за значенням");
		System.out.println("4 - Виводили на екран Set ключів");
		System.out.println("5 - Виводили на екран List значень");
		System.out.println("6 - Виводили на екран цілу мапу");
	}

	@SuppressWarnings("unchecked")
	public void addToMap() {
		System.out.println("Введіть ключ(key):");
		me.setFirstField((K) sc.next());
		System.out.println("Введіть значення(value)");
		me.setSecondField((V) sc.next());
		tm.put(me.getFirstField(), me.getSecondField());
		System.out.println("об'єкт додано");

	}

	@SuppressWarnings("unchecked")
	public void removeByKey() {
		System.out.println("Введіть ключ для видалення:");
		K temp = (K) sc.next();
		Iterator<Entry<K, V>> iterator = tm.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getKey().equals(temp)) {
				iterator.remove();
				System.out.println(temp + " - видалено");
			}
		}
	}

	public void removeByValue() {
		System.out.println("Введіть значення для видалення:");
		Iterator<Entry<K, V>> iterator = tm.entrySet().iterator();
		@SuppressWarnings("unchecked")
		V temp = (V) sc.next();
		while (iterator.hasNext()) {
			Entry<K, V> next = iterator.next();
			if (next.getValue().equals(temp)) {
				iterator.remove();
				System.out.println(temp + " - видалено");
			}

		}
	}

	public void showKeysSet() {
		System.out.println("Set ключів:");
		System.out.println(tm.keySet());
	}

	@SuppressWarnings("unchecked")
	public void showValuesList() {
		System.out.println("List значень:");
		ArrayList<V> arr = new ArrayList<V>();
		Collection<V> values2 = tm.values();
		arr.add((V) values2);
		System.out.println(arr);
	}

	public void showMap() {
		System.out.println(tm);
	}

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Map m = new Map();
		while (true) {
			menu();

			switch (sc.next()) {
			case "1":
				m.addToMap();
				break;
			case "2":
				m.removeByKey();
				break;
			case "3":
				m.removeByValue();
				break;
			case "4":
				m.showKeysSet();
				break;
			case "5":
				m.showValuesList();
				break;
			case "6":
				m.showMap();
				break;

			default:
				break;
			}
		}
	}

}
