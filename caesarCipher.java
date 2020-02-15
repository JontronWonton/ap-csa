class Main {
  public static void main(String[] args) {
    System.out.println(cipher("computer", 1));
  }

  private static String cipher(String str, int shift){
    String temp = "";
    String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    int pos = 0;

    for(int i = 0; i < str.length(); i++){
      for(int j = 0; j < alphabet.length; j++){
        if(alphabet[j].equals(str.substring(i, i+1))){
          pos = j;
        
      }
      temp += alphabet[pos+shift];
    }
    return temp;
  }
}