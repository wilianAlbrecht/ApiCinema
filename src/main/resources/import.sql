INSERT INTO ator (codigo, nome, papel) VALUES (0, 'christopher lee', 'Saruman')
insert into ator (codigo, nome, papel) VALUES (1, 'Ian McKellen', 'Gandalf')
insert into ator (codigo, nome, papel) VALUES (2, 'Viggo Mortensen', 'Aragorn')
insert into ator (codigo, nome, papel) VALUES (3, 'Orlando Bloom', 'Legolas')
insert into ator (codigo, nome, papel) VALUES (4, 'Elijah Wood', 'Frodo')

insert into filme (codigo, titulo, duracao, genero) VALUES (0, 'Senhor dos aneis: As duas torres', 180 , 'Fantasia')

insert into ator_filme (ator_codigo, filme_codigo) VALUES (0, 0)
insert into ator_filme (ator_codigo, filme_codigo) VALUES (1, 0)
insert into ator_filme (ator_codigo, filme_codigo) VALUES (2, 0)
insert into ator_filme (ator_codigo, filme_codigo) VALUES (3, 0)
insert into ator_filme (ator_codigo, filme_codigo) VALUES (4, 0)


insert into sessao (codigo, status_sessao, data_sessao) VALUES (0, 'programada', '2022-12-31 00.00.00')

insert into sala (codigo, num_assentos, tipo_tela, localizacao, sessao_codigo) VALUES (0, 100, 'Grande', 'sala 8', 0)
