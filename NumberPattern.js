let n = 4;
let totalRow = 2 * n - 1;

for (let row = 1; row <=totalRow; row++){
    let num = "";
    for (let col = 1; col <=totalRow; col++){
        
        let atEveryIndex = n - Math.min(Math.min(row - 1, col - 1), Math.min(totalRow - col, totalRow - row)); //calculate the left,right,up,down distance of each value 
                                                                            //and calculate min distance among all then subtract with n to get the value at each index
        num += atEveryIndex +" ";
    }
    console.log(num);
}
