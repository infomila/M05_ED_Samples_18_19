// $nombredeproyecto$.cpp: define las funciones exportadas de la aplicación DLL.
//

#include "stdafx.h"
#define ESTIC_FENT_LA_DLL

#include "LlibreriaCriptografica.h"

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