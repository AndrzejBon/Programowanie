#include <bits/stdc++.h>

using namespace std;
int kw,sk,tmp,ap,wynik; // kw - liczba kwiatków, sk - długość skoku, ap - aktualna pozycja
string Liczba;
int Grz[105]; // grzadka
int main()
{
	ap=1;
	scanf("%d %d", &kw, &sk);
	cin >> Liczba;
	for(int i=1;i<=kw;i++)
	{
		Grz[i]=Liczba[i-1]-48;
	}
	tmp=sk;
	while(ap<kw)
	{
		if(Grz[1]==0)
		{
			wynik=-1;
			break;
		}
		else if(Grz[ap+tmp]==1)
		{
			ap+=tmp;
			tmp=sk;
			wynik++;
		}
		else
		{
			tmp--;
			if(tmp==0)
			{
				wynik=-1;
				break;
			}
		}
	}
	printf("%d", wynik);
}