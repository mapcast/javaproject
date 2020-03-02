package 과제프로젝트;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.sql.*;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Cursor;
import javax.swing.ScrollPaneConstants;
import java.awt.Component;
import java.awt.Rectangle;
import javax.swing.JTextField;

public class SelFrame extends JFrame {

	private JPanel contentPane;
	private static Vector<JLabel> numVector=new Vector<JLabel>();
	private static Vector<JLabel> nameVector=new Vector<JLabel>();
	private static Vector<JLabel> ageVector=new Vector<JLabel>();
	private static Vector<JLabel> posVector=new Vector<JLabel>();
	private static Vector<JLabel> avgVector=new Vector<JLabel>();
	private static JPanel panel = new JPanel();
	private final JButton emptybutton = new JButton("");
	private JTextField searchfield;
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelFrame frame = new SelFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void getPlayers(){
		
		try {
			Connection conn=getConnection(); //db연결
			PreparedStatement statement=conn.prepareStatement(
					"SELECT * FROM player");
			ResultSet result=statement.executeQuery();
			numVector.clear();
			nameVector.clear();
			ageVector.clear();
			posVector.clear();
			avgVector.clear();
			while(result.next()) {
				numVector.add(new JLabel(result.getString("num")));
				nameVector.add(new JLabel(result.getString("name")));
				ageVector.add(new JLabel(result.getString("age")));
				posVector.add(new JLabel(result.getString("pos")));
				avgVector.add(new JLabel(result.getString("avg")));
			}
			
			for(int i=0; i<numVector.size(); i++) {
				JLabel num=numVector.get(i);
				num.setForeground(Color.WHITE);
				num.setBounds(0,20*i,60,20);
				num.setFont(new Font("굴림", Font.BOLD, 12));
				num.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(num);
				JLabel nam=nameVector.get(i);
				nam.setForeground(Color.WHITE);
				nam.setBounds(60,20*i, 105,20);
				nam.setFont(new Font("굴림", Font.BOLD, 12));
				nam.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(nam);
				JLabel age=ageVector.get(i);
				age.setForeground(Color.WHITE);
				age.setBounds(165,20*i,65,20);
				age.setFont(new Font("굴림", Font.BOLD, 12));
				age.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(age);
				JLabel loc=posVector.get(i);
				loc.setForeground(Color.WHITE);
				loc.setBounds(230,20*i,80,20);
				loc.setFont(new Font("굴림", Font.BOLD, 12));
				loc.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(loc);
				JLabel avg=avgVector.get(i);
				avg.setForeground(Color.WHITE);
				avg.setBounds(310,20*i,65,20);
				avg.setFont(new Font("굴림", Font.BOLD, 12));
				avg.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(avg);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void getPlayers(String str){
		
		try {
			Connection conn=getConnection(); //db연결
			PreparedStatement statement=conn.prepareStatement(
					"SELECT * FROM player WHERE name like '%"+str+"%'");
			ResultSet result=statement.executeQuery();
			numVector.clear();
			nameVector.clear();
			ageVector.clear();
			posVector.clear();
			avgVector.clear();
			while(result.next()) {
				numVector.add(new JLabel(result.getString("num")));
				nameVector.add(new JLabel(result.getString("name")));
				ageVector.add(new JLabel(result.getString("age")));
				posVector.add(new JLabel(result.getString("pos")));
				avgVector.add(new JLabel(result.getString("avg")));
			}
			
			for(int i=0; i<numVector.size(); i++) {
				JLabel num=numVector.get(i);
				num.setForeground(Color.WHITE);
				num.setBounds(0,20*i,60,20);
				num.setFont(new Font("굴림", Font.BOLD, 12));
				num.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(num);
				JLabel nam=nameVector.get(i);
				nam.setForeground(Color.WHITE);
				nam.setBounds(60,20*i, 105,20);
				nam.setFont(new Font("굴림", Font.BOLD, 12));
				nam.setHorizontalAlignment(SwingConstants.CENTER);
				System.out.println(nam.getText());
				panel.add(nam);
				JLabel age=ageVector.get(i);
				age.setForeground(Color.WHITE);
				age.setBounds(165,20*i,65,20);
				age.setFont(new Font("굴림", Font.BOLD, 12));
				age.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(age);
				JLabel loc=posVector.get(i);
				loc.setForeground(Color.WHITE);
				loc.setBounds(230,20*i,80,20);
				loc.setFont(new Font("굴림", Font.BOLD, 12));
				loc.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(loc);
				JLabel avg=avgVector.get(i);
				avg.setForeground(Color.WHITE);
				avg.setBounds(310,20*i,65,20);
				avg.setFont(new Font("굴림", Font.BOLD, 12));
				avg.setHorizontalAlignment(SwingConstants.CENTER);
				panel.add(avg);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	
	public SelFrame() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img=toolkit.getImage("C:\\자바학습\\과제프로젝트\\Image\\tk.jpg");
		setIconImage(img);
		setTitle("CRUD");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel subpanel1 = new JPanel();
		subpanel1.setBounds(0, 0, 395, 30);
		contentPane.add(subpanel1);
		subpanel1.setLayout(null);
		
		JButton numb = new JButton("\uBC88\uD638");
		numb.setBackground(Color.WHITE);
		numb.setBounds(0, 0, 60, 30);
		subpanel1.add(numb);
		
		JButton namb = new JButton("\uC774\uB984");
		namb.setBackground(Color.WHITE);
		namb.setBounds(60, 0, 105, 30);
		subpanel1.add(namb);
		
		JButton btnNewButton_1 = new JButton("\uB098\uC774");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(165, 0, 65, 30);
		subpanel1.add(btnNewButton_1);
		
		JButton posb = new JButton("\uD3EC\uC9C0\uC158");
		posb.setBackground(Color.WHITE);
		posb.setBounds(230, 0, 80, 30);
		subpanel1.add(posb);
		
		JButton avgb = new JButton("\uD3C9\uB4DD");
		avgb.setBackground(Color.WHITE);
		avgb.setBounds(310, 0, 65, 30);
		subpanel1.add(avgb);
		emptybutton.setBounds(375, 0, 20, 30);
		subpanel1.add(emptybutton);
		
		JPanel subpanel2 = new JPanel();
		subpanel2.setBounds(0, 382, 395, 79);
		contentPane.add(subpanel2);
		subpanel2.setLayout(null);
		
		JButton cbtn = new JButton("");
		cbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateDialog().setVisible(true);
			}
		});
		cbtn.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\c1.png"));
		cbtn.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\C.png"));
		cbtn.setBounds(0, 0, 79, 79);
		subpanel2.add(cbtn);
		
		JButton dbtn = new JButton("");
		dbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteDialog().setVisible(true);
			}
		});
		dbtn.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\d1.png"));
		dbtn.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\D.png"));
		dbtn.setBounds(79, 0, 79, 79);
		subpanel2.add(dbtn);
		
		JButton rbtn = new JButton("");
		rbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SelFrame().setVisible(true);
			}
		});
		rbtn.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\r1.png"));
		rbtn.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\R.png"));
		rbtn.setBounds(158, 0, 79, 79);
		subpanel2.add(rbtn);
		
		JButton homebtn = new JButton("");
		homebtn.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\home2.png"));
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainFrame().setVisible(true);
			}
		});
		homebtn.setBackground(Color.WHITE);
		homebtn.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\home.png"));
		homebtn.setBounds(237, 0, 79, 79);
		subpanel2.add(homebtn);
		
		JButton endbtn1 = new JButton("");
		endbtn1.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\fin2.jpg"));
		endbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		endbtn1.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\finimage.jpg"));
		endbtn1.setBackground(Color.WHITE);
		endbtn1.setBounds(316, 0, 79, 79);
		subpanel2.add(endbtn1);
		panel = new JPanel();
		panel.setSize(new Dimension(375,600));
		panel.setPreferredSize(new Dimension(375,600));
		//panel.setBounds(0, 30, 375, 600);
		panel.setBackground(new Color(138, 43, 226));
		
		panel.setLayout(null);
		
		getPlayers();
		JScrollPane scroll = new JScrollPane(panel);
		
		JLabel logolab1 = new JLabel("");
		logolab1.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\hicl2.png"));
		logolab1.setBounds(65, 77, 250, 197);
		panel.add(logolab1);
		
		JLabel logolab2 = new JLabel("");
		logolab2.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\hicl2.png"));
		logolab2.setBounds(65, 352, 250, 197);
		panel.add(logolab2);
		scroll.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		scroll.setBounds(0, 30, 395, 324);
		contentPane.add(scroll);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 353, 395, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		searchfield = new JTextField();
		searchfield.setBounds(0, 0, 301, 30);
		panel_1.add(searchfield);
		searchfield.setColumns(10);
		
		JButton searchbutton = new JButton("search");
		searchbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=searchfield.getText();
				dispose();
				new SelFrame(str).setVisible(true);
			}
		});
		searchbutton.setBounds(298, 0, 97, 30);
		panel_1.add(searchbutton);
		
	}
	public SelFrame(String str) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Image img=toolkit.getImage("C:\\자바학습\\과제프로젝트\\Image\\tk.jpg");
		setIconImage(img);
		setTitle("CRUD");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel subpanel1 = new JPanel();
		subpanel1.setBounds(0, 0, 395, 30);
		contentPane.add(subpanel1);
		subpanel1.setLayout(null);
		
		JButton numb = new JButton("\uBC88\uD638");
		numb.setBackground(Color.WHITE);
		numb.setBounds(0, 0, 60, 30);
		subpanel1.add(numb);
		
		JButton namb = new JButton("\uC774\uB984");
		namb.setBackground(Color.WHITE);
		namb.setBounds(60, 0, 105, 30);
		subpanel1.add(namb);
		
		JButton btnNewButton_1 = new JButton("\uB098\uC774");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(165, 0, 65, 30);
		subpanel1.add(btnNewButton_1);
		
		JButton posb = new JButton("\uD3EC\uC9C0\uC158");
		posb.setBackground(Color.WHITE);
		posb.setBounds(230, 0, 80, 30);
		subpanel1.add(posb);
		
		JButton avgb = new JButton("\uD3C9\uB4DD");
		avgb.setBackground(Color.WHITE);
		avgb.setBounds(310, 0, 65, 30);
		subpanel1.add(avgb);
		emptybutton.setBounds(375, 0, 20, 30);
		subpanel1.add(emptybutton);
		
		JPanel subpanel2 = new JPanel();
		subpanel2.setBounds(0, 382, 395, 79);
		contentPane.add(subpanel2);
		subpanel2.setLayout(null);
		
		JButton cbtn = new JButton("");
		cbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CreateDialog().setVisible(true);
			}
		});
		cbtn.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\c1.png"));
		cbtn.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\C.png"));
		cbtn.setBounds(0, 0, 79, 79);
		subpanel2.add(cbtn);
		
		JButton dbtn = new JButton("");
		dbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DeleteDialog().setVisible(true);
			}
		});
		dbtn.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\d1.png"));
		dbtn.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\D.png"));
		dbtn.setBounds(79, 0, 79, 79);
		subpanel2.add(dbtn);
		
		JButton rbtn = new JButton("");
		rbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SelFrame().setVisible(true);
			}
		});
		rbtn.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\r1.png"));
		rbtn.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\R.png"));
		rbtn.setBounds(158, 0, 79, 79);
		subpanel2.add(rbtn);
		
		JButton homebtn = new JButton("");
		homebtn.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\home2.png"));
		homebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new MainFrame().setVisible(true);
			}
		});
		homebtn.setBackground(Color.WHITE);
		homebtn.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\home.png"));
		homebtn.setBounds(237, 0, 79, 79);
		subpanel2.add(homebtn);
		
		JButton endbtn1 = new JButton("");
		endbtn1.setRolloverIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\fin2.jpg"));
		endbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		endbtn1.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\finimage.jpg"));
		endbtn1.setBackground(Color.WHITE);
		endbtn1.setBounds(316, 0, 79, 79);
		subpanel2.add(endbtn1);
		panel = new JPanel();
		panel.setSize(new Dimension(375,600));
		panel.setPreferredSize(new Dimension(375,600));
		//panel.setBounds(0, 30, 375, 600);
		panel.setBackground(new Color(138, 43, 226));
		
		panel.setLayout(null);
		
		getPlayers(str);
		JScrollPane scroll = new JScrollPane(panel);
		
		JLabel logolab1 = new JLabel("");
		logolab1.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\hicl2.png"));
		logolab1.setBounds(65, 77, 250, 197);
		panel.add(logolab1);
		
		JLabel logolab2 = new JLabel("");
		logolab2.setIcon(new ImageIcon("C:\\\uC790\uBC14\uD559\uC2B5\\\uACFC\uC81C\uD504\uB85C\uC81D\uD2B8\\Image\\hicl2.png"));
		logolab2.setBounds(65, 352, 250, 197);
		panel.add(logolab2);
		scroll.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		scroll.setBounds(0, 30, 395, 324);
		contentPane.add(scroll);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 353, 395, 30);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		searchfield = new JTextField();
		searchfield.setBounds(0, 0, 301, 30);
		panel_1.add(searchfield);
		searchfield.setColumns(10);
		
		JButton searchbutton = new JButton("search");
		searchbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str=searchfield.getText();
				dispose();
				new SelFrame(str).setVisible(true);
			}
		});
		searchbutton.setBounds(298, 0, 97, 30);
		panel_1.add(searchbutton);
		
	}
	
	
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/sampledb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String pass = "1234";
		
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url,user,pass);
			System.out.println("DB 연결 완료!");
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}

