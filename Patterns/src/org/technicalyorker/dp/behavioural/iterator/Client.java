package org.technicalyorker.dp.behavioural.iterator;


public class Client {
	public static void main(String[] args) {
		MonthArrayList list = new MonthArrayList();
		for (String month : list) {
			System.out.println(month);
		}
	}
}
