function modalReservas() {
    let repetir = $("#repetir").val();
    let quantidade = $("#quantidade").val();
    let data_ini = $("#data_ini").val();
    let data_fin = $("data_fin").val();

    $.ajax({
        type: "POST",
        url: "/reserva/",
        data: {
            quantidade: quantidade,
            data_ini: data_ini,
            data_fin: data_fin
        },
        success: function(data){
            alert(data);
        },
        error: function(){
            alert("Falha ao salvar os dados")
        }
    });
}