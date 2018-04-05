public class Rounders {
  int rounders(int value) {
      String str = String.valueOf(value);
      int strlen = str.length();
      int result = value;
      int c = 1;
      int i =0;
      boolean bump = false;
      boolean f = false;
      while (i<strlen){
          int temp = (int)Math.pow(10, i);
          int num = (value/temp) % 10;
          System.out.println("num " + num);
          i++;
      }
      return result;
  }
      
  boolean roundy(int n){
      if (n <5) {
          return false;
      } else {
          return true;
      }
  }
}

