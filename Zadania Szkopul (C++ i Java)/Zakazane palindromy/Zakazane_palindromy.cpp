#include <bits/stdc++.h>

using namespace std;
string Wspak(string);
int main()
{
	string N,NN;
	cin>>N;
	NN =Wspak(N);
	while(N==NN)
	{
		N.erase(N.length()-1,1);
		NN=Wspak(N);
		if(N.length()<1)
		{
			cout<<0;
			return 0;
		}
	}
	cout<<N.length();
}


string Wspak(string N)
{
	string NN=N;
	int n=N.length();
	for(int i=0;i<n;i++)
		NN[i]=N[n-1-i];
	return NN;
}