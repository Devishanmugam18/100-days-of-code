var map = function(arr, fn) {
    const ans=[];
    for(let i=0;i<arr.length;i++)
    ans[i]=fn(arr[i],i);
    return ans;
};
