#include <bits/stdc++.h>

using namespace std;

int main()
{
	string a,b; // a - imie, b - nazwisko
	cin >> a >> b;
	string result ="";
	result+=a[0];
	for(int i = 1; i<a.length(); i++)
	{
		if(a[i]<b[0])
			result += a[i];
		else
		{
				break;
		}
	}
	
	result += b[0];
	cout << result;
}
