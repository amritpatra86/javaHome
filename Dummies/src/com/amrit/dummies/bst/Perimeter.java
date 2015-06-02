package com.amrit.dummies.bst;

import java.util.ArrayList;
import java.util.List;

public class Perimeter {
	
	public static void main(String[] args) {
		
		Perimeter obj = new Perimeter();
		
		obj.createTree();
		
		obj.printPerimeter(obj.root);
		
	}

	class TreeNode {
	
		int data;
		TreeNode left;
		TreeNode right;
		
		public TreeNode(int value) {
			this.data = value;
		}
	}
	
	private TreeNode root;
	
	public void createTree() {
		
		root = new TreeNode(10);
		root.left = new TreeNode(6);
		root.right = new TreeNode(14);
		
		root.left.left = new TreeNode(4);
		root.left.left.left = new TreeNode(2);
		root.left.left.right = new TreeNode(5);
		root.left.right = new TreeNode(8);
		
		root.right.left = new TreeNode(12);
		root.right.left.left = new TreeNode(9);
		root.right.left.right = new TreeNode(13);
		root.right.right = new TreeNode(16);
	}
	
	public void printPerimeter(TreeNode node) {
		
		if(node == null) {
			System.out.println("Perimeter can't be found out for empty tree !!!");
			return;
		}
		
		TreeNode head = node;
		
		//Print left perimeter except leaf node
		while(head.left != null) {
			System.out.print(" "+head.data);
			head = head.left;
		}
		
		//Print all the leaf nodes
		printLeafNodes(node);
		
		//Print all right perimeter nodes in reverse order except leaf nodes
		head = node;
		List<Integer> list = new ArrayList<Integer>();
		while(head.right != null) {
			list.add(head.data);
			head = head.right;
		}
		
		for(int i=list.size()-1; i>=0; i--)
			System.out.print(" "+list.get(i));
		
	}
	
	public void printLeafNodes(TreeNode node) {
		
		if(node.left == null && node.right == null) {
			System.out.print(" "+node.data);
			return;
		}
		
		if(node.left != null)
			printLeafNodes(node.left);
		
		if(node.right != null)
			printLeafNodes(node.right);
	}
}