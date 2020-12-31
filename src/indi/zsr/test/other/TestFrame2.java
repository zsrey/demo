package indi.zsr.test.other;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestFrame2 {
	public static void main(String[] args) {
		OutListenerFrame outListenerFrame =new OutListenerFrame();
	}
}
class OutListenerFrame extends JFrame{

	static JTextField  t1,t2 ,resultField;
	static JComboBox cmb;
	JButton btn1;

	public OutListenerFrame() {
		// TODO Auto-generated constructor stub
		setTitle("标题");
		setSize(400,300);
		setBackground(Color.cyan);

		setLocationRelativeTo(null);
		setLayout(new FlowLayout());


		t1=new JTextField(5);
		t2=new JTextField(5);
		resultField =new JTextField(5);
		btn1 =new JButton("=");
		cmb=new JComboBox();
		cmb.addItem("+");
		cmb.addItem("-");
		cmb.addItem("*");
		cmb.addItem("/");

		add(t1);add(cmb);add(t2);add(btn1);add(resultField);
		btn1.addActionListener( new CommandLisenter());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class CommandLisenter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		double d1 =Double.parseDouble(OutListenerFrame.t1.getText());
		double d2 =Double.parseDouble(OutListenerFrame.t2.getText());
		String command=OutListenerFrame.cmb.getSelectedItem().toString();//获取JComboBox的内容

		double result =0;
		if(command.equals("+"))
			result =d1 +d2;
		else if (command.equals("-"))
			result = d1 - d2;
		else if (command.equals("*"))
			result= d1 * d2;
		else if(command.equals("/"))
			result = d1 / d2;

		OutListenerFrame.resultField.setText(result +"");
	}

}