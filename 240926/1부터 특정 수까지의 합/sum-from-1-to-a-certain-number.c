#include <stdio.h>

int print(int N){
    int sum = 0;
    for(int i = 1; i <= N; i++){
        sum += i;
    }
    return (sum/10);
}

int main() {
    int N;
    scanf("%d", &N);
    printf("%d", print(N));

    return 0;
}