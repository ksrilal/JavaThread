package com.ksril;

public class Fac extends Thread{
	public int answer;
	
	public Fac(int x) {
		this.answer = x;
	}
	
	public void run() {
		if(answer<=1) {
			answer = 1;
		}
		else {
			try {
				Fac fac = new Fac(answer-1);
				fac.start();
				fac.join();
				answer = answer * fac.answer;
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
