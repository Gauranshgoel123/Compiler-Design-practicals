import java.util.Scanner;

public class exp4{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int space=0;
        int newline=0;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==' ')
                space++;
            else if(s.charAt(i)=='.')
                newline++;
        System.out.println(space);
        System.out.println(newline);
    }
}
