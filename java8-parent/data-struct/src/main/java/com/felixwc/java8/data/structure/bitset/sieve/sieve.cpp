#include <bitset>
#include <iostream>
#include <ctime>

using namespace std;

int main(void){
    const int N = 2000000;
    clock_t cstart = clock();
    bitset<N+1> bitset;
    int count =0;
    int i;
    for(i=2;i<=N;i++){
        bitset.set(i);
    }
    i=2;
    while (i*i<=N){
        if(bitset.test(i)){
            count++;
            int k=2*i;
            while (k<=N){
                bitset.reset(k);
                k+=i;
            }
        }
        i++;
    }
    while (i<=N){
        if(bitset.test(i)) count++;
        i++;
    }
    clock_t cend = clock();
    double mills = 1000.0 * (cend-cstart)/CLOCKS_PER_SEC;
    cout<<count <<"primes\n"<<mills<<" milliseconds\n";
}