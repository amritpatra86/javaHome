package com.amrit.dummies.bst;

public class BinarySearchTree {
	
	public static void main(String[] args) 
	{
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.createBST();
		
		bst.BSTDisplay(bst.root, 0);
		
		System.out.println("\nIn-Order Traversal");
		
		bst.inOrder(bst.root);
		
		BTNode pHead = null;
		
		pHead = bst.BST2SortedDoubleLinkedList(bst.root, pHead);
		
		if(pHead != null)
		{
			System.out.println("\nFrom Start : ");
			while(pHead.right != null)
			{
				System.out.print(pHead.info + " ");
				pHead = pHead.right;
			}
			
			System.out.print(pHead.info + " ");
			
			System.out.println("\nFrom End : ");
			while(pHead.left !=null)
			{
				System.out.print(pHead.info + " ");
				pHead = pHead.left;
			}
			
			System.out.print(pHead.info + " ");
		}

	}
	
	class BTNode
	{
		String info;
		BTNode left;
		BTNode right;
		
		public BTNode(String value)
		{
			info = value;
		}
	}
	
	private BTNode root;
	
	public void createBST()
	{
		root = new BTNode("10");
		root.left = new BTNode("6");
		root.right = new BTNode("14");
		
		root.left.left = new BTNode("4");
		root.left.left.left = new BTNode("2");
		root.left.left.right = new BTNode("5");
		root.left.right = new BTNode("8");
		
		root.right.left = new BTNode("12");
		root.right.right = new BTNode("16");
	}
	
	public void BSTDisplay(BTNode node, int noOfSpace)
	{
		if(node != null)
		{
			BSTDisplay(node.right, ++noOfSpace);
			
			for(int i=0; i< noOfSpace; i++)
			{
				System.out.print(" ");
			}
			
			System.out.println(node.info+"\n\n");
			
			BSTDisplay(node.left, noOfSpace);
		}
	}
	
	public BTNode getRightMostLeaf(BTNode node)
	{
		if(node != null)
		{
			while(node.right != null)
				node = node.right;
		}
		
		return node;
	}
	
	public BTNode getLeftMostLeaf(BTNode node)
	{
		if(node != null)
		{
			while(node.left != null)
				node = node.left;
		}
		
		return node;
	}
	
	public BTNode BST2SortedDoubleLinkedList(BTNode node, BTNode listHead)
	{
		if(node != null)
		{
			if(node.left != null)
			{
				listHead = BST2SortedDoubleLinkedList(node.left, listHead);
				
				BTNode rightMostLeaf = getRightMostLeaf(node.left);
				
				rightMostLeaf.right = node;
				node.left = rightMostLeaf;
				
				if(listHead == null)
				{
					listHead = node.left;
				}
			}
			
			if(node.right != null)
			{
				listHead = BST2SortedDoubleLinkedList(node.right, listHead);
				
				BTNode leftMostLeaf = getLeftMostLeaf(node.right);
				
				leftMostLeaf.left = node;
				node.right = leftMostLeaf;
				
				if(listHead == null)
				{
					listHead = node.right;
				}
			}
		}
		
		return listHead;
	}
	
	public void inOrder(BTNode node)
	{
		if(node != null)
		{
			inOrder(node.left);
			System.out.print(node.info + " ");
			inOrder(node.right);
		}
	}

}
