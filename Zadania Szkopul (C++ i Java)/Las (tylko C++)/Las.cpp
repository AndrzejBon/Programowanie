#include <bits/stdc++.h>
using namespace std;
const int N=1005;
const int INF = 1e9 + 5;

int n,d;
int tab[N][N];
bool odw[N][N];

int bfs(int x,int y,int k){
	int rozm=1;
	queue <pair<int,int> > q;
	q.push({x,y});
	odw[x][y]=true;
	while(!q.empty()) {
		int a=q.front().first;
		int b=q.front().second;
		q.pop();
		if(odw[a+1][b]==false && tab[a+1][b] <=k){
			q.push({a+1,b});
			odw[a+1][b]=true;
			rozm++;
		}
		if(odw[a-1][b]==false && tab[a-1][b] <=k){
			q.push({a-1,b});
			odw[a-1][b]=true;
			rozm++;
		}
		if(odw[a][b+1]==false && tab[a][b+1] <=k){
			q.push({a,b+1});
			odw[a][b+1]=true;
			rozm++;
		}
		if(odw[a][b-1]==false && tab[a][b-1] <=k){
			q.push({a,b-1});
			odw[a][b-1]=true;
			rozm++;
		}
	}
	return rozm;
	
}

bool sprawdz(int k){
	for(int i=1;i<=n;i++)
		for(int j=1;j<=n;j++)
			odw[i][j]=false;
	int spojna=0;
	for(int i=1;i<=n;i++)
		for(int j=1;j<=n;j++)
			if(tab[i][j]<=k && odw[i][j]==false)
				spojna = max(spojna,bfs(i,j,k));
	return spojna>=d;
}

int main()
{
	scanf("%d%d",&n,&d);
	for(int i=1;i<=n;i++)
		for(int j=1;j<=n;j++)
			scanf("%d",&tab[i][j]);
	for(int i=0; i<=n+1;i++)
		tab[0][i] = tab[n+1][i] = tab[i][0]=tab[i][n+1]= INF;
	int b=tab[1][1],e=tab[1][1];
	for(int i=1;i<=n;i++)
		for(int j=1;j<=n;j++){
			b=min(b,tab[i][j]);
			e=max(e,tab[i][j]);
		}
	int m=(b+e)/2;
	while(b<e){
		if(sprawdz(m))
			e=m;
		else 
			b=m+1;
		m=(b+e)/2;
	}
	printf("%d",b);
	
}