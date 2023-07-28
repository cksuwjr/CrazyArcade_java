import java.awt.*;
import java.awt.event.*; 
public class MouseEventTest extends Frame {
	Label location;
	MouseEventTest(String title){
		
		super(title); // Frame(String title)을 호출한다.
		location = new Label("Mouse Pointer Location : ");
		location.setSize(195, 15);
		location.setBackground(Color.yellow); // Label의 배경색을 노란색으로 한다.
		add(location);
		
		// EventHandler의 인스턴스를 Frame의 Listener로 등록한다.
		addMouseMotionListener(new EventHandler());
		
		
		// frame에 x버튼누르면 종료
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0) {	
				dispose(); // 보이지 않음
			}
		});
		
		
		setSize(300,200);
		
		// 프레임 위치 설정(중앙에 위치 시키기)
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
		
		setLayout(null);
		setVisible(true);
	}

	
	class EventHandler implements MouseMotionListener { // 마우스가 프레임 위에서 움직였을때
		public void mouseDragged(MouseEvent e) {}
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location : (" + e.getX() + ", " + e.getY()+ ")");
		}
	}

}
