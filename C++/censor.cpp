/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <string>

using namespace std;

void uncensor(string a, string b){
    int i=0;
    for(auto c:a){
        if(c=='*'){
            cout<<b[i];
            i++;
            continue;
        }
        cout<<c;
    }
}

int main()
{
    uncensor("*PP*RC*S*", "UEAE");
    return 0;
}
