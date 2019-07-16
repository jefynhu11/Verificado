__Neste documento estão listadas as tabelas do banco de dados usado no projeto 'Trekos', assim como suas respectivas Chaves Primárias (PK), Chaves Estrangeiras (FK) e suas relações.__
  
# ATENÇÃO
1. Em todas as tabelas listadas abaixo há a coluna **TIPO (JAVA)**. Este é o padrão a ser seguido para a tipagem das variáveis dentro do Java.
2. O padrão para o nome das variáveis deve ser conforme a coluna **CAMPO** das tabelas abaixo em caixa baixa (minúscula).

# Lista de Tabelas
#### TABELA USUARIOS
CAMPO | TIPO (SQL) | TIPO (JAVA) | CHAVES | OBSERVAÇÃO
:------- | :------ | :------- | :------: | :-------
id_usuario | Number(11) | Long | PK | Chave primária; Não aceita nulo
txt_usuario | Varchar(25) | String || Não aceita nulo
txt_senha | Varchar(25) | String || Não aceita nulo

#### TABELA PRODUTOS
CAMPO | TIPO (SQL) | TIPO (JAVA) | CHAVES | OBSERVAÇÃO
:------- | :------ | :------- | :------: | :------
id_produto | Number(11) | Long | PK | Chave primária; Não aceita nulo
txt_titulo | Varchar(100) | String || Não aceita nulo
txt_descricao | Varchar(400) | String || Não aceita nulo
txt_categoria | Varchar(150) | String || Não aceita nulo
nro_preco | Decimal(10,2) | Double || Não aceita nulo
txt_imagem_principal | Varchar(200) | String || Não aceita nulo
txt_contato | Varchar(200) | String || Não aceita nulo
bool_vendido | TinyInt(0 ou 1) | Boolean | | 0 - não vendido, 1 - vendido; - Não aceita nulo
id_anunciante | Number(11) | Long || Não aceita nulo

#### TABELA PRODUTO_GALERIA
CAMPO | TIPO (SQL) | TIPO (JAVA) | CHAVES | OBSERVAÇÃO
:------- | :------ | :------- | :------: | :------
id_produto_galeria | Number(11) | Long | PK | Chave primária; Não aceita nulo
id_produto | Number(11) | Long || Não aceita nulo
txt_imagem | Varchar(200) | String || Não aceita nulo

#### TABELA PRODUTOS_FAVORITOS
CAMPO | TIPO (SQL) | TIPO (JAVA) | CHAVES | OBSERVAÇÃO
:------- | :------ | :------- | :------: | :------
id_produto_favorito | Number(11) | Long | PK | Chave primária; Não aceita nulo
id_produto | Number(11) | Long || Não aceita nulo
id_usuario | Number(11) | Long || Não aceita nulo

#### TABELA CATEGORIAS
CAMPO | TIPO (SQL) | TIPO (JAVA) | CHAVES | OBSERVAÇÃO
:------- | :------ | :------- | :------: | :------
id_categoria | Number(11) | Long | PK | Chave primária; Não aceita nulo
txt_nome | Varchar(200) | String || Não aceita nulo
txt_uri | Varchar(200) | String || Não aceita nulo
txt_icone | Varchar(200) | String || Não aceita nulo