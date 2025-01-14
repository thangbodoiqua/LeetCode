/*Given an integer array arr and a mapping function fn, 
return a new array with a transformation applied to each element.

The returned array should be created such that returnedArray[i] = fn(arr[i], i).

Please solve it without the built-in Array.map method.*/

var map = function (arr, fn) {
    let newArray = [];
    for (let i = 0; i < arr.length; i++){
        newArray[i] = fn(arr[i], i);
    }
    return newArray;
}

function plusI(n, i) {
    return n + i;
}
function constant(n, i) {
    return 42;
}
function plusOne(n) {
    return n + 1;
}

let transform = map([1, 2, 3], plusI);
console.log(transform);


