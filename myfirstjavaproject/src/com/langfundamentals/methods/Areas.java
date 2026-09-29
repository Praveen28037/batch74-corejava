package com.langfundamentals.methods;

//with return type + arguments 

//without using Scanner Class

public class Areas {

	public static void main(String[] args) {

		Areas area = new Areas();
		double arTri = area.areaOfTri(15, 7);
		System.out.println("Area of Triangle is:" + arTri);

		double arRct = area.areaOfRect(5, 17);
		System.out.println("Area of Rectangle is:" + arRct);

		double arSq = area.areaOfSq(5.3);
		System.out.println("Area of Square is:" + arSq);

		double arCir = area.areaOfCir(3.5);
		System.out.println("Area of Circle is:" + arCir);

	}

	double areaOfTri(double base, double height) {
		double arTri = 0.5 * base * height;
		return arTri;
	}

	double areaOfRect(double length, double breadth) {
		double arRect = length * breadth;
		return arRect;
	}

	double areaOfSq(double side) {
		double arSq = side * side;
		return arSq;
	}

	double areaOfCir(double radius) {
		double arCir = Math.PI * radius * radius;
		return arCir;
	}

}
