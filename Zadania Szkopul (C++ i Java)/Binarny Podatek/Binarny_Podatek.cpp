#include <bits/stdc++.h>

using namespace std;
string bin; // liczba w kodzie binarnym
int a,zera; // a - ilosc zapytan, zera - ilosc zer w kodzie
int main()
{
	scanf("%d",&a);
	for(int i=1;i<=a;i++)
	{
		cin >> bin;
		zera=0;
		for(int j=0;j<bin.size();j++)
		{
			if(bin[j]=='0')
				zera++;
		}
		if(zera!=bin.size())
		{
		printf("1");
		}
		for(int k=1;k<=zera;k++)
			printf("0");
		printf("\n");
	}
}