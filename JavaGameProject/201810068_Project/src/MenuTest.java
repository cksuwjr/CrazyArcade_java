import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MenuTest extends Frame {
	
	MenuTest(String title){ // ������
		super(title);
		this.setSize(500,500); // ������ ������
		
		// ������ ��ġ ����(�߾ӿ� ��ġ ��Ű��)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
		
		
		this.setIconImage(new ImageIcon("icon.png").getImage()); // ���α׷� ������ ����
		
		
		
		
		
		MenuBar mb = new MenuBar(); // �޴��� ��ü ����
		Menu m1 = new Menu("����");
		MenuItem mi1 = new MenuItem("ȸ������", new MenuShortcut('J', true)); // ����Ű (Ctrl + Shift) + �߰�
		
		MenuItem mi2 = new MenuItem("����", new MenuShortcut('E'));// ����Ű
		mi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // ���α׷� ����
			}
		});
		
		
		
		// �޴�  m1�� �޴� ������ ���̱�
		m1.add(mi1);
		m1.addSeparator(); // ���� �߰�
		m1.add(mi2);
		
		
		
		
		Menu m2 = new Menu("�̺�Ʈ ����");
		MenuItem mi3 = new MenuItem("�̺�Ʈ 1");
		mi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MouseEventTest("���콺 �̺�Ʈ �׽�Ʈ");
			}
		});
		
		
		MenuItem mi4 = new MenuItem("�̺�Ʈ 2");
		mi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TextComponentEventTest("ä��");
			}
		});
		
		MenuItem mi5 = new MenuItem("�̺�Ʈ 3");
		mi5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TextFieldTest2("�α��� â");
			}
		});
		
		MenuItem mi6 = new MenuItem("�̺�Ʈ 4");
		mi6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CheckboxEventTest("CheckboxEventTest");
			}
		});
		
		MenuItem mi7 = new MenuItem("�̺�Ʈ 5");
		mi7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CheckboxEventTest2("CheckboxEventTest2");
			}
		});
		
		MenuItem mi8 = new MenuItem("�̺�Ʈ 6");
		mi8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CardLayoutEventTest("CardLayoutEventTest");
			}
		});
		// �޴� m2�� �޴������� ���̱�
		m2.add(mi3);
		m2.add(mi4);
		m2.add(mi5);
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		
		Menu m3 = new Menu("�̺�Ʈ Ȱ��");
		
		MenuItem mi9 = new MenuItem("Ŀ�� ���Ǳ�");
		mi9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Coffee("Ŀ�� ���Ǳ�");
			}
		});
		
		
		// m3�� �޴� ������ ���̱�
		m3.add(mi9);
		
		
		
		Menu m4 = new Menu("����");
		
		// �޴� �ٿ� �޴� ���̱�
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		
		
		
		
		// x ������ ����
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		this.setMenuBar(mb);
		this.setVisible(true); // ������ ���̱�
	}
	
	public static void main(String[] args) {
		MenuTest m = new MenuTest("Java Project");
	}

}
