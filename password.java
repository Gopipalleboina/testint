import java.util.*;
public class password{
    static String validate(String password){
        if(password.length()<10 || password.length()>20){
            return "password length must be between 10 or 20 letters";
        }
        boolean hasDigit=false;
        boolean hasSpecialChar=false;
        String specialcharacters="!@#$";
        boolean hasLetters=false;
        boolean hasOthers=false;
        for(char c:password.toCharArray()){
            if(Character.isDigit(c)){
                hasDigit=true; 
            }
            if(specialcharacters.contains(String.valueOf(c))){
                hasSpecialChar=true;;
            }
            if(Character.isLetter(c)){
                hasLetters=true; 
            }
          else if (!Character.isLetterOrDigit(c) && !specialcharacters.contains(String.valueOf(c))) {
    hasOthers=true;
 }
        }
            if(!hasDigit){
               return "Password must contain at least one digit";
            }
            if(!hasSpecialChar){
                return "Password must contain at least one special character";
            }
            if(!hasLetters){
               return "Password must contain at least one letter";
            }
            if(!hasOthers){
            return "Password must contain at least one other (invalid) character";
        }
            return "valid password";
        
    }
       
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // String mobilenumber=sc.nextLine();
         String password=sc.nextLine();
         System.out.println(validate(password));
     }   
    
}