#include <bits/stdc++.h>
using namespace std;

const int N = 1e6+4;
const long long INF = 1e18+5;

int n, m, s;
vector<pair<int, int> > V[N];
bool odw[N];
long long dis[N];

void dijkstra(int s)
{
    for(int i = 1; i <= n; i++)
        dis[i] = INF;
    priority_queue<pair<long long, int> > q;
    dis[s] = 0;
    q.push(make_pair(0, s));
    while(!q.empty())
    {
        int x = q.top().second;
        q.pop();
        if(odw[x])
            continue;
        odw[x] = true;
        for(int i = 0; i < V[x].size(); i++)
        {
            int v = V[x][i].first;
            int d = V[x][i].second;
            if(dis[v] > dis[x] + d)
            {
                dis[v] = dis[x] + d;
                q.push(make_pair(-dis[v], v));
            }
        }
    }
}

int main()
{
    scanf("%d%d%d", &n, &m, &s);
    for(int i = 1; i <= m; i++)
    {
        int a, b, w;
        scanf("%d%d%d", &a, &b, &w);
        V[a].push_back(make_pair(b, w));
        V[b].push_back(make_pair(a, w));
    }
    dijkstra(1);
    int bubu;
    long long mini = INF;
    for(int i = 1; i <= s; i++)
    {
        int z;
        scanf("%d", &z);
        mini = min(mini, dis[z]);
    }
    scanf("%d", &bubu);
    if(mini <= dis[bubu])
    {
        cout << "-1";
    }
    else
    {
        cout << dis[bubu];
    }
}