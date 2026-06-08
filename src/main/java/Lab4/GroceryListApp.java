package Lab4;

import javax.swing.*;
import java.awt.event.*;
import java.util.HashSet;
import java.util.Iterator;

public class GroceryListApp extends JFrame implements ActionListener {

    private JLabel lblEnterItem;
    private JTextField txtEnterItem;
    private JButton btnAdd, btnRemove, btnBought, btnView;

    private JList<String> listItems;
    private JScrollPane scrollPane;
    private DefaultListModel<String> listModel;
    private HashSet<String> grocerySet;

    GroceryListApp() {

        grocerySet = new HashSet<>();
        listModel = new DefaultListModel<>();

        setTitle("Grocery List");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        txtEnterItem = new JTextField();
        txtEnterItem.setBounds(20, 50, 150, 30);
        add(txtEnterItem);

        lblEnterItem = new JLabel("Enter Grocery Item");
        lblEnterItem.setBounds(180, 50, 150, 30);
        add(lblEnterItem);

        btnAdd = new JButton("Add Item");
        btnAdd.setBounds(20, 100, 150, 30);
        add(btnAdd);

        btnRemove = new JButton("Remove Item");
        btnRemove.setBounds(20, 150, 150, 30);
        add(btnRemove);

        btnBought = new JButton("Mark as Bought");
        btnBought.setBounds(20, 200, 150, 30);
        add(btnBought);

        btnView = new JButton("View List");
        btnView.setBounds(20, 250, 150, 30);
        add(btnView);

        listItems = new JList<>(listModel);
        scrollPane = new JScrollPane(listItems);
        scrollPane.setBounds(200, 100, 150, 190);
        add(scrollPane);

        btnAdd.addActionListener(this);
        btnRemove.addActionListener(this);
        btnBought.addActionListener(this);
        btnView.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String item = txtEnterItem.getText().trim();
        int indexSelected;

        // ADD
        if (e.getSource() == btnAdd) {

            if (!item.isEmpty()) {

                if (grocerySet.add(item)) {
                    listModel.addElement(item);
                    txtEnterItem.setText("");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Item already exists",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this,
                        "Item cannot be empty",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // REMOVE
        else if (e.getSource() == btnRemove) {

            indexSelected = listItems.getSelectedIndex();

            if (indexSelected != -1) {

                String itemToRemove = listModel.getElementAt(indexSelected);

                listModel.remove(indexSelected);
                grocerySet.remove(itemToRemove);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Select an item to remove",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // BOUGHT
        else if (e.getSource() == btnBought) {

            indexSelected = listItems.getSelectedIndex();

            if (indexSelected != -1) {

                String oldItem = listModel.getElementAt(indexSelected);

                // avoid double marking
                if (!oldItem.contains("(Bought)")) {

                    String newItem = oldItem + " (Bought)";

                    // update UI
                    listModel.set(indexSelected, newItem);

                    // update HashSet (IMPORTANT FIX)
                    grocerySet.remove(oldItem);
                    grocerySet.add(newItem);
                }

            } else {
                JOptionPane.showMessageDialog(this,
                        "Select an item to mark as bought",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // VIEW
        else if (e.getSource() == btnView) {

            String text = "";

            for (String items : grocerySet) {
                text += items + "\n";
            }

            JOptionPane.showMessageDialog(this,
                    "Grocery List:\n" + text,
                    "View List",
                    JOptionPane.INFORMATION_MESSAGE);
                    }
    }

    public static void main(String[] args) {
        new GroceryListApp();
    }
}