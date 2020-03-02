package 과제프로젝트;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img=toolkit.getImage("C:\\자바학습\\과제프로젝트\\Image\\tk.jpg");
		setIconImage(img);
		setTitle("LA LAKERS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 460);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImgPanel panel = new ImgPanel(new ImageIcon("C:\\자바학습\\과제프로젝트\\image\\main.jpeg").getImage());
		panel.setBounds(0, 0, 750, 421);
		contentPane.add(panel);
		JButton readbutton = new JButton("");
		readbutton.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\CRUD2.png"));
		readbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SelFrame().setVisible(true);
			}
		});
		readbutton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\CRUD.png"));
		readbutton.setBackground(new Color(255, 255, 240));
		readbutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 165, 0), null, null, new Color(255, 255, 0)));
		readbutton.setBounds(12, 10, 232, 113);
		panel.add(readbutton);
		
		JLabel gotoLakers = new JLabel("");
		gotoLakers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
                    Desktop.getDesktop().browse(new URI("https://www.nba.com/lakers/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
			}
		});
		gotoLakers.setBounds(287, 139, 158, 148);
		panel.add(gotoLakers);
		
		JButton legendbutton = new JButton("");
		legendbutton.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\legend2.jpg"));
		legendbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LA_Main().setVisible(true);
			}
		});
		legendbutton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\legendButton.jpg"));
		legendbutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 165, 0), null, null, new Color(255, 255, 0)));
		legendbutton.setBackground(new Color(255, 255, 240));
		legendbutton.setBounds(506, 10, 232, 113);
		panel.add(legendbutton);
		
		JButton leaguebutton = new JButton("");
		leaguebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new NBA_App().setVisible(true);
			}
		});
		leaguebutton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\NBA.jpg"));
		leaguebutton.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\NBA2.jpg"));
		leaguebutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 165, 0), null, null, new Color(255, 255, 0)));
		leaguebutton.setBackground(new Color(0, 0, 0));
		leaguebutton.setBounds(12, 298, 232, 113);
		panel.add(leaguebutton);
		
		JButton webpagebutton = new JButton("");
		webpagebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
                    Desktop.getDesktop().browse(new URI("http://192.168.0.83:8080/BASKET-BALL/login.jsp"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
			}
		});
		webpagebutton.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\web2.jpg"));
		webpagebutton.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\web.png"));
		webpagebutton.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(255, 165, 0), null, null, new Color(255, 255, 0)));
		webpagebutton.setBackground(Color.BLACK);
		webpagebutton.setBounds(506, 298, 232, 113);
		panel.add(webpagebutton);
	}
	
	 
}
class ImgPanel extends JPanel{
	private Image img;
	
	public ImgPanel(Image img){
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, null);
	}
}
