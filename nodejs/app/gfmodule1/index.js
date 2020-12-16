module.exports = function (info) {

	var values = {
		number: null,
		name: null
	};

	for(var prop in values) {
		if(values[prop] !== 'undefined') {
			values[prop] = info[prop];
		}
	}

	var functions = {
	  setNumber: function (pNumber) {
  values.number = pNumber;
},
setName: function (pName) {
  value.name = pName;
},
		getInformation: function () {
			return values;
		}
	};

	return functions;

};