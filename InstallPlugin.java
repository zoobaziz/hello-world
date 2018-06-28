package wizard_panels;
import javax.swing.JPanel;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class InstallPlugin extends JPanel {

	String[] plugs = new String[8];
	/**
	 * Create the panel.
	 */
	public InstallPlugin(ArrayList<String> plug_ins, JFrame frame) {
		
		setLayout(null);
		
		JLabel lblFollowingPluginsWill = new JLabel("Following Plugins will be Installed");
		lblFollowingPluginsWill.setBounds(30, 26, 328, 14);
		add(lblFollowingPluginsWill);
		
		int x = 40, y1 = 67, y2 = 67, x1 = 200;
		for(int i = 0; i<plug_ins.size(); i++)
		{
			if(i<5){
				JLabel jlabLEFT = new JLabel(plug_ins.get(i));
				jlabLEFT.setBounds(x, y1, 106, 20);
				add(jlabLEFT);
				y1 += 30;
			}
			else
			{
				JLabel jlabRIGHT = new JLabel(plug_ins.get(i));
				jlabRIGHT.setBounds(x1, y2, 106, 20);
				add(jlabRIGHT);
				y2 += 30;
			}
		}

	}

}
