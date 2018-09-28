#pragma once

#if defined ESTIC_FENT_LA_DLL
#define DECLDIR __declspec(dllexport)
#else
#define DECLDIR  __declspec(dllimport)
#endif

extern "C" DECLDIR void encripta(char *msg);
extern "C" DECLDIR void desencripta(char *msg);