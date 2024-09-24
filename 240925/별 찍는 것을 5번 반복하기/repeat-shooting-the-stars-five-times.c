#include <stdio.h>

void printstars(){
    for(int i = 0; i < 10; i++){
        printf("*");
    }
    printf("\n");
}

int main() {
    for(int i = 0; i < 5; i++){
        printstars();
    }
    
    return 0;
}