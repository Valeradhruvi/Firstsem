public class Cmd_Args_error {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].charAt(0) < 65 || args[i].charAt(0)>91) {
                System.out.println("Error Error Error!!");
                return;
            }
            else
            {
                System.out.println(args[i]);
            }
        }
    }
}
