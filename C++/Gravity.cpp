#include <stdio.h>
#include <iostream>
using namespace std;
float height = 10;
float velocity = 5;
float gravitycal(){
    height += velocity;
    velocity -= 0.1;
    return height;
}
int main(){
    while (true){
        if(height <= 0){
            velocity = -velocity;
        }
        cout<<gravitycal()<<endl;
    }
    return 0;
}