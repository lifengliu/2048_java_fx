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
		Core core=new Core(4,4);
		for(int i=0;i<16;i++)
		{
			core.addRandom();
		}
		boolean full=true;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(core.getBoard()[i][j]==0)
				{
					full=false;
					break;
				}
			}
		}
		assertTrue(full);
	}
}
