import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int poly = 3;
        Scanner input = new Scanner(System.in);
        todolist list = new todolist();
        
        todolist.todo();

        System.out.println("Gib nummer ein: ");
        int rechner = input.nextInt();
        javi_func(null, rechner);
        System.out.println(rechner + " * " + poly + " = " + polynom(rechner, poly));
        ass_func(null, "again");
    }

    public static int polynom(int num1, int num2){
        if (num1 == 9){
            class2 vspage = new class2();
        }
        return num1 * num2;
    }
    public static int[] javi_func(int sike[], int random_steps){
        sike = new int[random_steps];
        int max = 0;
        int min = random_steps;
        for (int i = 0; i < sike.length; i++){
            int random_assign = (int) (Math.random() * random_steps + 1);
            sike[i] = random_assign;
            System.out.print(sike[i] + " ");
            if (sike[i] > max){
                max = sike[i];
            } else if (sike[i] < min){
                min = sike[i];
            }

        } 
        System.out.println("\n(Max = " + max + "| Min = " + min + ")");
        return sike;
    }
    public static char[] ass_func(char name_to_array[], String name){
        name_to_array = new char[name.length()];
        char name_backward [] = new char[name.length()];
        for (int i = 0; i < name_to_array.length; i++){
            name_to_array[i] = name.charAt(i);
            System.out.print(name_to_array[i]);
        }
        System.out.println("");
        int array_last_index = name_to_array.length - 1;
        for (int g = 0; g < name_to_array.length; g++){
            name_backward[array_last_index - g] = name_to_array[g];
            System.out.print(name_to_array[array_last_index - g]);
        }

        return name_to_array;
    }

}

