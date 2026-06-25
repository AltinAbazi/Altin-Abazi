import java.util.Scanner;

 public class bb {
public static void main (String[] args){

    int balance = 100;
    int withdraw;
    int deposit;
    int yes =1;
    Scanner sc = new Scanner(System.in);
    System.out.print("mirsevini ne banken tone.me 1 mund te terhqni para\n,me 2 mund te depositoni para\n,me 3 mund te kontrolloni bilancin\n me 4 mund te dilni");
    
    int choice = sc.nextInt();
    switch(choice){
     
        case 1:
            
            System.out.println("sa para doni te terhiqni?");
            int para = sc.nextInt();
          
            if(para>balance){
             System.out.println("nuk keni aq para ne llogari\n provoni perseri");
            } else {
           System.out.println("shuma juaj eshte: "+para);
            }
            while (true) {
                System.out.println("diten e mire");
                
                break;
             }
            }
    switch(choice){
        case 2:

                System.out.println("sa para doni te dpositoni?");
                deposit= sc.nextInt();
                if((balance>= deposit)||(balance<= deposit)) {
                System.out.println("parate qe i deposituat jane: "+ deposit + " ,ndersa bilanci juaj eshte: "+(balance+deposit));
                balance = balance + deposit;}

                else{
                    System.out.println("keni shtypur gabim!!!");

                }
                while(true){
                    System.out.println(" a doni te vazhdoni?\n po =1, jo =0");
                   yes = sc.nextInt();

                    if(yes==1){
                         System.out.print("mirsevini ne banken tone.\nme 1 mund te terhqni para\n,me 2 mund te depositoni para\n,me 3 mund te kontrolloni bilancin\n me 4 mund te dilni");
                    choice = sc.nextInt();
                switch(choice){
                
                    case 1:
                System.out.println("sa para doni te terhiqni?");
            para = sc.nextInt();
          
            if(para>balance){
             System.out.println("nuk keni aq para ne llogari\n provoni perseri");}
            else {
           System.out.println("shuma juaj eshte: "+para);
            }
            while (true) {
                System.out.println("diten e mire");
            }
        
        case 2:
                System.out.println("sa para doni te dpositoni?");
                deposit= sc.nextInt();
                if((balance>= deposit)||(balance<= deposit)) {
                System.out.println("parate qe i deposituat jane: "+ deposit + " ,ndersa bilanci juaj eshte: "+(balance+deposit));
                balance = balance + deposit;}

                else{
                    System.out.println("keni shtypur gabim!!!");
                }
        case 3:

               
                {
                System.out.println("bilanci juaj eshte :"+balance);

               case 4:
             System.out.println("Exit");
             break;
             default:
            System.out.println("keni shtypur gabim,ju lutem provoni perseri!");
            break;}
                }else {
                        System.out.println("ju lutem mereni kartelen tuaj!");
                      
                    }
                    break;
                {
                break;
            }
            break;
        }
    }

          
            switch(choice){
                case 3:

                System.out.println("a deshironi te vazhdoni?");
                Scanner sc1 = new Scanner(System.in);


                boolean po =sc1.nextBoolean();
              

                if( po)
                {
                System.out.println("bilanci juaj eshte :"+balance);

                }
                else{
                    System.out.println("ne rregull\nditen e mire\nju lutem merni kartelen tuaj! ");
                }
            break;
        }
           
switch(choice){
    case 4:
           System.out.println("shtypni" + 0 + " te dilni");
                System.out.println("mereni kartelen tuaj\n\n\n");
                System.out.println("diten e mire");
                break;

            
        
            }
        
    }
}



}

