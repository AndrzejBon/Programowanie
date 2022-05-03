#include <bits/stdc++.h>

using namespace std;

int wyk, ark, zesz; // wyk - ilosc ozdob do wykonania, ark - ilosc arkuszy w zeszycie, zesz - wymagana ilosc zeszytow
int czer, ziel, nieb; // czer - wymagana ilosc czerwonych arkuszy, ziel - wymagana ilosc zielonych arkuszy, nieb - wymagana ilosc niebieskich arkuszy 

int main()
{
	scanf("%d %d", &wyk, &ark);
	while(czer<wyk*2)
	{
		czer+=ark;
		zesz++;
	}
	while(ziel<wyk*5)
	{
		ziel+=ark;
		zesz++;
	}
	while(nieb<wyk*8)
	{
		nieb+=ark;
		zesz++;
	}
	printf("%d", zesz);
}

