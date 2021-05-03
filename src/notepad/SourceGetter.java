/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

/**
 *
 * @author PREMIUM
 */
import java.awt.*;  
import java.awt.event.*;  
import java.io.InputStream;  
import java.net.*;  
import javax.swing.*;

public class SourceGetter extends JFrame implements ActionListener{  
    JTextField tf;  
    JTextArea ta;  
    JButton b;  
    JLabel l;  
    SourceGetter(){  
        super("Source Getter Tool");  
        l=new JLabel("Enter URL:");  
        l.setBounds(50,50,50,20);  
          
        tf=new JTextField();  
        tf.setBounds(120,50,250,20);  
          
        b=new JButton("Get Source Code");  
        b.setBounds(120, 100,120,30);  
        b.addActionListener(this);  
          
        ta=new JTextArea();  
        ta.setBounds(120,150,250,150);  
          
        add(l);add(tf);add(b);add(ta);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void actionPerformed(ActionEvent e){  
        String s=tf.getText();  
        if(s==null){}  
        else{  
            try{  
            URL u=new URL(s);  
            URLConnection uc=u.openConnection();  
          
            InputStream is=uc.getInputStream();  
            int i;  
            StringBuilder sb=new StringBuilder();  
            while((i=is.read())!=-1){  
                sb.append((char)i);  
            }  
            String source=sb.toString();  
            ta.setText(source);  
            }catch(Exception ex){System.out.println(e);}  
        }  
    }  
    public static void main(String[] args) {  
        new SourceGetter();  
    }  

    void setDefaultCloseOpeartin(int DISPOSE_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  
