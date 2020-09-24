
function loginAprovado(user){
    
    document.getElementById("user").innerHTML = `${user.nome} <br> ${user.cpf} ` ;
    document.getElementById("imgUser").innerHTML = `<img src ="${user.linkFoto}">`;
    
    obterAtividades();
}

function obterAtividades(){
    fetch("http://localhost:8080/atividades")
    .then(res => res.json())
    .then(result => preencheAtividades(result));
}

function preencheAtividades(resposta){
    let agencias = '';

    for (let index = 0; index < resposta.length; index++) {
        agencias = agencias + `<option value = ${resposta[index].id}> ${resposta[index].descricao} </option>`;
    }

    document.getElementById("sel_atividades").innerHTML = agencias;
}




