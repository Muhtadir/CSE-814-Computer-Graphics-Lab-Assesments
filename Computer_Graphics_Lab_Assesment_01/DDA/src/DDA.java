/***************************************************
 * Copyright 2019 Md. Muhtadir Rahman              *
 * ID : 16701046                                   *
 * Department of Computer Science & Engineering,   *
 * University of Chittagong                        *
 **************************************************/
import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;
import java.lang.*;
public class DDA extends Canvas
{
   static int  x0, y0,x1,y1;
    DDA(int x0,int y0,int x1,int y1)
 {
       this.x0=x0;
   this.y0=y0;
   this.x1=x1;
   this.y1=y1;
 }
 public void paint(Graphics g)
 {
    int dx,dy;
  float Xinc,Yinc,x,y,steps;
  dy=y1-y0;
  dx=x1-x0;
  g.fillOval(x0,y0,10,10);
  if(dy>dx)
  {
   steps=Math.abs(dy);
  }
  else
  {
   steps=Math.abs(dx);
  }
  x=x0;
  y=y0;
  Yinc=dy/steps;
  Xinc=dx/steps;
  while(steps!=0)
  {

   steps--;
    x=x+Xinc;
           y=y+Yinc;

   g.fillOval(Math.round(x),Math.round(y),10,10);

  }

 }

 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter first end x0 and y0");
    int x0=sc.nextInt();
    int y0=sc.nextInt();
    System.out.println("Enter last end x1 and y1");
    int x1=sc.nextInt();
    int y1=sc.nextInt();
    DDA d=new DDA(x0,y0,x1,y1);
    JFrame f=new JFrame();
    f.add(d);
    f.setSize(800,800);
    f.setVisible(true);

   }
}
