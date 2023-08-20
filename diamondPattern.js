let n = 5;

for (let row = 1; row < 2*n ; row++) {
    let num = "";
    let spaceInRow = "";

    let totalColInRow = row > n ? 2 * n - row : row;
    let spaces = n - totalColInRow;
    for (let s = 1; s <= spaces; s++){
        spaceInRow += " ";
    }
    
    for (let col = 1; col <= totalColInRow; col++) {
        num += "* ";

    }
     console.log(spaceInRow+num);
}
 
