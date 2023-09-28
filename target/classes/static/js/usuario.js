$("#enviar").click(enviaCadastroUsuario);

function enviaCadastroUsuario() {
    let nome = $("#nome").val();
    let ocupacao = $("#ocupacao option:selected").val();
    let matricula = $("#matricula").val();
    let email = $("#email").val();

    $.ajax({
        type: "POST",
        url: "/cadastro/usuario",
        data: {
            nome: nome,
            ocupacao: ocupacao,
            matricula: matricula,
            email: email
        },
        success: function(data) {
            alert(data);
        },
        error: function(){
            alert("Falha na comunicação com o servidor.");
        }
    });
}