import java.util.Scanner;

public class Main {

    //Calculating the positional value of each char
    public static int letterSum(String name)
    {
        char[] nameArr=name.toCharArray();
        int i=0, sum=0;
        while(i<nameArr.length)
        {
            int intValue=nameArr[i];
            if(65<intValue&&intValue<90)
                sum=sum+(intValue-64);
            else
                sum=sum+(intValue-96);
                i++;
        }
        i=0;
        return sum;
    }

    //Calculating the sum of all digits until sum becomes one digit
    public static int digitSum(int num)
    {
        int finalSum=0;
        while(num%10!=0)
        {
            finalSum=finalSum+(num%10);
            num=num/10;
        }

        if(finalSum/10!=0)
        {
            finalSum=digitSum(finalSum);
        }

        return finalSum;
    }

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
            int sumOne=letterSum(firstName);
            int sumTwo=letterSum(secondName);          
            int finalSumOne=digitSum(sumOne);
            int finalSumTwo=digitSum(sumTwo);
            double ratio=0;

            if(finalSumOne>finalSumTwo)
            ratio=(double)finalSumTwo/finalSumOne;
            else
            ratio=(double)finalSumOne/finalSumTwo;

            System.out.println(String.format("%.2f", ratio*100)+"%");

         }

         sc.close();
        
    }
}
