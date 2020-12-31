package indi.zsr.test.other;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestFrame3 {
	public static void main(String[] args) {
		MyFrame myFrame =new MyFrame();
	}
}
class MyFrame extends JFrame implements ActionListener{


	Label label;
	JTextArea textArea;
	JPanel panel1,panel2,panel3;
	JButton btn_s,btn_j,btn_b,btn_c;
	int win=0,flat=0,lose=0,score=0;

	public MyFrame() {
		// TODO Auto-generated constructor stub
		setTitle("标题");
		setSize(400,300);
		this.getContentPane().setBackground(Color.cyan);

		setLocationRelativeTo(null);
		//setLayout(new FlowLayout());
		setLayout(new BorderLayout());
		panel1= new JPanel();panel2= new JPanel();panel3= new JPanel();
		textArea =new JTextArea();
		String showScore="赢："+win+" 平："+flat+"输："+lose+" 得分："+score;
		label =new Label(showScore,JLabel.CENTER);
		btn_s =new JButton("剪刀");
		btn_j =new JButton("石头");
		btn_b =new JButton("布");
		btn_c =new JButton("清除");


		panel1.add(label);panel1.setBackground(Color.cyan);
		panel2.add(textArea);panel2.setBackground(Color.blue);
		panel3.add(btn_s);panel3.add(btn_j);panel3.add(btn_b);panel3.add(btn_c);panel3.setBackground(Color.yellow);
		add(panel1,BorderLayout.PAGE_START);add(panel2,BorderLayout.CENTER);add(panel3,BorderLayout.PAGE_END);
		btn_s.addActionListener(this);
		btn_j.addActionListener(this);
		btn_b.addActionListener(this);
		btn_c.addActionListener(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn_j) {
			int i=((int)(Math.random()*10)%3);
			switch(i)
			{
				case 0 :textArea.setText("你出剪刀，电脑出石头，很遗憾你输了！");updaLabel(2);break;
				case 1 :textArea.setText("你出剪刀，电脑出剪子，平局！");updaLabel(3);break;
				case 2 :textArea.setText("你出剪刀，电脑出布，恭喜你赢了！");updaLabel(1);break;
			}

		}
		else if(e.getSource()==btn_s) {
			int i=((int)(Math.random()*10)%3);
			switch(i)
			{
				case 0 :textArea.setText("你出石头，电脑出石头，平局！");updaLabel(3);break;
				case 1 :textArea.setText("你出石头，电脑出剪子，恭喜你赢了！");updaLabel(1);break;
				case 2 :textArea.setText("你出石头，电脑出布，很遗憾你输了！");updaLabel(2);break;
			}
		}
		else if(e.getSource()==btn_b) {
			int i=((int)(Math.random()*10)%3);
			switch(i)
			{
				case 0 :textArea.setText("你出布，电脑出石头，恭喜你赢了！");updaLabel(1);break;
				case 1 :textArea.setText("你出布，电脑出剪子，很遗憾你输了！");updaLabel(2);break;
				case 2 :textArea.setText("你出布，电脑出布，平局！");updaLabel(3);break;
			}
		}
		else {
			textArea.setText("清除了");
			updaLabel(0);
		}
	}
	//更新分数
	public void updaLabel(int i) {
		switch (i) {
			case 1:
				win++;score++;
				break;
			case 2:
				lose++;score = score < 1 ? 0:score-1 ;
				break;
			case 3:
				flat++;
				break;
			case 0:
				flat=0;win=0;lose=0;score=0;
				break;
			default:
				break;
		}
		label.setText("赢："+win+" 平："+flat+"输："+lose+" 得分："+score);
	}

}
