$("#btnLogin").click(fazerLogin);

// Prática de pular de campo com a tecla Enter
$("#matricula").keyup(function(event){
    if(event.key === "Enter") {
        $("#senha").focus();
    }
});

$("#senha").keyup(function(event){
    if(event.key === "Enter") {
        fazerLogin();
    }
});

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