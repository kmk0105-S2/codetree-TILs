#include <stdio.h>

void printword(int n){
    for(int i = 0; i < n; i++){
        printf("12345^&*()_\n");
    }
}

int main() {
    int n;
    scanf("%d", &n);
    printword(n);
    return 0;
}