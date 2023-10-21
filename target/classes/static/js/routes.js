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

        default:
        $.get(url, function(data){
            $('#mainContainer').html(data);
        });
    }
}