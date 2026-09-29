package com.langfundamentals.methods;

import java.util.Scanner;

//with return type + arguments + Scanner Class

public class Areas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Areas2 area = new Areas2();

		System.out.println("-----Area of Triangle-----");
		System.out.println("Enter Base:");
		double b = sc.nextDouble();

		System.out.println("Enter Height:");
		double h = sc.nextDouble();
		double arTri = area.areaOfTri(b, h);
		System.out.println("Area of Triangle is:" + arTri);

		System.out.println("-----Area of Rectangle-----");
		System.out.println("Enter Length:");
		double l = sc.nextDouble();

		System.out.println("Enter Breadth:");
		double br = sc.nextDouble();

		double arRct = area.areaOfRect(l, br);
		System.out.println("Area of Rectangle is:" + arRct);

		System.out.println("-----Area of Square-----");
		System.out.println("Enter Side:");
		double s = sc.nextDouble();

		double arSq = area.areaOfSq(s);
		System.out.println("Area of Square is:" + arSq);

		System.out.println("-----Area of Circle-----");
		System.out.println("Enter Radius:");
		double r = sc.nextDouble();

		double arCir = area.areaOfCir(r);
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
