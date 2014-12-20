package com.my.app;

import com.my.editor.GraphicalEditor;
import com.my.shape.Rectangle;
import com.my.shape.Square;
import com.my.shape.Triangle;

public class MyApp {

	public static void main(String[] args){
		GraphicalEditor ge = new GraphicalEditor();
		Square sq = new Square();
		Rectangle rq = new Rectangle();
		Triangle tr = new Triangle();
		
		ge.drawShape(sq);
		ge.drawShape(rq);
		ge.drawShape(tr);
	}
}
