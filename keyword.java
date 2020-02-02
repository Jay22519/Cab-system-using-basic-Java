import java.nio.file.WatchEvent;

import accounts.*;
import project1.*; 

import java.util.* ; 

public class keyword{ 


    public int[] before_members; 

    public static void register() 
    {
            Registration r = new Registration() ;  
            r.takeInput() ;   
            
            r.show(); 
     } 
    public static void login() 
    { 
            login l = new login() ;
            l.input_id() ; 
            l.input_pass(); 
            //l.validate();    
    }  
    
    public static void driver()
    {
        drivers d = new drivers() ;   
        d.get_driver_details();  

    }


    public static void route()
    {
            Route r = new Route() ; 
            r.choselocation();  
            r.calc_price(); 
    }
    
    public static void vehicle()
    {
        vehicles v  = new vehicles() ;   

        System.out.println("FOllowing are the vehicle type") ;
        System.out.println("") ; 
        v.show_vehicle_types();  
        System.out.println("") ; 
        System.out.println("Select  vehicle type"); 
        System.out.println("") ; 
        v.select_type();  

        System.out.println("") ;
        System.out.println("FOllowing are the vehicle in the" + v.type_selected + " are"); 
        System.out.println("") ;
        v.show_appropriate_vehicle(); 
        System.out.println("") ;
        System.out.println("Select vehicle");
        System.out.println("") ;
        v.select_vehicle(); 

        System.out.println("") ;
        System.out.println("Your Driver detail are ");
        driver(); 

    }

        
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in) ;  

        System.out.println("WElcome to our App"); 
        System.out.println("") ;

        System.out.println("Enter 1 to Login                                                 Enter 2 to Register"); 

        int a = input.nextInt() ; 
        int user_id ; 
        String password ;   

        //int register_done = 0 ;  

        int flag = 0 ; 

        if(a == 1)
        {
                login() ; 
        } 
        else if(a==2)
        {
                register();  

                System.out.println("Thank you for registering to our app"); 
                System.out.println("") ; 
                System.out.println("PLease login in to the app ,to book cab"); 
                login() ; 
        }

        else 
        {  
            while(flag == 0)
            {
                System.out.println("Errrr !!!! . Wrong entry by the user ");  
                System.out.println("Enter 1 to Login                                                 Enter 2 to Register");  
                 a = input.nextInt() ;    
                if(a == 1)
                {
                        login() ; 
                } 
                else if(a==2)
                {

                        register(); 
                } 
                    
                  
            } 

        }  

        route() ; 
        vehicle(); 
        

        


        

    }

}   