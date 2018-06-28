package wizard_panels;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class Demo_Wizard {

	public JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo_Wizard window = new Demo_Wizard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo_Wizard() {
		initialize();
	}

	public JPanel panel = new JPanel();
	
	JRadioButton rdbtnLinuxQnx = new JRadioButton("Linux - QNX");
	JRadioButton rdbtnAndroid = new JRadioButton("Android");
	JRadioButton rdbtnRobotCamera = new JRadioButton("Robot & Camera");
	
	String platform_chosen = new String();
	int count = 0;
	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
				
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 470, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
				
		panel.setBounds(119, 0, 345, 311);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnAndroid);
		group.add(rdbtnLinuxQnx);
		group.add(rdbtnRobotCamera);
		
		JLabel welcomeMsg = new JLabel("Welcome to KITE Installation Wizard");
		welcomeMsg.setFont(new Font("Arial", Font.BOLD, 13));
		welcomeMsg.setBounds(10, 32, 265, 15);
		panel.add(welcomeMsg);
		
		JLabel lblClickNextTo = new JLabel("Select one of the following Platforms");
		lblClickNextTo.setBounds(10, 58, 199, 14);
		panel.add(lblClickNextTo);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(147, 277, 89, 23);
		panel.add(btnNext);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int close_install_wizard = JOptionPane.showConfirmDialog(null, "Are you sure you want to close the installation?", "Exit", JOptionPane.YES_NO_OPTION);
				if(close_install_wizard == JOptionPane.YES_OPTION)
				{
					System.exit(0);
				}
			}
		});
		btnCancel.setBounds(246, 277, 89, 23);
		panel.add(btnCancel);
		
		 
		rdbtnLinuxQnx.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					platform_chosen = "Linux - QNX";
				}
				if(e.getStateChange() == ItemEvent.DESELECTED){
					platform_chosen = "";
				}
			}
		});
		rdbtnLinuxQnx.setBounds(19, 98, 109, 23);
		panel.add(rdbtnLinuxQnx);
		
		rdbtnAndroid.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					platform_chosen = "Android";
				}
				if(e.getStateChange() == ItemEvent.DESELECTED){
					platform_chosen = "";
				}	
			}
		});
		rdbtnAndroid.setBounds(19, 147, 109, 23);
		panel.add(rdbtnAndroid);
		
		rdbtnRobotCamera.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					platform_chosen = "Robot & Camera";
				}
				if(e.getStateChange() == ItemEvent.DESELECTED){
					platform_chosen = "";
				}
			}
		});
		rdbtnRobotCamera.setBounds(19, 195, 144, 23);
		panel.add(rdbtnRobotCamera);
		
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
					
				if(rdbtnAndroid.isSelected()==false && rdbtnLinuxQnx.isSelected()==false && rdbtnRobotCamera.isSelected()==false)
				{
					JOptionPane.showMessageDialog(null, "Select one of the platforms to continue!", "Warning!", JOptionPane.WARNING_MESSAGE);
				}
				else
				{
					Plugin_Panel Nextpanel = new Plugin_Panel(frame,platform_chosen);
					Nextpanel.setBounds(126,0,345,311);
					panel.setVisible(false);
					frame.getContentPane().add(Nextpanel);
				}
			}
		});
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(-1, 0, 118, 311);
		frame.getContentPane().add(imageLabel);
		imageLabel.setIcon(new ImageIcon(Demo_Wizard.class.getResource("/Images/Min Art.jpg")));
	}
}