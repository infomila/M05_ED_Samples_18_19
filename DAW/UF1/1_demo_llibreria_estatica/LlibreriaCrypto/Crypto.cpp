#include "Crypto.h"

void encripta(char *msg) {
	while ((*msg) != 0) {
		(*msg) += 15;
		msg++;
	}
}

void desencripta(char *msg) {
	while ((*msg) != 0) {
		(*msg) -= 15;
		msg++;
	}
}