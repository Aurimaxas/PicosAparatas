package lt.mikalauskas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import lt.mikalauskas.EkranasPicuPavadinimai.eHandler;

public class EkranasPicosGamyba2 extends JFrame {

	JButton b1, b2;
	JLabel l1;
	eHandler handler = new eHandler();
	EkranasPicuDydziai epd = new EkranasPicuDydziai("Dydis");

	public EkranasPicosGamyba2(String s) {

		super(s);

		JPanel p = new JPanel();

		p.setLayout(null);

		l1 = new JLabel();
		b1 = new JButton("Grizti atgal");
		b2 = new JButton("Baigti darba");

		add(l1);
		add(b1);
		add(b2);
		add(p);

		b1.addActionListener(handler);
		b2.addActionListener(handler);

	}

	public void ekranas() {
		setVisible(true);
		setSize(600, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Downloads\\Pagaminta.png"));
		add(background);
		background.setLayout(new FlowLayout());
		l1.setText("PICA PAGAMINTA");
		l1.setBounds(50, 50, 475, 50);
		l1.setFont(new Font("TimesRoman", Font.PLAIN, 40));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setForeground(Color.red);

		b1.setBounds(50, 550, 225, 50);
		b1.setFont(new Font("TimesRoman", Font.PLAIN, 20));

		b2.setBounds(300, 550, 225, 50);
		b2.setFont(new Font("TimesRoman", Font.PLAIN, 20));

	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				setVisible(false);
				EkranasPagrindinis ep = new EkranasPagrindinis("PICU APARATAS");
				ep.ekranas();

			}
			if (e.getSource() == b2) {
				System.exit(0);
			}
		}

	}

}
