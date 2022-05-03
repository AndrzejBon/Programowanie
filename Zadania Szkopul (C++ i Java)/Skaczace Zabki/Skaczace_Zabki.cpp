#include <bits/stdc++.h>

using namespace std;
long long poz,p,t,s,z,tmp,tmp2; // poz - pozycja zabki, p - dlugosc skoku do przodu, t - dlugosc skoku do tylu, s - ilosc skokow, z - ilosc zabek
int main()
{
	scanf("%d",&z);
	for(int i=1;i<=z;i++)
	{
		scanf("%lld %lld %lld", &p,&t,&s);
		poz=0;
		tmp=s/2;
		tmp2=p-t;
		if(tmp2!=0)
		{
			for(int j=1;j<=tmp;j++)
			{
				poz+=tmp2;
			}
		}	
		if(s%2==1)
			poz+=p;
		printf("%lld\n",poz);
	}
	
}