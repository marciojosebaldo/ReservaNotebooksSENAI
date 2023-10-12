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
            $("#enviar").click(enviaCadastroUsuario)
            });
        break;

        case "/edit/usuario":
            $.get(url, function(data){
                let colNome = data.cargo = 1 ? 'col-8' : 'col-12';
                let inputNome = '<div class="'+colNome+'">'+
                                '<div class="input-group has-validation">'+
                                    '<span class="input-group-text"><i class="fa-solid fa-user"></i></span>'+
                                    '<div class="form-floating">'+
                                        '<input type="text" class="form-control" id="nome" placeholder="Nome" required value="'+data.nome+'"'>'+
                                        '<label for="nome">Nome</label>'+
                                    '</div>'+
                                    '<div class="invalid-feedback">'+
                                        'Por favor, informe seu nome.'+
                                    '</div>'+
                                '</div>';

                $('#mainContainer').html(inputNome);
            });
            break;

        default:
        $.get(url, function(data){
            $('#mainContainer').html(data);
        });
    }
}




//$("#btnSair").click(function(event) {
//    event.preventDefault(); // Isso previne a ação padrão do link
//    controleRotasGet($(this).attr("href"));
//}
//
////Este trecho do notebook.html fica aqui. Será necessário fazer um case:
//$("#enviar").click(enviaCadastroNotebook);