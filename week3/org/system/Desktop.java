package org.system;

public class Desktop extends Computer {
	

	public void desktopSize() {
		
		System.out.println("Size is 15.6inch");
	}

	public static void main(String[] args) {
		
		Desktop info=new Desktop();
		
		info.computerModel();
		info.desktopSize();
		
		}
	}

