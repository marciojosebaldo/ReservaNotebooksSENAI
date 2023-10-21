function modelReservas() {
    let data = $("#data").val();
    let quantidade = $("#quantidade").val();

    $.ajax({
        type: "POST",
        url: "/reserva/notebook",
        data: {
            data: data,
            quantidade: quantidade
        },
        success: function(data){
            alert(data);
        },
        error: function(){
            alert("Falha ao salvar os dados")
        }
    });
}