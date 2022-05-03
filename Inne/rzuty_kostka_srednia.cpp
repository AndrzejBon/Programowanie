// Program ten liczy średnią wyrzuconą liczbę oczek, przy podaniu wielkości kości jak i samych rzutów, program zostaje przerwany, gdy podamy "-1" jako wartość rzutu


#include <iostream>

using namespace std;

int Tab[30];
int main(){
    float ile=0,sum=0;
    int a,b;
    float wyn;
    cout<<"Podaj rozmiar kosci: ";
    cin>>b;
    cout<<"Podaj rzuty: \n";
    while (a!=-1)
    {
        cin>>a;
        if(a>b){
        cout<<"Zla wartosc rzutu\n";
        }
        else if(a!=-1){
            Tab[a]++;
            sum+=a;
            ile++;
            wyn=sum/ile;
            cout<<"Srednia: "<<wyn<<"\n";
        }
    }
    cout<<"\nIle razy wystepowala kazda liczba oczek: ";
    for(int i=1;i<=b;i++){
        cout<<"\n"<< i <<": "<<Tab[i];
    }
    wyn=sum/ile;
    //cout<<sum<<"\n"<<ile<<"\n";
    cout<<"\nSuma rzutow to: "<< sum <<"\nIle rzutow: "<< ile <<"\nSrednia to: "<<wyn;
    return 0;
}