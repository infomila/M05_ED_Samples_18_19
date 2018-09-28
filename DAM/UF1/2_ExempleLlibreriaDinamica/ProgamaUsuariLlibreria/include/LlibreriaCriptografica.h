#pragma once

#if defined DLL_EXPORT
#define DECLDIR __declspec(dllexport)
#else
#define DECLDIR __declspec(dllimport)
#endif

extern "C" DECLDIR void encripta(char *missatge);
extern "C" DECLDIR void desencripta(char *missatge);
