/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Mysql_conn implements ActionListener{
    JFrame jfrm;
    JButton b1,b2;
    JLabel l1,l2;
    JTextField tf1,tf2;
    
    Mysql_conn(){
        jfrm=new JFrame("window");
        b1=new JButton("button1");
        tf1=new JTextField();
        tf1.setBounds(100,50,200,30); 
        tf2=new JTextField();
        tf2.setBounds(100,100,200,30);
        l1=new JLabel("N1");
        l1.setBounds(80,50,100,30); 
        l2=new JLabel("N2");
        l2.setBounds(80,100,100,30);
        b1=new JButton("N1");
        b1.setBounds(80,150,50,30); 
        b2=new JButton("N2");
        b2.setBounds(170,150,50,30);
        
        jfrm.add(tf1);
        jfrm.add(tf2);
        jfrm.add(l1);
        jfrm.add(l2);
        jfrm.add(b1);
        jfrm.add(b2);
        jfrm.setLayout(new BorderLayout());
        jfrm.setSize(400,400);
        jfrm.setVisible(true);
        
    
    }
 
    public static void main(String args[]) {
        
        Mysql_conn con=new Mysql_conn();
    }
}
