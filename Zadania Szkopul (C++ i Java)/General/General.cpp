#include <bits/stdc++.h>

using namespace std;

long long Tab[1000000]; // tablica miast
long long n,k; // n - liczba miast, k - potencjal wojskowy
int  P=1, i=1; // P - poczatek gasienicy, i - koniec gasienicy
int main()

{
	scanf("%lld %lld", &n, &k);
	for ( i=1;i<=n;i++)
		scanf("%lld", &Tab[i]);
		Tab[i]=999999999999999999;
		
		i=1;
	while(P<=n)
		{
			while(Tab[P]+k>=Tab[i])
				{i++;}
			i--;
			printf("%lld ", i);
			P++;
		}
}
