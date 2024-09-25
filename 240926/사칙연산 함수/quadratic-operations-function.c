#include <stdio.h>

int plus(int a, int c){
    return a+c;
}

int minus(int a, int c){
    if(a >= c){
        return a-c;
    }
    else{
        return -(c-a);
    }
}

int rhq(int a, int c){
    return a*c;
}

int sksnrl(int a, int c){
    if(a >= c){
        return a/c;
    }
    else{
        return c/a;
    }
}



int main() {
    int a, c;
    char o;
    scanf("%d %c %d", &a, &o, &c);

    switch(o){
        case '+':
        printf("%d %c %d = %d", a, o, c, plus(a,c));
        break;

        case '-':
        printf("%d %c %d = %d", a, o, c, minus(a,c));
        break;

        case '*':
        printf("%d %c %d = %d", a, o, c, rhq(a,c));
        break;

        case '/':
        printf("%d %c %d = %d", a, o, c, sksnrl(a,c));
        break;

        default:
        printf("False");
        break;
    }

    return 0;
}