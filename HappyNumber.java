public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(n!=0 && !seen.contains(n)){
            int sum=0;

            seen.add(n);
            while(n>0){
                int digit = n%10;
                sum+= digit*digit;
                n = n/10;

            }
            n = sum;
        }
        return n == 1;
    }
