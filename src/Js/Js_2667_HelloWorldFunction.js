const createHelloWorld = function () {
    return function (...args) {
        return "Hello World!";
    }
}
console.log(createHelloWorld);
console.log(createHelloWorld());
console.log(createHelloWorld()());


const consoleLog = createHelloWorld();
console.log(consoleLog());

// Sự  khác nhau về việc gọi 1 hàm() có ngoặc và hàm ko có ngoặc
// Hàm có ngoặc gọi đến và thực thi trong khi ko có ngoặc thì chỉ là tham chiếu đến hàm đó mà ko thực thi hàm
// Ví dụ như trên, khi gọi hàm createHeloWorld bình thường thì nó sẽ chỉ trả về tham chiếu đến hàm đó và log ra tên của biến function
// Nhưng nếu có ngoặc thì nó sẽ thực thi và trả về một anonymous func, tức function bên trong
// và nếu có 2 ngoặc, điều này tương ứng vs việc ta tiếp tục thực thi hàm bên trong và nó sẽ log ra kết quả "HelloWorld"
// Thay vào đó ta có thể gán vào 1 biến và console log nó ra như 2 dòng cuối cùng, và nhớ là phải đầy đủ ngoặc
