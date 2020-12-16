let number, name;

exports.setNumber = function (pNumber) {
  number = pNumber;
};
exports.setName = function (pName) {
  name = pName;
};
exports.getInfo = function () { 
  return { number: number, name: name};
};
