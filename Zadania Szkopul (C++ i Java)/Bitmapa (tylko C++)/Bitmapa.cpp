#include <bits/stdc++.h>
using namespace std;

const int N=200;

int n,m;
string s[N];
int dis[N][N];
bool odw[N][N];

bool poprawne(int x, int y){
	if(0 <= x && x < n && 0 <= y && y < m && odw[x][y]==false)
		return true;
	else
		return false;
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin >> n >> m;
	for(int i=0;i<n;i++)
		cin >> s[i];
	queue<pair<int,int> > q;
	for(int i=0;i<n;i++)
		for(int j=0;j<m;j++)
			if(s[i][j]=='1'){
				q.push({i,j});
				odw[i][j]=true;
			}
	while(!q.empty()){
		int x = q.front().first;
		int y = q.front().second;
		q.pop();
		if(poprawne(x+1,y)){
			q.push(make_pair(x+1,y));
			odw[x+1][y]=true;
			dis[x+1][y]= dis[x][y]+1;
		}
		if(poprawne(x-1,y)){
			q.push(make_pair(x-1,y));
			odw[x-1][y]=true;
			dis[x-1][y]= dis[x][y]+1;
		}
		if(poprawne(x,y+1)){	
			q.push(make_pair(x,y+1));
			odw[x][y+1]=true;
			dis[x][y+1]= dis[x][y]+1;
		}
		if(poprawne(x,y-1)){
			q.push(make_pair(x,y-1));
			odw[x][y-1]=true;
			dis[x][y-1]= dis[x][y]+1;
		}
		
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++)
			cout<<dis[i][j]<< " ";
		cout<<"\n";
	}
}