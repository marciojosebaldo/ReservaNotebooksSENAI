$('a').click(function(event) {
    event.preventDefault();
    if(!$(this).hasClass('btn')){
        $('a').removeClass('active disabled'); // Remove de todos
        $(this).addClass('active disabled'); // Adiciona no que foi clicado com a sobrecarga this
    }
    controleDeRotas($(this).attr("href"));
});

function gerarSwal(urlSucesso) {
    const swalWithBootstrapButtons = Swal.mixin({
        customClass: {
            confirmButton: 'btn btn-success me-2',
            cancelButton: 'btn btn-danger ms-2'
        },
        buttonsStyling: false
    })

    swalWithBootstrapButtons.fire({
      title: 'Sair?',
      text: "Você deseja realmente sair do sistema?",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonText: '<i class="fa-solid fa-thumbs-up"></i> Sim',
      cancelButtonText: '<i class="fa-solid fa-thumbs-down"></i> Não'
    }).then((result) => {
      if (result.isConfirmed) {
          window.location.href="/logout";
      }
    });
}