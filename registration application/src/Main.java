
import java.util.regex.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 1 to register & 2 to Login");
        while(true){
        Scanner logReg=new Scanner(System.in);
            int regorlog= logReg.nextInt();
            if(regorlog==1){
                System.out.println("Enter Your Email:");
                while(true){
                    Scanner email=new Scanner(System.in);
                    String mail=email.next();
                    String regmail="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
                    Pattern petmail=Pattern.compile(regmail);
                    Matcher matchmail=petmail.matcher(mail);
                    if(matchmail.matches()) {
                        System.out.println("Enter phone Number:");
                        while (true) {
                            Scanner phone = new Scanner(System.in);
                            String phn = phone.next();
                            String regphone = "^(\\+968|968)[79][0-9]{7}$";
                            Pattern petphone = Pattern.compile(regphone);
                            Matcher matchphone = petphone.matcher(phn);
                            if(matchphone.matches()){
                                System.out.println("Enter Name");
                                Scanner userName=new Scanner(System.in);
                                String UsrName = userName.next();
                                System.out.println("Enter Password:");
                                Scanner PWD=new Scanner(System.in);
                                String pwd = PWD.next();
                                System.out.println("Thanks for Register on our System");

                            }
                            else System.out.println("Enter valid phone");
                        }

                    }
                    else{
                        System.out.println("Enter Valid Mail");

                        }
                }
            }
            else if(regorlog==2){
                System.out.println("Plz Enter your Email");
                Scanner logMail=new Scanner(System.in);
                String logmail=logMail.next();
                System.out.println("Plz Enter your Password");
                Scanner logPwd=new Scanner(System.in);
                String logpwd=logPwd.next();


            }
        }



    }

}
