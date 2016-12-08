package com.automation.linkedList;

public class SingleLinkedList {
	
	Node firstNode;
	
	public class Node {

		int data;
		Node next;

		public Node(int newData, Node newNode) {

			data = newData;
			next = newNode;

		}

	}
	
	public void add(int data){
		
		Node node =firstNode;
		
		if (node==null) {
			firstNode=new Node(data,null);
			return;
		}
		while (node.next!=null){
			node=node.next;
		}
		node.next=new Node(data, null);
	}
	
	public void add(int index,int data){
		
		Node node=firstNode;
		
		if (index==0) {
			firstNode = new Node(data, firstNode);
			return;
		}
		
		for (int i = 0; i < index; i++) {
			node=node.next;
		}
		
		node.next=new Node(data,node.next);
		
	}
	
	public int indexOfElement(int data){
		
		Node node=firstNode;
		int position=0;
		
		while (node!=null) {
			
			if (node.data==data) {
				return position;
			}
			position++;
			node=node.next;
		}
		
		return -1;
		
	}
	
	public int get(int index){
		
		Node node=firstNode;
		
		if (node==null) {
			return -1;
		}
		
		for (int i = 0; i < index; i++) {
			node=node.next;
		}
		return node.data;
	}
	
	public int length(){
		
		Node node=firstNode;
		int length=0;
		
		if (node==null) {
			return 0;
		}
		
		while (node!=null) {
			length++;
			node=node.next;
		}
		return length;
	}
	
	public int delete(int index){
		
		Node node=firstNode;
		
		if (node==null) {
			return -1;
		}
		
		if (index==0) {
			
			firstNode=firstNode.next;
			return 0;
		}
		int i = 1;
		for (i = 1; i < index-1; i++) {
			node=node.next;
		}
		
		node.next=node.next.next;
		return index;
	}
	
	public void print(){
		
		Node node=firstNode;
		
		while (node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		SingleLinkedList list = new SingleLinkedList();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(2,250);
		list.delete(1);
		list.print();
		System.out.println(list.get(1));
		System.out.println(list.length());
		System.out.println(list.indexOfElement(300));
		
	}

}
