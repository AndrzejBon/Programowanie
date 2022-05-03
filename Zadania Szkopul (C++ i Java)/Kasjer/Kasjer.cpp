#include <bits/stdc++.h>
using namespace std;
int Poc[100046]; // tablica czasu przybycia klientow
int Time[100046]; // tablica czasu zajmowanego przez klientow
int wyn; // wynik zadania
int main(){
	int n,L,a; // n - liczba klientow, L - czas trwania dnia pracy, a - dlugosc przerwy na papierosa
	scanf("%d %d %d",&n,&L,&a);
	for(int i=1;i<=n;i++){
		scanf("%d %d",&Poc[i],&Time[i]);
	}
	wyn=Poc[1]/a;
	for(int i=2;i<=n;i++){
		wyn+=(Poc[i]-(Poc[i-1]+Time[i-1]))/a;
	}
	wyn+=(L-(Poc[n]+Time[n]))/a;
	if(n==0)
		wyn=L/a;
	printf("%d",wyn);
}