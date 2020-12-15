var http = require('http'),
    express = require('express'),
    app = express();
app.get('/', function (req, res) {
  res.end('Mensaje de prueba');
});
http.createServer(app)
    .listen(3000);