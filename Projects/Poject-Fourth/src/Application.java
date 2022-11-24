import javax.swing.JFrame; import javax.swing.JButton; import javax.swing.JOptionPane; import javax.swing.JList; import javax.swing.DefaultListModel; import javax.swing.JTextField;
import java.awt.event.ActionListener; import java.awt.event.ActionEvent;
import java.awt.Container; import java.awt.GridLayout;
public class Application extends JFrame { private final Store Store = new Store(); private final DefaultListModel<String> data = new DefaultListModel<>(); private final JTextField input = new JTextField("");
    public Application() { super("Watch store"); setBounds(0, 0, 300, 300); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); Container container = getContentPane(); container.setLayout(new GridLayout(8, 0 , 0 ,0));
        JButton ButtonOne = new JButton("Show all brands"); container.add(ButtonOne); ButtonOne.addActionListener(new ButtonEventListener());
        JList<String> list = new JList<>(data); container.add(list);
        JButton ButtonTwo = new JButton("The most expensive watches"); container.add(ButtonTwo); ButtonTwo.addActionListener(new ButtonEventListener());
        JButton ButtonThree = new JButton("The most popular brand"); container.add(ButtonThree); ButtonThree.addActionListener(new ButtonEventListener());
        JButton ButtonFour = new JButton("Set the hours on all watches"); container.add(ButtonFour); ButtonFour.addActionListener(new ButtonEventListener());
        container.add(input); }
    class ButtonEventListener implements ActionListener { public void actionPerformed(ActionEvent arg0) {
            if (arg0.getActionCommand().equals("The most expensive watches")) { String message = Store.getBiggestPrice();
                JOptionPane.showMessageDialog(null, message, "The most expensive watches", JOptionPane.PLAIN_MESSAGE); }
            if (arg0.getActionCommand().equals("The most popular brand")) { String message = Store.getMostPopularBrand();
                JOptionPane.showMessageDialog(null, message, "The most popular watches", JOptionPane.PLAIN_MESSAGE); }
            if (arg0.getActionCommand().equals("Set the hours on all watches")) { int value = Integer.parseInt(input.getText()); Store.setTimeAllWatches(Interface.Arrow.Hours, value);
                JOptionPane.showMessageDialog(null, "The watches is set to " + value + " o'clock", "Set the hours on all watches", JOptionPane.PLAIN_MESSAGE); }
            if (arg0.getActionCommand().equals("Show all brands")) { data.clear(); for (int value = 0; value < Store.size(); value++) { data.addElement(Store.getDataElements(value)); } } } } }


