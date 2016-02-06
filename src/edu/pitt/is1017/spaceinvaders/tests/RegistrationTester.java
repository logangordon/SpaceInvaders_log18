package edu.pitt.is1017.spaceinvaders.tests;

import java.awt.EventQueue;

import edu.pitt.is1017.spaceinvaders.RegistrationGUI;

public class RegistrationTester {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationGUI window = new RegistrationGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
