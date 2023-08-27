/**
 * @param {number[]} prices
 * @return {number}
 */
let buyingPrice = function(prices){
let minPrice =  prices[0];
for(let i=1;i<prices.length-1;i++){
    if(prices[i]<minPrice){
        minPrice = prices[i];
        buyDay = i;
    }
}
 return [buyDay,minPrice];
}


let sellingPrice =  function(prices,buyDay,buyPrice){
    let max = buyDay+1;
    for(let j=buyDay+2; j<prices.length-1;j++){
        if(prices[j]>max){
            max=prices[j];
        }
    }
    max-buyPrice;
}

var maxProfit = function(prices) {
 let buy=buyingPrice(prices);
 if(buy[0]==prices.length-1){ 
 let profit=  sellingPrice(prices,buy[0],buy[1]);
 return profit;
 }
 else return 0;
};
