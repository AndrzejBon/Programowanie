#include <bits/stdc++.h>

using namespace std;
const int N=5006;
const int INF=1e9+5;

int n,m,k;
vector<int> kraw[N];
bool odw[N][2];
int dis[N][N][2];

int main()
{
	scanf("%d%d%d", &n, &m,&k);
	for(int i=1;i<=m;i++){
		int a,b;
		scanf("%d%d",&a,&b);
		kraw[a].push_back(b);
		kraw[b].push_back(a);
	}
	for(int i=1;i<=n;i++)
		for(int j=1; j<=n;j++)
			dis[i][j][0]=dis[i][j][1]=INF;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++)
			odw[j][0]=odw[j][1]=false;
		queue<pair<int, int> > q;
		q.push(make_pair(i, 0));
		odw[i][0]=true;
		dis[i][i][0]=0;
		while(!q.empty()){
			int x=q.front().first;
			int parz=q.front().second;
			parz = 1-parz;
			q.pop();
			for(int j=0; j < kraw[x].size(); j++)
				if(!odw[kraw[x][j]][parz]){
					q.push(make_pair(kraw[x][j],parz));
					odw[kraw[x][j]][parz]=true;
					dis[i][kraw[x][j]][parz]=dis[i][x][1-parz] + 1;
				}
		}
	}
	for(int i=1;i<=k;i++){
		int a,b,w;
		scanf("%d%d%d", &a,&b,&w);
		if(w < dis[a][b][w%2] || (a == b && kraw[a].size() == 0 && w!=0 ))
			printf("NIE\n");
		else
			printf("TAK\n");
	}
	
	
	
	
	
}