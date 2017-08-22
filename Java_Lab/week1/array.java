class array {
    public static void main(String args[]) {
        int arr[], mean = 0;
        arr = new int[4];
        arr[0] = 45; arr[1] = 32; arr[2] = 43; arr[3] = 28;
        for(int iter = 0; iter < 4; iter++) {
            mean = mean + arr[iter];
        }
        System.out.println("Average of 45, 32, 43, 28 is " + mean + ".");
		System.out.println("Made by: Mohit Bansal(05414802715)\n");
    }
}