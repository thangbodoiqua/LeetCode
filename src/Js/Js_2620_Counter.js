/*Given an integer n, return a counter function. 
This counter function initially returns n 
and then returns 1 more than the previous
value every subsequent time it is called (n, n + 1, n + 2, etc).
 */
var createCounter = function (n) {
    return function count() {
        return n++;
    };
};

const counter = createCounter(10);
console.log(counter());
console.log(counter());
console.log(counter());

//Thực chất đoạn code này khá khó hiểu ở việc tạo ra và gọi hàm liên tục thì nó lại vẫn lưu đc giá trị của n
//Nhưng hiểu một cách đơn giản hơn, ta  coi  createCounter bên trong kia là 1 constructor, n là một thuộc tính của lớp
// Lúc này ta tạo ra biến counter tức cũng là tạo một đối tượng của lớp creatCounter
// Và với mỗi lần gọi counter ra là ta đang gọi hàm thực hiện việc tăng thuộc tính n lên một giá trị