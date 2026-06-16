function mostrarMensagem() {
  alert("🌱 O agronegócio sustentável protege o meio ambiente e aumenta a produtividade!");
}

function enviarFormulario(event) {
  event.preventDefault();

  alert("Mensagem enviada com sucesso! Obrigado pelo contato 🌿");

  event.target.reset();
}
