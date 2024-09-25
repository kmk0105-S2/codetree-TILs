#include <stdio.h>

void print(int n){
    if(n %2 == 0 && ((n/10)+(n%10))%5==0){
        printf("Yes");
    }
    else{
        printf("No");
    }

    
}

int main() {
    int n;
    scanf("%d", &n);
    print(n);

    return 0;
}