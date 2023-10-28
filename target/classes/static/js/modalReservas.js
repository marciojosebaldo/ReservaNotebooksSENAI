$("#salvar").click(modalReservas);

function modalReservas() {
//    let repetir = $("#repetir").val();
    let quantidade = $("#quantidade").val();

    let data_Ini = new Date($("#data_ini").val());
    let data_Fin = new Date($("#data_fin").val());

    let data_ini = data_Ini.toLocaleDateString();
    let data_fin = data_Fin.toLocaleDateString();

    let hora_ini = data_Ini.toLocaleTimeString();
    let hora_fin = data_Fin.toLocaleTimeString();

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
            alert("Falha na comunicação com o servidor")
        }
    });
}