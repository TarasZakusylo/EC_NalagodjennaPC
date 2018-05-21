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

public class EC3 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna12;
	private JSlider sl_putanna13;
	private JSlider sl_putanna14;
	private JSlider sl_putanna15;

	int i_sl_putanna12;
	int i_sl_putanna13;
	int i_sl_putanna14;
	int i_sl_putanna15;

	private int i_sl_putanna2;

	SliderListener12 slider12 = new SliderListener12();
	SliderListener13 slider13 = new SliderListener13();
	SliderListener14 slider14 = new SliderListener14();
	SliderListener15 slider15 = new SliderListener15();

	EC3(String s, final int ii_sl_putanna0, final int ii_sl_putanna1, final int ii_sl_putanna2,
			final int ii_sl_putanna3, final int ii_sl_putanna4, final int ii_sl_putanna5, final int ii_sl_putanna6,
			final int ii_sl_putanna7, final int ii_sl_putanna8, final int ii_sl_putanna9, final int ii_sl_putanna10,
			final int ii_sl_putanna11, final int ii_sl_putanna12, final int ii_sl_putanna13, final int ii_sl_putanna14,
			final int ii_sl_putanna15) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.i_sl_putanna12 = ii_sl_putanna12;
		this.i_sl_putanna13 = ii_sl_putanna13;
		this.i_sl_putanna14 = ii_sl_putanna14;
		this.i_sl_putanna15 = ii_sl_putanna15;

		sl_putanna12 = new JSlider(0, 0, 10, i_sl_putanna12);
		sl_putanna12.setMinorTickSpacing(1);
		sl_putanna12.setOpaque(false);
		sl_putanna12.setPaintTicks(true);
		sl_putanna12.setPaintLabels(true);
		sl_putanna12.setBounds(31, 143, 904, 40);
		getContentPane().add(sl_putanna12);

		sl_putanna13 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna13);
		sl_putanna13.setPaintTicks(true);
		sl_putanna13.setPaintLabels(true);
		sl_putanna13.setOpaque(false);
		sl_putanna13.setMinorTickSpacing(1);
		sl_putanna13.setBounds(31, 250, 904, 40);
		getContentPane().add(sl_putanna13);

		sl_putanna14 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna14);
		sl_putanna14.setPaintTicks(true);
		sl_putanna14.setPaintLabels(true);
		sl_putanna14.setOpaque(false);
		sl_putanna14.setMinorTickSpacing(1);
		sl_putanna14.setBounds(31, 356, 904, 40);
		getContentPane().add(sl_putanna14);

		sl_putanna15 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna15);
		sl_putanna15.setPaintTicks(true);
		sl_putanna15.setPaintLabels(true);
		sl_putanna15.setOpaque(false);
		sl_putanna15.setMinorTickSpacing(1);
		sl_putanna15.setBounds(31, 451, 904, 40);
		getContentPane().add(sl_putanna15);

		JLabel label_4 = new JLabel("Постійно");
		label_4.setForeground(Color.WHITE);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(6, 181, 102, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Постійно");
		label_5.setForeground(Color.WHITE);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(3, 288, 102, 14);
		getContentPane().add(label_5);

		JLabel label_10 = new JLabel("Постійно");
		label_10.setForeground(Color.WHITE);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(3, 394, 102, 14);
		getContentPane().add(label_10);

		JLabel label_15 = new JLabel("Постійно");
		label_15.setForeground(Color.WHITE);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(10, 494, 102, 14);
		getContentPane().add(label_15);

		JButton b_gotovo = new JButton("\u0413\u043E\u0442\u043E\u0432\u043E\r\n");
		b_gotovo.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		b_gotovo.setForeground(Color.DARK_GRAY);
		b_gotovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				i_sl_putanna2 = invector(ii_sl_putanna2);
				i_sl_putanna13 = invector(i_sl_putanna13);

				int i_antuvirus = ii_sl_putanna0 + ii_sl_putanna1 + i_sl_putanna2 + ii_sl_putanna3 + ii_sl_putanna4
						+ ii_sl_putanna5 + ii_sl_putanna6 + ii_sl_putanna7 + ii_sl_putanna8 + ii_sl_putanna9;

				int i_zalizo = ii_sl_putanna3 + ii_sl_putanna4 + ii_sl_putanna10 + ii_sl_putanna11 + i_sl_putanna13;

				int i_Internet = i_sl_putanna12 + i_sl_putanna13 + i_sl_putanna14 + i_sl_putanna15;

				new EC_Rezultatu(i_antuvirus, i_zalizo, i_Internet, ii_sl_putanna1, ii_sl_putanna8, i_sl_putanna12,
						i_sl_putanna13, i_sl_putanna14, i_sl_putanna15);

				setVisible(false);
			}
		});
		b_gotovo.setBounds(484, 517, 498, 36);
		getContentPane().add(b_gotovo);

		JButton b_nazad1 = new JButton("Назад");
		b_nazad1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		b_nazad1.setForeground(Color.DARK_GRAY);
		b_nazad1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC2("EC", ii_sl_putanna0, ii_sl_putanna1, i_sl_putanna2, ii_sl_putanna3, ii_sl_putanna4,
						ii_sl_putanna5, ii_sl_putanna6, ii_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, ii_sl_putanna10,
						ii_sl_putanna11, i_sl_putanna12, i_sl_putanna13, i_sl_putanna14, i_sl_putanna15);
				setVisible(false);

			}
		});
		b_nazad1.setBounds(0, 517, 486, 36);
		getContentPane().add(b_nazad1);

		JLabel label_3 = new JLabel("Ніколи");
		label_3.setForeground(Color.WHITE);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(826, 494, 116, 14);
		getContentPane().add(label_3);

		JLabel label_6 = new JLabel("Ніколи");
		label_6.setForeground(Color.WHITE);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(819, 394, 116, 14);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Ніколи");
		label_7.setForeground(Color.WHITE);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(819, 288, 116, 14);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("Ніколи");
		label_8.setForeground(Color.WHITE);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(822, 181, 116, 14);
		getContentPane().add(label_8);

		JLabel label = new JLabel(
				"Ви використовуєте збереження даних в Інтернеті (паролі, логіни, теми, віджети ...) ?");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(11, 409, 960, 34);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("У Вас є необхідність налаштовувати локальні мережі ?");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(36, 308, 906, 34);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Вас задовільняє швидкість Інтернету ?");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_2.setBounds(36, 203, 906, 34);
		getContentPane().add(label_2);

		JLabel label_9 = new JLabel("У Вас виникають проблеми із портами ?");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_9.setBounds(36, 96, 906, 34);
		getContentPane().add(label_9);

		JLabel label_11 = new JLabel("Діагностика");
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(Color.YELLOW);
		label_11.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		label_11.setBounds(0, 0, 982, 50);
		getContentPane().add(label_11);

		JLabel label_12 = new JLabel("Вам необхідно пройти опитування. Давайте відповіді якомога точніше.");
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(Color.WHITE);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_12.setBounds(0, 49, 982, 21);
		getContentPane().add(label_12);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("res/fon/fon_EC3.jpg"));
		label_20.setBounds(-10, 0, 992, 553);
		getContentPane().add(label_20);

		setVisible(true);

		sl_putanna12.addChangeListener(slider12);
		sl_putanna13.addChangeListener(slider13);
		sl_putanna14.addChangeListener(slider14);
		sl_putanna15.addChangeListener(slider15);

	}

	static int invector(int i_inv) {
		switch (i_inv) {
		case 0:
			i_inv = 10;
			break;
		case 1:
			i_inv = 9;
			break;
		case 2:
			i_inv = 8;
			break;
		case 3:
			i_inv = 7;
			break;
		case 4:
			i_inv = 6;
			break;
		case 5:
			i_inv = 5;
			break;
		case 6:
			i_inv = 4;
			break;
		case 7:
			i_inv = 3;
			break;
		case 8:
			i_inv = 2;
			break;
		case 9:
			i_inv = 1;
			break;
		case 10:
			i_inv = 0;
			break;
		}
		return i_inv;
	}

	class SliderListener12 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna12 = (JSlider) e.getSource();
			i_sl_putanna12 = (int) sl_putanna12.getValue();
		}
	}

	class SliderListener13 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna13 = (JSlider) e.getSource();
			i_sl_putanna13 = (int) sl_putanna13.getValue();
		}
	}

	class SliderListener14 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna14 = (JSlider) e.getSource();
			i_sl_putanna14 = (int) sl_putanna14.getValue();
		}
	}

	class SliderListener15 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna15 = (JSlider) e.getSource();
			i_sl_putanna15 = (int) sl_putanna15.getValue();
		}
	}

}
