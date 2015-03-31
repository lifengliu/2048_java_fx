package com.xer.fx2048;

import javafx.scene.layout.Pane;

/**
 *
 * @author lifengliu 
 */
public class GamePane extends Pane{
	final private static int size=4;	
	private Tile [][] tiles;
	private Core core;

	public GamePane()
	{
		this.tiles=new Tile[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				int x=i*Tile.TILEWIDTH;
				int y=j*Tile.TILEHEIGHT;
				this.tiles[i][j]=new Tile(this,x,y);
			}
		}
		this.core=new Core(size);
		update();
	}
	private void update()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				tiles[i][j].setValue(core.getBoard()[i][j]);
			}
		}
	}
	public void slideUp()
	{
		boolean success=core.slideUp();
		update();
	}
	public void slideDown()
	{
		boolean success=core.slideDown();
		update();
	}
	public void slideRight()
	{
		boolean success=core.slideRight();
		update();
	}
	public void slideLeft()
	{
		boolean success=core.slideLeft();
		update();
	}
}
