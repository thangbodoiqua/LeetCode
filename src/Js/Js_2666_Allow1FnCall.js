/*Given a function fn, return a new function that is identical to the original function
 except that it ensures fn is called at most once.

The first time the returned function is called, it should return the same result as fn.
Every subsequent time it is called, it should return undefined.*/

var once = function (fn) {
    let isCall = false;
    return function (...args) {
        if (isCall === false) {
            isCall = true;
            return fn(...args);
        } else
            return undefined;
    }
}

let call = once((a, b, c) => a + b + c);
console.log(call(1, 2, 3));
console.log(call(4, 5, 6));