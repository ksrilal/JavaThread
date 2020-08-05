package com.ksril;

public class Fibo extends Thread {
	private int x;
	public int answer;
	
	public Fibo(int x) {
		this.x = x;
	}
	
	public void run() {
		if(x<=2) {
			answer = 1;
		}	
		else {
			try {
				Fibo fibo_1 = new Fibo(x-1);
				Fibo fibo_2 = new Fibo(x-2);
				fibo_1.start();
				fibo_2.start();
				fibo_1.join();
				fibo_2.join();
				answer = fibo_1.answer + fibo_2.answer;
			}catch(Exception e) {
				System.out.println("Something went wrong!!");
			}
		}
	}
}
