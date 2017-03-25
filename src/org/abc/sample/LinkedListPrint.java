package org.abc.sample;

public class LinkedListPrint {
	
	public static void main(String[] args) {

		// constructing a linked list
		// 10 indicate the size of the list and also the data in the node is added from 1 to 10.
		Node firstNode = buildLinkedList(null, 10);

		// Printing the linked list
		System.out.print("Linked List is " + firstNode.getData());

		for (int i = 1; i < 10; i++) {
			Node nextNode = getNextNodes(firstNode);
			System.out.print(" -> " + nextNode.getData());
			firstNode = nextNode;
		}
	}
	
	/**
	 * Building a Linked list with incrementing the value from 1 to 10
	 * @param linkedList - The list in which Node is added.
	 * @param nextNode - the next node.
	 * @param data - input data. This also indicate the size of the list.
	 * @return First node
	 */
	private static Node buildLinkedList(Node nextNode, int data) {
		if (data == 0) {
			return nextNode;
		}
		Node node = new Node();
		node.setData(data);
		node.setNext(nextNode);
		return buildLinkedList(node, data - 1);
	}

	/**
	 * Method to retrieve the next node of the list
	 * @param node - Current Node.
	 * @return the next node.
	 */
	private static Node getNextNodes(Node node) {
		return node.getNext();
	}
}



