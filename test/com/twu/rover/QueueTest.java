package com.twu.rover;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.mockito.Mockito.*;

public class QueueTest {

    @Test
    public void shouldEnqueue(){
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(100);
        assertEquals(100, q.front().intValue());
        assertEquals(1, q.size());
    }

    @Test
    public void shouldDequeue(){
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(100);
        q.enqueue(20);
        q.dequeue();
        assertEquals(1, q.size());
        assertEquals(20, q.front().intValue());
    }

    @Test
    public void shouldReturnTrueWhenEmpty(){
       Queue<Integer> q = new Queue<Integer>();
        assertTrue(q.isEmpty());
    }

    @Test
    public void shouldReturnFalseWhenNotEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(3);
        assertFalse(q.isEmpty());
    }

}
