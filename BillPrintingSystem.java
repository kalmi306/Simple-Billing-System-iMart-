import java.util.Scanner; 

class BillPrintingSystem{
 public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.println("==================================================================================");  
   System.out.println(" __          __  _                            _          _ __  __            _              ");
   System.out.println(" \\ \\        / / | |                          | |        (_)  \\/  |          | |          ");
   System.out.println("  \\ \\  /\\  / /__| | ___ ___  _ __ ___   ___  | |_ ___    _| \\  / | __ _ _ __| |_        ");
   System.out.println("   \\ \\/  \\/ / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\ | __/ _ \\  | | |\\/| |/ _` | '__| __|  ");
   System.out.println("    \\  /\\  /  __/ | (_| (_) | | | | | |  __/ | || (_) | | | |  | | (_| | |  | |_          ");
   System.out.println("     \\/  \\/ \\___|_|\\___\\___/|_| |_| |_|\\___|  \\__\\___/  |_|_|  |_|\\__,_|_|   \\__| ");
   System.out.println("==================================================================================\n");
   
//customer details
   System.out.print("Enter Customer Phone Number-"); 
   String PhoneNumber=input.next();
   System.out.println();
   System.out.print("Enter Customer Name-"); 
   String name=input.next();
   System.out.println("");
   System.out.println("==================================================================================");  
   System.out.println(""); 

//Items details
   double Basmathi=250.00,Dhal=180.00,Suger=150.00,Highland=1200.00,Yoghurt=50.00,Flour=120.00,Soap=160.00;
   int q1,q2,q3,q4,q5,q6,q7;
   
   System.out.print("Basmathi Qty(Kg) -"); 
   q1=input.nextInt();
   System.out.println();
   
   System.out.print("Dhal Qty(Kg)     -"); 
   q2=input.nextInt();
   System.out.println();

   System.out.print("Sugar Qty(Kg)    -"); 
   q3=input.nextInt();
   System.out.println();

   System.out.print("Higland Qty(Kg)  -"); 
   q4=input.nextInt();
   System.out.println();

   System.out.print("Yoghurt Qty(Kg)  -"); 
   q5=input.nextInt();
   System.out.println();

   System.out.print("Flour Qty(Kg)    -"); 
   q6=input.nextInt();
   System.out.println();

   System.out.print("Soap Qty(Kg)     -"); 
   q7=input.nextInt();
   System.out.println();   

   double x=q1*Basmathi;
   double y=q2*Dhal;
   double z=q3*Suger;
   double p=q4*Highland;
   double q=q5*Yoghurt;
   double r=q6*Flour;
   double w=q7*Soap;

//total,discount
   double Total=x+y+z+p+q+r+w;
   double Discount=Total*0.10;
   double Price=Total-Discount;

   System.out.println("+------------------------------------------------------------------------+");
   System.out.println("|                  _   __  __          _____ _______                     |         "); 
   System.out.println("|                 (_) |  \\/  |   /\\   |  _  \\__   __|                    |      "); 
   System.out.println("|                  _  | \\  / |  /  \\  | |_)  | | |                       |       ");
   System.out.println("|                 | | | |\\/| | / /\\ \\ |  _  /  | |                       |      ");
   System.out.println("|                 | | | |  | |/ ____ \\| | \\ \\  | |                       |      ");
   System.out.println("|                 |_| |_|  |_/_/    \\_\\_|  \\_\\ |_|                       |     ");
   System.out.println("|                       252,Galle Road,Pnadura.                          |         ");                                            
   System.out.println("|                                                                        |         ");
   System.out.println("+------------------------------------------------------------------------+         ");
   System.out.printf("|                          #Tel  : %-33s     |\n", PhoneNumber );                        
   System.out.printf("|                          #Name : %-33S     |\n", name );                        
   System.out.println("+----------------+---------------+---------------------+-----------------+          ");
   System.out.println("|                |      Qty      |      unit price     |    Price        |          ");                                       
   System.out.println("+----------------+---------------+---------------------+-----------------+          ");
   System.out.printf("|#Basmathi       |  %3d          |    %6.2f           |   %6.2f       |\n",q1,Basmathi,x); 
   System.out.println("|                |               |                     |                 |               "); 
   System.out.printf("|#Dhal           |  %3d          |    %6.2f           |   %6.2f        |\n",q2,Dhal,y ); 
   System.out.println("|                |               |                     |                 |                ");
   System.out.printf("|#Suger          |  %3d          |    %6.2f           |   %6.2f        |\n",q3,Suger,z ); 
   System.out.println("|                |               |                     |                 |                ");
   System.out.printf("|#Highland       |  %3d          |    %6.2f          |   %6.2f       |\n",q4,Highland,p ); 
   System.out.println("|                |               |                     |                 |                ");
   System.out.printf("|#yoghurt        |  %3d          |    %6.2f          |   %6.2f        |\n",q5,Highland,q); 
   System.out.println("|                |               |                     |                 |                "); 
   System.out.printf("|#Flour          |  %3d          |    %6.2f           |   %6.2f        |\n",q6,Flour,r); 
   System.out.println("|                |               |                     |                 |                ");
   System.out.printf("|#Soap           |  %3d          |    %6.2f           |   %6.2f        |\n",q7,Soap,w); 
   System.out.println("|                |               |                     |                 |                ");
   System.out.println("+----------------+---------------+---------------------+-----------------+                ");
   System.out.printf("|                                | Total               |   %6.2f       |\n",Total );
   System.out.println("|                                +---------------------+-----------------+                "); 
   System.out.printf("|                                | Discount(10%%)       |   %6.2f        |\n",Discount); 
   System.out.println("|                                +---------------------+-----------------+                ");
   System.out.printf("|                                | Price               |   %6.2f       |\n",Price );
   System.out.println("|--------------------------------+---------------------+-----------------+                ");                                              

   input.close();
  }
}