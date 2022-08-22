public class Q1
{
    public static void main(String[] args) 
    {
        String word = "Hello";
        String x;
        for (int i=1; i<=10; i++)
        {
            if(i==1){x = "st";}
            else if(i==2){x = "nd";}
            else if(i==3){x = "rd";}
            else{x = "th";}
            System.out.println(i+x+" "+word);
        }
    }
}