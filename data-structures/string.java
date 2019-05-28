class String{

  String s = " This is My string";
  
  int n = 787;  
  s = Integer.toString(n); //converts int to string
  n = (int) Integer.valueOf(s); //converts string to int

  s.trim(); //remove leading and trailing spaces
  s.indexOf("i"); //returns starting index of first occrence of substring input
  s.lastIndexOf("i"); //returns starting index of last occrence of substring input

  char[] c = s.toCharArray(); //convert to char array
  String s2 = new String(c); //convert char array to String
  s.charAt(5); //char at pos 5. 's'


}
