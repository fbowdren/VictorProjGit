package loginScreen;
/**
 * 
 */

/**
 * @author Declan
 *
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

public static void main(String[] args) {
Login frameTabel = new Login();
}

	
	JButton blogin = new JButton("Login");
	JPanel panel = new JPanel();
	JTextField txuser = new JTextField(15);
	JPasswordField pass = new JPasswordField(15);

	Login(){
			super("User Login ");
			setSize(300,200);
			setLocation(500,280);
			panel.setLayout (null); 


			txuser.setBounds(70,30,150,20);
			pass.setBounds(70,65,150,20);
			blogin.setBounds(110,100,80,20);

			panel.add(blogin);
			panel.add(txuser);
			panel.add(pass);

			getContentPane().add(panel);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			actionlogin();
		}

	public void actionlogin(){
		blogin.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent ae) {
				String uname = txuser.getText();
				String paswd = pass.getText();
				if(uname.equals("test") && paswd.equals("12345")) {
					NewFrame regFace =new NewFrame();
					regFace.setVisible(true);
					dispose();
				} 
				else {

						JOptionPane.showMessageDialog(null,"Wrong Password / Username");
						txuser.setText("");
						pass.setText("");
						txuser.requestFocus();
				}

			}
		});
	}
}
