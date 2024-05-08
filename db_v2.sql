create database sgve;

use sgve;

create table produto(
id int auto_increment primary key,
codigo int,
nome varchar(255),
fabricante varchar(255),
estoque int,
estoque_minimo int,
estoque_maximo int,
categoria varchar(100),
peso float,
preco_compra decimal(10,2),
preco_venda decimal(10,2),
unidade_medida varchar(50),
descricao text
);

create table categoria(
id int auto_increment primary key,
categoria varchar(200)
);

create table venda(
id int auto_increment primary key,
produto varchar(255),
quantidade int,
valor_pago decimal(10,2),
pagamento varchar(255)
);

select * from produto;

call sp_add_produto(2,3,'Carro de brinquedo', 'Amox', 1,1,1,'Brinquedo', 10,20,30 ,'nada', 'algum texto');

call sp_deletar_produto(2);