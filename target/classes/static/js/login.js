$("#btnLogin").click(fazerLogin);

    function fazerLogin() {
        let matricula = $("#matricula").val();
        let senha = $("#senha").val();

        $.ajax({
            type: "POST",
            url: "/login",
            data: {
                matricula: matricula,
                senha: senha
            },
            success: function(data){
                if(data) {
                    window.location.href="/home"; // Isso é a URL que será configurada no GetMapping
                } else{
                    alert("Usuário ou senha inválidos!")
                }
            },
            error: function() {
                alert("Falha na comunicação");
            }
        });
    }