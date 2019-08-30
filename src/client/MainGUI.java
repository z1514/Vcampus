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
	
//	 Splitpane������panel, �Լ����
	JTree tr;
	JSplitPane sp = new JSplitPane();
	JPanel lpanel = new JPanel();
	JPanel rpanel = new JPanel();
	DefaultMutableTreeNode root = new DefaultMutableTreeNode("��Ϣ�Ż�");
	DefaultMutableTreeNode nd1 = new DefaultMutableTreeNode("������Ϣ");
	DefaultMutableTreeNode nd2 = new DefaultMutableTreeNode("�������");
	DefaultMutableTreeNode nd3 = new DefaultMutableTreeNode("����ͼ���");
	DefaultMutableTreeNode nd4 = new DefaultMutableTreeNode("�����̵�");
	
//	 ���ù�����
	JScrollPane slp;
	
	public MainGUI() {
//		 ������
		tr = new JTree(root);
		root.add(nd1); root.add(nd2);
		root.add(nd3); root.add(nd4);
		
//		 ��������UI
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
		
//		���ñ�����ɫ
		Color bgColor = new Color(255, 255, 255); // ��ɫ
		lpanel.setBackground(bgColor);
		rpanel.setBackground(bgColor);
		
//		 ���ô��ڴ�С�����������������ûʲô��
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		f.setSize(width, height);
		
//		����splitpane���Ҳ���
		sp.setLeftComponent(slp);
		sp.setRightComponent(rpanel); // ����ȱʡ
		
		
//		 ��������ѡ��ģʽ��������
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
		f.setResizable(false); // �Ƿ�����û����������С
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		���÷ָ��߱����Լ����ɵ�������OK���������f.setVisible��
		sp.setDividerLocation(0.12);
		sp.setEnabled(false);
		
//		��˵�����طָ��ߣ�Ŀǰ����
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
