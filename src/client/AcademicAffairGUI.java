package client;

import java.awt.*;
import javax.swing.*;

public class AcademicAffairGUI extends JPanel{
	
	JLabel lID = new JLabel("����ѧ�ţ�");
//	JLabel lGPA = new JLabel("���㣺");
	JLabel lGPA;
	JLabel lSRTP = new JLabel("SRTPѧ�֣�");

	
//	�ļ����  
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
//		����Label��ʽ����try
		lGPA = new JLabel("���㣺", SwingConstants.RIGHT);
//		lGPA.setHorizontalAlignment(SwingConstants.RIGHT);
		
//		���ñ�����ɫ
		Color bgColor = new Color(255, 255, 255);
		this.setBackground(bgColor);
		
//		lGPA.setOpaque(true);  	 
//		lGPA.setBackground(Color.GREEN);
//		����JLabelͼ�ꡪ��try����OK
//		��������ӦlID��С 
//		icon.setImage(icon.getImage().getScaledInstance((icon.getIconWidth()/4), 
//				(icon.getIconHeight()/4), Image.SCALE_DEFAULT)); 
//	    System.out.println(icon.getIconWidth() + "x" + icon.getIconHeight());
//	    lID.setIcon(icon);//����ͼƬ
	    lID.setBounds(10, 10, 190, 330);//����lID�Ĵ�С
		
//		 ���ò���
		GridBagLayout lay = new GridBagLayout();
		setLayout(lay);
		GridBagConstraints cons = new GridBagConstraints();
		cons.weightx = 3;
		cons.weighty = 4;
//		cons.anchor = GridBagConstraints.WEST;
		
//		 ���ô��ڴ�С
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		this.setSize(width, height);
		
//		������и���
		add(lID, cons, 0, 0, 1, 1); // ��һ��
		add(IDinput, cons, 1, 0, 1, 1); 
		add(lGPA, cons, 0, 1, 1, 1); // �ڶ���
		add(GPAoutput, cons, 1, 1, 1, 1); 
		add(lSRTP, cons, 2, 1, 1, 1); 
		add(SRTPoutput, cons, 3, 1, 1, 1); 
		
//		����������ɫ�ʹ�С
		for(int i = 0; i < this.getComponentCount(); i++){ 
			Font font = new Font("ƻ�� ����", Font.CENTER_BASELINE, 15); 
			this.getComponent(i).setFont(font);
		}
		this.setBorder(BorderFactory.createTitledBorder("�ɼ���ѯ"));

	}
		
}
