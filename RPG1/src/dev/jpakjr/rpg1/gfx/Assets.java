package dev.jpakjr.rpg1.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	    
		private static final int width = 32, height = 32;  
	
	    public static BufferedImage grass, fern;     
	    public static BufferedImage[] player_down, player_up, player_left, player_right;
	    
		public static void init(){
			SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tileset.png"));
      		SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("/textures/mainguy.png"));

      		player_down = new BufferedImage[3];
      		player_up = new BufferedImage[3];
      		player_left = new BufferedImage[3];
      		player_right = new BufferedImage[3];
      		
      		
      		player_down[0] = sheet1.crop(0, 0, width, height);
      		player_down[1] = sheet1.crop(0, 0, width, height);
      		player_down[2] = sheet1.crop(0, 0, width, height);
      		
      		player_up[0] = sheet1.crop(0 , 72 , width, height);
      		player_up[1] = sheet1.crop(46  , 72, width, height);
      		player_up[2] = sheet1.crop(0, 72, width, height);
      		
      		player_left[0] = sheet1.crop(0, 110, width, height);
      		player_left[1] = sheet1.crop(46, 110, width, height);
      		player_left[2] = sheet1.crop(0, 110, width, height);
      		
      		player_right[0] = sheet1.crop(0, 38, width, height);
      		player_right[1] = sheet1.crop(50 , 38 , width, height);
      		player_right[2] = sheet1.crop(0, 38 , width, height);

            
			grass = sheet.crop(1, 1, width, height);
			fern = sheet.crop(width * 3, 1, width, height);

		}
}
