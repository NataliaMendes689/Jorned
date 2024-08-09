//Altere o conteúdo da tag h1 com document.querySelector e atribua o seguinte texto: Hora do Desafio.

let titulo = document.querySelector('h1');
titulo.innerHTML = 'Hora do Desafio';

//Crie uma função que exiba no console a mensagem O botão foi clicado sempre que o botão Console for pressionado.

function exibeMensagem() {
    console.log('O botão foi clicado!');
}


//Crie uma função que exiba um alerta com a mensagem: Eu amo JS, sempre que o botão Alerta for pressionado.

function exibeAlertaJS() {
    console.log('Eu amo Java Script!');
}

//Crie uma função que é executada quando o botão prompt é clicado, perguntando o nome de uma cidade do Brasil.
//Exiba um alerta com a mensagem concatenando a resposta com o texto: Estive em {cidade} e lembrei de você.

function exibePrompt() {
    let nomeCidade = prompt('Digite uma cidade do Brasil');
    alert(`Estive em ${nomeCidade} e lembrei de você!`);
}

//Ao clicar no botão soma, peça 2 números inteiros e exiba o resultado da soma em um alerta.

function somaDoisNumeros() {
    let num1 = prompt('Digite um número inteiro:');
    let num2 = prompt('Digite outro número inteiro:');
    let resultado = num1 + num2;
    alert(` ${num1} + ${num2} = ${resultado}`);
}