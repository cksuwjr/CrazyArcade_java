import java.awt.*;
import java.awt.event.*;

public class Coffee extends Frame {
static int coffee = 0;
static int size = 0;
static int total = 0;

	Coffee(String title){
		super(title);
	
	setSize(550,750);

	// ������ ��ġ ����(�߾ӿ� ��ġ ��Ű��)
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	this.setLocation(screenSize.width/2 - this.getWidth()/2, screenSize.height/2 - this.getHeight()/2);
		
	setBackground(new Color(120,230,200));
	setLayout(null);
	
	addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent arg0) {	
			dispose();
		}
	});
	Label ChooseCoffee = new Label("Ŀ�� ����",  Label.CENTER);
ChooseCoffee.setBackground(Color.CYAN);
ChooseCoffee.setBounds(20,70,65,25);


Button Cof1 = new Button("�Ƹ޸�ī��(1000��)");
Cof1.setBackground(Color.red);
Cof1.setBounds(20,100,100,25);

Button Cof2 = new Button("ī���(2000��)");
Cof2.setBackground(Color.red);
Cof2.setBounds(130,100,100,25);

Button Cof3 = new Button("īǪġ��(3000��)");
Cof3.setBackground(Color.red);
Cof3.setBounds(240,100,100,25);


Label Fin1 = new Label("����1", Label.CENTER);
Fin1.setBackground(Color.CYAN);
Fin1.setBounds(20,220,320,25);

Label Fin2 = new Label("����2", Label.CENTER);
Fin2.setBackground(Color.CYAN);
Fin2.setBounds(20,250,320,25);

Cof1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		coffee = 1000;
		Fin1.setText(Cof1.getLabel() + "�� �����ϼ̽��ϴ�.");
	}
});
Cof2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		coffee = 2000;
		Fin1.setText(Cof2.getLabel() + "�� �����ϼ̽��ϴ�.");
	}
});
Cof3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		coffee = 3000;
		Fin1.setText(Cof3.getLabel() + "�� �����ϼ̽��ϴ�.");
	}
});


Label CofType = new Label("������ ����",  Label.CENTER);
CofType.setBackground(Color.CYAN);
CofType.setBounds(20,150,65,25);

Button T1 = new Button("����(+100)");
T1.setBackground(Color.red);
T1.setBounds(20,180,100,25);

Button T2 = new Button("�߰� (+200)");
T2.setBackground(Color.red);
T2.setBounds(130,180,100,25);

Button T3 = new Button("��ū (+300)");
T3.setBackground(Color.red);
T3.setBounds(240,180,100,25);




T1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		size = 100;
		Fin2.setText(T1.getLabel() + "�� �����ϼ̽��ϴ�.");
	}
});
T2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		size = 200;
		Fin2.setText(T2.getLabel() + "�� �����ϼ̽��ϴ�.");
	}
});
T3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		size = 300;
		Fin2.setText(T3.getLabel() + "�� �����ϼ̽��ϴ�.");
	}
});




Label result = new Label();
result.setBackground(Color.CYAN);
result.setBounds(105,300,250,25);

Button cal = new Button("���");
cal.setBackground(Color.red);
cal.setBounds(20,300,75,25);
cal.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0){
		total = size + coffee;
		result.setText("������" + total + "�Դϴ�.");
		}
		
	});
	
	
	
	
	add(ChooseCoffee);
	add(Cof1); add(Cof2); add(Cof3);
	
	add(CofType);
	add(T1); add(T2); add(T3);
	
	add(Fin1);
	add(Fin2);
	
	add(result);
	add(cal);
	setVisible(true);
	}
}
