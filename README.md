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
{</br>
"titulo" : "Senhor dos aneis: As duas torres"</br>
}</br>
</br>
Esse metodo irá retornar todos os filmes em cartaz com seus respectivos dados.</br>

Para cadastrar um filme, é necessario enviar todas as infoemaçoes sobre ele.</br>
PUT: http://localhost:8080/filme/cadastrar</br>

{</br>
<pre>	"titulo" : "Senhor dos aneis: O retorno do rei",</pre></br>
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
}</br>

