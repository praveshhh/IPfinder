import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class IPfinder extends JFrame implements ActionListener
	{
	JLabel l;
	JTextField tf;
	JButton b;
	IPfinder()
	{
	super("IP Finder Tool-pp");
	l=new JLabel("Enter URL:");
	l.setBounds(500,280,220,30);;
	tf=new JTextField ();
	tf.setBounds(500,320,260,30);
	b=new JButton("Find IP");
	b.setBounds(500,370,160,30);
	b.addActionListener(this);
	add(l);
	add(tf);
	add(b);
	setSize(900,800);
	setLayout(null);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
	String url=tf.getText();
	try
	{
	InetAddress ia=InetAddress.getByName(url);
	String ip=ia.getHostAddress();
	JOptionPane.showMessageDialog(this,ip);
	}
	catch(UnknownHostException e1)
	{
	JOptionPane.showMessageDialog(this,e1.toString());
	}
	}
	public static void main(String[] args)
	{
	new IPfinder();
	}
	}