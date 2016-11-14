//Below are the libraries that I imported for this project...
package main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

//extend the main class to JFrame
//import ActionListener lib..
public class Main extends JFrame implements ActionListener {
    // do the below dnt knw y yet The JFrame implements ActionListener
    private static final long serialVersionUID = 1L;
    
    public static void main(String[] args) {
    // create an object as shown below    
    new Main().setVisible(true);    
 
    }
   // create tis below to create stuffs 
    private Main(){
        // setTitle 
     super("CrownsTech Inc - Nyako Ephraim Alhamdu");
     setBackground(Color.BLUE);
     setSize(500,500);
      setResizable(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
    //set layout for the button 
      setLayout(new FlowLayout());//import FlowLayout lib also u can use Grid Layout or 
//BorderLayout the left is fo rows and right colums ie (10,1)
      // import the JButton library
      //creating new Button
      JButton buttonTwo = new JButton("TAP");//this is like making an object with the new initializer.Not too sure about that though sha...
      JButton button = new JButton("CLICK");
      // Adding stuffs to the MenuBar
      JMenuBar bar = new JMenuBar();//Setting MenuBar for app
      setJMenuBar(bar);
      //setting the MenuBar Titles
      JMenu file = new JMenu("File");//upNext putting things in the Menu
      JMenu crownsTech = new JMenu("CrownsTech inc");
      JMenu about = new JMenu("About");
// they are called JMenuItems
      //Forming components/items of the JMenu...JMenuItem
      JMenuItem open = new JMenuItem("Open");
      JMenuItem newMenuItem = new JMenuItem("New");
      JMenuItem save = new JMenuItem("Save");
      JMenuItem close = new JMenuItem("Close");
      JMenuItem crownsTechMedicine = new JMenuItem("CrownsTechMedicine");
      JMenuItem crownsTechRobotics = new JMenuItem("CrownsTechRobotics");
      JMenuItem crownsTechMechanics = new JMenuItem("CrownsTechMechanics");
      JMenuItem crownsTechMilitary = new JMenuItem("CrownsTechMilitary");
      JMenuItem crownyako = new JMenuItem("CrownYako");
      JMenuItem crownsTechinc = new JMenuItem("CrownsTech inc");
      add(button);//part of JFrame lib.//using BorderLayout we add layout positions
      add(buttonTwo);
        //do listener adding as below
//Adding components to the MenuTitle
      bar.add(file);//adding bar/Adding Components/JMenuItem of the JMenu(file) 
      file.add(newMenuItem);
      file.add(open);
      file.add(save);
      file.add(close);
      bar.add(crownsTech);//adds JMenuItem(s) to the (crownsTech)JMenu
      crownsTech.add(crownsTechMedicine);
      crownsTech.add(crownsTechRobotics);
      crownsTech.add(crownsTechMechanics);
      crownsTech.add(crownsTechMilitary);
      bar.add(about);//Adds the JMenuItem(s)to the (about)JMenu
      about.add(crownyako);
      about.add(crownsTechinc);
      
      buttonTwo.addActionListener(this);
      button.addActionListener(this);// passin "this" means pass d object
      //UP NXT actionListeners..
      // u go up and implement ActionListener after the extend(ing) 
    }
    //OutSide private Main()!!!
//choose to implement all And Do Stuffs...ie an option box comes out with an option to implement all and bla bla bla 
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //this is the method that is gonna call d btn
        
        //to make both btn do diff things with same one actionListener
        String name = e.getActionCommand();//write this to get name command frm user
        String num1 = e.getActionCommand(); 
        String num2 = e.getActionCommand();
        String average = e.getActionCommand();
        
        
        if (name.equals("CLICK")){
//            String name = new String("name");
                name = JOptionPane.showInputDialog(null,"What's Your name please : ");
        JOptionPane.showMessageDialog(null,name +" hello i will now welcome you PS check the IDE Editor to see output plus i'd show  a dialog");
        System.out.println( name+" <<WELCOME TO CrownsTech Inc>> ");// to add dis listener you hv to add it to d main component
        JOptionPane.showMessageDialog(null,name +" Let's do a simple calculus of average of two numbers ");
               num1 = JOptionPane.showInputDialog(null," Input First number : ");
               num2 = JOptionPane.showInputDialog(null," Input Second number : ");
              JOptionPane.showMessageDialog(null,"the average of  "+ num1 +" and "+num2+ " equals "+(Integer.parseInt(num1)+Integer.parseInt(num2))/2);//THIS IS WRONG MATH OPERATION! DEBUG IT
              // i parse the Strings num1 num2 to Int 
              JOptionPane.showMessageDialog(null,"let's do another maths operation hmm say a simple one ADDITION!");
               num1 = JOptionPane.showInputDialog(null," Input First number : ");
               num2 = JOptionPane.showInputDialog(null," Input Second number : ");
                JOptionPane.showMessageDialog(null,"the addition of  "+ num1 +" + "+num2+ " equals "+(Integer.parseInt(num1)  + Integer.parseInt(num2)));//THIS IS WRONG MATH OPERATION! DEBUG IT
        }
        
        
        else if(name.equals("TAP")){
                name = JOptionPane.showInputDialog(null,"What's Your name please : ");
        JOptionPane.showMessageDialog(null,name + " hello ANNA will now welcome you ");
        System.out.println(name +" << hello i am Anna WELCOME TO CrownsTech Inc >> ");// to add dis liisteener you hv to aad it to d main component
    // you can play with diff layout GridLayout, FlowLayout and so on
        JOptionPane.showMessageDialog(null,name + " Would you like to talk about Nyako Ephraim ?\n ");
        String aboutCrown = JOptionPane.showInputDialog(null,"write what you know about Crown Here:");
        JOptionPane.showMessageDialog(null," You said\n "+" Nyako Ephraim : "+ " " +aboutCrown);
        }
        
        
    }
    
    
}
