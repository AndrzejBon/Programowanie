#include <bits/stdc++.h>

using namespace std;
int ta,chl;
int p=1,k=1,tmp,wynik = -1000; // p, k - poczatek i koniec gasienicy; tmp - zmienna tymczasowa; wynik - koncowy wynik programu
int Tab[100005];
int main()
{
	scanf("%d %d",&ta,&chl);
	for(int i=1;i<=ta;i++)
	{
		scanf("%d", &Tab[i]);
	}
		while(k<ta+1)
		{
			if(Tab[k]!=Tab[k+1] and Tab[k+1]!=0)
				k++;
			else
			{
				tmp=k-p+1;
				wynik=max(tmp,wynik);
				p=k+1;
				k=p;
			}
		}
	printf("%d",wynik);
}