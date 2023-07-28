import java.awt.*;
import java.awt.event.*; 
public class CheckboxEventTest2 extends Frame {
	CheckboxGroup group;
	Checkbox cb1;
	Checkbox cb2;
	Checkbox cb3;
	
	CheckboxEventTest2(String title){
		super(title);
		group = new CheckboxGroup();
		cb1 = new Checkbox("red", group, true);
		cb2 = new Checkbox("green", group, false);
		cb3 = new Checkbox("blue", group, false);
		
		cb1.addItemListener(new EventHandler());
		cb2.addItemListener(new EventHandler());
		cb3.addItemListener(new EventHandler());
		
		setLayout(new FlowLayout());
		add(cb1);
		add(cb2);
		add(cb3);
		setBackground(Color.red);
		setSize(300,200);
		// 프레임 위치 설정(중앙에 위치 시키기)
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
		
		setVisible(true);
		
		
		// frame에 x버튼누르면 종료
				addWindowListener(new WindowAdapter(){
					public void windowClosing(WindowEvent arg0) {	
						dispose();
					}
				});
	}
	class EventHandler implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			Checkbox cb = (Checkbox)e.getSource();
			String color = cb.getLabel();
			
			if(color.equals("red")) {
				setBackground(Color.red);
				cb1.setBackground(Color.red);
				cb2.setBackground(Color.red);
				cb3.setBackground(Color.red);
			}else if(color.equals("green")){
				setBackground(Color.green);
				cb1.setBackground(Color.green);
				cb2.setBackground(Color.green);
				cb3.setBackground(Color.green);
				
			}else {
				setBackground(Color.blue);
				cb1.setBackground(Color.blue);
				cb2.setBackground(Color.blue);
				cb3.setBackground(Color.blue);
			}
		}
	}      // class EventHandler
}
