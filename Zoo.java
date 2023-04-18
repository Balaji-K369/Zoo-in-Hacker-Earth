import java.util.*;
public class Zoo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=0,k=0;
        String zoo=sc.nextLine();
        //String o=sc.nextInt();
        for(int i=0;i<zoo.length();i++){
        if(zoo.charAt(i)=='z'||zoo.charAt(i)=='Z')
            c++;
            else
            k++;
        }int a=2*c;
        if(a==k)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}