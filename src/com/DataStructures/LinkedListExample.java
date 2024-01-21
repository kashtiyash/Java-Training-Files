package com.DataStructures;

class Player {
	String playerName;
	String teamName;
	int jerseyNumber;

	public Player(String playerName, String teamName, int jerseyNumber) {
		super();
		this.playerName = playerName;
		this.teamName = teamName;
		this.jerseyNumber = jerseyNumber;
	}

	@Override
	public String toString() {
		return "Player Name = " + playerName + ", Team Name = " + teamName + ", Jersey Number = " + jerseyNumber;
	}

}

class SingleNode {
	SingleNode next;
	Player data;

	public SingleNode(SingleNode next, Player player) {
		super();
		this.next = next;
		this.data = player;
	}

}

class LinkedList {
	SingleNode head;

	public LinkedList() {
		head = null;
	}

	public void addPlayer(Player player) {
		SingleNode newNode = new SingleNode(null, player);
		if (head == null) {
			head = newNode;
		} else {
			SingleNode current = head;
			while (current.next != null) {
				current = current.next;

			}
			current.next = newNode;
		}
	}

	public void insertAfterIndex(int index, Player playerData) {

		SingleNode current = head;
		while (current != null) {
			if (current.data.jerseyNumber == index) {
				SingleNode newNode = new SingleNode(null, playerData);

				if (current == head) {
					SingleNode temp = current.next;
					current.next = newNode;
					newNode.next = temp;
				} else {
					if (current.next != null) {
						newNode.next = current.next;
						current.next = newNode;
					} else {
						current.next = newNode;
						newNode.next = null;
					}
				}
			}
			current = current.next;

		}
	}

	public void showPlayerDetails() {
		SingleNode current = head;
		while (current != null) {
			System.out.println(current.data);
			System.out.println("Next Node : " + current.next);
			System.out.println("------------------------------\n");
			current = current.next;

		}
	}

	public void search(int jerseyNumber) {

		SingleNode current = head;
		while (current != null) {
			if (current.data.jerseyNumber == jerseyNumber) {
				System.out.println(current.data);
			}
			current = current.next;
		}
	}

	public void remove(int jerseyNumber) {
		if (head == null) {
			return;
		}
		if (head.data.jerseyNumber == jerseyNumber) {
			head = head.next;
			return;
		}
		SingleNode current = head;
		while (current.next != null && current.next.data.jerseyNumber != jerseyNumber) {
			current = current.next;
		}
		if (current.next != null) {
			current.next = current.next.next;
		}

	}
}

public class LinkedListExample {

	public static void main(String[] args) {
		Player play1 = new Player("Rohit", "Mumbai", 45);
		Player play2 = new Player("Virat", "Banglore", 18);
		Player play3 = new Player("MSD", "Chennai", 07);
		Player play4 = new Player("Bumrah", "Mumbai", 37);

		LinkedList ll = new LinkedList();
		ll.addPlayer(play1);
		ll.addPlayer(play2);
		ll.addPlayer(play3);
		ll.showPlayerDetails();
		System.out.println("-------------------Above shows All Details ---------------\n\n\n");
//		ll.search(07);
//		ll.remove(18);
		ll.showPlayerDetails();

		System.out.println("\n\n------------------After inserting------------ \n\n\n\n");
		ll.insertAfterIndex(45, play4);
		ll.showPlayerDetails();
	}

}
