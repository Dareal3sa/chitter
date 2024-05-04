package chitchanger;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exit extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					exit frame = new exit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public exit() {
		setTitle("Exit Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 533);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel proglbl = new JLabel("programssnamama");
		proglbl.setForeground(new Color(255, 255, 255));
		proglbl.setFont(new Font("Arial", Font.PLAIN, 25));
		proglbl.setBounds(44, 25, 330, 72);
		contentPane.add(proglbl);
		
		
		JLabel mem1 = new JLabel("New label");
		mem1.setForeground(new Color(255, 255, 255));
		mem1.setFont(new Font("Arial", Font.PLAIN, 20));
		mem1.setBounds(44, 119, 273, 72);
		contentPane.add(mem1);
		
		JLabel mem2 = new JLabel("New label");
		mem2.setForeground(Color.WHITE);
		mem2.setFont(new Font("Arial", Font.PLAIN, 20));
		mem2.setBounds(44, 203, 273, 72);
		contentPane.add(mem2);
		
		JLabel mem3 = new JLabel("New label");
		mem3.setForeground(Color.WHITE);
		mem3.setFont(new Font("Arial", Font.PLAIN, 20));
		mem3.setBounds(44, 296, 273, 72);
		contentPane.add(mem3);
		
		JLabel mem4 = new JLabel("New label");
		mem4.setForeground(Color.WHITE);
		mem4.setFont(new Font("Arial", Font.PLAIN, 20));
		mem4.setBounds(44, 379, 273, 72);
		contentPane.add(mem4);
		
		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
		
		okButton.setBounds(547, 379, 89, 72);
		contentPane.add(okButton);
	}
}
