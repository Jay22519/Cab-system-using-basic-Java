package project1;
import java.util.*;
public class vehicles
{
    private String[] vehicle_types = new String[10];
    private String[][] vehicle_names =  new String[10][5];
    private int[][] vehicle_avability = new int[10][5];
    Scanner input = new Scanner(System.in);

    public int type_selected=0;

    int vehicle_selected=0;

    int  selection_done=0; 

    int flag = 0; 



    public vehicles()
    {
        vehicle_types[0]="Auto";
        vehicle_types[1]="Bike";
        vehicle_types[2]="Exec";
        vehicle_types[3]="Lux";
        vehicle_types[4]="Micro";
        vehicle_types[5]="Mini";
        vehicle_types[6]="Prime";
        vehicle_types[7]="Prime sedan";
        vehicle_types[8]="Prime SUv";
        vehicle_types[9]="kaali peeli";
        for(int  i=0;i<10;i++)
        {
            for(int j=0;j<5;j++)
            {
                vehicle_avability[i][j]=1;
            }
        }
    }
    public void  show_vehicle_types()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(vehicle_types[i]);
        }
    }

    public void select_type()
    {
        int done=0;
        while(done==0)
        {
            try{
            this.type_selected=input.nextInt();
            int flag=0;
            for(int i=0;i<5;i++)
            {
                if(vehicle_avability[type_selected][i]==1)
                {
                    flag=1;
                }
            }
            if(flag==1)
            {
                done=1;
            }
            else
            {
                System.out.println("this type is not avaiable now please select onother one");
            }
        }
        catch(ArrayIndexOutOfBoundsException err)
        {
            System.out.println("please enter a digit between 0 and 9");
        }
        }
    }

    public void show_appropriate_vehicle()
    {
        vehicle_names[0][0]="rishi";
        vehicle_names[0][1]="jaypuri";
        vehicle_names[0][2]="abhishek";
        vehicle_names[0][3]="aburag";
        vehicle_names[0][4]="samriddhi";


        vehicle_names[1][0]="shine";
        vehicle_names[1][1]="pulsar";
        vehicle_names[1][2]="kawsaki";
        vehicle_names[1][3]="duke";
        vehicle_names[1][4]="harley davidson";



        vehicle_names[2][0]="shine";
        vehicle_names[2][1]="pulsar";
        vehicle_names[2][2]="kawsaki";
        vehicle_names[2][3]="duke";
        vehicle_names[2][4]="harley davidson";


        vehicle_names[3][0]="shine";
        vehicle_names[3][1]="pulsar";
        vehicle_names[3][2]="kawsaki";
        vehicle_names[3][3]="duke";
        vehicle_names[3][4]="harley davidson";



        vehicle_names[4][0]="shine";
        vehicle_names[4][1]="pulsar";
        vehicle_names[4][2]="kawsaki";
        vehicle_names[4][3]="duke";
        vehicle_names[4][4]="harley davidson";



        vehicle_names[5][0]="shine";
        vehicle_names[5][1]="pulsar";
        vehicle_names[5][2]="kawsaki";
        vehicle_names[5][3]="duke";
        vehicle_names[5][4]="harley davidson";



        vehicle_names[6][0]="shine";
        vehicle_names[6][1]="pulsar";
        vehicle_names[6][2]="kawsaki";
        vehicle_names[6][3]="duke";
        vehicle_names[6][4]="harley davidson";



        vehicle_names[7][0]="shine";
        vehicle_names[7][1]="pulsar";
        vehicle_names[7][2]="kawsaki";
        vehicle_names[7][3]="duke";
        vehicle_names[7][4]="harley davidson";

        vehicle_names[8][0]="shine";
        vehicle_names[8][1]="pulsar";
        vehicle_names[8][2]="kawsaki";
        vehicle_names[8][3]="duke";
        vehicle_names[8][4]="harley davidson";


        vehicle_names[9][0]="shine";
        vehicle_names[9][1]="pulsar";
        vehicle_names[9][2]="kawsaki";
        vehicle_names[9][3]="duke";
        vehicle_names[9][4]="harley davidson";

        for(int i=0;i<5;i++)
        {
            System.out.println(vehicle_names[type_selected][i]);
        }
    }   

    

    public void select_vehicle()
    {
        int done=0;
       
        while(done==0)
        {
            try{
                this.vehicle_selected = input.nextInt();
                if(vehicle_avability[type_selected][vehicle_selected]==0)
                {
                    System.out.println("this vehicle is not avalable now please choose onother one");
                    this.vehicle_selected = input.nextInt();
                }
                else
                {
                    done=1;
                }
            }
            catch(ArrayIndexOutOfBoundsException err)
            {
                System.out.println("please choose vehicle between 0 and 4");
            }
        }
     
        System.out.println("0 for choosing another vehicle from the same type"); 
        System.out.println("1 for choosing another vehicle type and subsequent another vehicle"); 
        System.out.println("2 continuing");

        selection_done = input.nextInt();

        if(selection_done==2)
        {
            vehicle_avability[type_selected][vehicle_selected]=0;
            vehicle_information(); 
        }
        else if(selection_done == 0)
        {
            
            select_vehicle();
        }
        else if(selection_done == 3)
        {

        }
        else 
        {
            while(flag == 0  )
            {
                System.out.println("Errrr you have entered wrong input"); 
                System.out.println("0 for choosing another vehicle from the same type"); 
                System.out.println("1 for choosing another vehicle type and subsequent another vehicle"); 
                System.out.println("2 continuing");

                selection_done = input.nextInt();

                if(selection_done==2)
                {
                    vehicle_avability[type_selected][vehicle_selected]=0;
                    vehicle_information();
                }
                else if(selection_done == 0)
                {
                    flag = 1 ; 
                    show_appropriate_vehicle();
                    select_vehicle();
                }
                else if(selection_done == 3)
                {
                    flag = 1 ; 
                    select_type();  
                    show_appropriate_vehicle(); 
                    select_vehicle() ; 
                }
            }
        }
        

    } 


    public void vehicle_information()
    {
        System.out.println("Following is the information detail");  

        System.out.println("Vehicle type selected is");
        System.out.println(vehicle_types[type_selected]); 

        System.out.println("Vehicle selectes is"); 
        System.out.println(vehicle_names[type_selected][vehicle_selected]);
        
    }



}