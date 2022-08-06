package Question_3;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Account> account = new ArrayList<Account>();
        Scanner sc = new Scanner(System.in);
        boolean f =true;
        String str;
        int op;
        Account ac = null;
        Account ac1 = new Account(null);
        account.add(new Account("AC001"));
        account.add(new Account("AC002"));
        account.add(new Account("AC003"));
        account.add(new Account("AC004"));
        account.add(new Account("AC005"));
        account.add(new Account("AC006"));
        account.add(new Account("AC007"));
        account.add(new Account("AC008"));
        account.add(new Account("AC009"));
        account.add(new Account("AC0010"));
        System.out.println("Enter your ID :-");
        str = sc.next();

        for(Account account1 : account){
            if(str.equals(account1.id)){
                ac = ac1;
                break;
            }
        }
        {
            if(ac == null){
                System.out.println("Invalid ID");
                System.exit(0);
            }else{
                do{

                    op = sc.nextInt();
                    switch(op){
                        case 1 -> ac.Balance_Inq();
                        case 2 -> ac.Withdraw();
                        case 3 -> ac.deposit();
                        case 4 -> ac.MoneyTransfer(account);
                        case 5 -> ac.Create(account);
                        case 6 -> ac.delete(account);
                        case 0 -> System.out.println("Thank you");
                        default -> System.out.println("Invalid input");
                    }
                }while(op!=0);
            }
        }
    }
}
