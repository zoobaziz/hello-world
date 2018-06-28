package wizard_panels;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;

@SuppressWarnings("serial")
public class Plugin_Panel extends JPanel {

	/**
	 * Create the panel.
	 */
	ArrayList<String> plugins = new ArrayList<String>();
	
	/**
	 * Check boxes declaration 
	 */
	JCheckBoxMenuItem chckbxmntmAudio = new JCheckBoxMenuItem(plugin_names.Audio);
	JCheckBoxMenuItem chckbxmntmLinux = new JCheckBoxMenuItem(plugin_names.Linux);
	JCheckBoxMenuItem chckbxmntmAndroid = new JCheckBoxMenuItem(plugin_names.Android);
	JCheckBoxMenuItem chckbxmntmQnx = new JCheckBoxMenuItem(plugin_names.QNX);
	JCheckBoxMenuItem chckbxmntmCamera = new JCheckBoxMenuItem(plugin_names.Camera);
	JCheckBoxMenuItem chckbxmntmRobot = new JCheckBoxMenuItem(plugin_names.Robot);
	JCheckBoxMenuItem chckbxmntmCan = new JCheckBoxMenuItem(plugin_names.CAN);
	JCheckBoxMenuItem chckbxmntmUsbhub = new JCheckBoxMenuItem(plugin_names.USB_HUB);
	JCheckBoxMenuItem chckbxmntmVr = new JCheckBoxMenuItem(plugin_names.VR);
	JCheckBoxMenuItem chckbxmntmProgrammablePs = new JCheckBoxMenuItem(plugin_names.Programmable_PS);
	JCheckBoxMenuItem chckbxmntmLanguageocr = new JCheckBoxMenuItem(plugin_names.Lang_OCR);
	
	
	public Plugin_Panel(JFrame frame, String platform) {
		
		setLayout(null);
		
		
		
		JLabel lblChooseThePlugins = new JLabel("Click to choose the Plugins");
		lblChooseThePlugins.setBounds(32, 11, 145, 14);
		add(lblChooseThePlugins);
		
		selectCheckboxes(platform);
		
		chckbxmntmAudio.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				if(evt.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.Audio);
				}
				if(evt.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.Audio));
				}
			}
		});
		chckbxmntmAudio.setBounds(32, 62, 129, 22);
		add(chckbxmntmAudio);
		
		
		chckbxmntmLinux.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.Linux);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.Linux));
				}
			}
		});
		chckbxmntmLinux.setBounds(171, 62, 129, 22);
		add(chckbxmntmLinux);
		
		
		chckbxmntmAndroid.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent evt) {
				if(evt.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.Android);
				}
				if(evt.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.Android));
				}
			}
		});
		chckbxmntmAndroid.setBounds(32, 95, 129, 22);
		add(chckbxmntmAndroid);
		
		
		chckbxmntmQnx.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.QNX);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.QNX));
				}
			}
		});
		chckbxmntmQnx.setBounds(171, 95, 129, 22);
		add(chckbxmntmQnx);
		
		
		chckbxmntmCamera.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.Camera);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.Camera));
				}
			}
		});
		chckbxmntmCamera.setBounds(32, 128, 129, 22);
		add(chckbxmntmCamera);
		
		
		chckbxmntmRobot.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.Robot);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.Robot));
				}
			}
		});
		chckbxmntmRobot.setBounds(171, 128, 129, 22);
		add(chckbxmntmRobot);
		
		
		chckbxmntmCan.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.CAN);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.CAN));
				}
			}
		});
		chckbxmntmCan.setBounds(32, 161, 129, 22);
		add(chckbxmntmCan);
		
		
		chckbxmntmUsbhub.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.USB_HUB);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.USB_HUB));
				}
			}
		});
		chckbxmntmUsbhub.setBounds(171, 161, 129, 22);
		add(chckbxmntmUsbhub);
		
		JLabel lblAvailablePlugins = new JLabel("Available Plugins");
		lblAvailablePlugins.setBounds(42, 36, 93, 14);
		add(lblAvailablePlugins);
		
		
		chckbxmntmVr.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.VR);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.VR));
				}
			}
		});
		chckbxmntmVr.setBounds(32, 208, 75, 22);
		add(chckbxmntmVr);
		
		JLabel lblInDevelopment = new JLabel("In Development");
		lblInDevelopment.setBounds(42, 194, 93, 14);
		add(lblInDevelopment);
		
		
		chckbxmntmProgrammablePs.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.Programmable_PS);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.Programmable_PS));
				}
			}
		});
		chckbxmntmProgrammablePs.setBounds(171, 208, 129, 22);
		add(chckbxmntmProgrammablePs);
		
		
		chckbxmntmLanguageocr.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED)
				{
					plugins.add(plugin_names.Lang_OCR);
				}
				if(e.getStateChange() == ItemEvent.DESELECTED)
				{
					plugins.remove(plugins.indexOf((String) plugin_names.Lang_OCR));
				}
			}
		});
		chckbxmntmLanguageocr.setBounds(32, 239, 129, 22);
		add(chckbxmntmLanguageocr);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				for(String plug : plugins)
					System.out.println(plug);
				InstallPlugin tbinstalled = new InstallPlugin(plugins,frame);
				tbinstalled.setBounds(126, 0, 345, 311);
				frame.getContentPane().add(tbinstalled);

			}
		});
		btnNext.setBounds(147, 272, 89, 23);
		add(btnNext);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBounds(246, 272, 89, 23);
		add(btnCancel);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Demo_Wizard wiz = new Demo_Wizard();
				frame.getContentPane().add(wiz.panel);
			}
		});
		btnBack.setBounds(46, 272, 89, 23);
		add(btnBack);

	}
	
	//New Code--------------
	public void selectCheckboxes(String platform){
		
		switch(platform)
		{
			case "Linux - QNX":	chckbxmntmAudio.setSelected(true);
								chckbxmntmCan.setSelected(true);
								chckbxmntmUsbhub.setSelected(true);
								chckbxmntmLinux.setSelected(true);
								chckbxmntmQnx.setSelected(true);
								chckbxmntmLanguageocr.setSelected(true);
								chckbxmntmVr.setSelected(true);
								chckbxmntmProgrammablePs.setSelected(true);
								plugins.add(plugin_names.Audio);
								plugins.add(plugin_names.CAN);
								plugins.add(plugin_names.USB_HUB);
								plugins.add(plugin_names.Linux);
								plugins.add(plugin_names.QNX);
								plugins.add(plugin_names.Lang_OCR);
								plugins.add(plugin_names.VR);
								plugins.add(plugin_names.Programmable_PS);
								break;
								
			case "Android":		chckbxmntmAudio.setSelected(true);
								chckbxmntmAndroid.setSelected(true);
								chckbxmntmCan.setSelected(true);
								chckbxmntmUsbhub.setSelected(true);
								chckbxmntmLanguageocr.setSelected(true);
								chckbxmntmVr.setSelected(true);
								chckbxmntmProgrammablePs.setSelected(true);
								
								plugins.add(plugin_names.Audio);
								plugins.add(plugin_names.Android);
								plugins.add(plugin_names.CAN);
								plugins.add(plugin_names.USB_HUB);
								plugins.add(plugin_names.Lang_OCR);
								plugins.add(plugin_names.VR);
								plugins.add(plugin_names.Programmable_PS);
								break;
								
			case "Robot & Camera" : chckbxmntmAudio.setSelected(true);
									chckbxmntmCamera.setSelected(true);
									chckbxmntmCan.setSelected(true);
									chckbxmntmUsbhub.setSelected(true);
									chckbxmntmLanguageocr.setSelected(true);
									chckbxmntmRobot.setSelected(true);
									chckbxmntmVr.setSelected(true);
									chckbxmntmProgrammablePs.setSelected(true);
								
									plugins.add(plugin_names.Audio);
									plugins.add(plugin_names.CAN);
									plugins.add(plugin_names.Camera);
									plugins.add(plugin_names.USB_HUB);
									plugins.add(plugin_names.Lang_OCR);
									plugins.add(plugin_names.Robot);
									plugins.add(plugin_names.VR);
									plugins.add(plugin_names.Programmable_PS);
									break;
				
		}
	}
	
}
