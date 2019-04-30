import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTypeBanknote {

    //получаем фрейм
    static JFrame jFrame = getFrame();
    //создаем панель
    static JPanel jPanel = new JPanel();
    //определяем тип валюты
    static String typeCurrency = "";
    static String msg = "Выберите желаемую валюту:";

    //блок выбора валюты - фрейм
    public GuiTypeBanknote() {
        JTextField jTextField = new JTextField();

        jFrame.add(jPanel);
        JTextField textField = new JTextField(msg);
        //создаем контейнер для ввода пин кода
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);


        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx = 0;
        constraints1.weighty = 0;
        constraints1.gridx = 0;
        constraints1.gridy = 0;
        constraints1.gridheight = 1;
        constraints1.gridwidth = 0;
        jPanel.add(new JLabel(paramString(textField)), constraints1);

        jFrame.add(jPanel);
        //GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButton UAH = new JRadioButton("UAH");
        buttonGroup.add(UAH);
        jPanel.add(UAH);
        // UAH.setSelected(true);
        UAH.addActionListener(new MyListener());
        UAH.setActionCommand("UAH");

        JRadioButton RUR = new JRadioButton("RUR");
        jPanel.add(RUR);
        buttonGroup.add(RUR);
        RUR.addActionListener(new MyListener());
        RUR.setActionCommand("RUR");

        JRadioButton USD = new JRadioButton("USD");
        jPanel.add(USD);
        buttonGroup.add(USD);
        USD.addActionListener(new MyListener());
        USD.setActionCommand("USD");

        JButton button = new JButton("OK");
        jPanel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                System.out.println("Type currancy : " + typeCurrency);
                if (typeCurrency != "")
                    new GuiBanknote();
                // else System.out.println(Validation.msg);

            }
        });

    }

    private String paramString(JTextField textField) {
        return msg;
    }

    //сам фрейм
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(200, 200, 350, 200);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

    //слушатель
    public class MyListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            AbstractButton aButton = (AbstractButton) e.getSource();
            System.out.println("Selected: " + aButton.getText());
            // System.out.println(e);
            if (e.getActionCommand().equals("UAH")) typeCurrency = "UAH";
            else if (e.getActionCommand().equals("RUR")) typeCurrency = "RUR";
            else if (e.getActionCommand().equals("USD")) typeCurrency = "USD";
            else {
            }

        }
    }

}
