package edu.kis.vh.nursery.list;

/**
 * Klasa przetrzymuje listę dwukierunkową wartości liczb całkowitych
 */
public class IntLinkedList {

	public static final int INT = -1;
	private Node last;
	int i;

	/**
	 * @param i: wartość nowego Noda, która zostanie dodana do listy
	 * Funkcja dodaje element do listy
	 */
	public void push(int i) {
		if (getLast() == null)
			setLast(new Node(i));
		else {
			getLast().next = new Node(i);
			getLast().next.prev = getLast();
			setLast(getLast().next);
		}
	}

	/**
	 * Zwraca wartość true lub false w zależności od tego czy posiada element Node przypisany do pola last
	 */
	public boolean isEmpty() {
		return getLast() == null;
	}

	/**
	 * Zawsze zwraca wartość false, funkcja sprawdza, czy lista jest pełna
	 */
	public boolean isFull() {
		return false;
	}

	/**
	 * Zwraca wartość ostatniego Node w liście, jeżeli lista jest pusta zwraca kod błędu
	 */
	public int top() {
		if (isEmpty())
			return INT;
		return getLast().value;
	}

	/**
	 * Usuwa ostatni element z list, gdy lusta, jeżeli lista jest pusta zwraca kod błędu
	 */
	public int pop() {
		if (isEmpty())
			return INT;
		int ret = getLast().value;
		setLast(getLast().prev);
		return ret;
	}

	/**
	 * Zwraca ostatni Node
	 */
	public Node getLast() {
		return last;
	}

	/**
	 * @param last: Node do dodania na koniec listy
	 * Dodaje element do końca listy
	 */
	public void setLast(Node last) {
		this.last = last;
	}

	/**
	 * Klasa służy jako element z których składa się IntLinkedList
	 */
	private class Node {

		public int value;
		public Node prev, next;

		public Node(int i) {
			value = i;
		}
	}
}
