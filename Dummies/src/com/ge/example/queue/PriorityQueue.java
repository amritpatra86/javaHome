package com.ge.example.queue;

import java.util.NoSuchElementException;

public interface PriorityQueue<T> {
	
	/**
	 * Checks whether the queue is empty.
	 * @return True if the queue is empty, else false.
	 */
	boolean isEmpty();
	
	/**
	 * Get the highest priority entry from the queue.
	 * @return The next entry.
	 * @throws NoSuchElementException if the queue is empty.
	 */
	T getNext() throws NoSuchElementException;
	
	/**
	 * Add a value to the queue with the given priority.
	 * @param value The object to be added to the queue.
	 * @param priority The priority to assign to the entry, lower number is the highest priority.
	 * @return True if the value was added to the queue, false if any error occurs.
	 */
	boolean add(T value, int priority);

}
