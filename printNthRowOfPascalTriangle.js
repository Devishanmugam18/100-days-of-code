function nCr(n, r) {
    let res = 1;
  
    // calculating nCr:
    for (let i = 0; i < r; i++) {
      res = res * (n - i);
      res = res / (i + 1);
    }
    return res;
}
  
  function printNthRowOfPascalTriangle(n) {
    // printing the entire row n:
    for (let c = 1; c <= n; c++) {
      console.log(nCr(n - 1, c - 1) + " ");
    }
    console.log("n");
}
  
const n = 5;
pascalTriangle(n);
