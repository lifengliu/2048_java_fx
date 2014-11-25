/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xer.fx2048;

/**
 *
 * @author xer
 */
public class Core {
	private int [][] board;
	private int width;
	private int height;
	private int list[][];

	
	public Core(int width, int height)
	{
		this.width=width;
		this.height=height;
		board=new int[width][height];
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				board[i][j]=0;
			}
		}
		list=new int[width*height][2];
		addRandom();
		addRandom();
	}
	public void addRandom()
	{
		int len=0;
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				if(board[i][j]==0)
				{
					list[len][0]=i;
					list[len][1]=j;
					len++;
				}
			}
		}
		if(len>0)
		{
			int r=(int)(Math.random()*len);	
			int x=list[r][0];
			int y=list[r][1];
			int n=(((int)(Math.random()*10))/9+1)*2;	
			board[x][y]=n;	
		}
		
	}
	public int [][] getBoard()
	{
		return board;
	}
	public void setBoard(int [][] board)
	{
		for(int i=0;i<width;i++)
		{
			for(int j=0;j<height;j++)
			{
				this.board[i][j]=board[i][j];
			}
		}
	}
}
