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

public class EC1 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JSlider sl_putanna4;
	private JSlider sl_putanna5;
	private JSlider sl_putanna6;
	private JSlider sl_putanna7;

	int i_sl_putanna4;
	int i_sl_putanna5;
	int i_sl_putanna6;
	int i_sl_putanna7;

	SliderListener4 slider4 = new SliderListener4();
	SliderListener5 slider5 = new SliderListener5();
	SliderListener6 slider6 = new SliderListener6();
	SliderListener7 slider7 = new SliderListener7();

	EC1(String s, final int ii_sl_putanna0, final int ii_sl_putanna1, final int ii_sl_putanna2,
			final int ii_sl_putanna3, int ii_sl_putanna4, int ii_sl_putanna5, int ii_sl_putanna6, int ii_sl_putanna7,
			final int ii_sl_putanna8, final int ii_sl_putanna9, final int ii_sl_putanna10, final int ii_sl_putanna11,
			final int ii_sl_putanna12, final int ii_sl_putanna13, final int ii_sl_putanna14,
			final int ii_sl_putanna15) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.i_sl_putanna4 = ii_sl_putanna4;
		this.i_sl_putanna5 = ii_sl_putanna5;
		this.i_sl_putanna6 = ii_sl_putanna6;
		this.i_sl_putanna7 = ii_sl_putanna7;

		sl_putanna4 = new JSlider(0, 0, 10, i_sl_putanna4);
		sl_putanna4.setOpaque(false);
		sl_putanna4.setMinorTickSpacing(1);
		sl_putanna4.setPaintTicks(true);
		sl_putanna4.setPaintLabels(true);
		sl_putanna4.setBounds(35, 136, 906, 40);
		getContentPane().add(sl_putanna4);

		sl_putanna5 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna5);
		sl_putanna5.setPaintTicks(true);
		sl_putanna5.setPaintLabels(true);
		sl_putanna5.setOpaque(false);
		sl_putanna5.setMinorTickSpacing(1);
		sl_putanna5.setBounds(35, 230, 906, 40);
		getContentPane().add(sl_putanna5);

		sl_putanna6 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna6);
		sl_putanna6.setPaintTicks(true);
		sl_putanna6.setPaintLabels(true);
		sl_putanna6.setOpaque(false);
		sl_putanna6.setMinorTickSpacing(1);
		sl_putanna6.setBounds(35, 332, 906, 40);
		getContentPane().add(sl_putanna6);

		sl_putanna7 = new JSlider(SwingConstants.HORIZONTAL, 0, 10, i_sl_putanna7);
		sl_putanna7.setPaintTicks(true);
		sl_putanna7.setPaintLabels(true);
		sl_putanna7.setOpaque(false);
		sl_putanna7.setMinorTickSpacing(1);
		sl_putanna7.setBounds(35, 438, 906, 40);
		getContentPane().add(sl_putanna7);

		JLabel label_4 = new JLabel("Постійно");
		label_4.setForeground(Color.WHITE);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(10, 174, 102, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Постійно");
		label_5.setForeground(Color.WHITE);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(8, 268, 102, 14);
		getContentPane().add(label_5);

		JLabel label_10 = new JLabel("Постійно");
		label_10.setForeground(Color.WHITE);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(10, 371, 102, 14);
		getContentPane().add(label_10);

		JLabel label_15 = new JLabel("Постійно");
		label_15.setForeground(Color.WHITE);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setBounds(10, 481, 102, 14);
		getContentPane().add(label_15);

		JLabel l_putanna0 = new JLabel("Комп'ютер працює повільніше ніж зазвичай ?");
		l_putanna0.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna0.setBounds(35, 96, 906, 34);
		l_putanna0.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna0.setForeground(Color.WHITE);
		getContentPane().add(l_putanna0);

		JLabel l_putanna1 = new JLabel("Мимоволі зникають файли, або з'являються підозрілі файли ?");
		l_putanna1.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna1.setBounds(35, 203, 906, 34);
		getContentPane().add(l_putanna1);
		l_putanna1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna1.setForeground(Color.WHITE);

		JLabel l_putanna2 = new JLabel("Відправляються файли та повідомлення без відома користувача ?");
		l_putanna2.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna2.setBounds(35, 308, 906, 34);
		getContentPane().add(l_putanna2);
		l_putanna2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna2.setForeground(Color.WHITE);

		JLabel l_putanna3 = new JLabel("Комп'ютер вимогає підключення до Інтернету ?");
		l_putanna3.setHorizontalAlignment(SwingConstants.CENTER);
		l_putanna3.setBounds(10, 409, 960, 34);
		getContentPane().add(l_putanna3);
		l_putanna3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l_putanna3.setForeground(Color.WHITE);

		JButton b_vpered1 = new JButton("Далі");
		b_vpered1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		b_vpered1.setForeground(Color.DARK_GRAY);
		b_vpered1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC2("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, i_sl_putanna4,
						i_sl_putanna5, i_sl_putanna6, i_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, ii_sl_putanna10,
						ii_sl_putanna11, ii_sl_putanna12, ii_sl_putanna13, ii_sl_putanna14, ii_sl_putanna15);
				setVisible(false);
			}
		});
		b_vpered1.setBounds(487, 517, 494, 36);
		getContentPane().add(b_vpered1);

		JButton b_nazad0 = new JButton("Назад");
		b_nazad0.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		b_nazad0.setForeground(Color.DARK_GRAY);
		b_nazad0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC("EC", ii_sl_putanna0, ii_sl_putanna1, ii_sl_putanna2, ii_sl_putanna3, i_sl_putanna4,
						i_sl_putanna5, i_sl_putanna6, i_sl_putanna7, ii_sl_putanna8, ii_sl_putanna9, ii_sl_putanna10,
						ii_sl_putanna11, ii_sl_putanna12, ii_sl_putanna13, ii_sl_putanna14, ii_sl_putanna15);
				setVisible(false);
			}
		});
		b_nazad0.setBounds(-1, 517, 494, 36);
		getContentPane().add(b_nazad0);

		JLabel label_3 = new JLabel("Ніколи");
		label_3.setForeground(Color.WHITE);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(825, 481, 116, 14);
		getContentPane().add(label_3);

		JLabel label_6 = new JLabel("Ніколи");
		label_6.setForeground(Color.WHITE);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(825, 371, 116, 14);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Ніколи");
		label_7.setForeground(Color.WHITE);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(823, 268, 116, 14);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("Ніколи");
		label_8.setForeground(Color.WHITE);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(825, 174, 116, 14);
		getContentPane().add(label_8);

		JLabel label = new JLabel("Вам необхідно пройти опитування. Давайте відповіді якомога точніше.");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(-1, 49, 982, 21);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Діагностика");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.YELLOW);
		label_1.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		label_1.setBounds(-1, 0, 982, 50);
		getContentPane().add(label_1);

		JLabel label_20 = new JLabel("");
		label_20.setIcon(new ImageIcon("res/fon/fon_EC1.jpg"));
		label_20.setBounds(-1, 0, 982, 553);
		getContentPane().add(label_20);

		setVisible(true);

		sl_putanna4.addChangeListener(slider4);
		sl_putanna5.addChangeListener(slider5);
		sl_putanna6.addChangeListener(slider6);
		sl_putanna7.addChangeListener(slider7);

	}

	class SliderListener4 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna4 = (JSlider) e.getSource();
			i_sl_putanna4 = (int) sl_putanna4.getValue();
		}
	}

	class SliderListener5 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna5 = (JSlider) e.getSource();
			i_sl_putanna5 = (int) sl_putanna5.getValue();
		}
	}

	class SliderListener6 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna6 = (JSlider) e.getSource();
			i_sl_putanna6 = (int) sl_putanna6.getValue();
		}
	}

	class SliderListener7 implements ChangeListener {
		public void stateChanged(ChangeEvent e) {
			sl_putanna7 = (JSlider) e.getSource();
			i_sl_putanna7 = (int) sl_putanna7.getValue();
		}
	}
}
