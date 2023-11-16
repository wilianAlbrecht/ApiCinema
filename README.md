# ApiCinema</br>
Projeto de desenvolvimento de uma API para um sistema de gerenciamento de salas de cinema.</br>
</br>
O sistema consiste em cadastrar filmes em cartaz e comprar ingressos</br>
</br>
Começando no sistema de cadastro de filmes, está implementado um CRUD completo.</br>
</br>
Para buscar o filme cadastrado é necessario apenas enviar o titulo do filme no JSON.</br>
GET: http://localhost:8080/filme/buscar</br>
</br>
<pre>
{</br>
	"titulo" : "Senhor dos aneis: As duas torres"</br>
}</br>
</pre>
</br>
Esse metodo irá retornar todos os filmes em cartaz com seus respectivos dados.</br>
</br></br></br></br>
Para cadastrar um filme, é necessario enviar todas as infoemaçoes sobre ele.</br>
PUT: http://localhost:8080/filme/cadastrar</br>
<pre>
{</br>
	"titulo" : "Senhor dos aneis: O retorno do rei",</br>
	"duracao" : 200,</br>
	"genero" : "Fantasia",</br>
	"atores" : [</br>
			{</br>
				"codigo": 1,</br>
				"nome": "Ian McKellen",</br>
				"papel": "Gandalf"</br>
			},</br>
			{</br>
				"codigo": 2,</br>
				"nome": "Viggo Mortensen",</br>
				"papel": "Aragorn"</br>
			},</br>
			{</br>
				"codigo": 4,</br>
				"nome": "Elijah Wood",</br>
				"papel": "Frodo"</br>
			}</br>
	]</br>
}</pre></br>

Agora para alterar um filme é necessario passar todos os campos que será alterado, caso não seja enviado o campo se permanecerra o mesmo. O unico campo obrigatorio é o titulo original.</br>
POST: http://localhost:8080/filme/atualizar</br>
<pre></br>
	{
	"titulo" : "Senhor dos aneis: As duas torres",
	"novoTitulo" : "Senhor dos aneis: A sociedade do anel",
	"duracao": "100",
	"genero" : "aventura",
	"atores" : [
		{
			"codigo": 1,
			"nome": "Ian McKellen",
			"papel": "Gandalf"
		}
	]

}
</pre>

