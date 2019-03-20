class reverseString{
  public static void main(String[] args) {
  int i = args.length;
  System.out.println(args.length);
  while (i-1 >= 0) {
    System.out.print(args[i-1]+" ");
    i--;
    //System.out.println("Hey here");
  }
}
}
