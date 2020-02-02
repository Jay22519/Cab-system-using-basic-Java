package accounts;
import java.util.*;
public  class Registration
{
    //Include import java.util.Scanner;

    // Include import java.util.Random;

    //int q = Integer.MAX_VALUE ; It is showing error as an array con't be that large
    int [] user_check = new int[100000];

    static String [] name_array = new String[100000] ;
    static String [] password_array = new String[100000] ;

    static String [] mobile_number_array = new String[100000] ;
    static String [] email_array = new String[100000] ;


    Scanner input = new Scanner(System.in) ;

    String name  ;
    int  user_id ;
    String mobile_number  ;
    String email  ;
    String password  ;
    String dummy ;
    String confirm ;
    int mobile_length ;  
    int email_ver = 0 ;  
    int email_length ; 

    int user_a , user_b , user_c ; 
    public int [] init()
    {
        user_a = 1000 + (int)(Math.random()*9999) ;  
        user_b = 1000 + (int)(Math.random()*9999) ; 
        while(user_b == user_a)
        {
            user_b = 1000 + (int)(Math.random()*9999) ; 
        }
        user_c = 1000 + (int)(Math.random()*9999) ;  
        while((user_a == user_c) && (user_b == user_c))
        {
            user_c = 1000 + (int)(Math.random()*9999) ;  
        }  

        int[] user_list = new int[3] ; 
        user_list[0] = user_a ; 
        user_list[1] = user_b ; 
        user_list[2] = user_c ;  

        
        name_array[user_a] = "Jay"  ; 
        password_array[user_a] = "Jay22519" ; 
        mobile_number_array[user_a] = "8349381988" ; 
        email_array[user_a] = "jaypurig@gmail.com" ;  

        name_array[user_b] = "Abhishek" ; 
        password_array[user_b] = "abhishek55236" ; 
        mobile_number_array[user_b] = "4567239871" ; 
        email_array[user_b] = "abhishekjaiswal55236@gmail.com" ;  

        name_array[user_c] = "rishab"  ; 
        password_array[user_c] = "rishab69" ; 
        mobile_number_array[user_c] = "1234567891" ; 
        email_array[user_c] = "rishab69@gmail.com" ;  

        user_check[user_a] = 1 ; 
        user_check[user_b] = 1 ; 
        user_check[user_c] =  1 ; 


        return user_list ; 
    }

    Random rand = new Random() ; 



    public Registration()
    {
        user_id = 1000 + (int)(Math.random()*9999) ;
        while(user_check[user_id] ==1 || user_id == user_a || user_id ==user_b || user_id == user_c)
        {
            user_id = 1000 + (int)(Math.random()*9999) ;
        }
        user_check[user_id] =  1 ;

    }

    public void takeInput()
    {

        System.out.println("Enter your name");
        name = input.next() ; 
        while(name.length() == 0)
        {
            System.out.println("Enter valid name"); 
            name = input.next() ;  
        }

        System.out.println("") ;
        System.out.println("Enter your email-id");
        email = input.next() ; 
        email_length = email.length() ;  

        while(email.length() == 0)
        {
            System.out.println("") ;
            System.out.println("You have not entered email. Please enter it again");
            email = input.next() ;
        }
        System.out.println("") ;
        System.out.println("Enter your Mobile number");
        mobile_number = input.next() ;
        //mobile_length = String.valueOf(mobile_number).length() ;

        while(mobile_number.length() <=9 )
        {
            System.out.println("") ;
            System.out.println("You have not entered valid mobile number . Please enter it again ");
            mobile_number = input.next() ;
        }


        System.out.println("") ;
        System.out.println("Set your password(Atleast 8 characters)");
        dummy = input.nextLine() ;
        password = input.next() ;

        while(password.length()<8)
        {
            System.out.println("") ; 
            System.out.println("Enter valid password");
            password = input.next() ;
        }

        System.out.println("") ; 
        System.out.println("Confirm your password");
        confirm = input.next() ;

        while(!confirm.equals(password))
        {
            System.out.println("") ; 
            System.out.println("Your confirming password was wrong !!!!!!")  ;

            System.out.println("") ;
            System.out.println("Set your password");
            password = input.next() ;

            System.out.println("") ; 
            System.out.println("Confirm your password");
            confirm = input.next();
        }

        name_array[user_id] = name ;
        password_array[user_id] = password ;
        mobile_number_array[user_id] = mobile_number ;
        email_array[user_id] = email ;


    } // End of void function 

    public String pass_return(int chk)
    {
        
        return password_array[chk] ; 
    }

    public void show()
    {
        System.out.println("So following are you details. Type 1 if you confirm it or otherwise to fill the detail again type 0");
        System.out.print("You user id is\t " + user_id + "\n");
        System.out.print("You name is \t" + name_array[user_id] + "\n");
        System.out.print("Your password is \t" + password_array[user_id] + "\n");
        System.out.print("Your mboile number is \t" + mobile_number_array[user_id]  + "\n");
        System.out.print("Your email id is \t" + email_array[user_id] + "\n");

        int confirm ;
        confirm = input.nextInt() ;
        if(confirm == 1)
        {
            System.out.println("You have successfully registered to our app ");
        }
        else
        {
            dummy = input.nextLine() ;
            this.takeInput(); 
            this.show() ;
        }


    }

}  //End of  Registration class
