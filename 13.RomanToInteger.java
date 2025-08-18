class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        char ch = s.charAt(s.length() - 1); 
        int val1 = 0;

        if (ch == 'I') val1 = 1;
        if (ch == 'V') val1 = 5;
        if (ch == 'X') val1 = 10;
        if (ch == 'L') val1 = 50;
        if (ch == 'C') val1 = 100;
        if (ch == 'D') val1 = 500;
        if (ch == 'M') val1 = 1000;

        sum = val1; 

        for (int i = s.length() - 2; i >= 0; i--) { 
            int val2 = 0;
            char chn = s.charAt(i);

            if (chn == 'I') val2 = 1;
            if (chn == 'V') val2 = 5;
            if (chn == 'X') val2 = 10;
            if (chn == 'L') val2 = 50;
            if (chn == 'C') val2 = 100;
            if (chn == 'D') val2 = 500;
            if (chn == 'M') val2 = 1000;

            if (val2 < val1) {
                sum -= val2; 
            } else {
                sum += val2; 
            }

            ch = chn;
            val1 = val2; 
        }

        return sum;
    }
}