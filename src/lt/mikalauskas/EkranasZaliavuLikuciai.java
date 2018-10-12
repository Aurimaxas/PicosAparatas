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

import lt.mikalauskas.PicosZaliavos;

public class EkranasZaliavuLikuciai extends JFrame {

	JButton b1;
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17;
	JTextField t1, t2, t3, t4, t5, t6, t7, t8;
	eHandler handler = new eHandler();

	public EkranasZaliavuLikuciai(String s) {

		super(s);

		JPanel p = new JPanel();

		p.setLayout(null);

		l1 = new JLabel();
		l2 = new JLabel("Padai");
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l16 = new JLabel();
		l9 = new JLabel("vnt");
		l10 = new JLabel("vnt");
		l11 = new JLabel("vnt");
		l12 = new JLabel("vnt");
		l13 = new JLabel("vnt");
		l14 = new JLabel("vnt");
		l15 = new JLabel("vnt");
		l17 = new JLabel("vnt");
		t1 = new JTextField(50);
		t2 = new JTextField(50);
		t3 = new JTextField(50);
		t4 = new JTextField(50);
		t5 = new JTextField(50);
		t6 = new JTextField(50);
		t7 = new JTextField(50);
		t8 = new JTextField(50);
		b1 = new JButton("Grizti atgal");

		add(l1);
		add(l2);
		add(t1);
		add(l9);
		add(l3);
		add(t2);
		add(l10);
		add(l4);
		add(t3);
		add(l11);
		add(l5);
		add(t4);
		add(l12);
		add(l6);
		add(t5);
		add(l13);
		add(l7);
		add(t6);
		add(l14);
		add(l8);
		add(t7);
		add(l15);
		add(l16);
		add(t8);
		add(l17);
		add(b1);
		add(p);

		b1.addActionListener(handler);

	}

	public void ekranas() {

		setVisible(true);
		setSize(600, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Downloads\\Pica3.png"));
		add(background);
		background.setLayout(new FlowLayout());
		l1.setText("ZALIAVU LIKUCIAI");
		l1.setBounds(50, 20, 475, 40);
		l1.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setText(" Padas");
		l2.setBounds(50, 80, 200, 40);
		l2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l2.setHorizontalAlignment(SwingConstants.LEFT);
		t1.setText(PicosZaliavos.kopijaPadas());
		t1.setBounds(300, 80, 100, 40);
		t1.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		l9.setBounds(450, 80, 50, 40);
		l9.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l9.setHorizontalAlignment(SwingConstants.LEFT);
		l3.setText("Desra");
		l3.setBounds(50, 140, 200, 40);
		l3.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l3.setHorizontalAlignment(SwingConstants.LEFT);
		t2.setText(PicosZaliavos.kopijaDesra());
		t2.setBounds(300, 140, 100, 40);
		t2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		l10.setBounds(450, 140, 50, 40);
		l10.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l10.setHorizontalAlignment(SwingConstants.LEFT);
		l4.setText("Kumpis");
		l4.setBounds(50, 200, 200, 40);
		l4.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l4.setHorizontalAlignment(SwingConstants.LEFT);
		t3.setText(PicosZaliavos.kopijaKumpis());
		t3.setBounds(300, 200, 100, 40);
		t3.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		l11.setBounds(450, 200, 50, 40);
		l11.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l11.setHorizontalAlignment(SwingConstants.LEFT);
		l5.setText("Vistiena");
		l5.setBounds(50, 260, 200, 40);
		l5.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l5.setHorizontalAlignment(SwingConstants.LEFT);
		t4.setText(PicosZaliavos.kopijaVistiena());
		t4.setBounds(300, 260, 100, 40);
		t4.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		l12.setBounds(450, 260, 50, 40);
		l12.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l12.setHorizontalAlignment(SwingConstants.LEFT);
		l6.setText("Pievagrybiai");
		l6.setBounds(50, 320, 200, 40);
		l6.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l6.setHorizontalAlignment(SwingConstants.LEFT);
		t5.setText(PicosZaliavos.kopijaPievagrybiai());
		t5.setBounds(300, 320, 100, 40);
		t5.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t5.setHorizontalAlignment(SwingConstants.CENTER);
		l13.setBounds(450, 320, 50, 40);
		l13.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l13.setHorizontalAlignment(SwingConstants.LEFT);
		l7.setText("Suris");
		l7.setBounds(50, 380, 200, 40);
		l7.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l7.setHorizontalAlignment(SwingConstants.LEFT);
		t6.setText(PicosZaliavos.kopijaSuris());
		t6.setBounds(300, 380, 100, 40);
		t6.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t6.setHorizontalAlignment(SwingConstants.CENTER);
		l14.setBounds(450, 380, 50, 40);
		l14.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l14.setHorizontalAlignment(SwingConstants.LEFT);
		l8.setText("Pomidorai");
		l8.setBounds(50, 440, 200, 40);
		l8.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l8.setHorizontalAlignment(SwingConstants.LEFT);
		t7.setText(PicosZaliavos.kopijaPomidorai());
		t7.setBounds(300, 440, 100, 40);
		t7.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t7.setHorizontalAlignment(SwingConstants.CENTER);
		l15.setBounds(450, 440, 50, 40);
		l15.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l15.setHorizontalAlignment(SwingConstants.LEFT);
		l16.setText("Padazas");
		l16.setBounds(50, 500, 200, 40);
		l16.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l16.setHorizontalAlignment(SwingConstants.LEFT);
		t8.setText(PicosZaliavos.kopijaPadazas());
		t8.setBounds(300, 500, 100, 40);
		t8.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t8.setHorizontalAlignment(SwingConstants.CENTER);
		l17.setBounds(450, 500, 50, 40);
		l17.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l17.setHorizontalAlignment(SwingConstants.LEFT);

		b1.setBounds(50, 580, 475, 50);
		b1.setFont(new Font("TimesRoman", Font.PLAIN, 20));

	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				setVisible(false);
				EkranasPagrindinis ep = new EkranasPagrindinis("PICU APARATAS");
				ep.ekranas();

			}

		}

	}
}
