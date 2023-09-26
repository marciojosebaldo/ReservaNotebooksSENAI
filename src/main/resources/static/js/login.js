$("#btnLogin").click(fazerLogin);

    function fazerLogin() {
        let matricula = $("#matricula").val();
        let senha = $("#senha").val();

        $.ajax({
            type: "POST",
            url: "",
            data: {
                matricula: matricula,
                senha: senha
            },
            success: function(data){
                alert(data);
            },
            error: function() {
                alert("Falha na comunicação com o servidor!");
            }
        });
    }