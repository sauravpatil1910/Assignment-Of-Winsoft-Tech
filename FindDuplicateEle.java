import java.util.Scanner;

public class FindDuplicateEle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the charecter");
        String string=scanner.next();
        int count;
        char convert[]=string.toCharArray();
      
        for(int i=0;i<convert.length;i++){
            count=1;
            for(int j=i+1;j<convert.length;j++){
                if(convert[i]==convert[j]&& convert[i]!=' '){
                    count++;
                    convert[j]='0';
                }
            }
            if(count>1&&convert[i]!='0'){
                System.out.println(convert[i] + "is duplicate charecter of String");

            }
        }



        
    }

    
}