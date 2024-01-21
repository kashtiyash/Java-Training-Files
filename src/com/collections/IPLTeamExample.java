package com.collections;

import java.util.LinkedList;
import java.util.Scanner;

class Player {
	String playerName;
	int playerJerseyNumber;
	int playerAge;

	public Player(String playerName, int playerJerseyNumber, int playerAge) {
		super();
		this.playerName = playerName;
		this.playerJerseyNumber = playerJerseyNumber;
		this.playerAge = playerAge;
	}

	@Override
	public String toString() {
		return "Player Name = " + playerName + ", Player Jersey Number = " + playerJerseyNumber + ", Player Age = "
				+ playerAge;
	}

}

class IplTeam {
	String teamName;
	String ownerName;
	LinkedList<Player> palyers;

	public IplTeam(String teamName, String ownerName, LinkedList<Player> palyers) {
		super();
		this.teamName = teamName;
		this.ownerName = ownerName;
		this.palyers = palyers;
	}

}

public class IPLTeamExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter IPL Team Name :");
		String teamName = scanner.nextLine();
		System.out.println("Enter Owner Name :");
		String ownerName = scanner.nextLine();
		System.out.println("Enter players count : ");
		int count = scanner.nextInt();

		LinkedList<Player> players = new LinkedList<Player>();
		for (int index = 0; index < count; index++) {
			System.out.println("Enter Player Name :");
			String playerName = scanner.next();
			System.out.println("Enter Player Jersey Number :");
			int playerJerseyNumber = scanner.nextInt();
			System.out.println("Enter Player Age :");
			int playerAge = scanner.nextInt();
			Player p1 = new Player(playerName, playerJerseyNumber, playerAge);
			players.add(p1);
		}

		IplTeam team = new IplTeam(teamName, ownerName, players);

		System.out.println("Team Name : " + team.teamName);
		System.out.println("Owner Name : " + team.ownerName);
		for (Player player : players) {
			System.out.println(player);
		}

	}

}
