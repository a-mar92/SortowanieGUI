import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DrawFrame extends JFrame implements ActionListener {
    private ArrayList<Integer> numbers = new ArrayList<>();
    private JButton bExit, bSort;
    private JFrame myFrame;
    private JTextField imputNumbersTextArea;
    private JLabel numberInformation, sortedNumbers;
    private String inputedNumbersTextField;
    private String table[];
    private JButton bReset;
    private String[] numberStrings;
    int number;
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
        bReset = new JButton("Reset");
        sortedNumbers = new JLabel("");
        setTitle("sortowanie");
        setSize(390, 220);
        imputNumbersTextArea = new JTextField(null);
        setLayout(null);
        bExit.setBounds(12, 120, 100, 20);
        bReset.setBounds(132, 120, 100, 20);
        bSort.setBounds(250, 120, 100, 20);
        imputNumbersTextArea.setBounds(122, 17, 150, 20);
        numberInformation.setBounds(2, 12, 150, 30);
        sortedNumbers.setBounds(2, 50, 350, 30);
        add(bReset);
        add(bExit);
        add(bSort);
        add(imputNumbersTextArea);
        add(numberInformation);
        add(sortedNumbers);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bReset.addActionListener(this);
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
            if (!inputedNumbersTextField.equals("")){

                numberStrings = inputedNumbersTextField.split(",");

                for (String numberString : numberStrings) {
                    if (numberString.trim().isEmpty()){
                     number = 0;
                    }
else{
                    number = Integer.parseInt(numberString.trim());
                    numbers.add(number);
                }}
                Collections.sort(numbers);
                sortedNumbers.setText(String.valueOf(numbers));
                numbers.removeAll(numbers);
            }
            else {
                sortedNumbers.setText("enter Value");

            }
        } else if (source==bReset) {
            numbers.removeAll(numbers);
            imputNumbersTextArea.setText("");
            sortedNumbers.setText("");
        }



    }
}









