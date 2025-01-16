/*
Given two promises promise1 and promise2, return a new promise. 
promise1 and promise2 will both resolve with a number. 
The returned promise should resolve with the sum of the two numbers.
*/
var addTwoPromises = async function (promise1, promise2) {
    var pm1 = await promise1;
    var pm2 = await promise2;
    return pm1 + pm2;
};
let promise1 = new Promise(resolve => setTimeout(() => resolve(2), 20)); 
let promise2 = new Promise(resolve => setTimeout(() => resolve(5), 60));
let twoP = await addTwoPromises(promise1, promise2);
console.log(twoP)