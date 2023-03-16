import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class DrawFrame extends JFrame implements ActionListener {

    private JButton bPrintInfo, bExit;

    public DrawFrame(){
        dzialanie();
    }

    private void dzialanie() {
        setTitle("Sortowanie");
        setSize(450,200);
        bPrintInfo = new JButton("Naciśnij");
        setLayout(null);
        bPrintInfo.setBounds(230,125,200,25);
        add(bPrintInfo);
        setVisible(true);
        bExit = new JButton("Exit");
        bExit.setBounds(1,125,200,25);
        add(bExit);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bPrintInfo.addActionListener(this);
        bExit.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object sourse = e.getSource();
        if (sourse == bPrintInfo){
                System.out.println("Nacisk");
    } else if (sourse == bExit) {
            System.out.println("Koniec programu Wyjście");
           dispose();

        }

    }
}