package ∞˙¡¶«¡∑Œ¡ß∆Æ;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteDialog extends JDialog {

	private final JPanel dotla1 = new JPanel();
	private JTextField textField;
	private static JLabel failed;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DeleteDialog dialog = new DeleteDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DeleteDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		dotla1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(dotla1, BorderLayout.CENTER);
		dotla1.setLayout(null);
		{
			JLabel title = new JLabel("\uD300\uC744 \uB098\uAC08 \uC120\uC218\uC758 \uB4F1\uBC88\uD638");
			title.setForeground(new Color(0, 0, 128));
			title.setFont(new Font("πŸ≈¡", Font.BOLD | Font.ITALIC, 18));
			title.setHorizontalAlignment(SwingConstants.CENTER);
			title.setBounds(100, 20, 236, 30);
			dotla1.add(title);
		}
		{
			textField = new JTextField();
			textField.setForeground(new Color(255, 0, 0));
			textField.setFont(new Font("±º∏≤", Font.PLAIN, 99));
			textField.setHorizontalAlignment(SwingConstants.CENTER);
			textField.setBounds(157, 70, 116, 116);
			dotla1.add(textField);
			textField.setColumns(10);
		}
		{
			failed = new JLabel("\uC798\uBABB\uB41C \uC785\uB825\uC785\uB2C8\uB2E4.");
			failed.setForeground(new Color(255, 0, 0));
			failed.setHorizontalAlignment(SwingConstants.CENTER);
			failed.setBounds(100, 196, 236, 15);
			failed.setVisible(false);
			dotla1.add(failed);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {
							int n=Integer.parseInt(textField.getText());
							Player.deletePlayer(n);
							dispose();
						}catch(Exception err) {
							failed.setVisible(true);
						}
					}
				});
				
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}

}
