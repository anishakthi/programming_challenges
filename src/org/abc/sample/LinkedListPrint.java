package org.abc.sample;

import java.util.List;
import java.util.ArrayList;

public class LinkedListPrint {
	
	public static void main(String[] args) {
		
		// constructing a linked list
		List<Node> linkedList = new ArrayList<Node>();
		// 10 indicate the size of the list and also the data in the node is added from 1 to 10.
		buildLinkedList(linkedList, null, 10);
		
		// Printing the linked list
		System.out.print("Linked List is " + linkedList.get(linkedList.size() -1).getData()); // got last value from the list as the first element is inserted as last element
		for(int i=1; i<linkedList.size() ; i++) {
			Node node = linkedList.get(linkedList.size()-i);
			System.out.print(" -> " + getNextNode(node));
		}
 	}
	
	/**
	 * Building a Linked list with incrementing the value from 1 to 10
	 * @param linkedList - The list in which Node is added.
	 * @param nextNode - the next node.
	 * @param data - input data. This also indicate the size of the list.
	 * @return
	 */
	private static List<Node> buildLinkedList(List<Node> linkedList, Node nextNode, int data) {
			if(data <= 0) {
			return linkedList; 
			} else {
			Node node = new Node();
			node.setData(data);
			node.setNext(nextNode);
			linkedList.add(node);
			return buildLinkedList(linkedList, node, data-1);
			}
			
	}

	/**
	 * Method to retrieve the next element's data of the list
	 * @param node - Current Node.
	 * @return the data of the next node.
	 */
	private static int getNextNode(Node node) {
		return node.getNext().getData();
	}
	
}



