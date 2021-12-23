import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Game extends JFrame {
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JPanel panelMain;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JTextField textField1_1;
    private JTextField textField2_2;
    private JTextField textField3_2;
    private JTextField textField4_6;
    private JButton checkButton;
    private JTextField textField1_2;
    private JTextField textField1_3;
    private JTextField textField1_5;
    private JTextField textField1_7;
    private JTextField textField1_10;
    private JTextField textField1_8;
    private JTextField textField1_6;
    private JTextField textField1_9;
    private JTextField textField1_4;
    private JTextField textField3_10;
    private JTextField textField2_8;
    private JTextField textField2_5;
    private JTextField textField2_7;
    private JTextField textField2_3;
    private JTextField textField2_6;
    private JTextField textField2_9;
    private JTextField textField2_10;
    private JTextField textField2_1;
    private JTextField textField2_4;
    private JTextField textField4_9;
    private JTextField textField4_1;
    private JTextField textField4_8;
    private JTextField textField4_2;
    private JTextField textField4_3;
    private JTextField textField4_10;
    private JTextField textField4_4;
    private JTextField textField4_7;
    private JTextField textField4_5;
    private JTextField textField3_1;
    private JTextField textField3_3;
    private JTextField textField3_4;
    private JTextField textField3_5;
    private JTextField textField3_6;
    private JTextField textField3_7;
    private JTextField textField3_8;
    private JTextField textField3_9;
    
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField chances;

    private int count = 0;
    private static int black = 0;
    private static int white = 0;
    private static ArrayList<String> secret = new ArrayList<>();
    private static ArrayList<String> selection = new ArrayList<>();
    private String comboBox1Selection;
    private String comboBox2Selection;
    private String comboBox3Selection;
    private String comboBox4Selection;

    public Game() {
        setContentPane(panelMain);
        setTitle("hello");
        setSize(800, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        textField1_1.setVisible(false);textField2_1.setVisible(false);textField3_1.setVisible(false);textField4_1.setVisible(false);textField1.setVisible(false);
        textField1_2.setVisible(false);textField2_2.setVisible(false);textField3_2.setVisible(false);textField4_2.setVisible(false);textField2.setVisible(false);
        textField1_3.setVisible(false);textField2_3.setVisible(false);textField3_3.setVisible(false);textField4_3.setVisible(false);textField3.setVisible(false);
        textField1_4.setVisible(false);textField2_4.setVisible(false);textField3_4.setVisible(false);textField4_4.setVisible(false);textField4.setVisible(false);
        textField1_5.setVisible(false);textField2_5.setVisible(false);textField3_5.setVisible(false);textField4_5.setVisible(false);textField5.setVisible(false);
        textField1_6.setVisible(false);textField2_6.setVisible(false);textField3_6.setVisible(false);textField4_6.setVisible(false);textField6.setVisible(false);
        textField1_7.setVisible(false);textField2_7.setVisible(false);textField3_7.setVisible(false);textField4_7.setVisible(false);textField7.setVisible(false);
        textField1_8.setVisible(false);textField2_8.setVisible(false);textField3_8.setVisible(false);textField4_8.setVisible(false);textField8.setVisible(false);
        textField1_9.setVisible(false);textField2_9.setVisible(false);textField3_9.setVisible(false);textField4_9.setVisible(false);textField9.setVisible(false);
        textField1_10.setVisible(false);textField2_10.setVisible(false);textField3_10.setVisible(false);textField4_10.setVisible(false);textField10.setVisible(false);

        // --------------------------------------------------------------------------------------------------------------------------------------------------------
        Random rand = new Random();
        String [] maker = new String[]{"red", "blue", "white", "yellow", "pink" , "purple"};
        for (int i = 0; i<4; i++){
            secret.add(maker[rand.nextInt(maker.length)]);
        }
        selection.add("color");
        selection.add("color");
        selection.add("color");
        selection.add("color");

        System.out.println(secret);

        // --------------------------------------------------------------------------------------------------------------------------------------------------------

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==comboBox1){
                    comboBox1Selection = comboBox1.getSelectedItem().toString().toLowerCase();
                    selection.set(0, comboBox1Selection);
                    System.out.println(comboBox1Selection);
                }
            }
        });
        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==comboBox2){
                    comboBox2Selection = comboBox2.getSelectedItem().toString().toLowerCase();
                    selection.set(1, comboBox2Selection);
                    System.out.println(comboBox2Selection);
                }
            }
        });
        comboBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==comboBox3){
                    comboBox3Selection = comboBox3.getSelectedItem().toString().toLowerCase();
                    selection.set(2, comboBox3Selection);
                    System.out.println(comboBox3Selection);
                }
            }
        });
        comboBox4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==comboBox4){
                    comboBox4Selection = comboBox4.getSelectedItem().toString().toLowerCase();
                    selection.set(3, comboBox4Selection);
                    System.out.println(comboBox4Selection);
                }
            }
        });

            chances.setText("Chances left: " + (10-count));
            checkButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    for (int i = 0; i<4; i++){
                        if (secret.get(i).equals(selection.get(i))) black++ ;
                    }
                    for (int i = 0; i<4; i++){
                        for (int j=0; j<4; j++){
                            if(secret.get(i).equals(selection.get(j))) {
                                white++;
                                i++ ;
                                break;
                            }
                        }
                    }

                    switch (count){
                        case 0 : textField1_1.setVisible(true);textField2_1.setVisible(true);textField3_1.setVisible(true);textField4_1.setVisible(true);textField1.setVisible(true);
                                textField1_1.setText(comboBox1Selection);textField2_1.setText(comboBox2Selection);
                                textField3_1.setText(comboBox3Selection);textField4_1.setText(comboBox4Selection);
                                textField1.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 1 : textField1_2.setVisible(true);textField2_2.setVisible(true);textField3_2.setVisible(true);textField4_2.setVisible(true);textField2.setVisible(true);
                                textField1_2.setText(comboBox1Selection);textField2_2.setText(comboBox2Selection);
                                textField3_2.setText(comboBox3Selection);textField4_2.setText(comboBox4Selection);
                                textField2.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 2 : textField1_3.setVisible(true);textField2_3.setVisible(true);textField3_3.setVisible(true);textField4_3.setVisible(true);textField3.setVisible(true);
                                textField1_3.setText(comboBox1Selection);textField2_3.setText(comboBox2Selection);
                                textField3_3.setText(comboBox3Selection);textField4_3.setText(comboBox4Selection);
                                textField3.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 3 : textField1_4.setVisible(true);textField2_4.setVisible(true);textField3_4.setVisible(true);textField4_4.setVisible(true);textField4.setVisible(true);
                                textField1_4.setText(comboBox1Selection);textField2_4.setText(comboBox2Selection);
                                textField3_4.setText(comboBox3Selection);textField4_4.setText(comboBox4Selection);
                                textField4.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 4 : textField1_5.setVisible(true);textField2_5.setVisible(true);textField3_5.setVisible(true);textField4_5.setVisible(true);textField5.setVisible(true);
                                textField1_5.setText(comboBox1Selection);textField2_5.setText(comboBox2Selection);
                                textField3_5.setText(comboBox3Selection);textField4_5.setText(comboBox4Selection);
                                textField5.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 5 : textField1_6.setVisible(true);textField2_6.setVisible(true);textField3_6.setVisible(true);textField4_6.setVisible(true);textField6.setVisible(true);
                                textField1_6.setText(comboBox1Selection);textField2_6.setText(comboBox2Selection);
                                textField3_6.setText(comboBox3Selection);textField4_6.setText(comboBox4Selection);
                                textField6.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 6 : textField1_7.setVisible(true);textField2_7.setVisible(true);textField3_7.setVisible(true);textField4_7.setVisible(true);textField7.setVisible(true);
                                textField1_7.setText(comboBox1Selection);textField2_7.setText(comboBox2Selection);
                                textField3_7.setText(comboBox3Selection);textField4_7.setText(comboBox4Selection);
                                textField7.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 7 : textField1_8.setVisible(true);textField2_8.setVisible(true);textField3_8.setVisible(true);textField4_8.setVisible(true);textField8.setVisible(true);
                                textField1_8.setText(comboBox1Selection);textField2_8.setText(comboBox2Selection);
                                textField3_8.setText(comboBox3Selection);textField4_8.setText(comboBox4Selection);
                                textField8.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 8 : textField1_9.setVisible(true);textField2_9.setVisible(true);textField3_9.setVisible(true);textField4_9.setVisible(true);textField9.setVisible(true);
                                textField1_9.setText(comboBox1Selection);textField2_9.setText(comboBox2Selection);
                                textField3_9.setText(comboBox3Selection);textField4_9.setText(comboBox4Selection);
                                textField9.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                        case 9 : textField1_10.setVisible(true);textField2_10.setVisible(true);textField3_10.setVisible(true);textField4_10.setVisible(true);textField10.setVisible(true);
                                textField1_10.setText(comboBox1Selection);textField2_10.setText(comboBox2Selection);
                                textField3_10.setText(comboBox3Selection);textField4_10.setText(comboBox4Selection);
                                textField10.setText(String.format("Black-%d \nWhite-%d", black, white));
                                break;
                    }
                    chances.setText("Chances to guess left: " + (9-count));
                    count++ ;
                    if (count>=10) {
                        chances.setText("You have no chances to guess!");
                    }
                    if (black == 4){
                        chances.setText("You got it!");
                    }
                    black = 0;
                    white = 0;
                    System.out.println(count);
                }
            });
        }

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Game game = new Game();
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
