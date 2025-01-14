/*Write a function expect that helps developers test their code.
It should take in any value val and return an object with the following two functions.

toBe(val) accepts another value and returns true if the two values === each other.
If they are not equal, it should throw an error "Not Equal".

notToBe(val) accepts another value and returns true if the two values !== each other.
If they are equal, it should throw an error "Equal".


*/

const expect = function (val) {
    var toBe = function (value) {
        if (value === val) {
            return true;
        } else {
            throw new Error("Not Equal");
        }
    }
    var notToBe = function (value) {
        if (value !== val) {
            return true;
        } else {
            throw new Error("Equal")
        }
    }
    return { toBe, notToBe }; //Phải return ở đây để có thể sử dụng hàm, vì lúc này expect(val) sẽ là 1 object chứa 2 function
}

console.log(expect(5).notToBe(4));
console.log(expect(5).toBe(5));