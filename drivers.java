package project1;
import java.util.*;

public class drivers extends project1.Person
{   
    String [] driver_lisc = new String[10];
    int[] avaibility =new int[10];
    public drivers()
    {
        Arrays.fill(avaibility,0);
        super.names[0]="Ketan";
        super.names[1]="Atharva";
        super.names[2]="Rishabh";
        super.names[3]="Warun";
        super.names[4]="Prince";
        super.names[5]="Yash";
        super.names[6]="Diplesh";
        super.names[7]="Tejomay";
        super.names[8]="Harshal";
        super.names[9]="Rajan";
        super.phone_number[0]="9424298760";
        super.phone_number[1]="9424298761";
        super.phone_number[2]="9424298762";
        super.phone_number[3]="9424298763";
        super.phone_number[4]="9424298764";
        super.phone_number[5]="9424298765";
        super.phone_number[6]="9424298766";
        super.phone_number[7]="9424298767";
        super.phone_number[8]="9424298768";
        super.phone_number[9]="9424298769";
        driver_lisc[0]="56555";
        driver_lisc[1]="21421341";
        driver_lisc[2]="123";
        driver_lisc[3]="1233234";
        driver_lisc[4]="12334";
        driver_lisc[5]="123344";
        driver_lisc[6]="1233124";
        driver_lisc[7]="1232343";
        driver_lisc[8]="1233234";
        driver_lisc[9]="122433";
        

        Arrays.fill(avaibility,1);
    }

    public void get_driver_details()
    {
        int got=0;
        int driver_i=0;
        while(got==0)
        {
            driver_i=(int) (Math.random()*9);
            if(avaibility[driver_i]==0)
            {
                continue; 
            }
            else
            {
                avaibility[driver_i]=0;
                got=1;
            }
        }
        System.out.println("you driver is "+super.names[driver_i]);
        System.out.println("") ;
        System.out.println("phone number is "+super.phone_number[driver_i]);
        System.out.println("") ;
        System.out.println("his liscence number is " +driver_lisc[driver_i]);
    }
}