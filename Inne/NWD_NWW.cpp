#include<iostream>
#include<ctime>
#include<algorithm>
using namespace std;
 
//deklaracja funkcji
int NWDo(int,int); // Najwiekszy wspolny dziennik - Euklides odejmowanie
int NWDd(int,int); // Najwiekszy wspolny dzielnik - Euklides dzielenie
int NWW(int,int); // Najmniejsza wspolna wielokrotnosc - do obliczenia wartosci korzystamy z funkcji NWD (NWDd) 
 

int main()
{
   int a,b;
   srand(time(NULL));
   for(int i=0;i<3;i++)
      {
       a=rand()%3000+1;
       b=rand()%3000+1;
       cout<<"\n\nNWD (odejmowanie) dla "<<a<<" i "<<b<<" wynosi "<<NWDo(a,b);
       cout<<"\nNWD (dzielenie) dla "<<a<<" i "<<b<<" wynosi "<<NWDd(a,b);
       cout<<"\nNWW dla "<<a<<" i "<<b<<" wynosi "<<NWW(a,b);
      }
}


int NWDo(int x,int y)
    {
    while (x!=y)
          if (x>y)
             x-=y;
          else
             y-=x;
    return x;                      
    }
 
int NWDd(int x,int y)
   {
   int r=x%y;
   while (r!=0)
       {
          x=y;
          y=r;
          r=x%y;
       }
    return y;              
    }
            
int NWW(int x,int y)
    {
       return x/NWDd(x,y)*y;
    }
