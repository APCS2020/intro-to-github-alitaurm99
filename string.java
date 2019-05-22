public class string{
    public static String talk(String str){
        String keyword = "sister";
        String str1 = "Do you have any sister?";
        String str2 = "How many do you have?";
        String str3 = "Do you like your sister?";
        //keyword sister
        if(str.indexOf(keyword) != -1){
            return str1;
        }
        else if(str.indexOf(keyword) == 0){
            return str2;
        }
        else{
            return str3;
        }
    }
    public static void main(String []args){
        String str;
        str = "wjugd87g";
        System.out.println(str);
        //methods: variableName.methodName(parameters);
        //1.length()
        System.out.println(str.length());
        //2.substring(index), substring(index,end)
        String temp = new String(str.substring(7,8));
        String tmp = str.substring(0,2);
        System.out.println(temp);
        System.out.println(tmp);

        //StringIndexOutOfBoundsException
        System.out.println("wjugd87g".substring(5,6));

        //3 str2.indexOf(b)
        String b = "sister";
        String str3 = "sister this";
        String str2 = "i have a sister";
        String str1 = "i haveasister";
        System.out.println("indexOf str3" + str3.indexOf(b));
        System.out.println("indexOf str3" + str2.indexOf(b));
        System.out.println("indexOf str1" + str1.indexOf(b));
    }
}