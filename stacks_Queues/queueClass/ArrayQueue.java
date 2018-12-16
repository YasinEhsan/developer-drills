package queue;

import java.util.Scanner;

public class ArrayQueue<T> implements Queue<T> {
   private T data[];
   private int front, rear, size, capacity;

   public ArrayQueue() {
      capacity = 1000;
      data = (T[]) new Object[capacity];
      front = rear = size = 0;
   }

   public ArrayQueue(int c) {
      capacity = c;
      data = (T[]) new Object[capacity];
      front = rear = size = 0;
   }

   public int size() {
      return size;
   }

   public boolean empty() {
      return size == 0;
   }

   public void enqueue(T x) throws Exception {
      if (size() == capacity)
         throw new Exception("Queue<T> Full");
      data[rear++] = x;
      if (rear == capacity)
         rear = 0;
      size++;
   }

   public T dequeue() throws Exception {
      if (empty())
         throw new Exception("Queue<T> Empty");
      T answer = (T) data[front++];
      if (front == capacity)
         front = 0;
      size--;
      return answer;
   }

   // methods for testing purposes
   public String toString() {
      int i, j;
      String ans = "Array Queue<T>:  ";
      for (i = 0, j = front; i < size; i++, j++) {
         if (j == capacity)
            j = 0;
         ans += (data[j] + " -> ");
      }
      return ans;
   }

   public static void main(String args[]) {
      Queue<String> q = new ArrayQueue<String>();
      testQueue(q);
   }

   public static void testQueue(Queue<String> q) {
      boolean done = false;
      Scanner sc = new Scanner(System.in);
      while (!done) {
         try {
            System.out.print(q + "  ");
            System.out.println("\ncmds are + - Q: >>");
            String cmd = sc.next();
            String entry = null;
            char command = cmd.charAt(0);
            if (command == '+')
               entry = sc.next();
            switch (cmd.charAt(0)) {
            case 'Q':
               done = true;
               break;
            case '+':
               q.enqueue(entry);
               break;
            case '-':
               q.dequeue();
               break;
            }
         } catch (Exception e) {
            System.out.println("Error " + e.toString());
         }
      }
      sc.close();
   }
}
