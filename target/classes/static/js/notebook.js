    function enviaCadastroNotebook() {
        let numero = $("#numero").val();
        let patrimonio = $("#patrimonio").val();

        $.ajax({
            type: "POST",
            url: "/cadastros/notebook",
            data: {
                numero: numero,
                patrimonio: patrimonio
            },
            success: function(data){
                alert(data);
            },
            error: function(){
                alert("Falha na comunicação com o servidor!");
            }
        });
    }


    // Função ainda não foi invocada para limpar os campos após o envio da informação
    function limparCamposNotebook() {
        let numero = $("numero").val("");
        let patrimonio = $("patrimonio").val("");
    }