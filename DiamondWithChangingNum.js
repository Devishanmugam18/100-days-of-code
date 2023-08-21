let n = 4;

for (let row = 1; row < 2 * n; row++) { //run the loop 2*n times
    let spaces = ""; 
    let changingcolNum = "";
    let initRowNum = row > n ? 2 * n - row : row; //calculate initial value at each row
    for (let s = 1; s <= n-initRowNum; s++) { //run the loop till the space count
        spaces += " "; //append the each space
    }
    for (let c = initRowNum; c >= 1; c--) { // run the loop from inital row number till 1 
        changingcolNum += c; //append the number which changes on each iteration
    }
    for (let c = 2; c <= initRowNum; c++) { // run the loop from 2 till initial row number
        changingcolNum += c; // append the number which changes on each iteration
    }

    console.log(spaces + changingcolNum); //print the spaces and changing column number of each row

}
