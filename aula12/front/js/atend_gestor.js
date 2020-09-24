function validaLogin(){

    let userTxt = localStorage.getItem("userLogged");

    if(!userTxt){
        window.location = "index.html";
    }

    let jsonUser = JSON.parse(userTxt);
    if(jsonUser.perfil == 0){
        loginAprovado(jsonUser);
    }else{
        window.location = "index.html";
    }
}

function loginAprovado(user){
    
    document.getElementById("user").innerHTML = `${user.nome} <br> ${user.cpf} ` ;
    document.getElementById("imgUser").innerHTML = `<img src ="${user.linkFoto}">`;
    
}

function filtrar(){
    let status = document.getElementById("sel_status");
    let statusId = status[status.selectedIndex].value; //obtem id da agencia selecionada
    let link;
    if(statusId == 0){
        link = "http://localhost:8080/chamado/pendentes";
    }else{
        link = "http://localhost:8080/chamado/fechados";
    }

    fetch(link)
    .then(res => res.json())
    .then(result => preencheRespostaGestor(result));
}

function preencheRespostaGestor(resposta){
    let chamados = '<table class = "table"> <tr> <th>#chamado</th> <th>descrição</th> <th>data</th> <th>Técnico</th> </tr>';

    for (let index = 0; index < resposta.length; index++) {
        chamados = chamados + `<tr> <td> ${resposta[index].numChamado} </td> 
                                  <td> ${resposta[index].atividade.descricao} </td>
                                  <td> ${resposta[index].dataAgendamento} </td>
                                  <td> ${resposta[index].usuario.nome} </td> 
                                  </tr>`;
    }

    chamados = chamados + '</table>';

    document.getElementById("tableResposta").innerHTML = chamados;
}

