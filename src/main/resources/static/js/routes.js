function controleDeRotas(url){
    switch(url){
        case "/logout":
            gerarSwal(url);
            break;

        case "/cadastro/notebook":
            // Renderizar a tela
            $.get(url, function(data){
                $('#mainContainer').html(data);
                // Definir as ações dos componentes
                $("#enviar").click(enviaCadastroNotebook);
            });
            break;

        case "/cadastro/usuario":
            // Renderiza a tela
            $.get(url, function(data){
                $('#mainContainer').html(data);
                // Defini a ação do componente
                $("#enviar").click(enviaCadastroUsuario)
            });
            break;
    }
}




//$("#btnSair").click(function(event) {
//    event.preventDefault(); // Isso previne a ação padrão do link
//    controleRotasGet($(this).attr("href"));
//}
//
////Este trecho do notebook.html fica aqui. Será necessário fazer um case:
//$("#enviar").click(enviaCadastroNotebook);