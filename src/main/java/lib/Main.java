package lib;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;

import com.colourpicker.ScreenColor;

@SuppressWarnings("serial")

public class Main extends JFrame {

	public Main() {

		setTitle("JColorPicker");

		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/images/color_picker.png")));

		ScreenColor panel = new ScreenColor(Color.BLACK);

		panel.setBackground(Color.WHITE);

		getContentPane().add(panel, BorderLayout.CENTER);

		setLocationRelativeTo(null);

		setSize(190, 80);

	}

	public static void main(String[] args) {

		try {

			new Main().setVisible(true);

		}

		catch (Exception e) {

		}

	}

}
