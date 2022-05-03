#include <bits/stdc++.h>

using namespace std;

int Tab[1005][1005]; // tablica komnat
int Pref[1005][1005]; // tablica prefiksow
int najw=-1; // najwieksza mozliwa do zebrania ilosc diamentow w obszarze
int main()
{
	int n, m, k, temp; // n,m - wymiary mapy, k - ilosc zapytan, temp = tymczasowa zmienna
	int a, b, c, d; // a,b - koordynaty lewego gornego rogu obszaru; c,d - koordynaty prawego dolnego roku obszaru
	scanf("%d %d", &n, &m);
	
	for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=m; j++)
				{
					scanf("%d", &Tab[i][j]);
				}
		}
			
	for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=m; j++)
				{
					Pref[i][j]=Tab[i][j]+Pref[i-1][j]+Pref[i][j-1]-Pref[i-1][j-1];
				}
		}
	
	scanf("%d", &k);

	for (int i=1; i<=k; i++)
		{
					scanf("%d %d %d %d", &a, &b, &c, &d);
					temp=Pref[c][d]-Pref[a-1][d]-Pref[c][b-1]+Pref[a-1][b-1];
					najw=max(temp,najw);
		}
	printf("%d ", najw);
}