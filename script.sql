create database projeto
default character set utf8
default collate utf8_general_ci;

create table professores (
id_professor tinyint auto_increment,
nome_professor varchar(100),
primary key (id_professor) 
);

create table disciplinas (
id_disciplina tinyint auto_increment,
nome_disciplina varchar(100), 
semestre varchar(100),
primary key (id_disciplina)
);


insert into professores (nome_professor) values ('Rosely Scheffer');
insert into professores (nome_professor) values ('Alan Adriel Lobato Rodrigues');
insert into professores (nome_professor) values ('Bruno Henrique Pachulski Camara');
insert into professores (nome_professor) values ('Clauber Magela Freire Krieck');
insert into professores (nome_professor) values ('Cristiane Marques de Mello');
insert into professores (nome_professor) values ('Douglas Zampar');
insert into professores (nome_professor) values ('Eugenio Martins');
insert into professores (nome_professor) values ('Gilvan Maiochi');
insert into professores (nome_professor) values ('Hugo Henrique Ramos Sabara');
insert into professores (nome_professor) values ('Juliano dos Santos de Oliveira');
insert into professores (nome_professor) values ('Sidnei Goncalves Alves');
insert into professores (nome_professor) values ('Steven Kariston Louback de Carvalho');

insert into disciplinas (nome_disciplina, semestre) values ('Algoritmos e Lógica de Programação', '1° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Formação Geral', '1° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Fundamentos de Arquitetura de Computadores', '1° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Matemática Aplicada à Computação', '1° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Atividades Complementares 1', '1° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Projeto Integrador I', '1° Semestre');

insert into disciplinas (nome_disciplina, semestre) values ('Engenharia de Software', '2° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Fundamentos de Redes de Computadores', '2° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Leitura e Interpretação de Textos', '2° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Modelagem de Dados', '2° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Programação Estruturada', '2° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Atividades Complementares 2', '2° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Projeto Integrador II', '2° Semestre');

insert into disciplinas (nome_disciplina, semestre) values ('Análise de Sistemas Orientada a Objetos', '3° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Banco de Dados', '3° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Programação Orientada a Objetos', '3° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Atividades Complementares 3', '3° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Projeto Integrador III', '3° Semestre');
        
insert into disciplinas (nome_disciplina, semestre) values ('Ética e Legislação Profissional','4° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Fundamentos de Sistemas Operacionais', '4° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Modelagem de Processo de Negócio', '4° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Programação Web', '4° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Atividades Complementares 4', '4° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Projeto Integrador IV', '4° Semestre');
        
insert into disciplinas (nome_disciplina, semestre) values ('Estágio Curricular Supervisionado I', '5° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Gerência de Projetos de Sistemas', '5° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Programação para Dispositivos Móveis', '5° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Programação Visual', '5° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Tópicos em Banco de Dados', '5° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Projeto Integrador V', '5° Semestre');
        
insert into disciplinas (nome_disciplina, semestre) values ('Empreendedorismo', '6° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Estágio Curricular Supervisionado II', '6° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Metodologias de Desenvolvimento Agil', '6° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Qualidade de Software', '6° Semestre');
insert into disciplinas (nome_disciplina, semestre) values ('Tópicos Especiais em Análise e Desenvolvimento de Sistemas', '6° Semestre');

create table imagens (
id_img tinyint primary key,
descrição_img varchar(50),
caminho_img text
);

insert into imagens (id_img, descrição_img, caminho_img) values (1, 'Logo Guia', 'img/logo_faculdade_policromia_vertical.png');
