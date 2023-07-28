import java.awt.*;
import java.awt.event.*; 
class TextFieldTest2 extends Frame{ //frame 상속받으면 자신이 프레임
	Label lid;
	Label lpwd;
	TextField tfld;
	TextField tfPwd;
	Button ok;
	TextFieldTest2(String title) {
		
		
		
		super(title); // Frame(String title)을 호출한다.
		lid = new Label("ID: ", Label.RIGHT); // Label의 text정렬을 오른쪽
		lpwd = new Label("Password :", Label.RIGHT);
		// 약 10개의 글자를 입력할 수 있는  TextField 생성.
		tfld = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');    // 입력한 값 대신 '*'이 보이게 한다.
		ok = new Button("OK");
		// OK버튼과  TextField 에 이벤트 처리를 위한  Listener 을 추가해준다.
		tfld.addActionListener(new EventHandler());
		tfPwd.addActionListener(new EventHandler());
		ok.addActionListener(new EventHandler());
		
		setLayout(new FlowLayout()); // LayoutManager 를 FlowLayout으로
		add(lid);                     // 생성한 Component들을 Frame에 포함시킨다.
		add(tfld);
		add(lpwd);
		add(tfPwd);
		add(ok);
		
		addWindowListener(new WindowAdapter(){ // frame x버튼 누르면 종료
			public void windowClosing(WindowEvent arg0) {	
				dispose();
			}
		});
		
		this.setBackground(new Color(149,56,24));
		setSize(450,75);
		// 프레임 위치 설정(중앙에 위치 시키기)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
		
		setVisible(true);        // 프레임이 화면에 보이게 한다.
	}
	class EventHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String id = tfld.getText();
			String password = tfPwd.getText();
			if(!id.equals("admin")) {
				System.out.println("입력하신 id가 유효하지 않습니다. 다시 입력해 주세요.");
				// id를 다시 입력할 수 있도록, focus를 tfld로 옮긴다.
				tfld.requestFocus();
				tfld.selectAll(); // tfld에 입력된 text가 선택되게 한다.
			} else if (!password.contentEquals("1234")) {
				System.out.println("입력하신 비밀번호가 틀렸습니다. 다시 입력해 주시기 바랍니다.");
				// id를 다시 입력할 수 있도록 focus를 tfld로 옮긴다.
				tfPwd.requestFocus();
				tfPwd.selectAll();
			}else { System.out.println(id + "님, 성공적으로 로그인 되었습니다.");
			}
		} 
	}// class EventHandler
	
}
