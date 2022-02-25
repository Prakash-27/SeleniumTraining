package com.Learning;

// Java program to demonstrate working of Robot
// class. This program is for Windows. It opens
// notepad and types a message.
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;

public class robo {
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		String command = "C:\\Users\\Prakash\\Desktop\\Notepad.exe";
		Runtime run = Runtime.getRuntime();
		run.exec(command);

		// Create an instance of Robot class
		Robot robot = new Robot();

		// Press keys using robot. A gap of
		// of 500 milli seconds is added after
		// every key press
		robot.keyPress(KeyEvent.VK_H);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_L);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_O);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_F);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_O);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_SPACE);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_G);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_K);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_F);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_O);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_R);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_G);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_E);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_K);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_S);
	}
}
