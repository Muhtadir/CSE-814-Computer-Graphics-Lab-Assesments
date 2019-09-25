/***************************************************
 * Copyright 2019 Md. Muhtadir Rahman              *
 * ID : 16701046                                   *
 * Department of Computer Science & Engineering,   *
 * University of Chittagong                        *
 **************************************************/
import java.io.*;
import java.applet.*;
import java.util.*;
import java.awt.*;
public class Bre1 extends Applet
{
public void paint(Graphics g)
{
int x,y,k;
double dx,dy,p;
int x1=200,y1=300,x2=600,y2=400;
dx=Math.abs(x2-x1);
dy=Math.abs(y2-y1);
x=x1;
y=y1;
p=2*dy-dx;
g.fillOval(200,300,5,5);
for(k=0;k<dx;k++)
{
if(p<0)
{
g.fillOval(x++,y,5,5);
p=p+(2*dy);
}
else
{
g.fillOval(x++,y++,5,5);
p=p+(2*(dy-dx));
}
}
}
}
/*<applet code="Bre1.class" width="800" height="800">
 </applet>*/