// $nombredeproyecto$.cpp: define las funciones exportadas de la aplicación DLL.
//

#include "stdafx.h"

#define DLL_EXPORT

#include "LlibreriaCriptografica.h"

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