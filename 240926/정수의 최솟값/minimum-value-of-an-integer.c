#include <stdio.h>

int minPrint(int a, int b, int c){
    int min;
    if(a > b){
        min = b;
    }else{
        min = a;
    }

    if(min > c){
        min = c;
    }

    return min;
}

int main() {
    int a,b,c;
    scanf("%d %d %d", &a, &b, &c);
    printf("%d", minPrint(a, b, c));

    return 0;
}