package client;

import java.awt.*;
import javax.swing.*;

public class ShopGUI extends JPanel{
	
	JLabel lBuy = new JLabel("购买");
	JLabel lTopUp = new JLabel("充值");
	JLabel lBrowse = new JLabel("浏览全部商品");
	
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
//		 设置布局
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		GridBagConstraints cons = new GridBagConstraints();
//		cons.anchor = GridBagConstraints.WEST;
		cons.weightx = 10;
		cons.weighty = 12;
		
//		 设置窗口大小
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width, height);
		
//		 插入Label
		add(lBuy, cons, 0, 0, 1, 1);
		add(lTopUp, cons, 3, 0, 1, 1);
		add(lBrowse, cons, 0, 1, 1, 1);
		this.setVisible(true);
		
//		设置字体颜色和大小
		for(int i = 0; i < this.getComponentCount(); i++){ 
			Font font = new Font("苹方 常规", Font.CENTER_BASELINE, 15); 
			this.getComponent(i).setFont(font);
		}
		this.setBorder(BorderFactory.createTitledBorder("商店服务"));
//		设置背景颜色
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		
	}

}