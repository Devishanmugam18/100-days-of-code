let n = 7;
let i = 0;
let j = 1;
//print row n times
for (let row = 1; row <= 2 * n; row++){
    
    let rowCopy = row<=n ? row : n-j++;
    let spaces = "";
    let num = "";
    
    let totalSpaceInRow = row <= n ? n - row : row - n; //calculating total spaces in a row
    let totalColInRow = row <=n ? row + i++ : (2*n-1) - 2*totalSpaceInRow; //calculating total columns in a row
    for (let s = 1; s <= totalSpaceInRow; s++){ //print spaces
        spaces += " " +" "; //append the spaces
    }
    let midIter = (totalColInRow / 2); //calculate mid th iteration
    
    for (let c = 1; c <= totalColInRow; c++){ // print columns
        num += rowCopy+" " ; //append the column number of each row
        if (c <midIter) { // decrement the number at each column of the row till c is less than mid th iteration
            rowCopy--;
        }
        else {// increment the number at each column of the row after the mid th iteration
            rowCopy++;
        }
    }
    console.log(spaces+num); //print the spaces and number at each column of the row
}
