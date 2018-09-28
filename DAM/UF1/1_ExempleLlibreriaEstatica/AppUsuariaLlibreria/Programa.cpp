#include <stdio.h>
#include "include/Crypto.h"
#include <conio.h>
int main() {
	char missatge[200] = "Hola Món !!!";
	printf("%s", missatge);

	encripta(missatge);	
	printf("%s", missatge);

	desencripta(missatge);
	printf("%s", missatge);

	_getch();

	return 0;
}