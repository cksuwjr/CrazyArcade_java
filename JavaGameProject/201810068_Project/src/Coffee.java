import java.awt.*;
import java.awt.event.*;

public class Coffee extends Frame {
static int coffee = 0;
static int size = 0;
static int total = 0;

	Coffee(String title){
		super(title);
	
	setSize(550,750);

	// 프레임 위치 설정(중앙에 위치 시키기)
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
	Label ChooseCoffee = new Label("커피 선택",  Label.CENTER);
ChooseCoffee.setBackground(Color.CYAN);
ChooseCoffee.setBounds(20,70,65,25);


Button Cof1 = new Button("아메리카노(1000원)");
Cof1.setBackground(Color.red);
Cof1.setBounds(20,100,100,25);

Button Cof2 = new Button("카페라떼(2000원)");
Cof2.setBackground(Color.red);
Cof2.setBounds(130,100,100,25);

Button Cof3 = new Button("카푸치노(3000원)");
Cof3.setBackground(Color.red);
Cof3.setBounds(240,100,100,25);


Label Fin1 = new Label("선택1", Label.CENTER);
Fin1.setBackground(Color.CYAN);
Fin1.setBounds(20,220,320,25);

Label Fin2 = new Label("선택2", Label.CENTER);
Fin2.setBackground(Color.CYAN);
Fin2.setBounds(20,250,320,25);

Cof1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		coffee = 1000;
		Fin1.setText(Cof1.getLabel() + "를 선택하셨습니다.");
	}
});
Cof2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		coffee = 2000;
		Fin1.setText(Cof2.getLabel() + "를 선택하셨습니다.");
	}
});
Cof3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		coffee = 3000;
		Fin1.setText(Cof3.getLabel() + "를 선택하셨습니다.");
	}
});


Label CofType = new Label("사이즈 선택",  Label.CENTER);
CofType.setBackground(Color.CYAN);
CofType.setBounds(20,150,65,25);

Button T1 = new Button("작은(+100)");
T1.setBackground(Color.red);
T1.setBounds(20,180,100,25);

Button T2 = new Button("중간 (+200)");
T2.setBackground(Color.red);
T2.setBounds(130,180,100,25);

Button T3 = new Button("좀큰 (+300)");
T3.setBackground(Color.red);
T3.setBounds(240,180,100,25);




T1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		size = 100;
		Fin2.setText(T1.getLabel() + "를 선택하셨습니다.");
	}
});
T2.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		size = 200;
		Fin2.setText(T2.getLabel() + "를 선택하셨습니다.");
	}
});
T3.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0) {
		size = 300;
		Fin2.setText(T3.getLabel() + "를 선택하셨습니다.");
	}
});




Label result = new Label();
result.setBackground(Color.CYAN);
result.setBounds(105,300,250,25);

Button cal = new Button("계산");
cal.setBackground(Color.red);
cal.setBounds(20,300,75,25);
cal.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent arg0){
		total = size + coffee;
		result.setText("가격은" + total + "입니다.");
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
