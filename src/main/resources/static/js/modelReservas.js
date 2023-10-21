function modelReservas() {
    let dataReserva = $("#dataReserva").val();
    let quantidade = $("#quantidade").val();

    $.ajax({
        type: "POST",
        url: "/reserva/",
        data: {
            dataReserva: dataReserva,
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