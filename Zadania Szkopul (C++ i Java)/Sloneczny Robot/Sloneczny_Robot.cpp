#include <bits/stdc++.h>

using namespace std;
int n,b,a,maksa; //n = dlugosc odcinka, b - poj baterii, a - poj akumulatora, maksa - maksymalna pojemnosc akumulatora
int pt=0; //pt - pokonana trasa
int Swi[200009]; // tablica swiatla
int main()
{
	scanf("%d %d %d", &n, &b, &a);
	maksa=a;
	for(int i=1;i<=n;i++)
	{
		scanf("%d", &Swi[i]);
	}
	for(int i=1;i<=n;i++)
	{
		if(Swi[i]==1 and b!=0 and a<maksa)
		{
			b--;
			a++;
			pt++;
		}
		else if(a!=0)
		{
			a--;
			pt++;
		}
		else if(Swi[i]==0 and a==0 and b!=0)
		{
			b--;
			pt++;
		}
		else if(a==0 and b==0)
		{
			break;
		}
	}
	printf("%d", pt);
}