import java.awt.event.*;
import java.awt.*;
import javax.swing.*;	

public class Geometric extends JFrame{
	
	//Data field	
	//Create text field of circle, rectangle, triangle 
	private JTextField jtc1 = new JTextField(8);	
	private	JTextField jtc2 = new JTextField(8);
	private	JTextField jtc3 = new JTextField(8);
	private JTextField jtr1 = new JTextField(8);	
	private	JTextField jtr2 = new JTextField(8);
	private	JTextField jtr3 = new JTextField(8);
	private	JTextField jtr4 = new JTextField(8);
	private JTextField jtt1 = new JTextField(8);	
	private	JTextField jtt2 = new JTextField(8);
	private	JTextField jtt3 = new JTextField(8);
	
	//Create clearing and computing button of circle, rectangle, triangle 
	private JButton jbtc1 = new JButton("計算");
	private JButton jbtc2 = new JButton("清除");
	private JButton jbtr1 = new JButton("計算");
	private JButton jbtr2 = new JButton("清除");
	private JButton jbtt1 = new JButton("計算");
	private JButton jbtt2 = new JButton("清除");

	public Geometric() {
		
		/**Circle*/
		//Panel panel1 to hold label 
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.add(new JLabel("Circle:"));

		//Panel panel2 to hold label, button and textField
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel2.add(new JLabel("Radius:"));
		panel2.add(jtc1);	
		panel2.add(jbtc1);	
		panel2.add(jbtc2);	

		//Panel panel3 to hold label, textField
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel3.add(new JLabel("The area is:"));
		panel3.add(jtc2);
		
		//Panel panel4 to hold label, textField
		JPanel panel4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel4.add(new JLabel("The perimeter is:"));	
		panel4.add(jtc3);

		//Create and register listener of calculation
		jbtc1.addActionListener(new ButtonCircleCalculateListener());
		
		//listener of clearing data
		jbtc2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
			
				jtc1.setText("");
				jtc2.setText("");
				jtc3.setText("");
			}
		});
		
		/**Rectangle*/
		//Panel panelr1 to hold label 
		JPanel panelr1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelr1.add(new JLabel("Rectangle:"));

		//Panel panelr2 to hold label and textField
		JPanel panelr2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelr2.add(new JLabel("Length:"));
		panelr2.add(jtr1);
		panelr2.add(new JLabel("Width:"));
		panelr2.add(jtr2);	
		panelr2.add(jbtr1);	
		panelr2.add(jbtr2);
		
		//Panel panelr3 to hold label, button and textField
		JPanel panelr3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelr3.add(new JLabel("The area is:"));
		panelr3.add(jtr3);
		
		//Panel panelr4 to hold label and textField
		JPanel panelr4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelr4.add(new JLabel("The perimeter is:"));	
		panelr4.add(jtr4);

		//Create and register listener of calculation
		jbtr1.addActionListener(new ButtonRectangleCalculateListener());
		
		//listener of clearing data
		jbtr2.addActionListener(new  ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
			
				jtr1.setText("");
				jtr2.setText("");
				jtr3.setText("");
				jtr4.setText("");	
			}
		});
		
		/**Regular Triangle*/
		//Panel panelt1 to hold label
		JPanel panelt1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelt1.add(new JLabel("Triangle:"));

		//Panel panelt2 to hold label, button and textField
		JPanel panelt2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelt2.add(new JLabel("Length:"));
		panelt2.add(jtt1);	
		panelt2.add(jbtt1);	
		panelt2.add(jbtt2);	

		//Panel panelt3 to hold label and textField
		JPanel panelt3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelt3.add(new JLabel("The area is:"));
		panelt3.add(jtt2);
		
		//Panel panelt4 to hold label and textField
		JPanel panelt4 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelt4.add(new JLabel("The perimeter is:"));	
		panelt4.add(jtt3);

		//Create and register listener of calculation
		jbtt1.addActionListener(new ButtonTriangleCalculateListener());
		
		//listener of clearing data
		jbtt2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
			
				jtt1.setText("");
				jtt2.setText("");
				jtt3.setText("");
			}
		});
		
		setLayout(new GridLayout(13, 1, 2, 2));
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panelr1);
		add(panelr2);
		add(panelr3);
		add(panelr4);
		add(panelt1);
		add(panelt2);
		add(panelt3);
		add(panelt4);
	}

		//listener class of calculation circle
		private class ButtonCircleCalculateListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e){
			
				try{
					double radius = Double.parseDouble(jtc1.getText());
					Circle circle = new Circle(radius);	
			
					jtc2.setText(String.format("%.3f", circle.getArea()));
					jtc3.setText(String.format("%.3f", circle.getPerimeter()));
				}
				catch(Exception ex){
					jtc2.setText("Enter again");
					jtc3.setText("Enter again");
				}
			}
		}

		//listener class of calculation triangle
		private class ButtonTriangleCalculateListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e){
			
				try{
					double length = Double.parseDouble(jtt1.getText());
					RegularTriangle triangle = new RegularTriangle(length);	
			
					jtt2.setText(String.format("%.3f", triangle.getArea()));
					jtt3.setText(String.format("%.3f", triangle.getPerimeter()));
				}
				catch(Exception ex){
					jtt2.setText("Enter again");
					jtt3.setText("Enter again");
				}
			}
		}
		
		//listener class of calculation rectangle
		private class ButtonRectangleCalculateListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e){
			
				try{
					double length = Double.parseDouble(jtr1.getText());
					double width = Double.parseDouble(jtr2.getText());	
					Rectangle rectangle = new Rectangle(width, length);
			
					jtr3.setText(String.format("%.3f", rectangle.getArea()));
					jtr4.setText(String.format("%.3f", rectangle.getPerimeter()));
				}
				catch(Exception ex){
					jtr3.setText("Enter again");
					jtr4.setText("Enter again");
				}
			}
		}
	
	/**Main method*/
	public static void main(String[] args) {
		Geometric frame = new Geometric();
  		
		frame.setTitle("U10316025_GeoCalculate");
		frame.setSize(500, 800);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}	
}
