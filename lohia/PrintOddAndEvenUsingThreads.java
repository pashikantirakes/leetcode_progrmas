package com.nikhil.lohia;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class PrintOddAndEvenUsingThreads {
	int count=1;
	int max=20;
	 
	 public void printOdd() {
		 synchronized (this) {
			 while(count < max) {
				 while (count %2==0) {
					 try {
						 wait();
					 }catch (Exception e) {
						// TODO: handle exception
					}
				}
				 System.out.println("Odd no - "  +  count);
				 count++;
				 notify();
			 }
		}
	
	}
	 public void printEven() {
		 synchronized (this) {
			 while(count < max) {
				 while (count %2==1) {
					 try {
						 wait();
					 }catch (Exception e) {
						// TODO: handle exception
					}
				}
				 System.out.println("Even no - "  +  count);
				 count++;
				 notify();
			 }
		}
}
	 public static void main(String[] args) {
		PrintOddAndEvenUsingThreads oe=new PrintOddAndEvenUsingThreads();
		Thread t1=new Thread(oe::printEven);
		Thread t2=new Thread(oe::printOdd);
		
		t1.start();
		t2.start();
		
		ExecutorService ex=Executors.newFixedThreadPool(2);
		
		IntStream.rangeClosed(1, 10).forEach(num->{
			CompletableFuture<Integer> odd=CompletableFuture.completedFuture(num)
					 .thenApplyAsync(x->{
						 if(x%2==1) {
							 System.out.println("odd " + x);
						 }
						 return num;
					 },ex);
			odd.join();
			
			CompletableFuture<Integer> even=CompletableFuture.completedFuture(num)
					 .thenApplyAsync(x->{
						 if(x%2==0) {
							 System.out.println("Even - " + x);
						 }
						 return num;
					 },ex);
			even.join();
		});
		ex.shutdown();
	}
}

/*
 * Odd no - 1
Even no - 2
Odd no - 3
Even no - 4
Odd no - 5
Even no - 6
Odd no - 7
Even no - 8
Odd no - 9
Even no - 10
Odd no - 11
Even no - 12
Odd no - 13
Even no - 14
Odd no - 15
Even no - 16
Odd no - 17
Even no - 18
Odd no - 19
Even no - 20
 */
/*
int start=1;
int end=20;
 CompletableFuture<Void> c1=CompletableFuture.runAsync(()->printEven(start,end));
 CompletableFuture<Void> c2=CompletableFuture.runAsync(()->printOdd(start,end));
 CompletableFuture.allOf(c1,c2).join();
 
}

private static void printOdd(int start, int end) {
	IntStream.rangeClosed(start, end)
    .filter(e->e%2!=0)
    .forEach(n->System.out.println("odd " + n));
    
}

private static void printEven(int start, int end) {
	// TODO Auto-generated method stub
	
	IntStream.rangeClosed(start, end)
	    .filter(e->e%2==0)
	    .forEach(n->System.out.println("even " + n));
	    ;
} 
*/