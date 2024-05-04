package chitchanger;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class dashboard1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField amountField;
	private JLabel stocksLabel;
	
	private int[] denominations = {500, 100, 50, 20, 10, 5, 1};
    private int[] stocks = {20, 20, 20, 20, 20, 20, 20};
	
	public dashboard1() {
		setTitle("Vending Machine");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new FlowLayout());
		setBounds(100, 100, 850, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu infoMenu = new JMenu("Info");
		menuBar.add(infoMenu);
		
		JMenuItem menuAppDesc = new JMenuItem("App Description");
		menuAppDesc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appDesc appD = new appDesc();
			      appD.setVisible(true);
			      appD.setLocationRelativeTo(null);
			      dispose();
			}
		});
		infoMenu.add(menuAppDesc);
		
		JMenuItem menuAlg = new JMenuItem("Algorithm used");
		menuAlg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appAlgo appA = new appAlgo();
			      appA.setVisible(true);
			      appA.setLocationRelativeTo(null);
			      dispose();
			}
		});
		infoMenu.add(menuAlg);
		
		JMenuItem menuBigO = new JMenuItem("Big-O notation");
		menuBigO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				appBigO appB = new appBigO();
			      appB.setVisible(true);
			      appB.setLocationRelativeTo(null);
			      dispose();
			}
		});
		infoMenu.add(menuBigO);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel stocksPanel = new JPanel();
		stocksPanel.setBounds(30, 49, 312, 321);
		contentPane.add(stocksPanel);
		stocksPanel.setLayout(null);
		
		//SA STOCKSSS
		stocksLabel = new JLabel(); 
		stocksLabel.setFont(new Font("Monospaced", Font.BOLD, 20));
	    stocksLabel.setLocation(7, 11);
	    stocksLabel.setSize(297, 299);
        updateStocksLabel();
		stocksPanel.add(stocksLabel);
		
		//SA CASHIER TYPE
		JPanel amtPanel = new JPanel();
		amtPanel.setBounds(454, 0, 380, 439);
		contentPane.add(amtPanel);
		amtPanel.setLayout(null);
		
		amountField = new JTextField();
		amountField.setFont(new Font("Impact", Font.PLAIN, 25));
		amountField.setBounds(25, 25, 330, 86);
		amtPanel.add(amountField);
		amountField.setColumns(10);
		
		//BUTTONS 0-9, CLEAR,BS,ENTER
			
			JButton btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn0.getText();
					amountField.setText(number);
					
				}
			});
			btn0.setForeground(Color.WHITE);
			btn0.setFont(new Font("Impact", Font.PLAIN, 30));
			btn0.setBackground(new Color(0, 0, 64));
			btn0.setBounds(25, 378, 206, 50);
			amtPanel.add(btn0);
			
			JButton btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn1.getText();
					amountField.setText(number);
					
				}
			});
			btn1.setForeground(Color.WHITE);
			btn1.setFont(new Font("Impact", Font.PLAIN, 30));
			btn1.setBackground(new Color(0, 0, 64));
			btn1.setBounds(25, 308, 50, 50);
			amtPanel.add(btn1);
			
			JButton btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn2.getText();
					amountField.setText(number);
					
				}
			});
			btn2.setForeground(Color.WHITE);
			btn2.setFont(new Font("Impact", Font.PLAIN, 30));
			btn2.setBackground(new Color(0, 0, 64));
			btn2.setBounds(105, 308, 50, 50);
			amtPanel.add(btn2);

			JButton btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn3.getText();
					amountField.setText(number);
					
				}
			});
			btn3.setForeground(Color.WHITE);
			btn3.setFont(new Font("Impact", Font.PLAIN, 30));
			btn3.setBackground(new Color(0, 0, 64));
			btn3.setBounds(181, 308, 50, 50);
			amtPanel.add(btn3);
			
			JButton btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn4.getText();
					amountField.setText(number);
					
				}
			});
			btn4.setForeground(Color.WHITE);
			btn4.setFont(new Font("Impact", Font.PLAIN, 30));
			btn4.setBackground(new Color(0, 0, 64));
			btn4.setBounds(25, 233, 50, 50);
			amtPanel.add(btn4);
			
			JButton btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn5.getText();
					amountField.setText(number);
					
				}
			});
			btn5.setForeground(Color.WHITE);
			btn5.setFont(new Font("Impact", Font.PLAIN, 30));
			btn5.setBackground(new Color(0, 0, 64));
			btn5.setBounds(105, 233, 50, 50);
			amtPanel.add(btn5);
			
			JButton btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn6.getText();
					amountField.setText(number);
					
				}
			});
			btn6.setForeground(Color.WHITE);
			btn6.setFont(new Font("Impact", Font.PLAIN, 30));
			btn6.setBackground(new Color(0, 0, 64));
			btn6.setBounds(181, 233, 50, 50);
			amtPanel.add(btn6);
			
			JButton btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn7.getText();
					amountField.setText(number);
					
				}
			});
			btn7.setFont(new Font("Impact", Font.PLAIN, 30));
			btn7.setForeground(new Color(255, 255, 255));
			btn7.setBackground(new Color(0, 0, 64));
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btn7.setBounds(25, 151, 50, 50);
			amtPanel.add(btn7);
			
			JButton btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn8.getText();
					amountField.setText(number);
					
				}
			});
			btn8.setForeground(Color.WHITE);
			btn8.setFont(new Font("Impact", Font.PLAIN, 30));
			btn8.setBackground(new Color(0, 0, 64));
			btn8.setBounds(105, 151, 50, 50);
			amtPanel.add(btn8);
			
			JButton btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String number = amountField.getText()+btn9.getText();
					amountField.setText(number);
					
				}
			});
			btn9.setForeground(Color.WHITE);
			btn9.setFont(new Font("Impact", Font.PLAIN, 30));
			btn9.setBackground(new Color(0, 0, 64));
			btn9.setBounds(181, 151, 50, 50);
			amtPanel.add(btn9);
			
			
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                try {
                    int amount = Integer.parseInt(amountField.getText());
                    if (amount <= 0) {
                        showError("Invalid amount. Please enter a positive value.");
                        return;
                    }
                    if (!hasSufficientStocks(amount)) {
                        showError("Insufficient chit stocks.");
                        return;
                    }
                    if (!ExactChange(amount)) {
                        showError("Cannot make exact change for this amount.");
                        return;
                    }

                    updateStocks(amount);
                    updateStocksLabel();

                    int[] chits = getChits(amount);
                    showChits(chits);
                } catch (NumberFormatException ex) {
                    showError("Invalid amount. Please enter valid amount.");
                }
			}
		});
		
		btnEnter.setForeground(Color.WHITE);
		btnEnter.setFont(new Font("Impact", Font.PLAIN, 20));
		btnEnter.setBackground(new Color(67, 92, 68));
		btnEnter.setBounds(255, 308, 100, 120);
		amtPanel.add(btnEnter);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountField.setText(null);
			}
		});
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Impact", Font.PLAIN, 20));
		btnClear.setBackground(new Color(112, 63, 63));
		btnClear.setBounds(255, 233, 100, 35);
		amtPanel.add(btnClear);
		
		JButton btnBSpace = new JButton("X");
		btnBSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace=null;
				
				if(amountField.getText().length()>0) {
					StringBuilder strB = new StringBuilder(amountField.getText());
					strB.deleteCharAt(amountField.getText().length()-1);
					backspace = strB.toString();
					amountField.setText(backspace);
					
					
				}
			}
		});
		btnBSpace.setForeground(new Color(0, 0, 0));
		btnBSpace.setFont(new Font("Arial Black", Font.PLAIN, 30));
		btnBSpace.setBackground(new Color(223, 175, 32));
		btnBSpace.setBounds(257, 151, 100, 50);
		amtPanel.add(btnBSpace);
		
		
		JButton btnNewButton = new JButton("Proceed");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(212, 381, 130, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_1.setBounds(30, 381, 130, 35);
		contentPane.add(btnNewButton_1);
		
        setVisible(true);
	}

	//methods, algo?
	
    private void updateStocksLabel() {
        StringBuilder stocksText = new StringBuilder();
        stocksText.append("<html><b>Stocks:</b><br>");
        for (int i = 0; i < denominations.length; i++) {
            stocksText.append(denominations[i]).append(": ").append(stocks[i]).append("<br>");
        }
        stocksText.append("</html>");
        stocksLabel.setText(stocksText.toString());
    }

    private boolean hasSufficientStocks(int amount) {
        for (int i = 0; i < denominations.length; i++) {
            if (amount / denominations[i] > stocks[i]) {
                return false;
            }
            amount %= denominations[i];
        }
        return true;
    }

    private boolean ExactChange(int amount) {
  	    int remaining = amount;  // tracker kada bawas sa stocks
  	    for (int i = 0; i < denominations.length; i++) {
  	        int usableCount = Math.min(remaining / denominations[i], stocks[i]);  // both stock and needed amount
  	        remaining -= usableCount * denominations[i];
  	    }
  	    return remaining == 0; 
  	}

    private void updateStocks(int amount) {
        for (int i = 0; i < denominations.length; i++) {
            stocks[i] -= amount / denominations[i];
            amount %= denominations[i];
        }
    }

    private int[] getChits(int amount) {
        int[] chits = new int[denominations.length];
        for (int i = 0; i < denominations.length; i++) {
            chits[i] = amount / denominations[i];
            amount %= denominations[i];
        }
        return chits;
    }

    private void showChits(int[] chits) {
        StringBuilder chitsText = new StringBuilder();
        chitsText.append("<html><b>Chits:</b><br>");
        for (int i = 0; i < denominations.length; i++) {
            if (chits[i] > 0) {
                chitsText.append(chits[i]).append(" x ").append(denominations[i]).append(" chit<br>");
            }
        }
        chitsText.append("</html>");
        JOptionPane.showMessageDialog(this, chitsText.toString(), "Chit Changed", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard1 frame = new dashboard1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
