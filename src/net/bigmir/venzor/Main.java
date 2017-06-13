package net.bigmir.venzor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Cat cat1 = new Cat("barsik", "pers", "white", 17.5, 5.3);
		cat1.printAbout();

		Scanner sc = new Scanner(System.in);

		System.out.println("как давно кормили кота?");
		double t = sc.nextDouble();
		sc.close();
		cat1.setHung(t);
		cat1.hugry();

	}

}
