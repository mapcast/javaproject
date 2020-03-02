package ∞˙¡¶«¡∑Œ¡ß∆Æ;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateDialog extends JDialog {
	private final JPanel dotla1 = new JPanel();
	private JTextField numtf;
	private JTextField nametf;
	private JTextField agetf;
	private JTextField postf;
	private JTextField avgtf;
	private static JLabel failed;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CreateDialog dialog = new CreateDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CreateDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		dotla1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(dotla1, BorderLayout.CENTER);
		dotla1.setLayout(null);
		{
			JLabel numla = new JLabel("\uB4F1\uBC88\uD638");
			numla.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
			numla.setBounds(100, 50, 60, 20);
			dotla1.add(numla);
		}
		{
			JLabel namla = new JLabel("\uC774\uB984");
			namla.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
			namla.setBounds(100, 80, 60, 20);
			dotla1.add(namla);
		}
		{
			JLabel agela = new JLabel("\uB098\uC774");
			agela.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
			agela.setBounds(100, 110, 60, 20);
			dotla1.add(agela);
		}
		{
			JLabel posla = new JLabel("\uD3EC\uC9C0\uC158");
			posla.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
			posla.setBounds(100, 140, 60, 20);
			dotla1.add(posla);
		}
		{
			JLabel avgla = new JLabel("\uD3C9\uADE0\uB4DD\uC810");
			avgla.setFont(new Font("∏º¿∫ ∞ÌµÒ", Font.BOLD, 14));
			avgla.setBounds(100, 170, 60, 20);
			dotla1.add(avgla);
		}
		{
			JLabel lblNewLabel_1 = new JLabel(":");
			lblNewLabel_1.setFont(new Font("±º∏≤", Font.BOLD, 14));
			lblNewLabel_1.setBounds(177, 50, 25, 20);
			dotla1.add(lblNewLabel_1);
		}
		{
			JLabel dotla2 = new JLabel(":");
			dotla2.setFont(new Font("±º∏≤", Font.BOLD, 14));
			dotla2.setBounds(177, 80, 25, 20);
			dotla1.add(dotla2);
		}
		{
			JLabel dotla3 = new JLabel(":");
			dotla3.setFont(new Font("±º∏≤", Font.BOLD, 14));
			dotla3.setBounds(177, 110, 25, 20);
			dotla1.add(dotla3);
		}
		{
			JLabel dotla4 = new JLabel(":");
			dotla4.setFont(new Font("±º∏≤", Font.BOLD, 14));
			dotla4.setBounds(177, 140, 25, 20);
			dotla1.add(dotla4);
		}
		{
			JLabel dotla5 = new JLabel(":");
			dotla5.setFont(new Font("±º∏≤", Font.BOLD, 14));
			dotla5.setBounds(177, 170, 25, 20);
			dotla1.add(dotla5);
		}
		{
			numtf = new JTextField();
			numtf.setBounds(220, 49, 116, 25);
			dotla1.add(numtf);
			numtf.setColumns(10);
		}
		{
			nametf = new JTextField();
			nametf.setColumns(10);
			nametf.setBounds(220, 81, 116, 25);
			dotla1.add(nametf);
		}
		{
			agetf = new JTextField();
			agetf.setColumns(10);
			agetf.setBounds(220, 111, 116, 25);
			dotla1.add(agetf);
		}
		{
			postf = new JTextField();
			postf.setColumns(10);
			postf.setBounds(220, 141, 116, 25);
			dotla1.add(postf);
		}
		{
			avgtf = new JTextField();
			avgtf.setColumns(10);
			avgtf.setBounds(220, 171, 116, 25);
			dotla1.add(avgtf);
		}
		{
			failed = new JLabel("\uC798\uBABB\uB41C \uC785\uB825\uC785\uB2C8\uB2E4.");
			failed.setForeground(new Color(255, 0, 0));
			failed.setHorizontalAlignment(SwingConstants.CENTER);
			failed.setBounds(100, 205, 236, 15);
			failed.setVisible(false);
			dotla1.add(failed);
		}
		{
			JLabel title = new JLabel("\uC0C8\uB85C\uC6B4 \uC120\uC218 \uC785\uB825");
			title.setForeground(new Color(0, 0, 128));
			title.setFont(new Font("πŸ≈¡", Font.BOLD | Font.ITALIC, 18));
			title.setHorizontalAlignment(SwingConstants.CENTER);
			title.setBounds(100, 10, 236, 30);
			dotla1.add(title);
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
							int num=Integer.parseInt(numtf.getText());
							String name=nametf.getText();
							int age=Integer.parseInt(agetf.getText());
							String pos=postf.getText();
							double avg=Double.parseDouble(avgtf.getText());
							Player.createPlayer(num, name, age, pos, avg);
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
