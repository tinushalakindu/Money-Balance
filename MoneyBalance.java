
import java.util.Scanner;
public class MoneyBalance {

   //git test 2
    public static void main(String[] args) {

      Scanner sun = new Scanner(System.in);
      System.out.println("Please input any Number");
      int currency = sun.nextInt() ;

        int modcurrency =0;


       if (currency >= 5000){ // max 5000

          modcurrency = currency % 5000;

            if (modcurrency==0){
              modcurrency=currency/5000;
             System.out.println("5000 x "+ modcurrency);
            }

            else
            {
                int x = currency/ 5000;
                System.out.println("5000 x  " + x);
                ////System.out.println("modcurrency is " + modcurrency);

                int y = modcurrency / 1000;
                modcurrency= modcurrency % 1000;
                 System.out.println("1000 x "+ y);
                 ////System.out.println("modcurrency is " +
                 modcurrency);


                 int z = modcurrency / 500;
                modcurrency= modcurrency % 500;
                 System.out.println("500 x "+ z);
                 //System.out.println("modcurrency is " + modcurrency);

                 int p = modcurrency / 100;
                modcurrency= modcurrency % 100;
                 System.out.println("100 x "+ p);
                 //System.out.println("modcurrency is " + modcurrency);

                 int q = modcurrency / 50;
                modcurrency= modcurrency % 50;
                 System.out.println("50 x "+ q);
                 //System.out.println("modcurrency is " + modcurrency);

                 int r = modcurrency / 10;
                modcurrency= modcurrency % 10;
                 System.out.println("10 x "+ r);
                 //System.out.println("modcurrency is " + modcurrency);

                 int s = modcurrency / 5;
                modcurrency= modcurrency % 5;
                 System.out.println("5 x "+ s);
                 //System.out.println("modcurrency is " + modcurrency);

                 int t = modcurrency / 2;
                modcurrency= modcurrency % 2;
                 System.out.println("2 x "+ t);
                 //System.out.println("modcurrency is " + modcurrency);

                 int u = modcurrency / 1;
                modcurrency= modcurrency % 1;
                 System.out.println("1 x "+ u);
                 //System.out.println("modcurrency is " + modcurrency);

                }

              //1000
              /*
                   modcurrency= modcurrency % 1000;
                   if (modcurrency==0){
                    modcurrency=currency/1000;
                    System.out.println("1000 x "+ modcurrency);

            }

       else (currency >= 1000) {
              modcurrency = currency % 1000;

                if (modcurrency==0){
                      modcurrency=currency/1000;
                    System.out.println("1000 x "+ modcurrency);
                      }


          }
*/

         }
          else if(currency < 5000) {

          modcurrency = currency % 1000;

            if (modcurrency==0){
              modcurrency=currency/1000;

             System.out.println("1000 x " + modcurrency);
            }

            else {

              int x = currency/ 1000;
                System.out.println("5000 x  " + x);
                //System.out.println("modcurrency is " + modcurrency);



                 int z = modcurrency / 500;
                modcurrency= modcurrency % 500;
                 System.out.println("500 x "+ z);
                 //System.out.println("modcurrency is " + modcurrency);

                 int p = modcurrency / 100;
                modcurrency= modcurrency % 100;
                 System.out.println("100 x "+ p);
                 //System.out.println("modcurrency is " + modcurrency);

                 int q = modcurrency / 50;
                modcurrency= modcurrency % 50;
                 System.out.println("50 x "+ q);
                 //System.out.println("modcurrency is " + modcurrency);

                 int r = modcurrency / 10;
                modcurrency= modcurrency % 10;
                 System.out.println("10 x "+ r);
                 //System.out.println("modcurrency is " + modcurrency);

                 int s = modcurrency / 5;
                modcurrency= modcurrency % 5;
                 System.out.println("5 x "+ s);
                 //System.out.println("modcurrency is " + modcurrency);

                 int t = modcurrency / 2;
                modcurrency= modcurrency % 2;
                 System.out.println("2 x "+ t);
                 //System.out.println("modcurrency is " + modcurrency);

                 int u = modcurrency / 1;
                modcurrency= modcurrency % 1;
                 System.out.println("1 x "+ u);
                 //System.out.println("modcurrency is " + modcurrency);


            }








        }




     }
 }
