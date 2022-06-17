#include <iostream>

using namespace std;
string roman = "";
int input;
void whilestuff(int a, string s){
    while(input>=a){
        roman+=s;
        input-=a;
    }
}

string RomanToInt(int i){
    input = i;
    whilestuff(1000, "M");
    whilestuff(900, "CM");
    whilestuff(500, "D");
    whilestuff(400, "CD");
    whilestuff(100, "C");
    whilestuff(90, "XC");
    whilestuff(50, "L");
    whilestuff(40, "XL");
    whilestuff(10, "X");
    whilestuff(9, "IX");
    whilestuff(5, "V");
    whilestuff(4, "IV");
    whilestuff(1, "I");
    return roman;
}

int main()
{
    cout<<RomanToInt(1111);
    return 0;
}