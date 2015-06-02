package com.amrit.dummies.test;


public class LinkedListTest {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		
		LinkedList.Node head = list.head();
		
		list.add(new LinkedList.Node("1"));
		list.add(new LinkedList.Node("2"));
		list.add(new LinkedList.Node("3"));
		list.add(new LinkedList.Node("4"));
		list.add(new LinkedList.Node("5"));
		//list.add(new LinkedList.Node("6"));
		
		LinkedList.Node current = head;
		int length = 0;
		
		LinkedList.Node middle = head;
		
		while(current.next() != null)
		{
			length++;
			if(length%2 == 0)
			{
				middle = middle.next();
			}
			
			current = current.next();
		}
		
		if(length%2 == 1)
		{
			middle = middle.next();
		}
		
		System.out.println("Length of Linked List : " + length);
		System.out.println("Middle element of Linked List : " + middle);
		
		if(length%2 == 0)
			System.out.println("Middle element of Linked List : " + middle.next());
	}
	
}

class LinkedList
{
	private Node head;
	private Node tail;
	
	public LinkedList()
	{
		this.head = new Node("head");
		tail = head;
	}
	
	public Node head()
	{
		return head;
	}
	
	public void add(Node node)
	{
		tail.next = node;
		tail = node;
	}

	public static class Node
	{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
      
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
      
        public String toString(){
            return this.data;
        }
    }
}

