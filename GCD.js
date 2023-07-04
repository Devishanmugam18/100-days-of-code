let num1 = 4, num2 = 8;
let ans;

for (let i = 1; i <= Math.min(num1, num2); i++) {
  if (num1 % i === 0 && num2 % i === 0) {
    ans = i;
  }
}

console.log("The GCD of the two numbers is " + ans);
