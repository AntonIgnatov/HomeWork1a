package net.bigmir.venzor;

public class Cat {
	private String name;
	private String breed;
	private String color;
	private double hung;
	private double age;
	private double weight;

	public Cat(String name, String breed, String color, double age, double weight) {
		super();
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
		this.weight = weight;
	}

	public Cat() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHung(double hung) {
		this.hung = hung;
	}

	public void myau() {
		System.out.println("���-���");
	}

	public void hugry() {
		if (this.hung >= 6) {
			System.out.println("��������� ����");
			myau();
		} else {
			myau();
			myau();
		}

	}

	public void printAbout() {
		System.out.println("������ ����: " + name);
		System.out.println("������ ����: " + breed);
		System.out.println("������� ����: " + String.format("%.1f.", age));
		System.out.println("��� ����: " + String.format("%.1f.", weight));
	}

}
