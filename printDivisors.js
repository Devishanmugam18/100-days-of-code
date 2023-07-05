
function printDivisors(n) {
  console.log("The Divisors of " + n + " are:");
  for (let i = 1; i <= Math.sqrt(n); i++) {
    if (n % i === 0) {
      process.stdout.write(i + " ");
      if (i !== n / i) {
        process.stdout.write(n / i + " ");
      }
    }
  }
  console.log("\n");
}

printDivisors(36);

