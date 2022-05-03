#include <bits/stdc++.h>

using namespace std;
int han,kwo,z,s;
bool odw;
string result;
int Tabh[55][55];

string ToString(int);

int main(){
	scanf("%d %d", &han, &kwo);
	for(int i=1;i<=han;i++){
		scanf("%d", &z);
		Tabh[i][0]=z;
		for(int j=1;j<=z;j++){
			scanf("%d", &Tabh[i][j]);
		}
	}
	
	for(int i=1;i<=han;i++){
		for(int j=1;j<=Tabh[i][0];j++){
			if(Tabh[i][j]<kwo){
				if(odw==false){
					s++;
					result+=ToString(i);
					result+=" ";
					odw=true;
				}
			}
		}
		odw=false;
	}
			
	printf("%d\n", s);
	cout << result;
	
}

string ToString(int i){
	string wynik="";
	char cyfra;
	while(i!=0){
		cyfra=i%10+48;
		i=i/10;
		wynik=cyfra+wynik;
	}
	
	return wynik;
	
}
