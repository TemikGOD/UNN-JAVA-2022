package org.example; import javax.swing.JFrame; import javax.swing.JButton; import javax.swing.JOptionPane; import java.awt.Dimension; import java.awt.Container; import java.awt.GridLayout; import java.awt.Toolkit; import java.awt.event.ActionListener; import java.awt.event.ActionEvent;

public class Application extends JFrame { private final Store Store = new Store(); GSON GSON = new GSON();
    public Application() { super("Serializable"); Dimension applicationSize = new Dimension(310, 200); setSize(applicationSize.width, applicationSize.height); setResizable(false); setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); Container container = getContentPane(); container.setLayout(new GridLayout(2, 0 , 0 ,0)); JButton ButtonOne = new JButton("Read / Write - First Method"); container.add(ButtonOne); ButtonOne.addActionListener(new ButtonEventListener()); JButton ButtonTwo = new JButton("Read / Write - GSON Method"); container.add(ButtonTwo); ButtonTwo.addActionListener(new ButtonEventListener()); Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); setLocation((int) (screenSize.width * 0.5 - applicationSize.width * 0.5), (int) (screenSize.height * 0.5 - applicationSize.height * 0.5)); }

    class ButtonEventListener implements ActionListener { public void actionPerformed(ActionEvent arg0) {
        if (arg0.getActionCommand().equals("Read / Write - First Method"))
        { Write.write(Store.list, true); Read.read(true); JOptionPane.showMessageDialog(null, "Read and Write Completed, Look at the Console", "First Method", JOptionPane.PLAIN_MESSAGE); }
        if (arg0.getActionCommand().equals("Read / Write - GSON Method"))
        { String itemJSON = GSON.writeJson(Store.list, true); GSON.readJson(itemJSON, true); JOptionPane.showMessageDialog(null, "Read and Write Completed, Look at the Console", "GSON Method", JOptionPane.PLAIN_MESSAGE); } } } }
