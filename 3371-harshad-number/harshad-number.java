class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int num = x;
        
        if(x <= 0){
            return -1;
        }
        
        while( x > 0){
            sum += x % 10;
            x /= 10;
        }
        
        if(num % sum == 0){
            return sum;
        }
        return -1;
    }
}