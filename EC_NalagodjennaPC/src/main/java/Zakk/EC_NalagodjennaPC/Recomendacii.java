package Zakk.EC_NalagodjennaPC;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class Recomendacii extends JFrame {

	private static final long serialVersionUID = 1L;

	String s_recomendaia = "";

	public Recomendacii(int i) {
		setSize(1000, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 994, 565);
		getContentPane().add(scrollPane);

		switch (i) {
		case 1:
			s_recomendaia = "res/recomendacii/Відклюдження служб (комплексно).jpg";
			break;
		case 8:
			s_recomendaia = "res/recomendacii/Автозавантаження.PNG";
			break;
		case 12:
			s_recomendaia = "res/recomendacii/Порти (загально).jpg";
			break;
		case 13:
			s_recomendaia = "res/recomendacii/Швидкість Інтернету (загально) зменшено.jpg";
			break;
		case 14:
			s_recomendaia = "res/recomendacii/Локальні мережі (загально) зменшено.jpg";
			break;
		case 15:
			s_recomendaia = "res/recomendacii/Cookies (загально) зменшено.jpg";
			break;
		}

		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(s_recomendaia));
		scrollPane.setViewportView(label);

		setVisible(true);
	}
}
