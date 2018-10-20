//CopyRight YAsin Ehsan
//Intrv prep
#include <iostream>
#include <vector> 
#include <iterator>
#include <algorithm>
using namespace std; 

/*
Problem: given input n = 3. Display such output
**0 **0 **0
*0* *0* *0*
0** 0** 0**
write program for any n.
*/

//Declaring Methods because putting Main first
void gridMethod(int given);
void columnMethod(int given);
void vectorMethod(int given);

int main() {
  int n = 0;
  cout << "enter number n: \n";
  cin >> n;

  gridMethod(n);
  columnMethod(n);
  vectorMethod(n);
}

void gridMethod(int given){
  cout<<"\n\nThis is grid method\n";
  /* 
  Game Plan:
  - create grid (row, col)
  - At position (row, col) there is a starGroup of size given
  - Each starGroup is different relative to row #
  - will have to create a three dimensional array to control postion of zero

  PROS: customizable unlike brute force
  CONS: Run time O^3
  */

  string starGrid[given][given][given];

  for(int row = 0; row < given; row++){
    for(int col = 0; col < given; col++){
      for(int starGroup = 0; starGroup < given; starGroup++){
        starGrid[row][col][starGroup] = "*";
      }
      starGrid[row][col][given-row-1] = "0";
    }
  }

  for(auto& row : starGrid){
    for(auto& col : row){
      for(auto& starGroup: col)
        cout << starGroup;
      cout << "\t";
    }
    cout << "\n";
  }
}

void columnMethod(int given) {
  cout<<"\n\nThis is col method\n";
  /* 
  Game Plan:
  - all the columns are identical
  - print left upper diagnol
  - add zero
  - print right lower diagnol
  - but before printing the entire col...first copy (row, col) for all columns
  - move to next row

  PROS: not much
  CONS: Run time O^3
  */
  for(int row = 0; row < given; row++){
    for(int copyCol = 0; copyCol < given; copyCol++){
      for(int col = given; col - 1 > row; col--){
      cout<<"*";
    }
      cout << "0";

      for(int col = 0; col < row; col++){
        cout<<"*";
      }
      cout << "\t";
    }
    cout << "\n";
  }
}

void vectorMethod(int given){
  cout<<"\n\nThis is vector method\n";
    /* 
  Game Plan:
  - decrease time comlexity 
  - use loop to store star group into a vector and exit loop
  - create var called col
  - in new loop copy contents of OG vector into a temp one.
  - replace postion wtv with zero
  - append col var
  - print star group
  - repeat for each row

  PROS: close to O(n) time complex-- couldnt do it
  CONS: idk this is optimal. Would it be possible for nlogn?
  */

  vector<string> starGroup;
  for(int i =0; i<given; i++)
    starGroup.push_back("*");
  
  for(int row = 0; row < given; row++){
    vector<string> temp = starGroup;
    for(int col = 0; col < given; col++){
      temp.at(given-row-1) = "0";
      copy(temp.begin(), temp.end(), ostream_iterator<string>(cout, ""));
      cout << "\t";
    }
    cout << "\n";
  }

  //ATTEMPTED O(n^2)
  // vector<string> starGroup;
  // int tabCount = 0;
  // for(int i = 0; i < given*given + given; i++){
  //   if(i == (given*(tabCount + 1)+ tabCount)){
  //     starGroup.push_back("\t");
  //     tabCount++;
  //   }
  //   else{
  //     starGroup.push_back("*");
  //   } 
  // }
  // for(int row = 1; row <= given; row++){
  //   vector<string> temp = starGroup;
  //   if(temp[(given*(row+1)-row)]%4 == 0){
  //      temp.at((given*(row+1)+row)) = "0";
  //   }
  //   copy(temp.begin(), temp.end(), ostream_iterator<string>(cout, ""));
  //   cout<<"\n";
  // }
}
