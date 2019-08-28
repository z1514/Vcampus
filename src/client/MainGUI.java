package client;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import java.awt.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MainGUI implements TreeSelectionListener{
	
	JFrame f = new JFrame("VCampus");
	static final int WIDTH = 1200;
	static final int HEIGHT = 650;
	
//	 Splitpane及左右panel, 以及结点
	JTree tr;
	JSplitPane sp = new JSplitPane();
	JPanel lpanel = new JPanel();
	JPanel rpanel = new JPanel();
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("信息门户");
	DefaultMutableTreeNode nd1 = new DefaultMutableTreeNode("个人信息");
	DefaultMutableTreeNode nd2 = new DefaultMutableTreeNode("教务管理");
	DefaultMutableTreeNode nd3 = new DefaultMutableTreeNode("虚拟图书馆");
	DefaultMutableTreeNode nd4 = new DefaultMutableTreeNode("虚拟商店");
	
//	 设置滚动条
	JScrollPane slp;
	
	public MainGUI() {
//		 创建树
		tr = new JTree(root);
		root.add(nd1); root.add(nd2);
		root.add(nd3); root.add(nd4);
		
//		 创建各个UI
		LibraryGUI library = new LibraryGUI();
		AcademicAffairGUI academicAffair = new AcademicAffairGUI();
		StudentInfoGUI stuinfo = new StudentInfoGUI();
		ShopGUI shop = new ShopGUI();
		
		slp = new JScrollPane(tr, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, 
					ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		lpanel.add(slp);
//		lpanel.add(tr);
		
		sp.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
		sp.setLeftComponent(lpanel);
		
//		设置背景颜色
		Color bgColor = new Color(255, 255, 255); // 白色
		lpanel.setBackground(bgColor);
		rpanel.setBackground(bgColor);
		
//		 设置窗口大小——在这里面设好像没什么用
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		f.setSize(width, height);
		
//		设置splitpane左右部件
		sp.setLeftComponent(slp);
		sp.setRightComponent(rpanel); // 不可缺省
		
		
//		 设置树的选择模式、监听器
		tr.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		tr.addTreeSelectionListener(new TreeSelectionListener() {
			public void valueChanged(TreeSelectionEvent e) {
				DefaultMutableTreeNode selectednd= (DefaultMutableTreeNode)e.getPath().getLastPathComponent();
				if(selectednd.equals(nd1)) {
					slp = new JScrollPane(academicAffair, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
							ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
					sp.setRightComponent(slp);
				}
				else if(selectednd.equals(nd2)) {
					slp = new JScrollPane(stuinfo, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
							ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
					sp.setRightComponent(slp);
				}
				else if(selectednd.equals(nd3)) {
					slp = new JScrollPane(library, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
							ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
					sp.setRightComponent(slp);
				}
				else if(selectednd.equals(nd4)) {
					slp = new JScrollPane(shop, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, 
							ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
					sp.setRightComponent(slp);
				}
			}
		});
		
		f.setContentPane(sp); 
		
//		f.pack();
		f.setSize(WIDTH, HEIGHT);
		f.setResizable(false); // 是否可由用户调整窗体大小
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		设置分割线比例以及不可调整——OK，必须放在f.setVisible后
		sp.setDividerLocation(0.12);
		sp.setEnabled(false);
		
//		据说是隐藏分割线，目前无用
//		UIDefaults defaults = UIManager.getDefaults();
//		defaults.remove( "SplitPane.border");
//		defaults.remove( "SplitPaneDivider.border"); 
	}
	
	public static void main(String []args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} 
		catch(Exception e) {}
		new MainGUI();
	}

	@Override
	public void valueChanged(TreeSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
