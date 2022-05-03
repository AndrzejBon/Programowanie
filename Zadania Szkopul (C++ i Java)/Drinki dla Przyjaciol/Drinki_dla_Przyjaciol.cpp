#include <bits/stdc++.h>

using namespace std;
int bp,bs,bj; // bp - butelki piotra, bs - butelki stefana, bj - butelki jozka
int cc,ft,sp; // cc - butelki coli, ft - butelki fanty, sp - butelki spritea

int main()
{
	scanf("%d %d %d", &bp, &bs, &bj);
	scanf("%d %d %d", &cc, &ft, &sp);
	if(bp<=cc)
	{
		cc=cc-bp;
		bp=0;
		if(cc<=bs)
		{
			bs=bs-cc;
			cc=0;
			if(ft<=bs)
			{
				bs=bs-ft;
				ft=0;
				if(sp<=bj)
				{
					bj=bj-sp;
					sp=0;
				}
				else
				{
					sp=sp-bj;
					bj=0;
				}
			}
			else
			{
				ft=ft-bs;
				bs=0;
				if(ft<=bj)
				{
					bj=bj-ft;
					ft=0;
					if(sp<=bj)
					{
						bj=bj-sp;
						sp=0;
					}
					else
					{
						sp=sp-bj;
						bj=0;
					}
				}
				else
				{
					ft=ft-bj;
					bj=0;
				}
			}
		}
		else
		{
			cc=cc-bs;
			bs=0;
			if(cc<=bj)
			{
				bj=bj-cc;
				cc=0;
				if(ft<=bj)
				{
					bj=bj-ft;
					ft=0;
					if(sp<=bj)
					{
						bj=bj-sp;
						sp=0;
					}
					else
					{
						sp=sp-bj;
						bj=0;
					}
				}
				else
				{
					ft=ft-bj;
					bj=0;
				}
			}
			else
			{
				cc=cc-bj;
				bj=0;
			}
		}
	}
	if(bp<=0 and bs<=0 and bj<=0)
		printf("TAK");
	else
		printf("NIE");
}