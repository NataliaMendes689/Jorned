//Criar uma função que exibe "Olá, mundo!" no console.

function saudação() {
    console.log('Olá, mundo!');
}

saudação();

//Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.

function saudaçãoNome(nome) {
    console.log(`Olá, ${nome}!`);
}

saudaçãoNome();

//Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.

function dobroNum(numero) {
    return numero * 2;
}

let resultado = dobroNum(prompt('Digite um número:'));
console.log(resultado);

//Criar uma função que recebe três números como parâmetros e retorna a média deles.

function calcMedia(num1, num2, num3) {
    return (num1 + num2 + num3) / 3;
}

let num1 = parseFloat(prompt('Digite o primeiro número:'));
let num2 = parseFloat(prompt('Digite o segundo número:'));
let num3 = parseFloat(prompt('Digite o terceiro número:'));

let media = calcMedia(num1, num2, num3);
console.log(`A média de ${num1}, ${num2} e ${num3} é: ${media}`);

//Criar uma função que recebe dois números como parâmetros e retorna o maior deles.

function validarMaiorNum(num1, num2) {
    return num1 > num2 ? num1 : num2;
}

let num1 = parseFloat(prompt('Digite o primeiro número:'));
let num2 = parseFloat(prompt('Digite o segundo número:'));

let maiorNum = validarMaiorNum(num1, num2);
console.log(maiorNum);

//Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número 
//por ele mesmo

function quadrado(num1) {
    return num1 * num1
}

let num1 = parseFloat(prompt('Digite um número:'));

let resultado = quadrado(num1);
console.log(resultado);