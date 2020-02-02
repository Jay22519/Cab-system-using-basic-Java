package accounts ; 
import java.util.* ; 

public class login 
{
    Scanner input  = new Scanner(System.in) ; 
    int option = 0  ; 

    
    String password ; 
    int user_id  ;  
    String pass_chk ;    
    String dummy ;  
    int pass_checker = 1 ;  

    public int[] user_validater ; 

    int a = 1  , b ;   
    int flag = 0 ; 

    

    public void input_id() 
    {
        Registration r = new Registration() ;      
        user_validater = r.init() ; 
        System.out.println("Following User_id exist \n" + user_validater[0] + "\n" + user_validater[1] + "\n") ;  
        System.out.println("") ;
        System.out.println("Enter your user_id ") ;  
        user_id = input.nextInt() ;   

        if(user_validater[0] == user_id || user_validater[1] == user_id)
        {   System.out.println("") ;
            System.out.println("User exist") ;
            flag = 1 ;  
        }


    } 
    public void input_pass()
    {
        if(flag == 0)
        {       System.out.println("") ; 
                System.out.println("Enter your password"); 
                password = input.next() ;  
                Registration r2 = new Registration() ;   
                pass_chk = r2.pass_return(user_id) ; 
                while(a<=5  && (pass_checker == 1))  
                {
                    if(password.equals(pass_chk))
                    {
                        pass_checker = 0 ; 
                    }
                    else  
                    {
                        b = 5 - a ; 
                        System.out.println("You have entered wrong password");
                        System.out.println("YOu have "+ b +" more chances to enter"); 
                        a+=1 ; 
            
                        this.input_id(); 
                        this.input_pass(); 
            
                        
                    }

                } 

                if(a==6)
                {
                    System.out.println("") ;
                    System.out.println("MY mate you have entered wrong password");
                }
                else 
                {   
                    System.out.println("") ; 
                    System.out.println("Welcome");
                }
        }
    }

}