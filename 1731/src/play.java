import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  
class play extends JFrame implements ActionListener{  
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,sample,starB;  
Icon star;  
Icon ic0=new ImageIcon("images/blank.jpg");  

Icon samicon1=new ImageIcon("images/pic1.jpeg");  
Icon samicon2=new ImageIcon("images/pic2.jpg");  
Icon samicon3=new ImageIcon("images/pic3.jpg");  
Icon ic1=new ImageIcon("images/pic1_01.jpg");  
Icon ic2=new ImageIcon("images/pic1_06.jpg");  
Icon ic3=new ImageIcon("images/pic1_03.jpg");  
Icon ic4=new ImageIcon("images/pic1_08.jpg");  
Icon ic5=new ImageIcon("images/pic1_05.jpg");  
Icon ic6=new ImageIcon("images/pic1_02.jpg");  
Icon ic7=new ImageIcon("images/pic1_07.jpg");  
Icon ic8=new ImageIcon("images/pic1_04.jpg");  
Icon ic9=new ImageIcon("images/blank.jpg");  
  
Icon ic11=new ImageIcon("images/pic2_02.jpg");  
Icon ic12=new ImageIcon("images/pic2_03.jpg");  
Icon ic13=new ImageIcon("images/pic2_06.jpg");  
Icon ic14=new ImageIcon("images/pic2_01.jpg");  
Icon ic15=new ImageIcon("images/pic2_04.jpg");  
Icon ic16=new ImageIcon("images/blank.jpg");  
Icon ic17=new ImageIcon("images/pic2_07.jpg");  
Icon ic18=new ImageIcon("images/pic2_05.jpg");  
Icon ic19=new ImageIcon("images/pic2_08.jpg");  
  
Icon ic21=new ImageIcon("images/pic3_04.jpg");  
Icon ic22=new ImageIcon("images/pic3_05.jpg");  
Icon ic23=new ImageIcon("images/pic3_01.jpg");  
Icon ic24=new ImageIcon("images/pic3_07.jpg");  
Icon ic25=new ImageIcon("images/pic3_03.jpg");  
Icon ic26=new ImageIcon("images/blank.jpg");  
Icon ic27=new ImageIcon("images/pic3_08.jpg");  
Icon ic28=new ImageIcon("images/pic3_02.jpg");  
Icon ic29=new ImageIcon("images/pic3_06.jpg");  
  
play(){  
  
super("pic puzzle");  
  
btn1=new JButton(ic1);  
btn1.setBounds(10,50,196,196);  
btn2=new JButton(ic2);  
btn2.setBounds(206,50,196,196);  
btn3=new JButton(ic3);  
btn3.setBounds(402,50,196,196);  
btn4=new JButton(ic4);  
btn4.setBounds(10,246,196,196);  
btn5=new JButton(ic5);  
btn5.setBounds(206,246,196,196);  
btn6=new JButton(ic6);  
btn6.setBounds(402,246,196,196);  
btn7=new JButton(ic7);  
btn7.setBounds(10,442,196,196);  
btn8=new JButton(ic8);  
btn8.setBounds(206,442,196,196);  
btn9=new JButton(ic9);  
btn9.setBounds(402,442,196,196);  
sample=new JButton(samicon1);  
sample.setBounds(650,100,200,200);  
  
  
JLabel lab1=new JLabel("Welcome to Picture Puzzle!!");  
lab1.setBounds(5,15,500,20);  
JLabel lab2=new JLabel("Original:");  
lab2.setBounds(650,50,200,20);  
lab2.setForeground(Color.red);  
JLabel lab3=new JLabel("Click on Original picture to change.");  
lab3.setBounds(650,350,500,20);  
  
star=btn9.getIcon();  
  
add(btn1);
add(btn2);
add(btn3);
add(btn4);
add(btn5);
add(btn6);
add(btn7);
add(btn8);  
add(btn9);
add(sample);
add(lab1);
add(lab2);
add(lab3);

 btn1.addActionListener(this);
 btn2.addActionListener(this);  
 btn3.addActionListener(this);
 btn4.addActionListener(this);   
 btn5.addActionListener(this);
 btn6.addActionListener(this);  
 btn7.addActionListener(this);
 btn8.addActionListener(this);  
 btn9.addActionListener(this);   
  
sample.addActionListener(this);  
setLayout(null);  
setSize(900,700);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
}  
  
public void actionPerformed(ActionEvent e){  
if(e.getSource()==btn1){  
    Icon s1=btn1.getIcon();  
      if(btn2.getIcon()==star){  
        btn2.setIcon(s1);  
        btn1.setIcon(star);  
      } else if(btn4.getIcon()==star){  
                    btn4.setIcon(s1);  
                    btn1.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==btn2){  
    Icon s1=btn2.getIcon();  
      if(btn1.getIcon()==star){  
        btn1.setIcon(s1);  
        btn2.setIcon(star);  
      } else if(btn5.getIcon()==star){  
                    btn5.setIcon(s1);  
                    btn2.setIcon(star);  
                   }  
         else if(btn3.getIcon()==star){  
                    btn3.setIcon(s1);  
                    btn2.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==btn3){  
    Icon s1=btn3.getIcon();  
      if(btn2.getIcon()==star){  
        btn2.setIcon(s1);  
        btn3.setIcon(star);  
      } else if(btn6.getIcon()==star){  
                    btn6.setIcon(s1);  
                    btn3.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==btn4){  
    Icon s1=btn4.getIcon();  
      if(btn1.getIcon()==star){  
        btn1.setIcon(s1);  
        btn4.setIcon(star);  
      } else if(btn5.getIcon()==star){  
                    btn5.setIcon(s1);  
                    btn4.setIcon(star);  
                   }  
         else if(btn7.getIcon()==star){  
                    btn7.setIcon(s1);  
                    btn4.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==btn5){  
    Icon s1=btn5.getIcon();  
      if(btn2.getIcon()==star){  
        btn2.setIcon(s1);  
        btn5.setIcon(star);  
      } else if(btn4.getIcon()==star){  
                    btn4.setIcon(s1);  
                    btn5.setIcon(star);  
                   }  
         else if(btn6.getIcon()==star){  
                    btn6.setIcon(s1);  
                    btn5.setIcon(star);  
                   }  
          else if(btn8.getIcon()==star){  
                    btn8.setIcon(s1);  
                    btn5.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==btn6){  
    Icon s1=btn6.getIcon();  
      if(btn3.getIcon()==star){  
        btn3.setIcon(s1);  
        btn6.setIcon(star);  
      } else if(btn5.getIcon()==star){  
                    btn5.setIcon(s1);  
                    btn6.setIcon(star);  
                   }  
         else if(btn9.getIcon()==star){  
                    btn9.setIcon(s1);  
                    btn6.setIcon(star);  
                   }  
}//end of if  
  
if(e.getSource()==btn7){  
    Icon s1=btn7.getIcon();  
      if(btn4.getIcon()==star){  
        btn4.setIcon(s1);  
        btn7.setIcon(star);  
      } else if(btn8.getIcon()==star){  
                    btn8.setIcon(s1);  
                    btn7.setIcon(star);  
                   }  
 }//end of if  
  
   if(e.getSource()==btn8){  
    Icon s1=btn8.getIcon();  
      if(btn7.getIcon()==star){  
        btn7.setIcon(s1);  
        btn8.setIcon(star);  
      } else if(btn5.getIcon()==star){  
                    btn5.setIcon(s1);  
                    btn8.setIcon(star);  
                   }  
         else if(btn9.getIcon()==star){  
                    btn9.setIcon(s1);  
                    btn8.setIcon(star);  
                   }  
  
  }//end of if  
  
 if(e.getSource()==btn9){  
    Icon s1=btn9.getIcon();  
      if(btn8.getIcon()==star){  
        btn8.setIcon(s1);  
        btn9.setIcon(star);  
      } else if(btn6.getIcon()==star){  
                    btn6.setIcon(s1);  
                    btn9.setIcon(star);  
                   }  
  }//end of if  
  
if(e.getSource()==sample){  
Icon s1=sample.getIcon();  
 if(s1==samicon3){  
sample.setIcon(samicon1);  
btn1.setIcon(ic1);  
btn2.setIcon(ic2);  
btn3.setIcon(ic3);  
btn4.setIcon(ic4);  
btn5.setIcon(ic5);  
btn6.setIcon(ic6);  
btn7.setIcon(ic7);  
btn8.setIcon(ic8);  
btn9.setIcon(ic9);  
star=btn9.getIcon();  
starB.setIcon(ic0);  
}//eof if  
else if(s1==samicon1){  
sample.setIcon(samicon2);  
btn1.setIcon(ic11);  
btn2.setIcon(ic12);  
btn3.setIcon(ic13);  
btn4.setIcon(ic14);  
btn5.setIcon(ic15);  
btn6.setIcon(ic16);  
btn7.setIcon(ic17);  
btn8.setIcon(ic18);  
btn9.setIcon(ic19);  
star=btn6.getIcon();  
  
}//eof else  
else{  
sample.setIcon(samicon3);  
btn1.setIcon(ic21);  
btn2.setIcon(ic22);  
btn3.setIcon(ic23);  
btn4.setIcon(ic24);  
btn5.setIcon(ic25);  
btn6.setIcon(ic26);  
btn7.setIcon(ic27);  
btn8.setIcon(ic28);  
btn9.setIcon(ic29);  
star=btn6.getIcon();  

}//end of else  
  
}  
}//end of actionPerformed  
  
public static void main(String args[]){  
new play();  
}//end of main  
}//end of class 
