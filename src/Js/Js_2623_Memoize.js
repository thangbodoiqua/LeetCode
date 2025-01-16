/*Given a function fn, return a memoized version of that function.

A memoized function is a function that will never be called twice with the same inputs. Instead it will return a cached value.

You can assume there are 3 possible input functions: sum, fib, and factorial.

sum accepts two integers a and b and returns a + b. Assume that if a value has already been cached for the arguments (b, a) where a != b, it cannot be used for the arguments (a, b). For example, if the arguments are (3, 2) and (2, 3), two separate calls should be made.
fib accepts a single integer n and returns 1 if n <= 1 or fib(n - 1) + fib(n - 2) otherwise.
factorial accepts a single integer n and returns 1 if n <= 1 or factorial(n - 1) * n otherwise.*/
var memorized = function (fn) {
    let callCount = 0;
    let cache = new Map();
    const memoize = function (...args) {
        let key = JSON.stringify(args);
        if (!cache.has(key)) { 
            ++callCount;
            cache.set(key, fn(...args));
        }
        return cache.get(key);
    }
    memoize.getCallCount = () => callCount;
    return memoize;
}
var sum = (a, b) => a + b;
var fib = (n) => {
    if (n <= 1) {
        return 1;
    } else { 
        return fib(n - 1) + fib(n - 2);
    }
}
var factorial = (n) => {
    if (n <= 1) {
        return 1;
    } else { 
        return n * factorial(n - 1);
    }
}

var sumTest = memorized(sum);
console.log(sumTest(2, 2));
console.log(sumTest(2, 2));
console.log(sumTest(2, 4));
console.log(sumTest.getCallCount());
