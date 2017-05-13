package com.automation.dataStructures;

public class QueueClass {

	Node head=null;
	Node tail=null;
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data,Node next){
			this.data=data;
			this.next=next;
		}
				
	}
	
	public void add(int data){
		
		Node node=head;
		
		if(node==null){
			node=new Node(data, null);
			head=node;
			tail=node;
			return;
		}
		
		tail.next=new Node(data,null);
		tail=tail.next;
				
	}
	
	/*
	 * Returns null if empty
	 * Returns and remode the head
	 */
	
	public Object poll(){
		
		if(head==null)
			return null;
		
		int data=head.data;
		head=head.next;		
		
		return data;
		
	}
	
	/*
	 * Returns null if empty
	 * Returns  the head
	 */
	
	public Object peek(){
		
		if(head==null)
			return null;
		
		return head.data;
		
	}
	
	public void print(){
		
		Node node=head;
		
		while (node!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		QueueClass queue= new QueueClass();
		
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		
		queue.print();
		
		queue.peek();
		
		queue.poll();
		queue.poll();
		queue.poll();
		
		queue.print();
		
		
	}
	
}
