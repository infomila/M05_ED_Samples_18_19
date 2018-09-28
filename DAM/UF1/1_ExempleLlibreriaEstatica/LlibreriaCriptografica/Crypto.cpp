#include "Crypto.h"

void encripta(char *missatge) {
	while ((*missatge) != 0) {
		(*missatge) += 15;
		missatge++;
	}
}

void desencripta(char *missatge) {
	while ((*missatge) != 0) {
		(*missatge) -= 15;
		missatge++;
	}
}