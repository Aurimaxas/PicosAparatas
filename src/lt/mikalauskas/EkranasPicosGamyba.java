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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import lt.mikalauskas.EkranasPicuPavadinimai.eHandler;

public class EkranasPicosGamyba extends JFrame {

	JButton b1, b2;
	JLabel l1, l2, l3, l4;
	JTextField t1, t2, t3;
	eHandler handler = new eHandler();
	EkranasPicuDydziai epd = new EkranasPicuDydziai("Dydis");
	PicosDydziai pd = new PicosDydziai();
	PicuPavadinimai pp = new PicuPavadinimai();
	PicuRecepturos pr = new PicuRecepturos();
	PicosZaliavos pz = new PicosZaliavos();
	public double sunaudotaPadu, sunaudotaDesros, sunaudotaKumpio, sunaudotaVistienos, sunaudotaPievagrybiu,
			sunaudotaSurio, sunaudotaPomidoru, sunaudotaPadazo;

	public EkranasPicosGamyba(String s) {

		super(s);

		JPanel p = new JPanel();

		p.setLayout(null);

		l1 = new JLabel();
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		b1 = new JButton("Gaminti pica");
		b2 = new JButton("Grizti atgal");

		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
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
		JLabel background = new JLabel(new ImageIcon("C:\\Users\\Aurimo PC\\Downloads\\Pica6.png"));
		add(background);
		background.setLayout(new FlowLayout());
		l1.setText("JUSU PASIRINKIMAS");
		l1.setBounds(50, 50, 475, 50);
		l1.setFont(new Font("TimesRoman", Font.PLAIN, 40));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l2.setText("Picos dydis");
		l2.setBounds(50, 150, 225, 50);
		l2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l2.setHorizontalAlignment(SwingConstants.LEFT);
		t1.setText(pd.getUzsakomaPica());
		t1.setBounds(300, 150, 225, 50);
		t1.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		l3.setText("Picos pavadinimas");
		l3.setBounds(50, 250, 225, 50);
		l3.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l3.setHorizontalAlignment(SwingConstants.LEFT);
		t2.setText(pp.getUzsakomaPica());
		t2.setBounds(300, 250, 225, 50);
		t2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		l4.setText("Kaina");
		l4.setBounds(50, 350, 225, 50);
		l4.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		l4.setHorizontalAlignment(SwingConstants.LEFT);
		t3.setText(Double
				.toString(Math.floor(pp.gautiKaina() * PicuRecepturos.getKoeficientasUzsakomaiPicai() * 100) / 100));
		t3.setBounds(300, 350, 225, 50);
		t3.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		t3.setHorizontalAlignment(SwingConstants.CENTER);

		b1.setBounds(50, 550, 225, 50);
		b1.setFont(new Font("TimesRoman", Font.PLAIN, 20));

		b2.setBounds(300, 550, 225, 50);
		b2.setFont(new Font("TimesRoman", Font.PLAIN, 20));

	}

	public class eHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				setVisible(false);
				double sunaudotaPadu = (pr.uzsakomaPicaReceptura.get(0) * (pr.getKoeficientasUzsakomaiPicai()));
				int sveikasSkaiciusPadai = (int) sunaudotaPadu;
				pz.papildytiPadu(pz.getPadas() - sveikasSkaiciusPadai);

				double sunaudotaDesros = (pr.uzsakomaPicaReceptura.get(1) * (pr.getKoeficientasUzsakomaiPicai()));
				int sveikasSkaiciusDesra = (int) sunaudotaDesros;
				pz.papildytiDesros(pz.getDesra() - sveikasSkaiciusDesra);

				double sunaudotaKupis = (pr.uzsakomaPicaReceptura.get(2) * (pr.getKoeficientasUzsakomaiPicai()));
				int sveikasSkaiciusKumpis = (int) sunaudotaKupis;
				pz.papildytiKumpio(pz.getKumpis() - sveikasSkaiciusKumpis);

				double sunaudotaVistiena = (pr.uzsakomaPicaReceptura.get(3) * (pr.getKoeficientasUzsakomaiPicai()));
				int sveikasSkaiciusVistiena = (int) sunaudotaVistiena;
				pz.papildytiVistienos(pz.getVistiena() - sveikasSkaiciusVistiena);

				double sunaudotaPievagrybiai = (pr.uzsakomaPicaReceptura.get(4) * (pr.getKoeficientasUzsakomaiPicai()));
				int sveikasSkaiciusPievagrybiai = (int) sunaudotaPievagrybiai;
				pz.papildytiPievagrybiu(pz.getPievagrybiai() - sveikasSkaiciusPievagrybiai);

				double sunaudotaSuris = (pr.uzsakomaPicaReceptura.get(5) * (pr.getKoeficientasUzsakomaiPicai()));
				int sveikasSkaiciusSuris = (int) sunaudotaSuris;
				pz.papildytiSurio(pz.getSuris() - sveikasSkaiciusSuris);

				double sunaudotaPomidorai = (pr.uzsakomaPicaReceptura.get(6) * (pr.getKoeficientasUzsakomaiPicai()));
				int sveikasSkaiciusPomidorai = (int) sunaudotaPomidorai;
				pz.papildytiPomidoru(pz.getPomidorai() - sveikasSkaiciusPomidorai);

				double sunaudotaPadazas = (pr.uzsakomaPicaReceptura.get(7) * (pr.getKoeficientasUzsakomaiPicai()));
				int sveikasSkaiciusPadazas = (int) sunaudotaPadazas;
				pz.papildytiPadazo(pz.getPadazas() - sveikasSkaiciusPadazas);

				EkranasPicosGamyba2 epg2 = new EkranasPicosGamyba2("PICOS GAMYBA");
				epg2.ekranas();

			}

			if (e.getSource() == b2) {
				setVisible(false);
				EkranasPagrindinis ep = new EkranasPagrindinis("PICU APARATAS");
				ep.ekranas();

			}
		}

	}

}
