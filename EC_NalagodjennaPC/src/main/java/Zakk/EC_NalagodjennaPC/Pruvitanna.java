package Zakk.EC_NalagodjennaPC;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Pruvitanna extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel l_fon;

	public Pruvitanna(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Експертна система");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new EC("EC для налагодження ПК", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		lblNewLabel.setForeground(new Color(248, 248, 255));
		lblNewLabel.setFont(new Font("Monotype Corsiva", Font.BOLD, 55));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 400, 994, 43);
		getContentPane().add(lblNewLabel);

		JLabel label = new JLabel("для налагодження комп'ютера");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new EC("EC для налагодження ПК", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		label.setForeground(new Color(248, 248, 255));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Monotype Corsiva", Font.BOLD, 55));
		label.setBounds(0, 456, 994, 46);
		getContentPane().add(label);

		l_fon = new JLabel("");
		l_fon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new EC("EC для налагодження ПК", 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5);
				setVisible(false);
			}
		});
		l_fon.setIcon(new ImageIcon("res/fon/fon_pruvitanna.jpg"));
		l_fon.setBounds(-1, 0, 995, 565);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
