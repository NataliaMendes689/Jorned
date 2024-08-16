//Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros,
//e peso, em quilogramas, que serão recebidos como parâmetro.

function calculaIMC(alturaMetros, peso){

    let imc = peso / (alturaMetros * alturaMetros);
  }  

//Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.

function calcularFatorial(numero) {
    if (numero === 0 || numero === 1) {
      return 1;
    }
  
    let fatorial = 1;
    for (let i = 2; i <= numero; i++) {
      fatorial *= i;
    }
  
    return fatorial;
  }

  let numero = parseInt(prompt('Digite um número:'));
  let resultado = calcularFatorial(numero);
  console.log(`O fatorial de ${numero} é ${resultado}`);

//Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais.
//Para isso, considere a cotação do dólar igual a R$4,80.

function conversaoDolarParaReal(valorDolar) {
    let cotacaoDolar = 4.80;
    let valorReais = valorDolar * cotacaoDolar;
    return valorReais.toFixed(2); // Retorna o valor em reais com duas casas decimais
}

let valorDolar = parseFloat(prompt('Digite um valor em dólares:')); // Converte a entrada para número com casas decimais
let valorReais = conversaoDolarParaReal(valorDolar); // Captura o valor convertido
console.log(`${valorDolar} dólares equivalem a R$ ${valorReais}`); // Mostra o resultado

//Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura
//que serão dadas como parâmetro.

function calcularAreaPerimetro(altura, largura) {
  let area = altura * largura;
  let perimetro = 2 * (altura + largura);
  
  console.log(`Área da sala: ${area} metros quadrados`);
  console.log(`Perímetro da sala: ${perimetro} metros`);
}

let altura = parseFloat(prompt('Digite a altura da sala em metros:'));
let largura = parseFloat(prompt('Digite a largura da sala em metros:'));

calcularAreaPerimetro(altura, largura);

//Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será
//fornecido como parâmetro. Considere Pi = 3,14.

function calcAreaPerimetro(raio){
  let area = Math.PI * raio * raio;
  let perimetro = 2 * Math.PI * raio;
  //let perimetroC = 2 * 3.14 * raio;
  //let areaC = 3.14 * raio * raio;

  console.log(`Perímetro da sala: ${perimetroC.toFixed(2)} metros quadrados`);
  console.log(`Área da sala: ${areaC.toFixed(2)} metros quadrados`);
}

  let raio = parseFloat(prompt('Digite o raio da sala:'));

  calcAreaPerimetro(raio);

//Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.
 
function tabuada(numeroTabuada) {
  for (let i = 1; i <= 10; i++) {
    let resultado = numeroTabuada * i;
    console.log(`${numeroTabuada} x ${i} = ${resultado}`);
  }
}

let numeroTabuada = parseInt(prompt('Digite um número:'));
tabuada(numeroTabuada);