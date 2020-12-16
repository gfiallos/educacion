let mod = require('./gfmodule'),
  mod1 = require('./gfmodule'),
  mod2 = require('./gfmodule1');
mod.setNumber(123);
mod.setName("GF");
console.log(mod.getInfo());
mod1.setNumber(1231);
mod1.setName("GF1");
console.log(mod1.getInfo());

let obj1 = mod2({ number: 1, name: "ZZ" });
let obj2 = mod2({ number: 2, name: "ZZsdd" });
console.log(obj1.getInformation());
console.log(obj2.getInformation());