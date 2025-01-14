/*Write a function createCounter. 
It should accept an initial integer init. 
It should return an object with three functions.

The three functions are:

    increment() increases the current value by 1 and then returns it.
    decrement() reduces the current value by 1 and then returns it.
    reset() sets the current value to init and then returns it. 
*/

var createCounter = function (init) {
    let temp = init;
    const increment = function () {
        return ++init;
    }
    const decrement = function () {
        return --init;
    }
    const reset = function () {
        init = temp;
        return init;
    }
    return { increment, decrement, reset };
    //Phải return ở đây để có thể sử dụng hàm, vì lúc này createCounter sẽ là 1 object chứa 3 function

}

let counter = createCounter(5);
console.log(counter.increment());
console.log(counter.reset());
console.log(counter.decrement());
