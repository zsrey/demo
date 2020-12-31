package indi.zsr.test.other;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        MyTestFrame myFrame=new MyTestFrame();
    }
}

class  MyTestFrame extends Frame{
    public  MyTestFrame(){
//        setBackground(Color.red);

        setSize(400,300);
        setVisible(true);

        Panel p1 =new Panel();
        p1.setBackground(Color.green);
        p1.setBounds(0,0,200,150);
        add(p1);

        Panel p2 =new Panel();
        p2.setBackground(Color.yellow);
        p2.setBounds(200,0,200,150);
        add(p2);

        Panel p3 =new Panel();
        p3.setBackground(Color.red);
        p3.setBounds(0,150,200,150);
        add(p3);

        Panel p4 =new Panel();
        p4.setBackground(Color.cyan);
        p4.setBounds(200,150,200,150);
        add(p4);
    }
}