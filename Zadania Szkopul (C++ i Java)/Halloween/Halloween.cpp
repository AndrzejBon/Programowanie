#include <iostream>

using namespace std;

int Tab [100046]; // tablica domow
int Pref [100046]; // tablica prefiksow
int main ()
{
	int t,n; // t - liczba zapytan, n - liczba domow
	cin>> t >> n;
	
	for (int i=1;i<=n;i++)
		{
			cin >> Tab [i];
		}
	
	Pref [0]=0;
	
	for (int i=1;i<=n;i++)
		{
			Pref[i]=Pref[i-1]+Tab[i];
		}
	
	int a,b; // a - poczatek zakresu domow, b - koniec zakresu domow
	
	for (int i=1;i<=t;i++)
		{
			cin>> a >> b;
			cout<< Pref[b]-Pref[a-1]<<endl;
		}
		
}
