
function generateRow(row) {
    let ans = 1;
    let ansRow = [1]; // inserting the 1st element
  
    // calculate the rest of the elements:
    for (let col = 1; col < row; col++) {
      ans = ans * (row - col);
      ans = ans / col;
      ansRow.push(ans);
    }
    return ansRow;
}
  
function pascalTriangle(n) {
    let ans = [];

    // store the entire pascal's triangle:
    for (let row = 1; row <= n; row++) {
        ans.push(generateRow(row));
    }
    return ans;
}
  
let n = 5;
let ans = pascalTriangle(n);
for (let i = 0; i < ans.length; i++) {
    console.log(ans[i].join(" "));
}
