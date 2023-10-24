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
            $.get(url, function(data){
                $('#mainContainer').html(data);
                $("#enviar").click(enviaCadastroUsuario);
            });
        break;

        case "/edit/usuario":
            $.get(url, function(data){
                $('#mainContainer').html(data);
                $("#salvar").click(salvarEditUsuario);
            });
        break;

//        Precisa routear a home e a partialHome para vincular o recarregamento da home com o botão #salvar do JQuery
        case "/Home":
            $.get(url, function(data){
                $('#mainContainer').html(data);
                $("#salvar").click(modalReservas);
            });
        break;

        default:
        $.get(url, function(data){
            $('#mainContainer').html(data);
        });
    }
}