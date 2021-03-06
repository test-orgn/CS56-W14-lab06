package edu.ucsb.cs56.w14.drawings.krbriggs.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D; 
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.w14.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.w14.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a santa hat that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Kevin Briggs 
   @version for CS56, Winter 14, UCSB
   
*/
public class SantaHat extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x top of hat
       @param y y top of hat
       @param radius radius of puff ball
	@param size general size of hat

     */
    public SantaHat(double x, double y, double radius, double size)
    {
    
        
        
        
      
        
        Line2D.Double leftHat = 
            new Line2D.Double (x, y,
                               x -  size, y + size);
                               
        Line2D.Double rightHat = 
            new Line2D.Double (x, y,
                               x +  size, y + size);

	Line2D.Double bottomHat = 
            new Line2D.Double (x-size, y+size,
                               x+size, y+size);

	 Ellipse2D.Double puffBall = 
           new Ellipse2D.Double
           (
             x - .5 * radius,
             y-radius,
             radius, radius
           );

        // put the santa hat together
       
        GeneralPath wholeHat = this.get();
        wholeHat.append(leftHat, false);
        wholeHat.append(rightHat, false);
        wholeHat.append(bottomHat, false); 
	wholeHat.append(puffBall, false); 
        
    }

}
