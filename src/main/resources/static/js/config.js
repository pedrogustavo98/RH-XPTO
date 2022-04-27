
				var candidatos = document.querySelectorAll(".candidato");
           
				for(var i = 0; i < candidatos.length ; i++){
					
						var candidato = candidatos[i];
	 
					 var tdNascimento=candidato.querySelector(".data_nascimento");
					 var nascimento = tdNascimento.textContent;
		 
					 
					 
					 var data_brasileira = nascimento.split('-').reverse().join('/');
	 
	 
	 
					 var ano = data_brasileira.substring(data_brasileira.length - 4);
		 
					 const dataAtual = new Date();
					 const anoAtual = dataAtual.getFullYear();
					 var idade = anoAtual - ano;
					 console.log(idade);
		 
					 var tdidade = candidato.querySelector(".idade").textContent="teste";
					 var tdidade = candidato.querySelector(".idade").textContent=idade;
		 
					 if(idade>=18){
						 var candidatoMaiorIdade=candidato.querySelector(".maiorIdade").textContent="Sim";
					 }else{
						 var candidatoMaiorIdade=candidato.querySelector(".maiorIdade").textContent="Não"; 
					 }
				 }
	 
				
					
				
				 if(i>2){
					 var formulario=document.querySelector(".limiteFormulario").textContent="Ops, limite de candidatos excedido!";
					 
				 }