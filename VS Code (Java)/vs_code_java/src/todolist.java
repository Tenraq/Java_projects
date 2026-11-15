import java.util.Scanner;
public class todolist {
   
    public static void todo(){
        System.out.println("Set item count: ");
        Scanner u_input = new Scanner(System.in);
        int items_count = u_input.nextInt();
        String list[] = printlist(new String[items_count]);
        int spot = 0;
        String sort1 = "";
        String sort2 = "";
        while (true) {
            String input = u_input.nextLine();
            String command[] = input.split(" ");
            if (command[0].equals("add")){
                int length = command.length;
                System.out.println(length);
                if (length > 1){

                     for (int i = 0; i < list.length; i++){

                        if (list[i] == null || list[i].equals("")){

                            list[i] = command[1];
                            i = list.length;
                            

                        } else {
                            
                            System.out.println("No more space!");

                        }

                    }
                    printlist(list);
                } else {
                    System.out.println("out of bound index!");
                }
               

            } else if(command[0].equals("remove")){
                if (command.length > 1){
                    for (int alpha = 0; alpha < list.length; alpha++){
                        if (list[alpha].equals(command[1])){
                            list[alpha] = "";
                        
                        }
                    }
                    printlist(list);
                } else {
                    printlist(list);
                    System.out.println("incomplete command!");
                }
                
                
            } else if (command[0].equals("sort") && command.length == 1){
                int tries = list.length;
                while (tries > 0) {
                   for (int l = 0; l < list.length - 1; l++){
                        sort1 = list[l];
                        sort2 = list[l + 1];
                        if(sort1.equals("")){
                            if (!sort2.equals("")){
                                list[l] = sort2;
                                list[l + 1] = sort1;
                                
                            }
                        }
                    } 
                    tries --;
                }
                printlist(list);
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
// test github 

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
