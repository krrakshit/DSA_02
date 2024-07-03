public class bitwise {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(4);

        System.out.println(getithbit(10,2));
        System.out.println(setithbit(10,2));
        System.out.println(clearithbit(10, 1));
        System.out.println(updateithbit(10,2,1));
        System.out.println(updtbit(10,2,1));

        System.out.println(clearibit(15,2));

        System.out.println(rangebit(10, 2, 4));
        System.out.println(power2(8));
        System.out.println(count(10));
        System.out.println(fastexpo(3,5));
        System.out.println(fastexpo(5,3));

    }

    public static int getithbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithbit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clearithbit(int n, int i) {
        int bitmask = ~(1 << i);
        return n & bitmask;
    }

    public static int updateithbit(int n, int i, int newbit) {
        if (newbit == 0) {
            return setithbit(n, i);
        } else {
            return clearithbit(n, i);
        }
    }

    public static int updtbit(int n, int i, int newbit) {
        n = clearithbit(n, i);
        int bitmask = newbit << 1;
        return n | bitmask;
    }

    public static int clearibit(int n, int i) {
        int bitmask = (~0) << i;
        return n & bitmask;
    }

    public static int rangebit(int n, int i, int j) {
        int a = (~0) << (j + 1);
        int b = ((1 << i) - 1);
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean power2(int n) {
        return (n & (n - 1)) == 0;
    }
    public static int count(int n){
        int count =0;
        while (n>0){
            if ((n&1) != 0){
                count++;
            }
            n =  n>>1;
        }
        return count;
    }
    public static int fastexpo(int a,int n){
        int ans = 1;
        while (n>0){
            if ((n&1) !=0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
}
