
let categoriaBuscaOrdenacao = document.getElementById("selectCategoria")
let ordemBuscaOrdenacao = document.getElementById("selectOrdem")

async function get(caminho){
    const host = window.location.host;
    const protocol = window.location.protocol;

    const url = protocol + "//" + host + "/" + caminho;

    let res = await fetch(url, {
        method: "GET"
    });

    return res.text();
}

function buscaJogadores(e){
    e.preventDefault();
    const promise = get(`todos-jogadores?sort=${categoriaBuscaOrdenacao.value},${ordemBuscaOrdenacao.value}`);
    promise.then((jogadores)=>{
        jogadores = JSON.parse(jogadores);
        exibeJogadores(jogadores);
    })
}

function exibeJogadores(jogadores){
    const list = document.getElementById('tbodyJogadores');

    list.innerHTML = '';

    if(jogadores.length == 0){
        list.insertAdjacentHTML('beforeend', '<h4>É raro, mas acontece bastante!</h4>');
    }else{
        list.insertAdjacentHTML('beforeend', templateListagemIndex(jogadores));
    }
}

function templateListagemIndex(jogadores){
    return `
    ${jogadores.map(jogador =>
        `
        <tr>
            <td><img src="${jogador.foto}" style="height: 40px; width: 40px;" class="mr-2 rounded-circle"></td>
            <td>${jogador.nome}</td>
            <td>${jogador.posicao}</td>
            <td>${jogador.caracteristicasPrincipais.geral}</td>
            <td>${jogador.caracteristicasPrincipais.potencial}</td>
            <td>${jogador.informacoesContrato.timeAtual}</td>
            <td>${jogador.informacoesContrato.precoFormatado}</td>
        </tr>
         `
    ).join('')}
    `;
}