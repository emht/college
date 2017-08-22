class swapusingfunction {
    public static void swapfunc(int p, int q)
    {
       int temp;
       temp = p;
       p = q;
       q = temp;
       System.out.println("a after swapping is " + p + " and b after swapping is " + q + ".");       
    } 
    public static void main(String args[]) {
        int a = 10, b = 20; 
        System.out.println("a before swapping is " + a + " and b before swapping is " + b + ".");
        swapfunc(a, b);
        System.out.println("Made by: Mohit Bansal(05414802715)\n");        
    }
}