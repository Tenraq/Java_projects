import java.util.Scanner;
public class todolist {
   
    public static void todo(){
        System.out.println("Set item count: ");
        Scanner input = new Scanner(System.in);
        int items_count = input.nextInt();
        String list[] = printlist(new String[items_count]);
        int spot = 0;
       
        String sort1 = "";
        String sort2 = "";
        while (true) {
            String command = input.nextLine();
            if (command.equals("add")){
                
                System.out.println("Enter name: ");
                command = input.nextLine();

                for (int i = 0; i < list.length; i++){
                    if (list[i] == null || list[i].equals("")){
                        list[i] = command;
                        i = list.length;
                        printlist(list);
                       
                    } else {
                        System.out.println("No more space!");
                     
                    }
                }

            } else if(command.equals("remove")){
               
                System.out.println("Enter line Nr: ");
                int line = input.nextInt();
                if (line >= 1 && line <= items_count){
                    list[line - 1] = ""; 
                    printlist(list);
                    
                } else {
                    printlist(list);
                    System.out.println("Wrong index!");
                }
                
            } else if (command.equals("sort")){
                int tries = list.length;
                while (tries > 0) {
                   for (int l = 0; l < list.length - 1; l++){
                        sort1 = list[l];
                        sort2 = list[l + 1];
                        if(sort1.equals("")){
                            if (!sort2.equals("")){
                                list[l] = sort2;
                                list[l + 1] = sort1;
                                printlist(list);
                            }
                        }
                    } 
                    tries --;
                }
                
            } else if (command.equals("exit")){
                System.exit(0);
            } else {
                if (!command.equals("")){
                    printlist(list);
                    System.out.println("Command does not exist!");
                } else {
                    printlist(list);
                }
            }
        }
    }
// test github ass

    private static String[] printlist(String list[]){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nCommand list:\n1.add, 2.remove, 3.sort\nYour current list:");
        for (int i = 0; i < list.length; i++){
            if (list[i] == null){
                list[i] = "";
            }
            System.out.println(i + 1 + ". " + list[i]);
        }
        return list;
    }
}
