import javax.swing.*;
import java.awt.event.*;

public class CharCountFauzan extends JFrame implements ActionListener {

    JLabel wordCountLabel;
    JTextArea textArea;
    JButton countButton;

    CharCountFauzan() {
        super("Word Count Tool");

        wordCountLabel = new JLabel("Word Count:");
        wordCountLabel.setBounds(50, 50, 100, 20);

        textArea = new JTextArea();
        textArea.setBounds(50, 110, 300, 200);

        countButton = new JButton("Count");
        countButton.setBounds(50, 320, 80, 30);
        countButton.addActionListener(this);

        add(wordCountLabel);
        add(textArea);
        add(countButton);

        setSize(400, 400);
        setLayout(null); // using no layout manager
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String text = textArea.getText();
            String words[] = text.split("\\s");
            wordCountLabel.setText("Word Count: " + words.length);
        }
    }

    public static void main(String[] args) {
        new CharCountFauzan();
    }
}