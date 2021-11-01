import javax.swing.JOptionPane;
public class Addition{
    public static void main(String[] args){
        float num1, num2, sum;
        String input1, input2; 
        input1= JOptionPane.showInputDialog("Your CAT MARK IS  ");
        input2= JOptionPane.showInputDialog("Your Exam MARK IS");
        //input3=JOptionPane.showInputDialog("MMU EXAM OFFICE /n ---------------- /n Your OOP2 Exam Total is 19");
        num1=Float.parseFloat(input1);
        num2=Float.parseFloat(input2);
        sum= num1+num2;
        JOptionPane.showMessageDialog(null, "MMU EXAM OFFICE \n ---------------------------------\n \n Your OOP2 Exam Total is " + sum, "", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    
}
