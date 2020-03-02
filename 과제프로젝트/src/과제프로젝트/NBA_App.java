package °úÁ¦ÇÁ·ÎÁ§Æ®;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.ScrollPaneConstants;

public class NBA_App extends JFrame {
	private JFrame frame;
	private JTextField ½ÃÁð;
	private JTextField ¿ì½ÂÆÀ;
	private JTextField ÁØ¿ì½ÂÆÀ;
	private JTextField ÆÄÀÌ³ÎMVP;
	private JTextField ½ÃÁðMVP;
	private JTextField search;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NBA_App frame = new NBA_App();
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
	public NBA_App() {
		NBA NBA = new NBA();
		setSize(1200,658);
		getContentPane().setLayout(null);
		setResizable(false);
		setJMenuBar(menuBar());
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel welcomePanel = new ImagePanel(new ImageIcon("C:\\ÀÚ¹ÙÇÐ½À\\°úÁ¦ÇÁ·ÎÁ§Æ®\\Image\\nbaa1.jpg").getImage());
		welcomePanel.setFocusable(true);
		welcomePanel.setBounds(0, 1, 1194, 607);
		getContentPane().add(welcomePanel);
		welcomePanel.setLayout(null);
		
		ImagePanel tablePanel = new ImagePanel(new ImageIcon("C:\\ÀÚ¹ÙÇÐ½À\\°úÁ¦ÇÁ·ÎÁ§Æ®\\Image\\nbaa2.jpg").getImage()); // ¸®½ºÆ® Å×ÀÌºí ÆÐ³Î
		tablePanel.setBounds(0, 0, 1194, 608);
		tablePanel.setVisible(false);
		String[][]data = NBA.getNBA();
		String[] headers = new String[] {"½ÃÁð","¿ì½ÂÆÀ","ÁØ¿ì½ÂÆÀ","ÆÄÀÌ³ÎMVP","½ÃÁðMVP"};
		tablePanel.setLayout(null);
		
		JTable table = new JTable(data,headers); // Å×ÀÌºí
		table.setRowHeight(30);
		table.setFont(new Font("Sanserif",Font.BOLD,15));
		table.setAlignmentX(0);
		table.setSize(800,400);
		table.setPreferredScrollableViewportSize(new Dimension(800,400));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setFont(new Font("ÈÞ¸ÕµÕ±ÙÇìµå¶óÀÎ", Font.ITALIC, 12));
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(232, 71, 950, 527);
		tablePanel.add(scrollPane);
		contentPane.add(tablePanel);
		
		search = new JTextField(); // °Ë»ö ¹Ù
		search.setBounds(232, 22, 768, 39);
		search.setFont(new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.BOLD, 17));
		tablePanel.add(search);
		search.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SEARCH :"); // °Ë»ö ·¹ÀÌºí
		lblNewLabel_3.setFont(new Font("ÈÞ¸ÕµÕ±ÙÇìµå¶óÀÎ", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(12, 23, 208, 39);
		tablePanel.add(lblNewLabel_3);
		
		JButton back = new JButton("\uB4A4\uB85C\uAC00\uAE30"); // µÚ·Î°¡±â ¹öÆ°
		back.setBackground(Color.BLACK);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ÀÌÀüÈ­¸éÀ¸·Î µ¹¾Æ°©´Ï´Ù.");
				dispose();
				new NBA_App().setVisible(true);
			}
		});
		back.setForeground(Color.WHITE);
		back.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 25));
		back.setBounds(999, 22, 183, 39);
		tablePanel.add(back);
		
		search.addKeyListener(new KeyAdapter() { // °Ë»ö¹Ù ¾×¼ÇÅ°¸®½º³Ê
			public void keyReleased(KeyEvent e) {
				String val = search.getText();
				TableRowSorter<TableModel> trs = new TableRowSorter<>(table.getModel());
				table.setRowSorter(trs);
				trs.setRowFilter(RowFilter.regexFilter(val));
			}
		});
		
		TableColumnModel columnModels = table.getColumnModel();
		columnModels.getColumn(0).setPreferredWidth(10);
		JLabel lblNewLabel = new JLabel("\uC2DC\uC98C");
		lblNewLabel.setBounds(67, 150, 116, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.RED);
		welcomePanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC6B0\uC2B9\uD300");
		lblNewLabel_1.setBounds(67, 190, 116, 30);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.BOLD, 25));
		welcomePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC900\uC6B0\uC2B9\uD300");
		lblNewLabel_2.setBounds(67, 236, 116, 30);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.BOLD, 25));
		welcomePanel.add(lblNewLabel_2);
		
		JLabel lblMvp = new JLabel("\uD30C\uC774\uB110 MVP");
		lblMvp.setBounds(67, 282, 131, 30);
		lblMvp.setHorizontalAlignment(SwingConstants.CENTER);
		lblMvp.setForeground(Color.RED);
		lblMvp.setFont(new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.BOLD, 25));
		welcomePanel.add(lblMvp);
		
		JLabel lblMvp_1 = new JLabel("\uC2DC\uC98C MVP");
		lblMvp_1.setBounds(77, 328, 116, 30);
		lblMvp_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMvp_1.setForeground(Color.RED);
		lblMvp_1.setFont(new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.BOLD, 25));
		welcomePanel.add(lblMvp_1);
		
		½ÃÁð = new JTextField();
		½ÃÁð.setHorizontalAlignment(SwingConstants.CENTER);
		½ÃÁð.setBounds(227, 137, 190, 36);
		½ÃÁð.setFont(new Font("Arial", Font.BOLD, 20));
		½ÃÁð.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		½ÃÁð.setColumns(10);
		welcomePanel.add(½ÃÁð);
		
		¿ì½ÂÆÀ = new JTextField();
		¿ì½ÂÆÀ.setBounds(227, 187, 190, 36);
		¿ì½ÂÆÀ.setHorizontalAlignment(SwingConstants.CENTER);
		¿ì½ÂÆÀ.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		¿ì½ÂÆÀ.setColumns(10);
		welcomePanel.add(¿ì½ÂÆÀ);
		
		ÁØ¿ì½ÂÆÀ = new JTextField();
		ÁØ¿ì½ÂÆÀ.setBounds(227, 233, 190, 36);
		ÁØ¿ì½ÂÆÀ.setHorizontalAlignment(SwingConstants.CENTER);
		ÁØ¿ì½ÂÆÀ.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		ÁØ¿ì½ÂÆÀ.setColumns(10);
		welcomePanel.add(ÁØ¿ì½ÂÆÀ);
		
		ÆÄÀÌ³ÎMVP = new JTextField();
		ÆÄÀÌ³ÎMVP.setBounds(227, 279, 190, 36);
		ÆÄÀÌ³ÎMVP.setHorizontalAlignment(SwingConstants.CENTER);
		ÆÄÀÌ³ÎMVP.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		ÆÄÀÌ³ÎMVP.setColumns(10);
		welcomePanel.add(ÆÄÀÌ³ÎMVP);
		
		½ÃÁðMVP = new JTextField();
		½ÃÁðMVP.setBounds(227, 325, 190, 36);
		½ÃÁðMVP.setHorizontalAlignment(SwingConstants.CENTER);
		½ÃÁðMVP.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		½ÃÁðMVP.setColumns(10);
		welcomePanel.add(½ÃÁðMVP);
		
		
		JLabel lblNewLabel_4 = new JLabel("\uC5ED\uB300 NBA \uC6B0\uC2B9\uD300 / \uD30C\uC774\uB110 MVP / \uC2DC\uC98C MVP");
		lblNewLabel_4.setBounds(98, 22, 1001, 59);
		lblNewLabel_4.setForeground(Color.CYAN);
		lblNewLabel_4.setFont(new Font("ÈÞ¸Õ¸ðÀ½T", Font.BOLD, 30));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		welcomePanel.add(lblNewLabel_4);
		
		JButton SUBMIT = new JButton("SUBMIT");
		SUBMIT.setBounds(87, 405, 330, 36);
		
		SUBMIT.addActionListener(new ActionListener() { // Á¦Ãâ ¾×¼Ç ¸®½º³Ê µ¥ÀÌÅÍ µî·Ï!
			public void actionPerformed(ActionEvent e) {
				String ½ÃÁðText = ½ÃÁð.getText();
				String ¿ì½ÂÆÀText = ¿ì½ÂÆÀ.getText();
				String ÁØ¿ì½ÂÆÀText = ÁØ¿ì½ÂÆÀ.getText();
				String ÆÄÀÌ³ÎMVPText = ÆÄÀÌ³ÎMVP.getText();
				String ½ÃÁðMVPText = ½ÃÁðMVP.getText();
				
				NBA.createNBA(½ÃÁðText,¿ì½ÂÆÀText,ÁØ¿ì½ÂÆÀText,ÆÄÀÌ³ÎMVPText,½ÃÁðMVPText);
				JOptionPane.showMessageDialog(null, "µ¥ÀÌÅÍ ÀÔ·Â ¿Ï·á!");
			  	}
				});
		
		SUBMIT.setForeground(Color.GREEN);
		SUBMIT.setFont(new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.BOLD, 25));
		welcomePanel.add(SUBMIT);
		
		JButton List = new JButton("List"); // ¸®½ºÆ® ¹öÆ°
		List.setBounds(769, 405, 330, 36);
		
		List.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¸®½ºÆ®¸¦ º¸¿©µå¸®°Ú½À´Ï´Ù.");
				welcomePanel.setVisible(false);
				tablePanel.setVisible(true);
				}
				});
		
		List.setForeground(Color.GREEN);
		List.setFont(new Font("ÈÞ¸Õ¸ÅÁ÷Ã¼", Font.BOLD, 25));
		welcomePanel.add(List);
		
		JButton toMenu = new JButton("MainMenu");
		toMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¸ÞÀÎ¸Þ´º·Î µ¹¾Æ°©´Ï´Ù.");
				dispose();
				new MainFrame().setVisible(true);
			}
		});
		toMenu.setForeground(Color.GREEN);
		toMenu.setFont(new Font("Dialog", Font.BOLD, 25));
		toMenu.setBounds(769, 335, 330, 36);
		welcomePanel.add(toMenu);
		
	}
	public JMenuBar menuBar() {      // ¸Þ´º¹Ù
		JMenuBar bar = new JMenuBar();
		JMenu fileMenu = new JMenu("Exit?");
		
		bar.add(fileMenu);
		
		JMenuItem openFile = new JMenuItem("Continue");
		JMenuItem exit = new JMenuItem("Exit");
		fileMenu.add(openFile);
		fileMenu.add(exit);
		
		openFile.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//welcomePanel.setVisible(true);
				//tablePanel.setVisible(false);
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		return bar;
		
		
	}
}

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null),img.getHeight(null))); //nullÇÏ¸é ÃÖ´ë°ª
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	
	public int getHeight() {
		return img.getHeight(null);
	}
	
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
}


