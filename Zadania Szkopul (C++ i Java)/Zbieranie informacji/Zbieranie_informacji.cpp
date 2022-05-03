#include <bits/stdc++.h>

using namespace std;
int kom,inf,p=1,wynik; // kom - liczpa komputeruf w żendzie oraz fragmentuf informacyji; inf - posiadane informacje; p - pozycja
bool kier=1; // kier - kierunek ruchu, 1 - prawo, 0 - lewo;
int Dro[1005]; // tablica z wartościami potrzebnymi do dostania się do kolejnego laptopa;
int main()
{
	Dro[0]=-20;
	scanf("%d",&kom);
	for(int i=1;i<=kom;i++)
	{
		scanf("%d",&Dro[i]);
	}
	while(inf<kom)
	{
		if(Dro[p]<=inf and Dro[p]>=0)
			{
				Dro[p]=-10;
				inf++;
				if(kier==1)
					p++;
				else
					p--;
					
				printf("P:%d,Inf %d, 1, wynik %d\n",p,inf,wynik);
			}
			else
			{
				if(kier==1)
					p++;
				else
					p--;
				printf("P:%d,Inf %d, 2, wynik %d\n",p,inf,wynik);
			}
		if(inf<kom)
			if(p==kom or p==0)
			{
				kier=(1-kier);
				wynik++;
				printf("P:%d,Inf %d, 3, wynik %d\n",p,inf,wynik);
			}
		
	}
	printf("%d",wynik);
}