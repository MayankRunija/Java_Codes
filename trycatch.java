public class trycatch {
    public static void main(String arrgsp[]){
        int a = 5;
        int b = 0;
        try{
            int c =a/b;
            System.out.println("division of a and b is : "+c);
        }
        catch(Exception ex){
            System.out.println("not able to execute due to :");
            System.out.println(ex);
        }
        System.out.println("end of main");
    }
}
