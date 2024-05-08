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

CREATE PROCEDURE `sp_add_produto`(
in vid int,
 vcodigo int, 
 vnome varchar(255), 
 vfabricante varchar(255),
 vestoque int, 
 vestoque_minimo int,
 vestoque_maximo int, 
 vcategoria varchar(100),
 vpeso float, 
 vpreco_compra decimal(10,2), 
 vpreco_venda decimal(10,2),
 vunidade_medida varchar(50), 
 vdescricao text)
BEGIN
insert into produto (id,codigo,nome,fabricante,estoque,estoque_minimo,estoque_maximo,categoria,peso,preco_compra,preco_venda,unidade_medida,descricao)
values(vid,vcodigo,vnome,vfabricante,vestoque,vestoque_minimo,vestoque_maximo,vcategoria,vpeso,vpreco_compra,vpreco_venda,vunidade_medida,vdescricao);
END

CREATE PROCEDURE `sp_add_venda`(
in vid int,
 vproduto varchar(255),
 vquantidade int,
 vvalor_pago decimal(10,2),
 vpagamento varchar(255))
BEGIN
insert into venda (id, produto, quantidade, valor_pago, pagamento)
values(vid,vproduto,vquantidade,vvalor_pago,vpagamento);
END

CREATE  PROCEDURE `sp_deletar_produto`(vid int)
BEGIN
delete from produto
where id = vid;
END

CREATE PROCEDURE `sp_deletar_venda`(vid int)
BEGIN
delete from venda
where id = vid;
END
