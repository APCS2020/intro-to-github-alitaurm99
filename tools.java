import java.util.Scanner;
public class tools{
    /**print a line on the scree
     * @param num how many times print character str
     * @param str the charactor for printing
     * 
     */
    public static void printLine(int num, String str){
        for (int i= 0; i < num; i++){
            System.out.print(str);
        }
        System.out.println();
    }
    //method2
    public static void printSquare(int num, String str){
        for (int i = 0; i < num; i++){
            printLine(num, str);
        }
    }
    //method3
    public static void printRectangle(int width, int length, String str){
        for (int r = 0; r < width; r++){
            printline(length, str);
        }
    }
    //get an integer from user input
    public static int getInt(){
        System.out.println("enter an integer");
        Scanner input = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    public static int getInt(String str){
        System.out.println(str);
        Scanner input = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    //get a String
    public static String getStr(){
        System.out.println("enter a String:");
        Scanner input = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    public static int add(int a, int b){
        return a + b;
    }
        /**Change a to 5
         * but this method don't work as intended
         * because java pass parameter by value
         */
    public static void modify(int a){//local variable
        a = 5;
    }
    public static int change(int a){//return a new value
        return a - 5;
    }
    public static String weekday(int a){
        if(a == 1){
            return "monday";
        }
        else if(a == 2){
            return "tuseday";
        }
        else if(a == 3){
            return "wednesday";
        }
        else if(a == 4){
            return "thursday";
        }
        else if(a == 5){
            return "friday";
        }
        else if(a == 6){
            return "saturday";
        }
        else if(a == 7){
            return "sunday";
        }
        else{
            return "you must insert a number between 1~7";
        }
        }
    public static String numTran(int n){
        String tmpt = "";
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3-i;j++){
                System.out.println(i+1);
            }
            System.out.println(i + i);
        }
        return tmpt;
    }
}