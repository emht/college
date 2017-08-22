class arg_odd {
    public static void main(String args[]) {
        if (args.length == 1) {
           int num1 = Integer.parseInt(args[0]);
           if(num1 % 2 == 0) {
               System.out.println(num1 + " is an even number.");
           } 
           else
                System.out.println("Welcome to the void!");
        }
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}