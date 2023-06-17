public class MooreVotingAlgo {
    public static int majorityElement(int []a) {
        int a = v.length;
        int count = 0;
        int elem = 0; 
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                count = 1;
                elem = a[i];
            } else if (elem == a[i]) count++;
            else count--;
        }
        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == elem) count1++;
        }
        if (count1 > (n / 2)) return elem;
        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
