var express = require('express'),
  flight = require('../gf/flight')
  data = require('../gf/data');
var router = express.Router();

var flights = [];
for (var element in data) {
  flights.push(flight(data[element]));
}
router.get('/', function(req, res, next) {
  res.json(flights);
});
router.get('/list', function(req, res, next) {
  res.render('flist', { title: 'Lista de vuelos',flights: flights });
});
router.get('/:number', function (req, res, next) {
  var num = req.params['number'];
  var record = null;
  for (var e in flights) {
    var element = flights[e];
    if (element.data.number == num) {
      record = element;
      break;
    }
  }
  if (record == null) { 
    res.status(404).json({msg:"No data found "});
  } else {
    res.json(record.getInformation());
  }
});
router.post('/:number/arrived', function (req, res, next) {
  var num = req.params['number'];
  var record = null;
  for (var e in flights) {
    var element = flights[e];
    if (element.data.number == num) {
      record = element;
      break;
    }
  }
  if (record == null) { 
    res.status(404).json({msg:"No data found "});
  } else {
    record.triggerArrive();
    res.json({status:"done"});
  }
});
module.exports = router;
