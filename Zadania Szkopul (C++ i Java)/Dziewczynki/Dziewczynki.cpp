#include <bits/stdc++.h>

using namespace std;

int Tab[1000005];

int main()
{
	int n,k,Wyn=99999999; // n - liczba osob w szeregu; k - liczba dziewczynek, jaka ma stac pod rzad; Wyn - liczba chlopcow ktorzy powinni usunas sie z szerergu
	scanf("%d %d", &n, &k);
	for (int i=1; i<=n; i++)
		scanf ("%d", &Tab[i]);
	int P=1, D=0, C=0; // P - poczatek gosienicy; D - liczba dziewczynek w szeregu; C - liczba chlopcow w szeregu	
	while (Tab[P] == 1)	
		P++;
	
	for (int i=P; i<=n; i++)
		{
			if (Tab[i]==0)
			{
				D++;
			}
			else
				C++;

			
			if (D==k)
			{
				Wyn=min(Wyn, C);
				if (Tab[P]==0)
				{P++; D--;}
				while(Tab[P]==1)
					{P++; C--;}
			}
		}
	if (Wyn != 99999999)
		printf ("%d", Wyn);
	else
		printf ("NIE");
}