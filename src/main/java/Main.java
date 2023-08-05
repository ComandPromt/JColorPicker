

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

import com.colourpicker.ScreenColor;

@SuppressWarnings("serial")

public class Main extends JFrame {

	public Main() {

		ScreenColor panel = new ScreenColor(Color.BLACK);

		panel.setBackground(Color.WHITE);

		getContentPane().add(panel, BorderLayout.CENTER);

		setLocationRelativeTo(null);

		setSize(165, 80);

	}

	public static void main(String[] args) {
		try {
			new Main().setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
