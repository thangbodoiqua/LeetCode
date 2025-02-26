var cancellable = function(fn, args, t) {
  return setTimeout(() => fn(args), t);  
};
const cancelTimeMs = 50;
const cancelFn = cancellable((x) => x * 5, [2], 20);
