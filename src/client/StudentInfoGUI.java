package client;

import java.awt.*;
import javax.swing.*;

public class StudentInfoGUI extends JPanel {
//	 学生个人信息
	JLabel lName = new JLabel("姓名");
	JLabel lSex = new JLabel("性别");
	JLabel lBirth = new JLabel("出生年月");
	JLabel lDorm = new JLabel("宿舍");
	JLabel lID = new JLabel("学号");
	JLabel lClass = new JLabel("班级");
	JLabel lTele = new JLabel("电话");
	JLabel lEmail = new JLabel("电子邮件");

	JButton bOK = new JButton("确定");
	JButton bCancel = new JButton("取消");

	JTextField nameinput = new JTextField(15);
	JTextField sexinput = new JTextField(15);
	JTextField birthinput = new JTextField(15);
	JTextField dorminput = new JTextField(15);
	JTextField IDinput = new JTextField(15);
	JTextField classinput = new JTextField(15);
	JTextField teleinput = new JTextField(15);
	JTextField emailinput = new JTextField(15);
	
	Image image ;
	public void add(Component c, GridBagConstraints cons, int x, int y, int w, int h){
		cons.gridx = x;
		cons.gridy = y;
		cons.gridwidth = w;
		cons.gridheight = h;
		add(c,cons);
	}
			
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		setBackground(Color.WHITE);
//		if (image != null) {
//			int height = image.getHeight(this);
//			int width = image.getWidth(this);
//			if (height != -1 && height > getHeight())
//				height = getHeight();
//			if (width != -1 && width > getWidth())
//				width = getWidth();
//			int x = (int)(((double)(getWidth() - width)) / 2.0);
//			int y = (int)(((double)(getHeight() - height)) / 2.0);
//			g.drawImage(image, x, y, width, height, this);
//		}
//	}
	
	public StudentInfoGUI() {
//		创建网格组布局方式对象
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.NONE;
//		cons.anchor = GridBagConstraints.EAST;
		cons.weightx = 3;
		cons.weighty = 4;
		
//		设置背景颜色
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		
//		 设置窗口大小
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width, height);
		
//		方法四--基于JPanel
//		image = Toolkit.getDefaultToolkit().getImage(
//			"D:\\18-JDKandEclipse\\1-Eclipse\\0-workspace\\ClientGUIs\\src\\clientGUIs\\pictures\\test00.png");
//		这里换成你的背景图片地址
		
//		 插入各行各列		
		add(lName, cons, 0, 0, 1, 1); // 第一行
		add(nameinput, cons, 1, 0, 1, 1); 
		add(lSex, cons, 2, 0, 1, 1); 
		add(sexinput, cons, 3, 0, 1, 1);
		add(lBirth, cons, 0, 1, 1, 1); // 第二行
		add(birthinput, cons, 1, 1, 1, 1); 
		add(lDorm, cons, 2, 1, 1, 1); 
		add(dorminput, cons, 3, 1, 1, 1); 
		add(lID, cons, 0, 2, 1, 1); // 第三行
		add(IDinput, cons, 1, 2, 1, 1); 
		add(lClass, cons, 2, 2, 1, 1); 
		add(classinput, cons, 3, 2, 1, 1); 
		add(lTele, cons, 0, 3, 1, 1); // 第四行 
		add(teleinput, cons, 1, 3, 1, 1);
		add(lEmail, cons, 2, 3, 1, 1);
		add(emailinput, cons, 3, 3, 1, 1);

//		设置字体颜色和大小
		for(int i = 0; i < this.getComponentCount(); i++){ 
			Font font = new Font("苹方 常规", Font.CENTER_BASELINE,15); 
			this.getComponent(i).setFont(font);
		}
		this.setBorder(BorderFactory.createTitledBorder("个人信息"));

	}
	
}
