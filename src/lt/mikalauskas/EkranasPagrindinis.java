package lt.mikalauskas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EkranasPagrindinis extends JFrame {

	JButton b1, b2, b3;
	JLabel l1;
	eHandler handler = new eHandler();

	public EkranasPagrindinis(String s) {

		super(s);

		JPanel p = new JPanel();

		p.setLayout(null);

		l1 = new JLabel();
		b1 = new JButton("Gaminti pica");
		b2 = new JButton("Servisas");
		b3 = new JButton("Baigti darba");

		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(p);

		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
	}

	public void ekranas() {
		setVisible(true);
		setSize(600, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Downloads\\Pica1.png"));
		add(background);
		background.setLayout(new FlowLayout());
		
		l1.setText("PASIRINKITE");
		l1.setBounds(100, 50, 400, 100);
		l1.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBackground(Color.white);
		l1.setOpaque(true);
		
		b1.setBounds(100, 200, 400, 100);
		b1.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		b2.setBounds(100, 350, 400, 100);
		b2.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		b3.setBounds(100, 500, 400, 100);
		b3.setFont(new Font("TimesRoman", Font.PLAIN, 30));

	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				setVisible(false);
				EkranasPicuDydziai epd = new EkranasPicuDydziai("PICU DYDZIAI");
				epd.ekranas();

			}
			if (e.getSource() == b2) {
				setVisible(false);
				EkranasServisas es = new EkranasServisas("SERVISAS");
				es.ekranas();

			}

			if (e.getSource() == b3) {
				System.exit(0);
			}

		}
	}

}
