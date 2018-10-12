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

public class EkranasPicuPavadinimai extends JFrame {
	JButton b1, b2, b3, b4, b5, b6, b7;
	JLabel l1;
	eHandler handler = new eHandler();
	PicuPavadinimai pp = new PicuPavadinimai();
	PicuRecepturos pr = new PicuRecepturos();

	public EkranasPicuPavadinimai(String s) {

		super(s);

		JPanel p = new JPanel();

		p.setLayout(null);

		l1 = new JLabel();

		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
		b4 = new JButton();
		b5 = new JButton();
		b6 = new JButton();
		b7 = new JButton("Grizti atgal");

		add(l1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(p);

		b1.addActionListener(handler);
		b2.addActionListener(handler);
		b3.addActionListener(handler);
		b4.addActionListener(handler);
		b5.addActionListener(handler);
		b6.addActionListener(handler);
		b7.addActionListener(handler);

	}

	public void ekranas() {
		setVisible(true);
		setSize(600, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Downloads\\Pica5.png"));
		add(background);
		background.setLayout(new FlowLayout());
		l1.setText("PASIRINKITE PICOS PAVADINIMA");
		l1.setBounds(50, 20, 475, 60);
		l1.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setText(pp.priskirtiPavadinimaStudentiskaPica());
		b1.setBounds(50, 120, 225, 100);
		b1.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		b2.setText(pp.priskirtiPavadinimaItaliskaPica());
		b2.setBounds(50, 240, 225, 100);
		b2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		b3.setText(pp.priskirtiPavadinimaVegetariskaPica());
		b3.setBounds(50, 360, 225, 100);
		b3.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		b4.setText(pp.priskirtiPavadinimaSkaniojiPica());
		b4.setBounds(300, 120, 225, 100);
		b4.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		b5.setText(pp.priskirtiPavadinimaAmerikietiskaPica());
		b5.setBounds(300, 240, 225, 100);
		b5.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		b6.setText(pp.priskirtiPavadinimaVistienosPica());
		b6.setBounds(300, 360, 225, 100);
		b6.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		b7.setBounds(50, 480, 475, 100);
		b7.setFont(new Font("TimesRoman", Font.PLAIN, 20));

	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				setVisible(false);
				pp.priskirtiPavadinimaUzsakomaPica(b1.getText());
				pr.uzsakomaiPicaiPriskirtiReceptura(b1.getText());
				EkranasPicosGamyba epg = new EkranasPicosGamyba("Picos gamyba");
				epg.ekranas();

			}

			if (e.getSource() == b2) {
				setVisible(false);
				pp.priskirtiPavadinimaUzsakomaPica(b2.getText());
				pr.uzsakomaiPicaiPriskirtiReceptura(b2.getText());
				EkranasPicosGamyba epg = new EkranasPicosGamyba("Picos gamyba");
				epg.ekranas();

			}

			if (e.getSource() == b3) {
				setVisible(false);
				pp.priskirtiPavadinimaUzsakomaPica(b3.getText());
				pr.uzsakomaiPicaiPriskirtiReceptura(b3.getText());
				EkranasPicosGamyba epg = new EkranasPicosGamyba("Picos gamyba");
				epg.ekranas();

			}

			if (e.getSource() == b4) {
				setVisible(false);
				pp.priskirtiPavadinimaUzsakomaPica(b4.getText());
				pr.uzsakomaiPicaiPriskirtiReceptura(b4.getText());
				EkranasPicosGamyba epg = new EkranasPicosGamyba("Picos gamyba");
				epg.ekranas();

			}

			if (e.getSource() == b5) {
				setVisible(false);
				pp.priskirtiPavadinimaUzsakomaPica(b5.getText());
				pr.uzsakomaiPicaiPriskirtiReceptura(b5.getText());
				EkranasPicosGamyba epg = new EkranasPicosGamyba("Picos gamyba");
				epg.ekranas();

			}

			if (e.getSource() == b6) {
				setVisible(false);
				pp.priskirtiPavadinimaUzsakomaPica(b6.getText());
				pr.uzsakomaiPicaiPriskirtiReceptura(b6.getText());
				EkranasPicosGamyba epg = new EkranasPicosGamyba("Picos gamyba");
				epg.ekranas();

			}

			if (e.getSource() == b7) {
				setVisible(false);
				EkranasPagrindinis ep = new EkranasPagrindinis("PICU APARATAS");
				ep.ekranas();

			}
		}

	}

}
