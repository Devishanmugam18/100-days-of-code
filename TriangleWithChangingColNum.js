let n = 5;
let i = 0;
//print row n times 
for (let row = 1; row <= n; row++){
    let rowCopy = row;
    let spaces = "";
    let num = "";
    let totalColInRow = row + i++; //calculating total columns in a row
    let totalSpaceInRow = n - row; //calculating total spaces in a row
    for (let s = 1; s <= totalSpaceInRow; s++){ //print spaces
        spaces += " "; //append the spaces
    }
  
    let midIter = (totalColInRow / 2); //calculate mid th iteration
    for (let c = 1; c <= totalColInRow; c++){ // print columns
      num += rowCopy; //append the column number of each row
       if (c <midIter) { // decrement the number at each column of the row till c is less than mid th iteration
            rowCopy--;
        }
        else {// increment the number at each column of the row after the mid th iteration
            rowCopy++;
        }
    }
    console.log(spaces+num); //print the spaces and number at each column of the row
}
