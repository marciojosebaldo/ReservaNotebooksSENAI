$("#salvar").click(modalReservas);

function modalReservas() {
//    let repetir = $("#repetir").val();
    let quantidade = $("#quantidade").val();
    let data_ini = $("#data_ini").val().toLocaleDateString;
    let hora_ini = $("#data_ini").val().toLocaleTimeString;
    let data_fin = $("#data_fin").val().toLocaleDateString;
    let hora_fin = $("#data_fin").val().toLocaleTimeString;

//    Conferir acima se o que foi feito dará certo

    $.ajax({
        type: "POST",
        url: "/reserva",
        data: {
            quantidade: quantidade,
            data_ini: data_ini,
            hora_ini: hora_ini,
            data_fin: data_fin,
            hora_fin: hora_fin
        },
        success: function(data){
            alert(data);
        },
        error: function(){
            alert("Falha ao salvar os dados")
        }
    });
}