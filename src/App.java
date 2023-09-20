//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Taking line input as String
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine())
        {
            String firstName=sc.nextLine();
            if(firstName==null||firstName.isEmpty())
            {
                break;
            }
            String secondName=sc.nextLine();
            
            //COnverting String to Char array
            char[] firstNameArr=firstName.toCharArray();
            char[] secondNameArr=secondName.toCharArray();
            int i=0;
            int sumOne=0, sumTwo=0;
            
            //Calculating the positional value of each char
            while(i<firstNameArr.length)
            {
                int intValue=firstNameArr[i];
                
                if(65<intValue&&intValue<90)
                sumOne=sumOne+(intValue-64);
                else
                sumOne=sumOne+(intValue-96);
                i++;
            } 
            
            i=0;
            while(i<secondNameArr.length)
            {
                int intValue=firstNameArr[i];
                
                if(65<intValue&&intValue<90)
                sumTwo=sumTwo+(intValue-64);
                else
                sumTwo=sumTwo+(intValue-96);
                i++;
            } 
            System.out.println(sumOne);
            System.out.println(sumTwo);
         }

         sc.close();

        
    }
}
