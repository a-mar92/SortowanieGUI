import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DrawFrame extends JFrame implements ActionListener {
    ArrayList<Integer>numbers = new ArrayList<>();
    JButton bExit, bSort;
    JFrame myFrame;
    JTextField imputNumbersTextArea;
    JLabel numberInformation, sortedNumbers;
    String inputedNumbersTextField;
    String table [];
    public String getInputedNumbersTextField() {
        return inputedNumbersTextField;
    }


    public DrawFrame() {
        startProgram();
    }

    private void startProgram() {

        bExit = new JButton("Exit");
        bSort = new JButton("Sort");
        myFrame = new JFrame();
        numberInformation = new JLabel("Enter value to sort");
        sortedNumbers = new JLabel();
        setTitle("sortowanie");
        setSize(400, 250);
        imputNumbersTextArea = new JTextField("");
        setLayout(null);
        bExit.setBounds(2, 150, 100, 20);
        bSort.setBounds(250, 150, 100, 20);
        imputNumbersTextArea.setBounds(122, 17, 150, 20);
        numberInformation.setBounds(2, 12, 150, 30);
        sortedNumbers.setBounds(2, 50, 150, 30);
        add(bExit);
        add(bSort);
        add(imputNumbersTextArea);
        add(numberInformation);
        add(sortedNumbers);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bExit.addActionListener(this);
        bSort.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == bExit) {
            dispose();
        } else if (source == bSort) {
            inputedNumbersTextField = imputNumbersTextArea.getText();
            sortedNumbers.setText(inputedNumbersTextField);
           table = new String [inputedNumbersTextField.length()];
           table=inputedNumbersTextField.split(", ");
            for (String table:table) {
                int number = Integer.parseInt(table.trim());
                numbers.add(number);
            }
        }
//
//            Collections.sort(numbers);
            System.out.println(numbers);

        }
    }









