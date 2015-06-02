package com.amrit.dummies.test;

public class TreeNode {
	
	int data;
	TreeNode left;
	TreeNode right;
	
	static int sum;
	
	public TreeNode(int value)
	{
		this.data = value;
	}
	
	private TreeNode root;
	
	public int getValue()
	{
		return this.data;
	}
	
	public void insert(TreeNode node)
	{
		if(root == null)
			root = node;
		else
		{
			if(node.data == this.data)
				return;
			else if(node.data < this.data)
			{
				if(left == null)
					left = node;
				else
					left.insert(node);
			}
			else if(node.data > this.data)
			{
				if(right == null)
					right = node;
				else
					right.insert(node);
			}
		}
	}
	
	public void sum()
	{
		sum = 0;
		sumOfAllNodes(root);
	}
	
	public void sumOfAllNodes(TreeNode node)
	{
		if(node != null)
		{
			sumOfAllNodes(node.left);
			
			sum += node.data;
			
			sumOfAllNodes(node.right);
		}
	}

}
