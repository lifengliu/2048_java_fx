/*
* The class for a tile
 */
package com.xer.fx2048;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


/**
 *
 * @author xer
 */
public class Tile {
	private int x;
	private int y;
	private GamePane pane;
	private Color color;
	private int value;
	private Rectangle rect;
	private Text text;
	public final static int TILEWIDTH=60;
	public final static int TILEHEIGHT=60;

	public Tile(GamePane pane, int x,int y)
	{
		this.x=x;
		this.y=y;
		this.pane=pane;
		this.value=0;
		this.color=getColor(this.value);
		
		rect=new Rectangle();
		pane.getChildren().add(rect);
		rect.setX(x);
		rect.setY(y);
		rect.setWidth(TILEWIDTH);
		rect.setHeight(TILEHEIGHT);

		text=new Text();
		text.setFont(new Font(20));
		pane.getChildren().add(text);
		update();
	}
	/**
	*Update figure 
	*/
	private void update()
	{
		color=getColor(value);
		rect.setFill(color);
		rect.setStroke(color);
		//if(value!=0)
		{
			text.setText(""+value);
			double layoutWidth=text.getLayoutBounds().getWidth();
			double layoutHeight=text.getLayoutBounds().getHeight();
			text.setX(x+TILEWIDTH/2.0-layoutWidth/2.0);
			text.setY(y+TILEHEIGHT/2.0+layoutHeight/2.0-5);
		}
		//else
		//{
		//	text.setText(".");
		//}
	}
	/**
	*Destroy the figure
	*/
	private void destroy()
	{
		pane.getChildren().remove(rect);
	}
	/**
	 * Get the corresponding color for a specified value 
	 * @param val The value of current tile
	 * @return The corresponding color object of input value
	 */
	private Color getColor(int val)
	{
		Color retColor=null;
		switch(val)
		{
			case 0:
				retColor=Color.GAINSBORO;
				break;
			case 2:
				retColor=Color.BROWN;
				break;
			case 4:
				retColor=Color.GREEN;
				break;
			case 8:
				retColor=Color.ORANGE;
				break;
			case 16:
				retColor=Color.CORNFLOWERBLUE;
				break;
			case 32:
				retColor=Color.DARKORCHID;
				break;
			case 64:
				retColor=Color.HOTPINK;
				break;
			case 128:
				retColor=Color.INDIANRED;
				break;
			case 256:
				retColor=Color.BLUE;
				break;
			case 512:
				retColor=Color.LIGHTSALMON;
				break;
			case 1024:
				retColor=Color.MEDIUMSEAGREEN;
				break;
			case 2048:
				retColor=Color.ORANGERED;
				break;
			default:
				retColor=Color.GAINSBORO;
		}
		return retColor;
	}

	/**
	* Update the value of the tile. Update the color at the same time
	*/
	public void setValue(int value) {
		this.value = value;
		update();
	}
	/**
	 *Get current value 
	 * @return The value 
	 */
	public int getValue() {
		return value;
	}
	
}
