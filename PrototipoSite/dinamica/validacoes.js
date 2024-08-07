const form = document.querySelector("#form-cadastro");
const nome = document.querySelector("#nome");
const email = document.querySelector("#email");
const senha = document.querySelector("#senha");

form.addEventListener("submit", (evento) => {
    evento.preventDefault();
    checarTdsForms();
});

function validarNome() {
    const nomeEscrito = nome.value;

    if (nomeEscrito === "") {
        errorInput(nome, "Escreva seu nome")
    } else {
        const pegaTodasValidacoes = nome.parentElement;
        pegaTodasValidacoes.className = "form-content";
    }
};

function validarEmail() {
    const emailEscrito = email.value;

    if (emailEscrito === "") {
        errorInput(email, "Escreva um E-mail")
    } else {
        const pegaTodasValidacoes = email.parentElement;

        pegaTodasValidacoes.className = "form-content";
    }
};

function validarSenha() {
    const senhaEscrita = senha.value;
console.log(senhaEscrita)
    if (senhaEscrita === "") {
        errorInput(senha, "A senha é obrigatória")
    } 
    else if(senhaEscrita.length < 8){
        errorInput(senha, "No mínimo 8 caracteres")
    }
    else {
        const pegaTodasValidacoes = senha.parentElement;
        pegaTodasValidacoes.className = "form-content";
    }
};

//
function checarTdsForms() {
    validarNome();
    validarEmail();
    validarSenha();

    const pegaTodasValidacoes = form.querySelectorAll(".form-content");
    const validaTudo = [...pegaTodasValidacoes].every((item) => {
        return item.className === "form-content"
    });
    
    console.log(validaTudo)
    if (validaTudo) {
        alert("Foi")
    }else{
        alert("Escreca")
    }
}

/*
Essa fuction apresenta uma mensagem de erro e cria algumas estilizações caso o user não cumpra os requisitos mínimos definidos acima
*/
function errorInput(input, message) {
 const pegaTodasValidacoes = input.parentElement;//a const recebe a tag pai (no caso, uma div) do input escolhido
 
 const msg = pegaTodasValidacoes.querySelector("span")//a const msg recebe a tag span que estiver dentro da tag pai
 
 msg.innerText = message;//o que for passado no message vai sobrescrever qualquer conteúdo que estiver na tag span
 
 pegaTodasValidacoes.className = "form-content error";// qualquer "class" da tag pai definida no html vai receber o nome definido aqui
}