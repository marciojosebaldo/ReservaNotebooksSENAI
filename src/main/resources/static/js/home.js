$('a').click(function(event) {
    event.preventDefault();
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