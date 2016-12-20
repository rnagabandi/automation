/**
 * 
 */
package com.automation.linkedList;

/**
 * @author Raghavender
 *
 */
public class ReverseLinkedList {
	
	Node firstNode;
	
	class Node{
		int data;
		Node next;
	
		Node(int data,Node next){
			this.data=data;
			this.next=next;			
		}
		
	}
	
	public void add(int data){
		
		
		Node node=firstNode;
		
		if (node==null) {
			
			firstNode=new Node(data,null);
			return;
		}
		
		while(node.next!=null){
			node=node.next;
		}
		
		node.next=new Node(data,null);
		
	}
	
	public void listInreverseOrder(){
		
		Node currentNode=firstNode;
		Node previous=null;
		Node nextNode=null;
		
		while (currentNode!=null) {
			nextNode=currentNode.next;
			currentNode.next=previous;
			previous=currentNode;
			currentNode=nextNode;
		}
		currentNode=previous;
		while(currentNode!=null){
			System.out.println(currentNode.data);
			currentNode=currentNode.next;
		}
		
	}
	
	public void listLinkedList(){
		
		Node node=firstNode;
		
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	public static void main(String[] args){
		
		ReverseLinkedList list = new ReverseLinkedList();
		
		list.add(100);
		list.add(90);
		list.add(80);
		list.add(70);
		list.add(60);
		list.add(50);
		list.add(40);
		list.add(30);
		list.add(20);
		list.add(10);
		
		list.listLinkedList();
		System.out.println("reverse order print--");
		list.listInreverseOrder();
		
	}

}
