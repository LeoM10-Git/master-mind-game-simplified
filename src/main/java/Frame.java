//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import java.util.Random;
//
//public class Frame extends JFrame {
//    private JPanel panelMain;
//    private JButton button1;
//    private static ArrayList<String> secret = new ArrayList<>();
//    private static ArrayList<String> selection = new ArrayList<>();
//    private static String [] colorSelection= new String[]{"red", "blue", "white", "yellow", "pink" , "purple"};
//    private static String [] maker= new String[]{"Color Selection", "Red", "Blue", "White", "Yellow", "Pink" , "Purple"};
//    JComboBox comboBox1 = new JComboBox(maker);
//    JComboBox comboBox2 = new JComboBox(maker);
//    JComboBox comboBox3 = new JComboBox(maker);
//    JComboBox comboBox4 = new JComboBox(maker);
//    JButton checkButton = new JButton("check");
//    JTextPane textPane1 = new JTextPane();
//    private String comboBox1Selection;
//    private String comboBox2Selection;
//    private String comboBox3Selection;
//    private String comboBox4Selection;
//
//    public Frame() {
//
//        setSize(800, 200);
//        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        setLayout(new FlowLayout());
//        this.add(comboBox1);
//        this.add(comboBox2);
//        this.add(comboBox3);
//        this.add(comboBox4);
//        this.add(checkButton);
//        setVisible(true);
//        this.add(textPane1);
//        textPane1.setVisible(false);
//
//
//        comboBox1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource()==comboBox1){
//                    comboBox1Selection = comboBox1.getSelectedItem().toString().toLowerCase();
//                    selection.add(comboBox1Selection);
//                    System.out.println(comboBox1Selection);
//                }
//            }
//        });
//        comboBox2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource()==comboBox2){
//                    comboBox2Selection = comboBox2.getSelectedItem().toString().toLowerCase();
//                    selection.add(comboBox2Selection);
//                    System.out.println(comboBox2Selection);
//                }
//            }
//        });
//        comboBox3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource()==comboBox3){
//                    comboBox3Selection = comboBox3.getSelectedItem().toString().toLowerCase();
//                    selection.add(comboBox3Selection);
//                    System.out.println(comboBox3Selection);
//                }
//            }
//        });
//        comboBox4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if (e.getSource()==comboBox4){
//                    comboBox4Selection = comboBox4.getSelectedItem().toString().toLowerCase();
//                    selection.add(comboBox4Selection);
//                    System.out.println(comboBox4Selection);
//                }
//            }
//        });
//        checkButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textPane1.setVisible(true);
//                textPane1.setText(comboBox1Selection);
//
//            }
//        });
//
//
//
//    }
//
//    public static void main(String[] args) {
//        Frame frame = new Frame();
//        Random rand = new Random();
//        for (int i = 0; i<4; i++){
//            secret.add(colorSelection[rand.nextInt(colorSelection.length)]);
//        }
//        System.out.println(secret);
//    }
//
//}

