package ua.lviv.lgs;

public class MyEntry<K, V> {
	K firstField;
	V secondField;
	
	
	public MyEntry(K firstField, V secondField) {
		super();
		this.firstField = firstField;
		this.secondField = secondField;
	}
	public K getFirstField() {
		return firstField;
	}
	public void setFirstField(K firstField) {
		this.firstField = firstField;
	}
	public V getSecondField() {
		return secondField;
	}
	public void setSecondField(V secondField) {
		this.secondField = secondField;
	}
	@Override
	public String toString() {
		return "MyEntry [firstField=" + firstField + ", secondField=" + secondField + "]";
	}	
}
