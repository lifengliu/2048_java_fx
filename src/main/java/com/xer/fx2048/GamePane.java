/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xer.fx2048;

import javafx.scene.layout.Pane;

/**
 *
 * @author xer
 */
public class GamePane extends Pane{
	final private static int size=4;	
	private Tile [][] tiles;

	public GamePane()
	{
		int count;
		this.tiles=new Tile[size][size];
		count=2;
		for(int i=0;i<size;i++)//columns
		{
			for(int j=0;j<size;j++)//rows
			{
				int x=i*Tile.TILEWIDTH;
				int y=j*Tile.TILEHEIGHT;
				tiles[i][j]=new Tile(this,x,y);
				tiles[i][j].setValue(count);
				count=count*2;	
			}
		}
	}
}
