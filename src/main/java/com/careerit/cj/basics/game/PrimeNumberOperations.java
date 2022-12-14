package com.careerit.cj.basics.game;

public class PrimeNumberOperations {

    public int countPrimesInRange(int lb,int ub){
        int count = 0;
        for(int i=lb;i<=ub;i++){
            if(isPrime(i)){
              count++;
            }
        }
        return count;
    }
    public boolean isPrime(int num){
        if(num < 2 || (num %2 ==0 && num !=2)){
          return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num %i==0){
              return false;
            }
        }
        return true;
    }
    public int[] getPrimes(int n){
        int[] temp = new int[n];
        int count = 0;
        for(int i=2;;i++){
            if(isPrime(i)){
                temp[count++] = i;
            }
            if(count==n){
              break;
            }
        }
        return temp;
    }
}
