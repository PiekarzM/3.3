class Main {
  public static void main(String[] args) {
   int wysokość = 5;
    
    for (int i= wysokość;i>0;i--){
      for (int t=5;i<t;t--)
        System.out.print(" ");
      for(int j=0;j<i;j++){
        System.out.print("*");
         }
      System.out.println(" ");
    }
  }
}