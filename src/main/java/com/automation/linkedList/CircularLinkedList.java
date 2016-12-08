package com.automation.linkedList;

public class CircularLinkedList {
	
	Node firstNode;
	
	class Node{
		int data;
		Node next;
		
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
	}
	
	public void add(int newData){
		
		Node node=firstNode;
		
		if (node==null) {
			firstNode=new Node(newData, null);
			return;
		}
		
		while (node.next!=null) {
			node=node.next;
		}
		node.next=new Node(newData, null);
	}
	
	public void print(){
		
		Node node=firstNode;
		
		while (node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	public void insertElementLast(int newData){
		
		Node node=firstNode;
		
		while (node.next!=null) {
			node=node.next;
		}
		
		node.next=new Node(newData, firstNode);
		
	}

	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.insertElementLast(400);
		
		list.print();
		
		
	}
	
}
