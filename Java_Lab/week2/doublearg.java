class doublearg {
    public static void main(String args[]) {
        if(args.length == 2) {
            double num1 = Double.parseDouble(args[0]), num2 = Double.parseDouble(args[1]);
            System.out.println("Product of these two numbers is: " + num1 * num2);
            System.out.println("Made by: Mohit Bansal(05414802715)\n");
        }
    }
}