package lt.mikalauskas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class EkranasServisas extends JFrame {

	JButton b1, b2, b3, b4;
	JLabel l1;
	eHandler handler = new eHandler();

	public EkranasServisas(String s) {

		super(s);

		JPanel p = new JPanel();

		p.setLayout(null);

		l1 = new JLabel();
		b1 = new JButton("Zaliavu likuciai");
		b2 = new JButton("Zaliavu papildymas");
		b3 = new JButton("Atlikti servisa");
		b4 = new JButton("Grizti atgal");

		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(p);

		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);

	}

	public void ekranas() {
		setVisible(true);
		setSize(600, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Downloads\\Pica4.png"));
		add(background);
		background.setLayout(new FlowLayout());
		l1.setText("PASIRINKITE");
		l1.setBounds(100, 20, 400, 100);
		l1.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setBounds(100, 120, 400, 100);
		b1.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		b2.setBounds(100, 240, 400, 100);
		b2.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		b3.setBounds(100, 360, 400, 100);
		b3.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		b4.setBounds(100, 480, 400, 100);
		b4.setFont(new Font("TimesRoman", Font.PLAIN, 30));

	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				setVisible(false);
				EkranasZaliavuLikuciai ezl = new EkranasZaliavuLikuciai("ZALIAVU LIKUCIAI");
				ezl.ekranas();

			}

			if (e.getSource() == b2) {
				setVisible(false);
				EkranasPapildytiZaliavu epz = new EkranasPapildytiZaliavu("ZALIAVU PAPILDYMAS");
				epz.ekranas();

			}

			if (e.getSource() == b4) {
				setVisible(false);
				EkranasPagrindinis ep = new EkranasPagrindinis("PICU APARATAS");
				ep.ekranas();

			}

		}

	}
}
