# ApiCinema
Projeto de desenvolvimento de uma API para um sistema de gerenciamento de salas de cinema.

O sistema consiste em cadastrar filmes em cartaz e comprar ingressos

Começando no sistema de cadastro de filmes, está implementado um CRUD completo.

Para buscar os filmes cadastrados usamos o metodo GET:
GET: http://localhost:8080/filme/buscar

{</br>
"titulo" : "Senhor dos aneis As duas torres"
}

Esse metodo irá retornar todos os filmes em cartaz com seus respectivos dados.


