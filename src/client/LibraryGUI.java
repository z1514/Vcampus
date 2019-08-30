package client;

import javax.swing.*;
import java.awt.*;

public class LibraryGUI extends JPanel{
	
//	 不能设置框架
//	JPanel的所有操作，直接用this
	JPanel p = new JPanel();
		
	JLabel lBorrow = new JLabel("借书");
	JLabel lReturn = new JLabel("还书");
//	 JLabel bSearch = new JLabel("查询");
	JLabel lBrowse = new JLabel("浏览全部书目");
	
	public void add(Component c, GridBagConstraints cons, int x, int y, int w, int h) {
		cons.gridx = x;
		cons.gridy = y;
		cons.gridwidth = w;
		cons.gridheight = h;
		add(c, cons);
	}
	
	public LibraryGUI() {
		
//		 设置布局
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		GridBagConstraints cons = new GridBagConstraints();
//		cons.anchor = GridBagConstraints.WEST;
		cons.weightx = 3;
		cons.weighty = 4;
		
//		 设置窗口大小
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width, height);
		
//		 插入Label
		add(lBorrow, cons, 0, 0, 1, 1);
		add(lReturn, cons, 3, 0, 1, 1);
//		add(bSearch, cons, 0, 1, 1, 1);
		add(lBrowse, cons, 0, 1, 1, 1);
		this.setVisible(true);
		
//		设置字体颜色和大小
		for(int i = 0; i < this.getComponentCount(); i++){ 
			Font font = new Font("苹方 常规", Font.CENTER_BASELINE, 15); 
			this.getComponent(i).setFont(font);
		}
		this.setBorder(BorderFactory.createTitledBorder("图书馆服务"));
//		设置背景颜色
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		
	}
}