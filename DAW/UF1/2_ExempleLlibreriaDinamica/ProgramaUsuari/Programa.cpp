#include<stdio.h>
#include<conio.h>
#include "include/LlibreriaCriptografica.h"

int main() {
	char missatge[200] = "Uaaaala!";
	printf("%s\n", missatge);
	encripta(missatge);
	printf("%s\n", missatge);
	desencripta(missatge);
	printf("%s\n", missatge);
	_getch();
	return 0;
}