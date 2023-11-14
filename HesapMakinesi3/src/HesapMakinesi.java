import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HesapMakinesi {
    private double total=0.0;
    private double total2=0.0;
    private char math_operator;
    private JPanel HesapMakinesi;
    private JTextField textHesapMakinesi;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btnEpuals;
    private JList Jmetin;
    private JButton Jmod;

    private void getOperator (String btnText){
        math_operator=btnText.charAt(0);
        total=total+Double.parseDouble(textHesapMakinesi.getText());
        textHesapMakinesi.setText("");
    }


    public HesapMakinesi() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText=textHesapMakinesi.getText()+btnOne.getText();
                textHesapMakinesi.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText=textHesapMakinesi.getText()+btnTwo.getText();
                textHesapMakinesi.setText(btnTwoText);
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTreeText=textHesapMakinesi.getText()+btnThree.getText();
                textHesapMakinesi.setText(btnTreeText);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText=textHesapMakinesi.getText()+btnFour.getText();
                textHesapMakinesi.setText(btnFourText);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText=textHesapMakinesi.getText()+btnFive.getText();
                textHesapMakinesi.setText(btnFiveText);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText=textHesapMakinesi.getText()+btnSix.getText();
                textHesapMakinesi.setText(btnSixText);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText=textHesapMakinesi.getText()+btnSeven.getText();
                textHesapMakinesi.setText(btnSevenText);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText=textHesapMakinesi.getText()+btnEight.getText();
                textHesapMakinesi.setText(btnEightText);
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText=textHesapMakinesi.getText()+btnNine.getText();
                textHesapMakinesi.setText(btnNineText);
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText=textHesapMakinesi.getText()+btnZero.getText();
                textHesapMakinesi.setText(btnZeroText);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String button_text=btnPlus.getText();
              getOperator(button_text);

            }
        });
        btnEpuals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              switch (math_operator){
                  case '+':
                      total2=total+Double.parseDouble(textHesapMakinesi.getText());
                      break;
                  case '-':
                      total2=total-Double.parseDouble(textHesapMakinesi.getText());
                      break;
                  case '/':
                      total2=total/Double.parseDouble(textHesapMakinesi.getText());
                      break;
                  case '*':
                      total2=total*Double.parseDouble(textHesapMakinesi.getText());
                      break;
                  case '%':
                      total2=total%Double.parseDouble(textHesapMakinesi.getText());
                      break;


              }
              textHesapMakinesi.setText(Double.toString(total2));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                textHesapMakinesi.setText("");
            }
        });


        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textHesapMakinesi.getText().equals("")){
                    textHesapMakinesi.setText("0.");
                } else if (textHesapMakinesi.getText().contains(".")) {
                    btnPoint.setEnabled(false);
                }
                else{
                    String  btnPointText = textHesapMakinesi.getText() + btnPoint.getText();
                    textHesapMakinesi.setText(btnPointText);
                }
                btnPoint.setEnabled(true);

            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text=btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text =btnDivide.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        Jmod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HesapMakinesi");
        frame.setContentPane(new HesapMakinesi().HesapMakinesi);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
