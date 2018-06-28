package wizard_panels;

import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Generate extends JPanel {
	private JTextField txtMAC;
	private JTextField txtIP;
	private JTextField txtOTP;
	private JTextField txtUID;
	private JLabel lblMAC;
	private JLabel lblIP;
	private JLabel lblOTP;
	private JLabel lblUID;
	
	
	public Generate() {
		setLayout(null);
		
		
		
		
		
		txtMAC = new JTextField();
		txtMAC.setBounds(138, 40, 263, 20);
		add(txtMAC);
		txtMAC.setColumns(10);
		
		txtIP = new JTextField();
		txtIP.setBounds(138, 82, 263, 20);
		add(txtIP);
		txtIP.setColumns(10);
		
		txtOTP = new JTextField();
		txtOTP.setColumns(10);
		txtOTP.setBounds(138, 135, 263, 20);
		add(txtOTP);
		
		txtUID = new JTextField();
		txtUID.setColumns(10);
		txtUID.setBounds(138, 184, 263, 20);
		add(txtUID);
		
		lblMAC = new JLabel("Device MAC");
		lblMAC.setBounds(50, 43, 78, 14);
		add(lblMAC);
		
		lblIP = new JLabel("IP");
		lblIP.setBounds(50, 85, 78, 14);
		add(lblIP);
		
		lblOTP = new JLabel("OTP");
		lblOTP.setBounds(50, 138, 78, 14);
		add(lblOTP);
		
		lblUID = new JLabel("UID");
		lblUID.setBounds(50, 187, 78, 14);
		add(lblUID);
		
		JButton btnGenerate = new JButton("Generate");
		btnGenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GenerateOTP gotp = new GenerateOTP();
				String otp = gotp.generateOTP();
				
				MAC mac= new MAC();
				String[] addr = mac.MACA();
				
				RandomStringUUID rid=new RandomStringUUID();
				String randomUUIDString=rid.UID();
				
				txtMAC.setText(addr[1]);
				txtOTP.setText(otp); ;
				txtIP.setText(addr[0]);
				txtUID.setText(randomUUIDString);
				
			}
		});
		btnGenerate.setBounds(158, 239, 89, 23);
		add(btnGenerate);

	}
}
