package com.amrit.dummies.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TreeNodeTest {
	
	@Test
	public void testInsert()
	{
		TreeNode node = new TreeNode(10);
		
		TreeNode node1 = new TreeNode(11);
		
		node.insert(node);
		
		node.insert(node1);
		
		assertEquals(11, node.right.data);
		
		assertEquals(10, node.data);
		
		TreeNode node2 = new TreeNode(8);
		
		node.insert(node2);
		
		assertEquals(8, node.left.data);
	}
	
	@Test
	public void testSum()
	{
		TreeNode node = new TreeNode(10);
		
		TreeNode node1 = new TreeNode(11);
		
		node.sum();
		
		assertEquals(0, node.sum);
		
		node.insert(node);
		node.sum();	
		assertEquals(10, node.sum);
		
		node.insert(node1);
		node.sum();
		assertEquals(21, node.sum);
		
		TreeNode node2 = new TreeNode(8);
		node.insert(node2);
		node.sum();
		assertEquals(29, node.sum);
	}
	
	
	@Test
	public void testGetValue()
	{
		TreeNode node = new TreeNode(10);
		
		TreeNode node1 = new TreeNode(11);
		
		assertEquals(10, node.getValue());
		
		node.insert(node);
		node.insert(node1);
		
		assertEquals(11, node.right.getValue());
	}
}
