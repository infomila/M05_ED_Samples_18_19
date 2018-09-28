#include<stdio.h>
#include "include/LlibreriaCriptografica.h"
#include<conio.h>
int main() {

	char missatge[200] = "paquito";
	printf("%s\n", missatge);
	encripta(missatge);
	printf("%s\n", missatge);
	desencripta(missatge);
	printf("%s\n", missatge);
	_getch();

	return 0;
}