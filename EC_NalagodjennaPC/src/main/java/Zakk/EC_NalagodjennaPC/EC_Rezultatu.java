package Zakk.EC_NalagodjennaPC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EC_Rezultatu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel l_fon;

	private String s_antuvirus = "";
	private String s_zalizo = "";
	private String s_Internet = "";

	public EC_Rezultatu(int i_antuvirus, int i_zalizo, int i_Internet, int ii_sl_putanna1, int ii_sl_putanna8,
			int i_sl_putanna12, int i_sl_putanna13, int i_sl_putanna14, int i_sl_putanna15) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Пройти знову");
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new EC("EC", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(218, 522, 593, 43);
		getContentPane().add(btnNewButton);

		if (i_antuvirus <= 33) {
			s_antuvirus = "критичний.";
		} else {
			if (i_antuvirus <= 66) {
				s_antuvirus = "небезпечний.";
			} else {
				s_antuvirus = "добрий.";
			}
		}

		if (i_zalizo <= 25) {
			s_zalizo = "небезпечний.";
		} else {
			s_zalizo = "добрий.";
		}

		if (i_Internet <= 20) {
			s_Internet = "небезпечний.";
		} else {
			s_Internet = "добрий.";
		}

		System.out.println(i_antuvirus + " " + i_zalizo + " " + i_Internet + " " + i_sl_putanna12 + " " + i_sl_putanna13
				+ " " + i_sl_putanna14 + " " + i_sl_putanna15);

		// JTextPane textPane = new JTextPane();
		// textPane.setForeground(Color.ORANGE);
		// textPane.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		// textPane.setText(s_Zdatni);
		// textPane.setBounds(14, 289, 341, 222);
		// getContentPane().add(textPane);
		//
		// JTextPane textPane_1 = new JTextPane();
		// textPane_1.setForeground(Color.ORANGE);
		// textPane_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		// textPane_1.setText(s_Ruzuk);
		// textPane_1.setBounds(641, 367, 341, 145);
		// getContentPane().add(textPane_1);

		JLabel lblNewLabel = new JLabel("Актуальний стан комп'ютера:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		lblNewLabel.setBounds(218, 0, 593, 43);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("Стан антивірусного захисту: " + s_antuvirus);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 255, 255));
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label.setBounds(218, 72, 593, 43);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Стан апаратної частини: " + s_zalizo);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 255, 255));
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label_1.setBounds(218, 151, 593, 43);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Стан Інтернет з'єднання: " + s_Internet);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 255, 255));
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label_2.setBounds(218, 230, 593, 43);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Також Вам необхідно використати :");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 255, 0));
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label_3.setBounds(218, 299, 593, 43);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Відключення служб");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Recomendacii(1);
			}
		});
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.YELLOW);
		label_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label_4.setBounds(139, 355, 371, 43);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Автозавантаження");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Recomendacii(8);
			}
		});
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.YELLOW);
		label_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label_5.setBounds(139, 411, 371, 43);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("Порти");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Recomendacii(12);
			}
		});
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.YELLOW);
		label_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label_6.setBounds(522, 355, 371, 43);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Швидкість Інтернету");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Recomendacii(13);
			}
		});
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.YELLOW);
		label_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label_7.setBounds(522, 411, 371, 43);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("Локальні мережі");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Recomendacii(14);
			}
		});
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.YELLOW);
		label_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		label_8.setBounds(139, 467, 371, 43);
		getContentPane().add(label_8);

		JLabel lblCookies = new JLabel("Cookies");
		lblCookies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Recomendacii(15);
			}
		});
		lblCookies.setHorizontalAlignment(SwingConstants.CENTER);
		lblCookies.setForeground(Color.YELLOW);
		lblCookies.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 25));
		lblCookies.setBounds(522, 467, 371, 43);
		getContentPane().add(lblCookies);

		l_fon = new JLabel("");
		// l_fon.setIcon(new
		// ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\fon_rezultatu.jpg"));
		l_fon.setIcon(new ImageIcon("res/fon/fon_rezultatu.jpg"));
		l_fon.setBounds(-1, 0, 995, 565);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
