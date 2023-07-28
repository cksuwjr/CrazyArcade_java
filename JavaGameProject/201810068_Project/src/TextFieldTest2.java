import java.awt.*;
import java.awt.event.*; 
class TextFieldTest2 extends Frame{ //frame ��ӹ����� �ڽ��� ������
	Label lid;
	Label lpwd;
	TextField tfld;
	TextField tfPwd;
	Button ok;
	TextFieldTest2(String title) {
		
		
		
		super(title); // Frame(String title)�� ȣ���Ѵ�.
		lid = new Label("ID: ", Label.RIGHT); // Label�� text������ ������
		lpwd = new Label("Password :", Label.RIGHT);
		// �� 10���� ���ڸ� �Է��� �� �ִ�  TextField ����.
		tfld = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');    // �Է��� �� ��� '*'�� ���̰� �Ѵ�.
		ok = new Button("OK");
		// OK��ư��  TextField �� �̺�Ʈ ó���� ����  Listener �� �߰����ش�.
		tfld.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout()); // LayoutManager �� FlowLayout����
		add(lid);                     // ������ Component���� Frame�� ���Խ�Ų��.
		add(tfld);
		add(lpwd);
		add(tfPwd);
		add(ok);
		
		addWindowListener(new WindowAdapter(){ // frame x��ư ������ ����
			public void windowClosing(WindowEvent arg0) {	
				dispose();
			}
		});
		
		this.setBackground(new Color(149,56,24));
		setSize(450,75);
		// ������ ��ġ ����(�߾ӿ� ��ġ ��Ű��)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
		
		setVisible(true);        // �������� ȭ�鿡 ���̰� �Ѵ�.
	}
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String id = tfld.getText();
			String password = tfPwd.getText();
			if(!id.equals("admin")) {
				System.out.println("�Է��Ͻ� id�� ��ȿ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ���.");
				// id�� �ٽ� �Է��� �� �ֵ���, focus�� tfld�� �ű��.
				tfld.requestFocus();
				tfld.selectAll(); // tfld�� �Էµ� text�� ���õǰ� �Ѵ�.
			} else if (!password.contentEquals("1234")) {
				System.out.println("�Է��Ͻ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
				// id�� �ٽ� �Է��� �� �ֵ��� focus�� tfld�� �ű��.
				tfPwd.requestFocus();
				tfPwd.selectAll();
			}else { System.out.println(id + "��, ���������� �α��� �Ǿ����ϴ�.");
			}
		} 
	}// class EventHandler
	
}
