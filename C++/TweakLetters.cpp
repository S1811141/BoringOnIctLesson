/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <string>
#include <vector>

using namespace std;


char dllm(char c, int i){
    int ansnum=(int)c-96+i;
    if(ansnum>26){
        while(ansnum>26){
            ansnum-=26;
        }
    }else if(ansnum<1){
        ansnum+=26;
    }
    return (char)ansnum+96;
}

string tweakLetters(string a, vector<int> b){
    int len=a.length();
    for(int i=0;i<len;i++){
        a[i]=dllm(a[i],b[i]);
    }
    return a;
}

int main()
{
    cout<<tweakLetters("rhino", {1, 1, 1, 1, 1});
    return 0;
}
