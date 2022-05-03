#include <bits/stdc++.h>
using namespace std;
int Ksi[200010];
int k,id,L=0,R=0; // k - ilosc polecen, zn - znak, id - indeks, L,R - kolejnosc ksiazki od lewej i prawej
char zn;
int tmp1,tmp2,tmp3;
int main(){
	scanf("%d",&k);
	for(int i=1;i<=k;i++){
		cin>>zn>>id;
		if(zn=='R'){
			R++;
			Ksi[id]=R;
		}
		else if(zn=='L'){
			L++;
			Ksi[id]=(0-L);
		}
		else if(zn=='?'){
			tmp1=R-Ksi[id];
			tmp2=L+Ksi[id];
			tmp3=min(tmp1,tmp2);
			//printf("tmp3 %d,tmp2 %d,tmp1 %d,R %d,L %d, Ksi[%d] %d",tmp3,tmp2,tmp1,R,L,id,Ksi[id]);
			printf("%d \n",tmp3);
		}
	}
}
