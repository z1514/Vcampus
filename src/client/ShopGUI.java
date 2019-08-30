package client;

import java.awt.*;
import javax.swing.*;

public class ShopGUI extends JPanel{
	
	JLabel lBuy = new JLabel("����");
	JLabel lTopUp = new JLabel("��ֵ");
	JLabel lBrowse = new JLabel("���ȫ����Ʒ");
	
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
	
	public ShopGUI() {
//		 ���ò���
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		GridBagConstraints cons = new GridBagConstraints();
//		cons.anchor = GridBagConstraints.WEST;
		cons.weightx = 10;
		cons.weighty = 12;
		
//		 ���ô��ڴ�С
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width, height);
		
//		 ����Label
		add(lBuy, cons, 0, 0, 1, 1);
		add(lTopUp, cons, 3, 0, 1, 1);
		add(lBrowse, cons, 0, 1, 1, 1);
		this.setVisible(true);
		
//		����������ɫ�ʹ�С
		for(int i = 0; i < this.getComponentCount(); i++){ 
			Font font = new Font("ƻ�� ����", Font.CENTER_BASELINE, 15); 
			this.getComponent(i).setFont(font);
		}
		this.setBorder(BorderFactory.createTitledBorder("�̵����"));
//		���ñ�����ɫ
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		
	}

}