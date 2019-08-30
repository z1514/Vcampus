package client;

import javax.swing.*;
import java.awt.*;

public class LibraryGUI extends JPanel{
	
//	 �������ÿ��
//	JPanel�����в�����ֱ����this
	JPanel p = new JPanel();
		
	JLabel lBorrow = new JLabel("����");
	JLabel lReturn = new JLabel("����");
//	 JLabel bSearch = new JLabel("��ѯ");
	JLabel lBrowse = new JLabel("���ȫ����Ŀ");
	
	public void add(Component c, GridBagConstraints cons, int x, int y, int w, int h) {
		cons.gridx = x;
		cons.gridy = y;
		cons.gridwidth = w;
		cons.gridheight = h;
		add(c, cons);
	}
	
	public LibraryGUI() {
		
//		 ���ò���
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		GridBagConstraints cons = new GridBagConstraints();
//		cons.anchor = GridBagConstraints.WEST;
		cons.weightx = 3;
		cons.weighty = 4;
		
//		 ���ô��ڴ�С
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width, height);
		
//		 ����Label
		add(lBorrow, cons, 0, 0, 1, 1);
		add(lReturn, cons, 3, 0, 1, 1);
//		add(bSearch, cons, 0, 1, 1, 1);
		add(lBrowse, cons, 0, 1, 1, 1);
		this.setVisible(true);
		
//		����������ɫ�ʹ�С
		for(int i = 0; i < this.getComponentCount(); i++){ 
			Font font = new Font("ƻ�� ����", Font.CENTER_BASELINE, 15); 
			this.getComponent(i).setFont(font);
		}
		this.setBorder(BorderFactory.createTitledBorder("ͼ��ݷ���"));
//		���ñ�����ɫ
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		
	}
}