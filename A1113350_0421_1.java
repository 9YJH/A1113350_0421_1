import java.util.*;
public class A1113350_0421_1{
    public static void main(String[] argv) {
    Scanner sc =new Scanner(System.in);
    String mail;
    boolean isMail;
    do{
        isMail=true;
        System.out.println("請輸入高雄大學電子郵件信箱格式：");
        mail=sc.next();
        if(mail.matches("a1[0-9][0-9]33[0-9][0-9]@mail.nuk.edu.tw")){
            System.out.println("信箱格式正確");
        }else{
            System.out.println("信箱格式錯誤");
            isMail=false;
        }
    }
    while(isMail==true);
}
}