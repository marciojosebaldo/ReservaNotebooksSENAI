$("#btnSair").click(function(event) {
    event.preventDefault(); // Isso previne a ação padrão do link

    Swal.fire({
      title: 'Sair?',
      text: "Você deseja realmente sair do sistema?",
      icon: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: '<i class="fa-solid fa-thumbs-up"></i> Sim',
      cancelButtonText: '<i class="fa-solid fa-thumbs-down"></i> Não'
    }).then((result) => {
      if (result.isConfirmed) {
          $.get("/logout", function(data));
      }
    })
});