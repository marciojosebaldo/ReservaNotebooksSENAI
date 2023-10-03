$("#cadastroNotebook").click(function(event) {
    event.preventDefault(); // Isso previne a ação padrão do link

    $.get("/cadastro/notebook", function(data) {
        // O código aqui será executado após a conclusão da solicitação AJAX
        alert("Teste");
    });
});