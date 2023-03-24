package com.lhl.javaCode;

public class Homework13 {

	public static void main(String[] args) {

		Circle c = new Circle();
		PassObject p = new PassObject();
		p.printAreas(c, 6);
	}
}

class Circle {

	double radius;

	public double findArea(int rad) {
		return Math.PI * Math.pow(rad, 2);
	}
}

class PassObject {

	public void printAreas(Circle c, int times) {
		for (int i = 1; i <= times; ++i) {
			System.out.println("半径值为：" + i + " 面积为：" + c.findArea(i));
		}
	}
}