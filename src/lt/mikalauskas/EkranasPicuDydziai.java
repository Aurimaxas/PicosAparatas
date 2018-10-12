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

public class EkranasPicuDydziai extends JFrame {

	private String dydzioPasirinkimas;

	public String getDydzioPasirinkimas() {
		return dydzioPasirinkimas;
	}

	public void setDydzioPasirinkimas(String dydzioPasirinkimas) {
		this.dydzioPasirinkimas = dydzioPasirinkimas;
	}

	JButton b1, b2, b3, b4;
	JLabel l1;
	eHandler handler = new eHandler();

	PicosDydziai pd = new PicosDydziai();
	PicuRecepturos pr = new PicuRecepturos();

	public EkranasPicuDydziai(String s) {

		super(s);

		JPanel p = new JPanel();

		p.setLayout(null);

		l1 = new JLabel();
		b1 = new JButton();
		b2 = new JButton();
		b3 = new JButton();
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
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Downloads\\Pica2.png"));
		add(background);
		background.setLayout(new FlowLayout());
		l1.setText("PASIRINKITE PICOS DYDI");
		l1.setBounds(100, 20, 400, 100);
		l1.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		b1.setText(pd.priskirtiPavadinimaMazaPica());
		b1.setBounds(100, 120, 400, 100);
		b1.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		b2.setText(pd.priskirtiPavadinimaVidutinePica());
		b2.setBounds(100, 240, 400, 100);
		b2.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		b3.setText(pd.priskirtiPavadinimaDidelePica());
		b3.setBounds(100, 360, 400, 100);
		b3.setFont(new Font("TimesRoman", Font.PLAIN, 30));
		b4.setBounds(100, 480, 400, 100);
		b4.setFont(new Font("TimesRoman", Font.PLAIN, 30));

	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			EkranasPicuDydziai epd = new EkranasPicuDydziai("Dydziai");

			if (e.getSource() == b1) {
				setVisible(false);
				pd.priskirtiPavadinimaUzsakomaPica(b1.getText());
				pr.priskirtiKoeficientaUzsakomaiPicai(b1.getText());
				EkranasPicuPavadinimai epp = new EkranasPicuPavadinimai("PICU PAVADINIMAI");
				epp.ekranas();

			}
			if (e.getSource() == b2) {
				setVisible(false);
				pd.priskirtiPavadinimaUzsakomaPica(b2.getText());
				pr.priskirtiKoeficientaUzsakomaiPicai(b2.getText());
				EkranasPicuPavadinimai epp = new EkranasPicuPavadinimai("PICU PAVADINIMAI");
				epp.ekranas();

			}
			if (e.getSource() == b3) {
				setVisible(false);
				pd.priskirtiPavadinimaUzsakomaPica(b3.getText());
				pr.priskirtiKoeficientaUzsakomaiPicai(b3.getText());
				EkranasPicuPavadinimai epp = new EkranasPicuPavadinimai("PICU PAVADINIMAI");
				epp.ekranas();

			}

			if (e.getSource() == b4) {
				setVisible(false);
				EkranasPagrindinis ep = new EkranasPagrindinis("PICU APARATAS");
				ep.ekranas();

			}
		}

	}
}

