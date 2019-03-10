class NormalLogAllPairsOfArray {
  public static void main(String[] args) {

  int boxes[] = {1,2,3,4,5};
  for(int a=0; a<boxes.length; a++){
    for(int b=0; b<boxes.length; b++ ){
      System.out.println(boxes[a] + " , " + boxes[b]);
    }
  }
}
}
