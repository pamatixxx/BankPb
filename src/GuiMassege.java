import javax.swing.*;
import java.awt.*;

public class GuiMassege extends JFrame {

    static String textMsg;
    static JFrame jFrame = getFrame();
    //создаем панель
    static JPanel jPanel = new JPanel();


    public GuiMassege() {
        JTextField jTextField = new JTextField();

        jFrame.add(jPanel);
        JTextField textField = new JTextField(textMsg);
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
    }

    private String paramString(JTextField textField) {
        return textMsg;
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setBounds(200, 200, 700, 200);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        return jFrame;
    }

}
