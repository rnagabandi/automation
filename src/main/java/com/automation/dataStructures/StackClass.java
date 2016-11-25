package com.automation.dataStructures;

public class StackClass {
	
	
	private Object[] array;
	private int top;
	
	public StackClass() {
		
		array = new Object[10];
		top=-1;
		
	}
	
	public StackClass(int size) {
		
		array = new Object[size];
		top=-1;
		
	}
	
	
	public boolean empty(){
		
		if (top==-1) 
			return true;
		else
			return false;
		
	}
	
	public Object peek(){
		
		if (top==-1) 
			return null;
		else
			return array[top];
	}
	
	public Object pop(){
		if (top==-1) 
			return null;
		else
			return array[top--];
	}
	
	public Object push(Object value){
		
		if (top==array.length) {
			return null;
		}else{
			array[++top]=value;
			return value;
		}
		
	}
	
	public int search(Object key){
		
		if (top==-1) {
			return 0;
		}else{
			for (int i = 0; i < array.length; i++) {
				if (array[i]==key) {
					return 1;
				}
			}
		}
		
		return 0;
	}
	
	public int size(){
		
		return top;
	}
	
	public void displayStack(){
		
		System.out.print("stack elementas are :: ");
		
		for (int i = 0; i <= top; i++) {
			System.out.print(" "+array[i]);
		}
	}
		
	public static void main(String[] args) {
		
		StackClass stack = new StackClass();
		
		System.out.println("stack size is :: "+stack.size());
		System.out.println("remove lement from empty stack :: "+stack.pop());
		System.out.println("display top element from empty stack :: "+stack.peek());
		
		stack.push(12);
		stack.push(34);
		stack.push(555);
		stack.push(88);
		
		stack.displayStack();
		
		stack.pop();
		
		stack.displayStack();
		
	}

}
