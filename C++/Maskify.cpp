/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <string>

using namespace std;

string maskify(string a){
    int len = a.length();
    if(len<4) return a;
    string ans="";
    for(int i=0;i<len-4;i++){
        ans+="#";
    }
    ans+=a.substr(len-4,4);
    return ans;
}

int main()
{
    cout<<maskify("");

    return 0;
}
