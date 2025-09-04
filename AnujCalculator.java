import java.awt.*;
import java.awt.event.*;

class Calculator extends WindowAdapter implements ActionListener {
    public Frame mainframe;
    public Button b1, b2, b3, b4;
    public TextField t1, t2;
    public Label lobj;
    Integer no1, no2;

    public Calculator(int Width, int height, String title) {
        mainframe = new Frame(title);
        mainframe.setSize(Width, height);
        mainframe.addWindowListener(this);

        b1 = new Button("ADD");
        b2 = new Button("SUB");
        b3 = new Button("MULTI");
        b4 = new Button("DIV");

        t1 = new TextField();
        t2 = new TextField();

        b1.setBounds(10, 200, 80, 40);
        b2.setBounds(100, 200, 80, 40);
        b3.setBounds(190, 200, 80, 40);
        b4.setBounds(290, 200, 80, 40);

        t1.setBounds(70, 100, 100, 40);
        t2.setBounds(220, 100, 100, 40);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);

        mainframe.add(t1);
        mainframe.add(t2);

        lobj = new Label();
        lobj.setBounds(150, 125, 200, 100);

        mainframe.add(lobj);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        mainframe.setLayout(null);
        mainframe.setVisible(true);
    } // end of constructor

    public void windowClosing(WindowEvent obj) {
        System.exit(0);
    }

    public void actionPerformed(ActionEvent aobj) {
        no1 = Integer.parseInt(t1.getText());
        no2 = Integer.parseInt(t2.getText());

        if (aobj.getSource() == b1) {
            lobj.setText("addition is :" + (no1 + no2));
        } else if (aobj.getSource() == b2) {
            lobj.setText("substraction is : " + (no1 - no2));
        } else if (aobj.getSource() == b3) {
            lobj.setText("multiplication is : " + (no1 * no2));
        } else if (aobj.getSource() == b4) {
            lobj.setText("division is : " + (no1 / no2));
        }
    }
}

class AnujCalculator {
    public static void main(String arg[]) {
        Calculator cobj = new Calculator(400, 400, "Marvellous PPA");
    }
}