function countSquares(n){
    let result = 0;
    while (n !== 0){
        result+= Math.pow(n, 2);
        n--;
    }
    return result;
}

console.log(countSquares(10))