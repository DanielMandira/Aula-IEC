const http = require('http')
const server = http.createServer((req, res)=>{
    res.writeHead(200,{'Content-Type': 'text/plain'});
    res.end('Servidor Node.js feito por Daniel Mandira rodando no Docker\n');
});

const PORT = 3000;
server.listen(PORT,()=>{
    console.log(`Servidor rodando na porta ${PORT}`);
});

