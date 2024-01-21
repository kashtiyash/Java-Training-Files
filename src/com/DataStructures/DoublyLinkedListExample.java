package com.DataStructures;

class Book {
	int id;
	String bookName;
	String authorName;
	int price;

	public Book(int id, String bookName, String authorName, int price) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book Id = " + id + " Book Name = " + bookName + ", Author Name = " + authorName + ", Price = " + price;
	}

}

class Node {
	Node next;
	Node previous;
	Book data;

	public Node(Node previous, Book data, Node next) {
		super();
		this.next = next;
		this.previous = previous;
		this.data = data;
	}

}

class DoublyLinkedList {
	Node head;
	Node tail;

	public DoublyLinkedList() {
		head = null;
		tail = null;
	}

	public void addBook(Book book) {
		Node newNode = new Node(null, book, null);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;

		}
	}

	public void searchBook(String name) {

		Node nodeToSearch = head;

		while (nodeToSearch != null) {
			if (nodeToSearch.data.bookName.equalsIgnoreCase(name)) {
				System.out.println(nodeToSearch.data);
			}
			nodeToSearch = nodeToSearch.next;

		}

	}

	public void removeBook(int id) {
		Node nodeToDelete = head;
//		System.out.println(nodeToDelete);

		while (nodeToDelete != null) {
			if (nodeToDelete.data.id == id) {

//				to remove head node
				if (nodeToDelete.previous == null) {
//					System.out.println("Head");
					head = nodeToDelete.next;
					if (head != null) {
						head.previous = null;
					}

				}

				else {
					nodeToDelete.previous.next = nodeToDelete.next;
//					check if there is no next node
					if (nodeToDelete.next != null) {
						nodeToDelete.next.previous = nodeToDelete.previous;
					} else {
//						if it is last node then point the tail to previous node
						tail = nodeToDelete.previous;
					}
				}

			}
			nodeToDelete = nodeToDelete.next;
		}

	}

	public void showBook() {
		Node current = head;
		while (current != null) {
			System.out.println("Previous  Node : " + current.previous);
			System.out.println(current.data);
			System.out.println("Next Node : " + current.next);
			System.out.println("------------------------------\n");
			current = current.next;

		}
	}

	public void addBookAtIndex(int id, Book book) {

		Node nodeToAdd = head;
		while (nodeToAdd != null) {
			if (nodeToAdd.data.id == id) {
				Node newNode = new Node(null, book, null);

				if (nodeToAdd == head) {
					nodeToAdd.previous = newNode;
					newNode.next = nodeToAdd;
					newNode.previous = null;
					head = newNode;
				} else {
					if (nodeToAdd.next != null) {
						nodeToAdd.previous.next = newNode;
						nodeToAdd.previous = newNode;
						newNode.previous = nodeToAdd.previous;
						newNode.next = nodeToAdd;
					} else {
						nodeToAdd.next = newNode;
						newNode.previous = nodeToAdd;
						newNode.next = null;
						tail = nodeToAdd;

					}
				}

			}
			nodeToAdd = nodeToAdd.next;

		}

	}

}

public class DoublyLinkedListExample {

	public static void main(String[] args) {
		Book b1 = new Book(1, "Book 1", "Author 1", 100);
		Book b2 = new Book(2, "Book 2", "Author 2", 200);
		Book b3 = new Book(3, "Book 3", "Author 3", 300);
		Book b4 = new Book(4, "Book 4", "Author 4", 400);

		DoublyLinkedList dl = new DoublyLinkedList();
		dl.addBook(b1);
		dl.addBook(b2);
		dl.addBook(b3);
//		dl.addBook(b4);
//		dl.removeBook(4);
		dl.addBookAtIndex(1, b4);

//		dl.searchBook("book 4");
		System.out.println("\n\n");

		dl.showBook();
	}

}
