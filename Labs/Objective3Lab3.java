public class Objective3Lab3 {
  public static void main (String[] args){
    int first, second, third, sum;
      first= 1 + (int)(Math.random()*6);
      second= 1 + (int)(Math.random()*6);
      third=1 + (int)(Math.random()*6);
      int sum1=Integer.sum(first, second);
      int sum2=Integer.sum(sum1, third);
    System.out.println(first + " + " + second + " + " + third + " = " + sum2 );


  }
}
