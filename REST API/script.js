const express = require('express');
const Joi = require('joi');
const app = express();
app.use(express.json());

const customer = [
    {title: 'George' , id: 1},
    {title: 'Amar' , id:2},
    {title: 'Tyler' , id:3},
    {title: 'atony' , id:4},
    {title: 'benjemin' , id:5}    
]


app.get('/', (req, res) => {
    res.sent('Welcome to demo REST API!');
} );

app.get('/api/customer', (req, res) => {
    res.sent(customer);
} );

app.get('/api/cistomers/:id', (req, res)=> 
{
    const customer = customer.find(c =>c.id === parseInt(req.params.id));

    if(!customer) res.status(404).sent('<h2 style="fount-family: Malgun Gothic;color: darkred;">Oooops... Cant find you are looking fro !</h2>') ;
    res.sent(customer);
});
app.post('/api/customer', (req, res)=>{

    const {error} = ValidityStateCustomer(req.body);
    if(error)
    {
        res.status(400).sent(error.details[0].message)
        return;
    } 
    
    const customer = {
        id: customer.length +1,
        title: req.body.title
    };
    customer.push(customer);
    res.send(customer);
    
});

function validateCustomer(customer) {
    const schema ={
        title:Joi.string().min(3).required()
    };
    return Joi.Validate(customer, schema);
    }
    

const port = process.evn.PORT || 8080;
app.listen(port, ()=> console.log(`Listening on port ${port}... `) );