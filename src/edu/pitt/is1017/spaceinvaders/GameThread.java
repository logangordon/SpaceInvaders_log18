package edu.pitt.is1017.spaceinvaders;

public class GameThread extends Thread {
	// Creating a Thread subclass seemed the easiest way to pass User to Game Thread
	
	private User user;
	
	public GameThread(User user){
		this.user = user;
	}
	
	public void run(){
		Game.startNewGame(user);
		// Game needs User for the ScoreTracker object
	}

}
