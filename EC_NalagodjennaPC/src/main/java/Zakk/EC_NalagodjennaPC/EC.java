package Zakk.EC_NalagodjennaPC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EC extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna0;
	private JSlider sl_putanna1;
	private JSlider sl_putanna2;
	private JSlider sl_putanna3;

	int i_sl_putanna0;
	int i_sl_putanna1;
	int i_sl_putanna2;
	int i_sl_putanna3;

	SliderListener slider = new SliderListener();
	SliderListener1 slider1 = new SliderListener1();
	SliderListener2 slider2 = new SliderListener2();
	SliderListener3 slider3 = new SliderListener3();

	EC(String s, int ii_sl_putanna0, int ii_sl_putanna1, int ii_sl_putanna2, int ii_sl_putanna3,
			final int ii_sl_putanna4, final int ii_sl_putanna5, final int ii_sl_putanna6, final int ii_sl_putanna7,
			final int ii_sl_putanna8, final int ii_sl_putanna9, final int ii_sl_putanna10, final int ii_sl_putanna11,
			final int ii_sl_putanna12, final int ii_sl_putanna13, final int ii_sl_putanna14,
			final int ii_sl_putanna15) {
		super(s);

		this.i_sl_putanna0 = ii_sl_putanna0;
		this.i_sl_putanna1 = ii_sl_putanna1;
		this.i_sl_putanna2 = ii_sl_putanna2;
		this.i_sl_putanna3 = ii_sl_putanna3;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel l_nazva = new JLabel("Діагностика");
		l_nazva.setHorizontalAlignment(SwingConstants.CENTER);
		l_nazva.setBounds(0, 0, 982, 50);
		getContentPane().add(l_nazva);
		l_nazva.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		l_nazva.setForeground(Color.YELLOW);

		JLabel l_komentar = new JLabel("Вам необхідно пройти опитування. Давайте відповіді якомога точніше.");
		l_komentar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		l_komentar.setForeground(Color.WHITE);
		l_komentar.setHorizontalAlignment(SwingConstants.CENTER);
		l_komentar.setBounds(0, 49, 982, 21);
		getContentPane().add(l_komentar);

		sl_putanna0 = new JSlider(0, 0, 10, i_sl_putanna0);
		sl_putanna0.setPaintLabels(true);
		sl_putanna0.setPaintTicks(true);
		sl_putanna0.setOpaque(false);
		sl_putanna0.setMinorTickSpacing(1);
		sl_putanna0.setBounds(35, 134, 907, 40);
		getContentPane().add(sl_putanna0);

		sl_putanna1 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna1);
		sl_putanna1.setPaintTicks(true);
		sl_putanna1.setPaintLabels(true);
		sl_putanna1.setOpaque(false);
		sl_putanna1.setMinorTickSpacing(1);
		sl_putanna1.setBounds(35, 238, 907, 40);
		getContentPane().add(sl_putanna1);

		sl_putanna2 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna2);
		sl_putanna2.setPaintTicks(true);
		sl_putanna2.setPaintLabels(true);
		sl_putanna2.setOpaque(false);
		sl_putanna2.setMinorTickSpacing(1);
		sl_putanna2.setBounds(35, 341, 907, 40);
		getContentPane().add(sl_putanna2);

		sl_putanna3 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna3);
		sl_putanna3.setPaintTicks(true);
		sl_putanna3.setPaintLabels(true);
		sl_putanna3.setOpaque(false);
		sl_putanna3.setMinorTickSpacing(1);
		sl_putanna3.setBounds(37, 451, 907, 40);
		getContentPane().add(sl_putanna3);

		JLabel label_3 = new JLabel("Ніколи");
		label_3.setForeground(Color.WHITE);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(826, 172, 116, 14);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Постійно");
		label_4.setForeground(Color.WHITE);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(35, 172, 102, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Постійно");
		label_5.setForeground(Color.WHITE);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(35, 276, 102, 14);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("Ніколи");
		label_6.setForeground(Color.WHITE);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(824, 276, 116, 14);
		getContentPane().add(label_6);

		JLabel label_10 = new JLabel("Постійно");
		label_10.setForeground(Color.WHITE);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(35, 380, 102, 14);
		getContentPane().add(label_10);

		JLabel label_11 = new JLabel("Ніколи");
		label_11.setForeground(Color.WHITE);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setBounds(826, 380, 116, 14);
		getContentPane().add(label_11);

		JLabel label_15 = new JLabel("Постійно");
		label_15.setForeground(Color.WHITE);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(37, 494, 102, 14);
		getContentPane().add(label_15);

		JLabel label_16 = new JLabel("Ніколи");
		label_16.setForeground(Color.WHITE);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setBounds(828, 494, 116, 14);
		getContentPane().add(label_16);

		JLabel l_putanna0 = new JLabel(
				"На екрані комп'ютера з'являються непередбачуваня повідомелення, помилки, зображення ?");
		l_putanna0.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna0.setBounds(35, 94, 907, 34);
		l_putanna0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna0.setForeground(Color.WHITE);
		getContentPane().add(l_putanna0);

		JLabel l_putanna1 = new JLabel("Іноді комп'ютер запускає невідомі програми, ресурси, сервіси ? ");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setBounds(35, 211, 907, 34);
		getContentPane().add(l_putanna1);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setForeground(Color.WHITE);

		JLabel l_putanna2 = new JLabel("Комп'ютер завжди завантажується з першого разу ?");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setBounds(35, 315, 907, 34);
		getContentPane().add(l_putanna2);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setForeground(Color.WHITE);

		JLabel l_putanna3 = new JLabel("Комп'ютер мимовільно вимикається, перезавантажується ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setBounds(12, 422, 960, 34);
		getContentPane().add(l_putanna3);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setForeground(Color.WHITE);

		JButton b_vpered0 = new JButton("Далі");
		b_vpered0.setForeground(Color.DARK_GRAY);
		b_vpered0.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		b_vpered0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				new EC1("EC", i_sl_putanna0, i_sl_putanna1, i_sl_putanna2, i_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, ii_sl_putanna10,
						ii_sl_putanna11, ii_sl_putanna12, ii_sl_putanna13, ii_sl_putanna14, ii_sl_putanna15);
				setVisible(false);
			}
		});
		b_vpered0.setBounds(482, 521, 500, 36);
		getContentPane().add(b_vpered0);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("res/fon/fon_EC.jpg"));
		label_20.setBounds(-1, 0, 983, 553);
		getContentPane().add(label_20);

		setVisible(true);

		sl_putanna0.addChangeListener(slider);
		sl_putanna1.addChangeListener(slider1);
		sl_putanna2.addChangeListener(slider2);
		sl_putanna3.addChangeListener(slider3);

	}

	class SliderListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna0 = (JSlider) e.getSource();
			i_sl_putanna0 = (int) sl_putanna0.getValue();
		}
	}

	class SliderListener1 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna1 = (JSlider) e.getSource();
			i_sl_putanna1 = (int) sl_putanna1.getValue();
		}
	}

	class SliderListener2 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna2 = (JSlider) e.getSource();
			i_sl_putanna2 = (int) sl_putanna2.getValue();
//			i_sl_putanna2 = invector(i_sl_putanna2);
		}
	}

	class SliderListener3 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna3 = (JSlider) e.getSource();
			i_sl_putanna3 = (int) sl_putanna3.getValue();
		}
	}
}
