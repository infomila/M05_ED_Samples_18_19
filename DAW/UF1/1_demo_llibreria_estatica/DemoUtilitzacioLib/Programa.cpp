#include "include/Crypto.h"
#include <stdio.h>
#include<conio.h>
int main() {
	char msg[200] = "Capita Enciam!";
	encripta(msg);
	printf("%s\n", msg);
	desencripta(msg);
	printf("%s\n", msg);
	_getch();
	return 0;
}