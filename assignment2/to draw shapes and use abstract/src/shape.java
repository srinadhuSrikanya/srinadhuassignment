import java.io.*;
import java.util.*;
public abstract class shape 
{
	abstract void draw();
	
	public static void main(String[] args) 
	{
		shape l=new Line();
		l.draw();
		shape r=new Rectangle();
		r.draw();
		shape c=new Cube();
		c.draw();
	}

}
