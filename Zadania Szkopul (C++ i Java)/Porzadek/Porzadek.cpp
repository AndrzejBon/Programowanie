#include <bits/stdc++.h>

using namespace std;

const int MAXN=1000046;

char S[MAXN]; // 
long long Nast[MAXN]; // tablica prefiksow nasturcji
long long Rub[MAXN]; // tablica prefiksow rudbekii
long long Wspol[MAXN]; // tablica prefiksow wspolczynnika nieporzadku

int main()
{
	long long n, t, a, b, Wyn; // n - dlugosc ogrodu, t - liczba zapytan, a - poczatek obszaru zapytania, b - koniec obszaru zapytania, wyn - wynik zapytania
	scanf("%lld", &n);
	scanf("%s", &S);
	for(int i=1; i<=n; i++)
	{
		if(S[i-1]=='N')
		{
			Nast[i]=Nast[i-1]+1;
			Rub[i]=Rub[i-1];
			Wspol[i]=Wspol[i-1]+Rub[i];
		}
		if(S[i-1]=='R')
		{
			Nast[i]=Nast[i-1];
			Rub[i]=Rub[i-1]+1;
			Wspol[i]=Wspol[i-1];
		}
	}
	scanf("%lld", &t);
	for (int i=1; i<=t; i++)
	{
		scanf("%lld %lld", &a, &b);
		Wyn=Wspol[b]-Wspol[a-1]-Rub[a-1]*(Nast[b]-Nast[a-1]);
		printf("%lld\n", Wyn);
	}
}