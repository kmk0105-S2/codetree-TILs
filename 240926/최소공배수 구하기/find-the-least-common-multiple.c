#include <stdio.h>

int print(int n, int m){
    int min, max;
    int god;

    if(n >= m){
        min = m;
        max = n;
    }
    else{
        min = n;
        max = m;
    }

    for(int i = 1; i <= min; i++){
        if(n % i == 0 && m % i == 0){
            god = i;
        }
    }

    return min*(max/god);
}

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    printf("%d", print(n, m));

    return 0;
}