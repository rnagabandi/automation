package com.automation.tree;

public class BinarySearchTree {
	
	Node rootNode;
	
	class Node{
		
		int data;
		Node left;
		Node right;
		
		Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
		
	}
	
	public void insert(int newData){
		
		Node node=rootNode;
		
		if (node==null) {
			rootNode=new Node(newData, null,null);
			return;
		}
		
		while (node!=null) {
			if (newData<node.data) {
				if (node.left!=null) {
					node=node.left;
				}else{
					node.left=new Node(newData, null,null);
					break;
				}
				
			}else{
				if (node.right!=null) {
					node=node.right;
				}else{
					node.right=new Node(newData, null,null);
					break;
				}
			}
		}
		
	}
	
	public void display(Node root){
		if(root!=null){
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}
	
	public void print(){
		display(rootNode);
	}
	
	public static void main(String[] args){
		
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(25);
		bst.insert(20);
		bst.insert(15);
		bst.insert(18);
		bst.insert(35);
		
		bst.print();
		
	}
	
	

}
