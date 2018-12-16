#include <iostream>
using namespace std;
int main() {
double given, posSum, posSize, nonPosSum, nonPosSize;

cout << "Enter a number. Enter -1 to exit";
cin >> given; 

while(given != -1){
  if(given > 0){
    posSum += given;
    posSize++;
  }
  else{
    nonPosSum += given;
    nonPosSize++;
  }
  cout << "Enter a number. Enter -1 to exit";
  cin >> given; 
}

cout << "\n\nSum of all positive #s: " << posSum << "\n";
cout << "Average of all positive #s: " << posSum / posSize<< "\n";
cout << "Sum of all nonpositive #s: " << nonPosSum << "\n";
cout << "Average of all nonpositive #s: " << nonPosSum / nonPosSize << "\n";
cout << "Sum of all #s: " << (posSum + nonPosSum) << "\n";
cout << "Average of all positive #: " <<(posSum + nonPosSum) / (nonPosSize + posSize) << "\n";





 
}