package com.silentlexx.ffuudbconv;

public class Debug {
	boolean enable = false;
	
	Debug(boolean b) {
		enable = b;
		if (enable)
		System.out.println("Debug system activated!");
	}
	
	public void p(String s) {
		if (enable)
		System.out.println(s);
	}

	public void p(int s) {
		if (enable)
		System.out.println(s);
	}
}
