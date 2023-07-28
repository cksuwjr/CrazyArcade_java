import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MenuTest extends Frame {
	
	MenuTest(String title){ // 생성자
		super(title);
		this.setSize(500,500); // 프레임 사이즈
		
		// 프레임 위치 설정(중앙에 위치 시키기)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
		
		
		this.setIconImage(new ImageIcon("icon.png").getImage()); // 프로그램 아이콘 설정
		
		
		
		
		
		MenuBar mb = new MenuBar(); // 메뉴바 객체 생성
		Menu m1 = new Menu("파일");
		MenuItem mi1 = new MenuItem("회원가입", new MenuShortcut('J', true)); // 단축키 (Ctrl + Shift) + 추가
		
		MenuItem mi2 = new MenuItem("종료", new MenuShortcut('E'));// 단축키
		mi2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // 프로그램 종료
			}
		});
		
		
		
		// 메뉴  m1에 메뉴 아이템 붙이기
		m1.add(mi1);
		m1.addSeparator(); // 수평선 추가
		m1.add(mi2);
		
		
		
		
		Menu m2 = new Menu("이벤트 연습");
		MenuItem mi3 = new MenuItem("이벤트 1");
		mi3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MouseEventTest("마우스 이벤트 테스트");
			}
		});
		
		
		MenuItem mi4 = new MenuItem("이벤트 2");
		mi4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TextComponentEventTest("채팅");
			}
		});
		
		MenuItem mi5 = new MenuItem("이벤트 3");
		mi5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new TextFieldTest2("로그인 창");
			}
		});
		
		MenuItem mi6 = new MenuItem("이벤트 4");
		mi6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CheckboxEventTest("CheckboxEventTest");
			}
		});
		
		MenuItem mi7 = new MenuItem("이벤트 5");
		mi7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CheckboxEventTest2("CheckboxEventTest2");
			}
		});
		
		MenuItem mi8 = new MenuItem("이벤트 6");
		mi8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CardLayoutEventTest("CardLayoutEventTest");
			}
		});
		// 메뉴 m2에 메뉴아이템 붙이기
		m2.add(mi3);
		m2.add(mi4);
		m2.add(mi5);
		m2.add(mi6);
		m2.add(mi7);
		m2.add(mi8);
		
		Menu m3 = new Menu("이벤트 활용");
		
		MenuItem mi9 = new MenuItem("커피 자판기");
		mi9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Coffee("커피 자판기");
			}
		});
		
		
		// m3에 메뉴 아이템 붙이기
		m3.add(mi9);
		
		
		
		Menu m4 = new Menu("도움말");
		
		// 메뉴 바에 메뉴 붙이기
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		
		
		
		
		
		// x 누르면 종료
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		this.setMenuBar(mb);
		this.setVisible(true); // 프레임 보이기
	}
	
	public static void main(String[] args) {
		MenuTest m = new MenuTest("Java Project");
	}

}
