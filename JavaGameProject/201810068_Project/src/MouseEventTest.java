import java.awt.*;
import java.awt.event.*; 
public class MouseEventTest extends Frame {
	Label location;
	MouseEventTest(String title){
		
		super(title); // Frame(String title)�� ȣ���Ѵ�.
		location = new Label("Mouse Pointer Location : ");
		location.setSize(195, 15);
		location.setBackground(Color.yellow); // Label�� ������ ��������� �Ѵ�.
		add(location);
		
		// EventHandler�� �ν��Ͻ��� Frame�� Listener�� ����Ѵ�.
		addMouseMotionListener(new EventHandler());
		
		
		// frame�� x��ư������ ����
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0) {	
				dispose(); // ������ ����
			}
		});
		
		
		setSize(300,200);
		
		// ������ ��ġ ����(�߾ӿ� ��ġ ��Ű��)
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
		
		setLayout(null);
		setVisible(true);
	}

	
	class EventHandler implements MouseMotionListener { // ���콺�� ������ ������ ����������
		public void mouseDragged(MouseEvent e) {}
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location : (" + e.getX() + ", " + e.getY()+ ")");
		}
	}

}
