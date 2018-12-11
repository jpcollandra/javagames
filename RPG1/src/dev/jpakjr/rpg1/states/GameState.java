package dev.jpakjr.rpg1.states;

import java.awt.Graphics;

import dev.jpakjr.rpg1.Game;
import dev.jpakjr.rpg1.Handler;
import dev.jpakjr.rpg1.entities.creatures.Player;
import dev.jpakjr.rpg1.tiles.Tile;
import dev.jpakjr.rpg1.worlds.World;

public class GameState extends State{

	private Player player;
	private World world;
	
    public GameState(Handler handler){
    	super(handler);
    	world = new World(handler, "res/Worlds/world1.txt");
    	handler.setWorld(world);
    	player = new Player(handler, 100 , 100);

    	handler.getGameCamera().move(0,0);
    }
    
	public void tick() {
		world.tick();
		player.tick(); 
		handler.getGameCamera().move(1, 1);
		
	}

	public void render(Graphics g) {
		world.render(g);
		player.render(g);
	}

}
