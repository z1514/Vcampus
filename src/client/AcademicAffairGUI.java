package client;

import java.awt.*;
import javax.swing.*;

public class AcademicAffairGUI extends JPanel{
	
	JLabel lID = new JLabel("输入学号：");
//	JLabel lGPA = new JLabel("绩点：");
	JLabel lGPA;
	JLabel lSRTP = new JLabel("SRTP学分：");

	
//	文件句柄  
//	ImageIcon icon = new ImageIcon(
//			"D:\\18-JDKandEclipse\\1-Eclipse\\0-workspace\\ClientGUIs\\src\\clientGUIs\\pictures\\test01.jpg");

	JTextField IDinput = new JTextField(15);
	JTextField SRTPoutput = new JTextField(15);
	JTextField GPAoutput = new JTextField(15);
	
	public void add(Component c, GridBagConstraints cons, int x, int y, int w, int h) {
		cons.gridx = x;
		cons.gridy = y;
		cons.gridwidth = w;
		cons.gridheight = h;
		add(c, cons);
	}
	
	public AcademicAffairGUI() {
//		设置Label格式——try
		lGPA = new JLabel("绩点：", SwingConstants.RIGHT);
//		lGPA.setHorizontalAlignment(SwingConstants.RIGHT);
		
//		设置背景颜色
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		
//		lGPA.setOpaque(true);  	 
//		lGPA.setBackground(Color.GREEN);
//		设置JLabel图标——try——OK
//		设置自适应lID大小 
//		icon.setImage(icon.getImage().getScaledInstance((icon.getIconWidth()/4), 
//				(icon.getIconHeight()/4), Image.SCALE_DEFAULT)); 
//	    System.out.println(icon.getIconWidth() + "x" + icon.getIconHeight());
//	    lID.setIcon(icon);//设置图片
	    lID.setBounds(10, 10, 190, 330);//设置lID的大小
		
//		 设置布局
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		GridBagConstraints cons = new GridBagConstraints();
		cons.weightx = 3;
		cons.weighty = 4;
//		cons.anchor = GridBagConstraints.WEST;
		
//		 设置窗口大小
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width, height);
		
//		插入各行各列
		add(lID, cons, 0, 0, 1, 1); // 第一行
		add(IDinput, cons, 1, 0, 1, 1); 
		add(lGPA, cons, 0, 1, 1, 1); // 第二行
		add(GPAoutput, cons, 1, 1, 1, 1); 
		add(lSRTP, cons, 2, 1, 1, 1); 
		add(SRTPoutput, cons, 3, 1, 1, 1); 
		
//		设置字体颜色和大小
		for(int i = 0; i < this.getComponentCount(); i++){ 
			Font font = new Font("苹方 常规", Font.CENTER_BASELINE, 15); 
			this.getComponent(i).setFont(font);
		}
		this.setBorder(BorderFactory.createTitledBorder("成绩查询"));

	}
		
}
