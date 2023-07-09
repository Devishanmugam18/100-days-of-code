function threeSum(num) {
    num.sort((a, b) => a - b);

    let res = [];

    for (let i = 0; i < num.length - 2; i++) {
        if (i === 0 || (i > 0 && num[i] !== num[i - 1])) {
            let lo = i + 1, hi = num.length - 1, sum = 0 - num[i];

            while (lo < hi) {
                if (num[lo] + num[hi] === sum) {
                    let temp = [];
                    temp.push(num[i]);
                    temp.push(num[lo]);
                    temp.push(num[hi]);
                    res.push(temp);

                    while (lo < hi && num[lo] === num[lo + 1]) lo++;
                    while (lo < hi && num[hi] === num[hi - 1]) hi--;

                    lo++;
                    hi--;
                } else if (num[lo] + num[hi] < sum) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
    }
    return res;
}

let arr = [-1, 0, 1, 2, -1, -4];
let ans = threeSum(arr);
console.log("The triplets are as follows: ");
for (let i = 0; i < ans.length; i++) {
    for (let j = 0; j < ans[i].length; j++) {
        console.log(ans[i][j] + " ");
    }
    console.log();
}
