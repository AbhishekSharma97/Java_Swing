
import java.awt.*;
import java.applet.*;	
import java.awt.event.*;
public class Abcd extends Applet implements ActionListener
{ 
	int x; int y; int w=800;
	 Button b1;Button b2;Button b3;
	 String msg=" ";
	 void slep()
	 {

	   try 
	{
	   Thread.sleep(100);
        }
	 catch(Exception e) 
		{}
	  }
	 public void init()
	   {
	 y=250;
	 x=20;
	 b1=new Button("back");
	 add(b1);
	 b2=new Button("forward");
	 b3=new Button("stop");
	 add(b3);
	 add(b2);
         b1.addActionListener(this);
	 b2.addActionListener(this);
	 b3.addActionListener(this);
	 }	 
	 public void actionPerformed(ActionEvent e)
	 {
	 String s=e.getActionCommand();
	 if(s.equals("back"))
	 {
	  msg="back";
	  repaint();
	 }
	  else if(s.equals("forward"))
	  {
	  msg="forward";
	  repaint();
	  }
	 else if(s.equals("stop"))
	  {
	   msg="  ";
	   repaint(); 
	  }
	}
	
	public void paint(Graphics g)
	{
	
		
	setBackground(Color.cyan);
	g.setColor(Color.green);
	g.fillRect(0,320,800,80);
	g.setColor(Color.black);
	g.fillRect(0,320,800,5);
	g.setColor(Color.yellow);
	g.fillOval(50,20,100,100);
	g.setColor(Color.white);
	g.fillOval(230,50,95,70);
	g.fillOval(280,20,85,80);
	g.fillOval(310,50,100,70);
	g.fillOval(450,90,95,70);
	g.fillOval(500,60,85,80);
	g.fillOval(530,90,100,70);


	g.setColor(Color.green);			//grass
	g.fillOval(190,270,85,50);
	g.setColor(Color.black);
	g.drawOval(190,270,85,50);
	g.setColor(Color.green);	
	g.fillOval(220,270,90,50);
	g.setColor(Color.black);	
	g.drawOval(220,270,90,50);
	g.setColor(Color.green);
	g.fillOval(215,240,70,50);
	g.setColor(Color.black);
	g.drawOval(215,240,70,50);
	g.setColor(Color.green);
	g.fillOval(210,256,75,65);			//grass



	Color c0=new Color(200,60,200);			//flowers
	g.setColor(c0);
	g.fillOval(240,259,7,7);
	g.fillOval(258,290,7,7);
	g.fillOval(225,280,7,7);
	g.setColor(Color.yellow);
	g.drawOval(240,259,7,7);
	g.drawOval(258,290,7,7);
	g.drawOval(225,280,7,7);			//flowers
	

	g.setColor(Color.red);
	g.fillRoundRect(20,240,10,80,5,5);
	g.fillRoundRect(40,240,10,80,5,5);
	g.fillRoundRect(60,240,10,80,5,5);
	g.fillRoundRect(80,240,10,80,5,5);
	g.fillRoundRect(100,240,10,80,5,5);	
	g.fillRoundRect(120,240,10,80,5,5);
	g.fillRoundRect(140,240,10,80,5,5);
	g.fillRoundRect(160,240,10,80,5,5);
	g.fillRoundRect(180,240,10,80,5,5);
	g.fillRoundRect(200,240,10,80,5,5);
	g.fillRoundRect(340,220,10,100,5,5);
	g.fillRoundRect(560,220,10,100,5,5);	
	g.fillRoundRect(10,260,220,10,5,5);
	g.fillRoundRect(10,300,220,10,5,5);
	g.setColor(Color.black);
	g.drawRoundRect(340,220,10,100,5,5);
	g.drawRoundRect(560,220,10,100,5,5);	
	g.drawRoundRect(10,260,220,10,5,5);
	g.drawRoundRect(10,300,220,10,5,5);
	g.setColor(Color.red);
	g.fillRoundRect(720,240,10,80,5,5);
	g.fillRoundRect(740,240,10,80,5,5);
	g.fillRoundRect(760,240,10,80,5,5);
	g.fillRoundRect(780,240,10,80,5,5);
	g.fillRoundRect(700,260,100,10,5,5);
	g.fillRoundRect(700,300,100,10,5,5);
	g.setColor(Color.black);
	g.drawRoundRect(700,260,100,10,5,5);
	g.drawRoundRect(700,300,100,10,5,5);
	g.drawLine(340,220,560,320);
	g.drawLine(340,220,560,320);
	g.drawLine(340,220,560,320);
	g.drawLine(340,220,560,320);
	g.drawLine(560,220,340,320);
	g.drawLine(560,220,340,320);
	g.drawLine(560,220,340,320);
	g.drawLine(560,220,340,320);	
	g.setColor(Color.black);
	g.drawArc(350,270,210,100,0,-180);
	g.setColor(Color.blue);
	g.fillArc(350,270,210,100,0,-180);
	g.setColor(Color.cyan);
	g.fillArc(350,310,210,30,0,-180);
	g.setColor(Color.black);
	g.drawArc(350,310,210,30,0,-180);
	g.setColor(Color.yellow);
	g.fillRoundRect(350,320,20,7,7,7);
	g.fillRoundRect(370,320,20,7,7,7);
	g.fillRoundRect(390,320,20,7,7,7);
	g.fillRoundRect(410,320,20,7,7,7);
	g.fillRoundRect(430,320,20,7,7,7);
	g.fillRoundRect(450,320,20,7,7,7);
	g.fillRoundRect(470,320,20,7,7,7);
	g.fillRoundRect(490,320,20,7,7,7);
	g.fillRoundRect(510,320,20,7,7,7);
	g.fillRoundRect(530,320,20,7,7,7);
	g.fillRoundRect(550,320,20,7,7,7);
	g.setColor(Color.black);
	g.drawRoundRect(350,320,20,7,7,7);
	g.drawRoundRect(370,320,20,7,7,7);
	g.drawRoundRect(390,320,20,7,7,7);
	g.drawRoundRect(410,320,20,7,7,7);
	g.drawRoundRect(430,320,20,7,7,7);
	g.drawRoundRect(450,320,20,7,7,7);
	g.drawRoundRect(470,320,20,7,7,7);
	g.drawRoundRect(490,320,20,7,7,7);
	g.drawRoundRect(510,320,20,7,7,7);
	g.drawRoundRect(530,320,20,7,7,7);
	g.drawRoundRect(550,320,20,7,7,7);
	
	Color c1=new Color(20,160,200);
	g.setColor(c1);					//board
	g.fillRoundRect(630,130,10,190,5,5);
	g.setColor(Color.black);
	g.drawRoundRect(630,130,10,190,5,5);
	g.setColor(c1);
	g.fillRoundRect(585,150,100,40,5,5);
	g.setColor(Color.black);
	g.drawRoundRect(585,150,100,40,5,5);		//board
	
	Color c2=new Color(200,60,200);
        g.setColor(c2);
	g.fillRoundRect(x,y+20,100,40,5,5);
	g.fillArc(x+90,y+20,20,40,270,180);
	g.setColor(c1);  
	g.fillRoundRect(x+10,y,70,25,10,10);
        g.setColor(Color.white);
        g.fillRect(x+20,y+5,20,25);
        g.fillRect(x+50,y+5,20,25);
        g.setColor(Color.black);
        g.fillRoundRect(x+55,y+10,10,20,10,10);
        g.fillOval(x+10,y+50,25,25);
        g.fillOval(x+60,y+50,25,25);
        g.setColor(Color.white);
        g.fillArc(x+20,y+60,5,5,0,360);
        g.fillArc(x+70,y+60,5,5,0,360);

	g.setColor(Color.black);
	g.drawString("Abhishek",610,173);		

        slep();
        if(msg.equals("forward"))
	    {          
	    if(x+120<w)
	    {
	    x=x+1;
	    showStatus("press back for moving backward");
	    repaint();
	    }
	    }
	    if(msg.equals("back"))
	    {
	       if(x>0)

	    {
	    x=x-1;
	   showStatus("Press forward for moving forward");
	    repaint();
	    }
	    }
}
}
	
	
