package com.assignments;

import java.util.Scanner;

import com.custom_exception.AgeOutOfRangeException;
import com.custom_exception.IncorrectNationalityException;

class Voter {
	String voterName;
	String voterNationality;
	int voterAge;

	public Voter(String voterName, String nationality, int age)
			throws AgeOutOfRangeException, IncorrectNationalityException {
		super();
		this.voterName = voterName;
		String country = "ind";
		System.out.println(nationality.trim().toLowerCase());
		if (age < 18) {
			throw new AgeOutOfRangeException("Age must be above 18.");
		} else {

			this.voterAge = age;
		}
		if (nationality.trim().toLowerCase() != country) {

			this.voterNationality = nationality;
		} else {

			throw new IncorrectNationalityException("Nationality should be Indian");
		}
	}

	public String toString() {
		return "VoterName = " + voterName + ", nationality = " + voterNationality + " Age = " + voterAge;
	}

}

public class VoterAssignment {

	public static void main(String[] args) {
//		Voter v1 = new Voter("Atom", "Indian", 23);
//		System.out.println(v1);

		System.out.println("Enter Name,Nationality('ind'),Age");
		try (Scanner sc = new Scanner(System.in)) {
			String vName = sc.nextLine();
			String vNationality = sc.nextLine();
			int vAge = sc.nextInt();
			Voter v = new Voter(vName, vNationality, vAge);
			System.out.println(v);
		} catch (AgeOutOfRangeException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
