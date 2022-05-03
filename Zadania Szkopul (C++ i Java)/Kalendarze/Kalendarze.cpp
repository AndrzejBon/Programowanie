#include<bits/stdc++.h>

using namespace std;

int A[1000046]; // kalendarz arbuzan
int B[1000046]; // kalendarz bananitow
int Ap[1000046];
int Bp[1000046];
int n, m, z; // n - liczba miesiecy kalendarz arbuzan, m - liczba miesiecy kalendarz bannanitow, z - liczba zapytan
int t1, t2, y; // t1 - liczba dni w zapytaniu, t2 - liczba miesiecy w zapytaniu, y - wynik wyszukiwania binarnego
char zn; // zn - kierunek konwersji zapytania

int Binary_SearchA(int S)
{
	int B=0;
	int E=n-1;
	int M=(B+E)/2+1;
	while(B!=E)
	{
		if(Ap[M]>=S)
			E=M-1;
		else
			B=M;
		M=(B+E)/2+1;
	}
	return B;
}

int Binary_SearchB(int S)
{
	int B=0;
	int E=m-1;
	int M=(B+E)/2+1;
	while(B!=E)
	{
		if(Bp[M]>=S)
			E=M-1;
		else
			B=M;
		M=(B+E)/2+1;
	}
	return B;
}

int main()
{
	scanf("%d %d", &n, &m);
	for(int i=1;i<=n;i++)
	{
		scanf("%d", &A[i]);
		Ap[i]=Ap[i-1]+A[i];
	}
	
	for(int i=1;i<=m;i++)
	{
		scanf("%d", &B[i]);
		Bp[i]=Bp[i-1]+B[i];
	}
	scanf("%d", &z);
	
	for(int i=1; i<=z;i++)
	{
		scanf("%d %d %c", &t1, &t2, &zn);

		if (zn=='A')
			{
			int S=Ap[t2-1]+t1;
			y=Binary_SearchB(S);
			t1=y;
			t2=S-Bp[y];
			printf("%d %d \n", t2, t1+1);
			}
		else
			{
			int S=Bp[t2-1]+t1;
			y=Binary_SearchA(S);
			t1=y;
			t2=S-Ap[y];
			printf("%d %d \n", t2, t1+1);
			}
	}
	
}