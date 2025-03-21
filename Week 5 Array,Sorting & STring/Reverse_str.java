public class Reverse_str {
  public static void main(String[] args) {
      String s = "vdhdhjfhjb";
      char[] charArray = s.toCharArray();
      int i = 0, j = charArray.length - 1;

      while (i < j) {

          char temp = charArray[i];
          charArray[i] = charArray[j];
          charArray[j] = temp;

          i++;
          j--;
      }

      String reversedString = new String(charArray);
      System.out.println("Reversed String: " + reversedString);
  }
}
