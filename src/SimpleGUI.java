import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SimpleGUI extends JFrame {
    BubleSort bSort = new BubleSort();
    Insertionsort insSort = new Insertionsort();
    CocktailSort cSort = new CocktailSort();
    GnomeSort gSort = new GnomeSort();
    SelectionSort sSort = new SelectionSort();
    private JButton button2 = new JButton("Sort");
    private JButton button1 = new JButton("Random");
    private JTextField input = new JTextField("", 5);
    private JTextField number = new JTextField("",5);
    private JLabel label = new JLabel("Input:");
    private JLabel label2 = new JLabel("Number of random elements:");
    private JRadioButton radio1 = new JRadioButton("Gnome sort");
    private JRadioButton radio2 = new JRadioButton("Cocktail sort");
    private JRadioButton radio3 = new JRadioButton("Insertion sort");
    private JRadioButton radio5 = new JRadioButton("Selection sort");
    private JRadioButton radio4 = new JRadioButton("Bubble sort");
    Font font1 = new Font("Times New Roman", Font.ITALIC, 12);

    public SimpleGUI() {
        super("Sorting Programm");
        CustomPrintStream printStream = new CustomPrintStream();
        System.setOut(printStream);
        this.setBounds(100, 100, 350, 150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4, 2, 2, 2));
        container.add(label);
        container.add(input);
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add(radio3);
        group.add(radio4);
        group.add(radio5);
        container.add(radio1);
        radio1.setSelected(true);
        container.add(radio2);
        container.add(radio3);
        container.add(radio4);
        container.add(radio5);
        button2.addActionListener(new Button2EventListener());
        container.add(button1);
        container.add(button2);
        button1.addActionListener(new Button1EventListener());
        number.setFont(font1);
        container.add(label2);
        container.add(number);
    }

    class Button2EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(radio1.isSelected()){
                String arr = input.getText();
                String[] items = arr.split(" ");

                int[] array = new int[items.length];

                for (int i = 0; i < items.length; i++) {
                    try {
                        array[i] = Integer.parseInt(items[i]);
                    } catch (NumberFormatException nfe) {};
                }
                gSort.gnomeSort(array);

            }
            else if(radio2.isSelected()){
                String arr = input.getText();
                String[] items = arr.split(" ");

                int[] array = new int[items.length];

                for (int i = 0; i < items.length; i++) {
                    try {
                        array[i] = Integer.parseInt(items[i]);
                    } catch (NumberFormatException nfe) {};
                }
                cSort.cocktailSort(array);
            }
            else if(radio3.isSelected()){
                String arr = input.getText();
                String[] items = arr.split(" ");

                int[] array = new int[items.length];

                for (int i = 0; i < items.length; i++) {
                    try {
                        array[i] = Integer.parseInt(items[i]);
                    } catch (NumberFormatException nfe) {};
                }
                insSort.insertionSort(array);
            }
            else if(radio4.isSelected()) {
                String arr = input.getText();
                String[] items = arr.split(" ");

                int[] array = new int[items.length];

                for (int i = 0; i < items.length; i++) {
                    try {
                        array[i] = Integer.parseInt(items[i]);
                    } catch (NumberFormatException nfe) {};
                }
                bSort.BubbleSort(array);
            }
            else if(radio5.isSelected()){
                String arr = input.getText();
                String[] items = arr.split(" ");

                int[] array = new int[items.length];

                for (int i = 0; i < items.length; i++) {
                    try {
                        array[i] = Integer.parseInt(items[i]);
                    } catch (NumberFormatException nfe) {};
                }
                sSort.main(array);
            }
        }
    }
    private String IntArrayToString(int[] array) {
        String strRet="";
        for(int i : array) {
            strRet+=Integer.toString(i)+" ";
        }
        return strRet;
    }
    class Button1EventListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(number.getText().trim().length() > 0){
                int n = Integer.parseInt(number.getText());
                int[] array = new int[n];
                String sssd = "";
                for (int i = 0; i < array.length; i++) {
                    array[i] = i;
                }

                Random rnd = new Random();
                for (int i = array.length - 1; i > 0; i--) {
                    int j = rnd.nextInt(i);
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
                input.setText(IntArrayToString(array));
            }
            else{
                JOptionPane.showMessageDialog(null,"Please enter number");


        }}

    }
    public static void main(String[] args) {
        SimpleGUI app = new SimpleGUI();
        app.setVisible(true); int n,arr[];


    }
}
