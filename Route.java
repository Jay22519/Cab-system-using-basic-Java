package project1;

import java.util.Scanner;


    public class Route
    {
        Scanner input = new Scanner(System.in) ;

        String intitial_code  ;
        String final_code  ;
        String via ;
        String dummy ;
        int payment = 0 ;
        int via_code ; 
        //char checker ; 

        String [] places = {"A","B","C","D","E","F","G","H","I","J"};
        int [] price = {10,9,8,5,12,16,19,15,13,21} ;


        int temp3, temp2 , temp1 ;

        public void choselocation()
        {
            int flag_i = 0  , flag_f = 0  , flag_v = 0 ;
            System.out.println("Enter your initial position");
            intitial_code = input.next() ;

            for(int i = 0 ; i<10 && (flag_i == 0) ; i++)
            {
                //checker = (char)intitial_code ; 
                if(intitial_code.equals(places[i]))
                {
                    flag_i = 1 ;  temp1 = i ;
                }
            }
            while(flag_i == 0)
            {
                System.out.println("") ;
                System.out.println("You have entered wrong place . Consider entering it again");
                intitial_code = input.next() ;
                for(int i = 0 ; i<10 && (flag_i == 0) ; i++)
                {

                    
                    if(intitial_code.equals(places[i]))
                    {
                        flag_i = 1 ;  temp1 = i ;
                    }
                }
            }
            System.out.println("") ;
            System.out.println("Enter your final position");
            final_code = input.next() ;

            for(int i = 0 ; i<10 && (flag_f == 0) ; i++)
            {
                if(final_code.equals(places[i]))
                {
                    flag_f = 1 ; temp3 = i ;
                }
            }

            while(flag_f == 0)
            {
                System.out.println("") ; 
                System.out.println("You have entered wrong place . Consider entering it again");
                intitial_code = input.next() ;
                for(int i = 0 ; i<10 && (flag_f == 0) ; i++)
                {
                    if(final_code.equals(places[i]))
                    {
                        flag_f = 1 ; temp3 = i ;
                    }
                }
            }

            System.out.println("") ;
            System.out.println("Enter 1 if you want to go via some place otherwise enter 0");
            via_code = input.nextInt() ;

            if(via_code == 1)
            {

                dummy = input.next() ;
                while(flag_v == 0)
                {
                    System.out.println("") ; 
                    System.out.println("Enter the via place");
                    via = input.nextLine() ;
                    for(int i = 0 ; i<10 && (flag_v == 0) ; i++)
                    {
                        if(via.equals(places[i]))
                        {
                            flag_v = 1 ; temp2 = i ;
                        }
                    }
                    if(flag_v == 0)
                    {
                        System.out.println("") ; 
                        System.out.println("You have entered wrong place . Consider entering it again");
                    }

                }
            }


           /*temp2 = String(places).indexof(via) ;
           temp3 = String(places).indexof(final_code) ;
           temp1 = String(places).indexof(intitial_code) ; */
        }

        public void calc_price()
        {
            payment = Math.abs(price[temp3] - price[temp1]) ; 
            if(via_code == 1)
            {
                payment = Math.abs(price[temp2] - price[temp1]) ;
                payment+= Math.abs(price[temp3] - price[temp2]) ;
            }

            System.out.println("") ; 
            System.out.println("The price you have to pay is \t" + payment*50);
        }

}

