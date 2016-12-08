package com.automation.linkedList;

public class DoubleLinkedList {
	
	Node firstNode;
	int length=0;
	
	class Node{
		
		int data;
		Node next;
		Node previous;
				
		Node(int data , Node next,Node previous){
			this.data=data;
			this.next=next;
			this.previous=previous;
		}
		
	}
	
	public void add(int newData){
		
		Node node=firstNode;
		
		if (node==null) {
			
			firstNode=new Node(newData,null, null);
			length++;
			return;
			
		}
		
		while (node.next!=null) {
			
			node=node.next;
		}
		
		node.next=new Node(newData, null, node);
		length++;
	}
	
	public void add(int index,int newData){
		
		Node node=firstNode;
		
		if (index==0) {
			node=new Node(newData, firstNode, null);
			firstNode.previous=node;
			firstNode=node;
			length++;
			return;
		}
		for (int i = 0; i < index; i++) {
			node=node.next;
		}
		
		Node newNode=new Node(newData, node.next,node);
		node.next.previous=newNode;
		node.next=newNode;
		length++;
	}
	
	public void print(){
		
		Node node=firstNode;
		
		while(node!=null){
			
			System.out.println(node.data);
			node=node.next;
			
		}
		
		
	}
	
	public void printReverse(){
		
		Node node=firstNode;
		
		for (int i = 0; i < length-1; i++) {
			node=node.next;
		}
		
		while (node!=null) {
				System.out.println(node.data);
				node=node.previous;
		}
		
	}
	
	public int indexOfElement(int data){
		
		Node node=firstNode;
		int index=0;
		
		while (node!=null) {
			index++;
			if (node.data==data) {
				return index;
			}
			node=node.next;
		}
		return -1;
	}
	
	public int getData(int index){
		
		Node node=firstNode;
		
		if (index>length) {
			return -1;
		}
		
		for (int i = 0; i < index-1; i++) {
			if (i==index) {
				return node.data;
			}
			node=node.next;
		}
		return node.data;
	}
	
	public void delete(int index){
		
		Node node=firstNode;
		
		if (index>length) {
			return;
		}
		if (index==0) {
			firstNode=node.next;
			firstNode.previous=null;
			return;
		}
		
		for (int i = 0; i < index-1; i++) {
			node=node.next;
		}
		node.next.previous=node;
		node.next=node.next.next;
	
	}
	
	public static void main(String[] args) {
		
		DoubleLinkedList list = new DoubleLinkedList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(2,350);
				
		list.print();
		System.out.println("---------");
		list.printReverse();
		System.out.println("---------");
		System.out.println(list.indexOfElement(200));
		System.out.println(list.indexOfElement(2000));
		System.out.println("---------");
		System.out.println(list.getData(1));
		System.out.println(list.getData(2));
		System.out.println(list.getData(3));
		System.out.println(list.getData(4));
		System.out.println(list.getData(5));
		System.out.println(list.getData(6));
		System.out.println(list.getData(7));
		System.out.println("---------");
		list.delete(0);
		list.delete(0);
		list.delete(0);
		list.delete(0);
		list.delete(0);
		list.print();
	}

}
