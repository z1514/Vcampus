package client;

import java.awt.*;
import javax.swing.*;

public class StudentInfoGUI extends JPanel {
//	 ѧ��������Ϣ
	JLabel lName = new JLabel("����");
	JLabel lSex = new JLabel("�Ա�");
	JLabel lBirth = new JLabel("��������");
	JLabel lDorm = new JLabel("����");
	JLabel lID = new JLabel("ѧ��");
	JLabel lClass = new JLabel("�༶");
	JLabel lTele = new JLabel("�绰");
	JLabel lEmail = new JLabel("�����ʼ�");

	JButton bOK = new JButton("ȷ��");
	JButton bCancel = new JButton("ȡ��");

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
//		���������鲼�ַ�ʽ����
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		GridBagConstraints cons = new GridBagConstraints();
		cons.fill = GridBagConstraints.NONE;
//		cons.anchor = GridBagConstraints.EAST;
		cons.weightx = 3;
		cons.weighty = 4;
		
//		���ñ�����ɫ
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		
//		 ���ô��ڴ�С
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width, height);
		
//		������--����JPanel
//		image = Toolkit.getDefaultToolkit().getImage(
//			"D:\\18-JDKandEclipse\\1-Eclipse\\0-workspace\\ClientGUIs\\src\\clientGUIs\\pictures\\test00.png");
//		���ﻻ����ı���ͼƬ��ַ
		
//		 ������и���		
		add(lName, cons, 0, 0, 1, 1); // ��һ��
		add(nameinput, cons, 1, 0, 1, 1); 
		add(lSex, cons, 2, 0, 1, 1); 
		add(sexinput, cons, 3, 0, 1, 1);
		add(lBirth, cons, 0, 1, 1, 1); // �ڶ���
		add(birthinput, cons, 1, 1, 1, 1); 
		add(lDorm, cons, 2, 1, 1, 1); 
		add(dorminput, cons, 3, 1, 1, 1); 
		add(lID, cons, 0, 2, 1, 1); // ������
		add(IDinput, cons, 1, 2, 1, 1); 
		add(lClass, cons, 2, 2, 1, 1); 
		add(classinput, cons, 3, 2, 1, 1); 
		add(lTele, cons, 0, 3, 1, 1); // ������ 
		add(teleinput, cons, 1, 3, 1, 1);
		add(lEmail, cons, 2, 3, 1, 1);
		add(emailinput, cons, 3, 3, 1, 1);

//		����������ɫ�ʹ�С
		for(int i = 0; i < this.getComponentCount(); i++){ 
			Font font = new Font("ƻ�� ����", Font.CENTER_BASELINE,15); 
			this.getComponent(i).setFont(font);
		}
		this.setBorder(BorderFactory.createTitledBorder("������Ϣ"));

	}
	
}
