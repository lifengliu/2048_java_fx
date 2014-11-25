/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xer.fx2048;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author xer
 */
public class CoreTest {
	@Test
	public void testRandom()
	{
		Core core=new Core(4);
		for(int i=0;i<16;i++)
		{
			core.addRandom();
		}
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				assertNotEquals(0, core.getBoard()[i][j]);
			}
		}
	}
	@Test
	public void testRotate()
	{
		int input[][]={{1,2,3,4},
			{5,6,7,8},
			{9,1,1,1},
			{2,2,2,2}};
		int output[][]={{4,8,1,2},
			{3,7,1,2},
			{2,6,1,2},
			{1,5,9,2}
		};
		Core core=new Core(4);
		core.setBoard(input);
		core.rotate();
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				assertEquals(output[i][j], core.getBoard()[i][j]);
			}
		}
	}
	@Test
	public void testFindTarget()
	{
		int [][] input={{0,0,0,2},
			{2,0,0,0},
			{2,0,0,2},
			{4,0,0,2},
			{4,4,4,2},

		};
		Core core=new Core(4);
		assertEquals(0,core.findTarget(input[0], 3, 0));
		assertEquals(2,core.findTarget(input[0], 3, 2));
		assertEquals(0,core.findTarget(input[1], 0, 0));
		assertEquals(0,core.findTarget(input[2], 3, 0));
		assertEquals(1,core.findTarget(input[2], 3, 1));
		assertEquals(1,core.findTarget(input[3], 3, 0));
		assertEquals(3,core.findTarget(input[4], 3, 0));
	}
	@Test
	public void testSlideColumn()
	{
		int [][] input={
			{0,0,0,2},
			{0,0,2,2},
			{0,2,0,2},
			{2,0,0,2},
			{2,0,2,0},
			{2,2,2,0},
			{2,0,2,2},
			{2,2,0,2},
			{2,2,2,2},
			{4,4,2,2},
			{2,2,4,4},
			{8,0,2,2},
			{4,0,2,2}
		};
		int [][] output={
			{2,0,0,0},
			{4,0,0,0},
			{4,0,0,0},
			{4,0,0,0},
			{4,0,0,0},
			{4,2,0,0},
			{4,2,0,0},
			{4,2,0,0},
			{4,4,0,0},
			{8,4,0,0},
			{4,8,0,0},
			{8,4,0,0},
			{4,4,0,0}
		};
		Core core=new Core(4);
		for(int i=0;i<13;i++)
		{
			core.slideColumn(input[i]);
			for(int j=0;j<4;j++)
			{
				assertEquals("error at ("+i+","+j+")",output[i][j],input[i][j]);
			}
		}
	}
}
