#include <bits/stdc++.h>

using namespace std;
int T[102],n;
int main()
{
	cin>>n;
	for(int i=0;i<n;i++)
		cin>>T[i];
	for(int i=1;i<n-1;i++)
	{
		if(T[i-1]==1 && T[i+1]==1)
		{
			T[i]=1;
		}
	}
	int wynik=0;
	for(int i=0;i<n;i++)
	{
		if(T[i]==1)
		wynik++;
	}
	cout<<wynik;
}