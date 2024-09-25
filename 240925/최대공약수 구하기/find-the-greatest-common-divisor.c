#include <stdio.h>

int gcd(int n, int m){
    int min = 0;
    int gcd = 0;

    if(n >= m){
        min = m;
    }
    else{
        min = n;
    }

    for(int i = 1; i <= min; i ++){
        if(n % i == 0 && m % i == 0){
            gcd = i;
        }
    }

    return gcd;
}

int main() {
    int n, m;
    scanf("%d %d", &n, &m);
    printf("%d", gcd(n, m));
    
    return 0;
}