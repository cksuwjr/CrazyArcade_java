import java.awt.*;
import java.awt.event.*; 
public class TextComponentEventTest extends Frame {
	TextField tf = new TextField();
	TextArea ta = new TextArea();
	
	
	TextComponentEventTest(String title){
		super(title);   // Frame(String title)�� ȣ���Ѵ�.
		
		tf = new TextField();
		ta = new TextArea();
		add(ta, "Center");
		add(tf, "South");
		tf.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				// TextField���� Enter�� ġ��, tf�� �Էµ� text�� TextArea�� �߰��Ѵ�.
				ta.append(tf.getText() + "\n");
				tf.setText(""); // tf�� text�� �����.
				tf.requestFocus();
			}
		});
		ta.setEditable(false); // TextArea�� text�� �������� ���ϰ� �Ѵ�.
		tf.requestFocus(); // focus�� TextField�� ��ġ�ϵ��� �Ѵ�.
		
		setSize(300,200);
		// ������ ��ġ ����(�߾ӿ� ��ġ ��Ű��)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
			
		setVisible(true);
		// frame�� x��ư������ ����
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent arg0) {	
				dispose();
			}
		});
	}
	

}
