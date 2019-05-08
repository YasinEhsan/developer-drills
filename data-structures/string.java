class String{

String s = " This is My string";

s.trim(); //remove leading and trailing spaces
s.indexOf("i"); //returns starting index of first occrence of substring input
s.lastIndexOf("i"); //returns starting index of last occrence of substring input

char[] c = s.toCharArray(); //convert to char array
String s2 = new String(c); //convert char array to String


}
