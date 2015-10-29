package org.technicalyorker.dp.behavioural.template;

public class Client {
	public static void main(String[] args) {
		new ThinCrustPizzaMaker().makePizza();
		System.out.println("--------------");
		new ThickCrustPizzaMaker().makePizza();
	}
}
