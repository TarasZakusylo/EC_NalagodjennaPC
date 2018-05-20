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

public class EC2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna8;
	private JSlider sl_putanna9;
	private JSlider sl_putanna10;
	private JSlider sl_putanna11;

	int i_sl_putanna8;
	int i_sl_putanna9;
	int i_sl_putanna10;
	int i_sl_putanna11;

	SliderListener8 slider8 = new SliderListener8();
	SliderListener9 slider9 = new SliderListener9();
	SliderListener10 slider10 = new SliderListener10();
	SliderListener11 slider11 = new SliderListener11();

	EC2(String s, final int ii_sl_putanna0, final int ii_sl_putanna1, final int ii_sl_putanna2,
			final int ii_sl_putanna3, final int ii_sl_putanna4, final int ii_sl_putanna5, final int ii_sl_putanna6,
			final int ii_sl_putanna7, final int ii_sl_putanna8, final int ii_sl_putanna9, final int ii_sl_putanna10,
			final int ii_sl_putanna11, final int ii_sl_putanna12, final int ii_sl_putanna13, final int ii_sl_putanna14,
			final int ii_sl_putanna15) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.i_sl_putanna8 = ii_sl_putanna8;
		this.i_sl_putanna9 = ii_sl_putanna9;
		this.i_sl_putanna10 = ii_sl_putanna10;
		this.i_sl_putanna11 = ii_sl_putanna11;

		sl_putanna8 = new JSlider(0, 0, 10, i_sl_putanna8);
		sl_putanna8.setOpaque(false);
		sl_putanna8.setMinorTickSpacing(1);
		sl_putanna8.setPaintTicks(true);
		sl_putanna8.setPaintLabels(true);
		sl_putanna8.setBounds(35, 136, 912, 40);
		getContentPane().add(sl_putanna8);

		sl_putanna9 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna9);
		sl_putanna9.setPaintTicks(true);
		sl_putanna9.setPaintLabels(true);
		sl_putanna9.setOpaque(false);
		sl_putanna9.setMinorTickSpacing(1);
		sl_putanna9.setBounds(35, 235, 912, 40);
		getContentPane().add(sl_putanna9);

		sl_putanna10 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna10);
		sl_putanna10.setPaintTicks(true);
		sl_putanna10.setPaintLabels(true);
		sl_putanna10.setOpaque(false);
		sl_putanna10.setMinorTickSpacing(1);
		sl_putanna10.setBounds(35, 344, 912, 40);
		getContentPane().add(sl_putanna10);

		sl_putanna11 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna11);
		sl_putanna11.setPaintTicks(true);
		sl_putanna11.setPaintLabels(true);
		sl_putanna11.setOpaque(false);
		sl_putanna11.setMinorTickSpacing(1);
		sl_putanna11.setBounds(35, 451, 912, 40);
		getContentPane().add(sl_putanna11);

		JLabel label_4 = new JLabel("Постійно");
		label_4.setForeground(Color.WHITE);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(10, 174, 102, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Постійно");
		label_5.setForeground(Color.WHITE);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(10, 273, 102, 14);
		getContentPane().add(label_5);

		JLabel label_10 = new JLabel("Постійно");
		label_10.setForeground(Color.WHITE);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(10, 383, 102, 14);
		getContentPane().add(label_10);

		JLabel label_15 = new JLabel("Постійно");
		label_15.setForeground(Color.WHITE);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(10, 494, 102, 14);
		getContentPane().add(label_15);

		JButton b_vpered2 = new JButton("Далі");
		b_vpered2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		b_vpered2.setForeground(Color.DARK_GRAY);
		b_vpered2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC3("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, i_sl_putanna8, i_sl_putanna9, i_sl_putanna10,
						i_sl_putanna11, ii_sl_putanna12, ii_sl_putanna13, ii_sl_putanna14, ii_sl_putanna15);
				setVisible(false);

			}
		});
		b_vpered2.setBounds(492, 517, 490, 36);
		getContentPane().add(b_vpered2);

		JButton b_nazad1 = new JButton("Назад");
		b_nazad1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		b_nazad1.setForeground(Color.DARK_GRAY);
		b_nazad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC1("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, i_sl_putanna8, i_sl_putanna9, i_sl_putanna10,
						i_sl_putanna11, ii_sl_putanna12, ii_sl_putanna13, ii_sl_putanna14, ii_sl_putanna15);
				setVisible(false);

			}
		});
		b_nazad1.setBounds(0, 517, 494, 36);
		getContentPane().add(b_nazad1);

		JLabel label_3 = new JLabel("Ніколи");
		label_3.setForeground(Color.WHITE);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(826, 494, 116, 14);
		getContentPane().add(label_3);

		JLabel label_6 = new JLabel("Ніколи");
		label_6.setForeground(Color.WHITE);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(826, 383, 116, 14);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Ніколи");
		label_7.setForeground(Color.WHITE);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(826, 273, 116, 14);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("Ніколи");
		label_8.setForeground(Color.WHITE);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(826, 174, 116, 14);
		getContentPane().add(label_8);

		JLabel label = new JLabel("Вам необхідно пройти опитування. Давайте відповіді якомога точніше.");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(0, 49, 982, 21);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Діагностика");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.YELLOW);
		label_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		label_1.setBounds(0, 0, 982, 50);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("При запуску комп'ютара запускаються небажані програми, сервіси, служби ? ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_2.setBounds(36, 96, 906, 34);
		getContentPane().add(label_2);

		JLabel label_9 = new JLabel("На жорсткому диску постійно не вистачає пам'яті ?");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_9.setBounds(36, 203, 906, 34);
		getContentPane().add(label_9);

		JLabel label_11 = new JLabel("Комп'ютер працює дуже голосно ?");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.WHITE);
		label_11.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_11.setBounds(36, 308, 906, 34);
		getContentPane().add(label_11);

		JLabel label_12 = new JLabel("У комп'ютера були механічні пошклдження ?");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_12.setBounds(11, 409, 960, 34);
		getContentPane().add(label_12);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("res/fon/fon_EC2.jpg"));
		label_20.setBounds(0, 0, 982, 553);
		getContentPane().add(label_20);

		setVisible(true);

		sl_putanna8.addChangeListener(slider8);
		sl_putanna9.addChangeListener(slider9);
		sl_putanna10.addChangeListener(slider10);
		sl_putanna11.addChangeListener(slider11);

	}

	class SliderListener8 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna8 = (JSlider) e.getSource();
			i_sl_putanna8 = (int) sl_putanna8.getValue();
		}
	}

	class SliderListener9 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna9 = (JSlider) e.getSource();
			i_sl_putanna9 = (int) sl_putanna9.getValue();
		}
	}

	class SliderListener10 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna10 = (JSlider) e.getSource();
			i_sl_putanna10 = (int) sl_putanna10.getValue();
		}
	}

	class SliderListener11 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna11 = (JSlider) e.getSource();
			i_sl_putanna11 = (int) sl_putanna11.getValue();
		}
	}

}
