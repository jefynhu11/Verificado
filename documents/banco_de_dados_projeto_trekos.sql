-- Copiando estrutura para tabela test.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `id_produto` int(11) NOT NULL AUTO_INCREMENT,
  `txt_titulo` varchar(100) NOT NULL DEFAULT '0',
  `txt_descricao` varchar(400) NOT NULL DEFAULT '0',
  `txt_categoria` varchar(150) NOT NULL DEFAULT '0',
  `nro_preco` decimal(10,0) NOT NULL DEFAULT 0,
  `txt_imagem_principal` varchar(200) NOT NULL DEFAULT '0',
  `txt_contato` varchar(200) NOT NULL DEFAULT '0',
  `bool_vendido` tinyint(1) NOT NULL DEFAULT 0,
  `id_anunciante` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id_produto`),
  KEY `fk_produto_usuario` (`id_anunciante`),
  CONSTRAINT `fk_produto_usuario` FOREIGN KEY (`id_anunciante`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando estrutura para tabela test.produto_favorito
CREATE TABLE IF NOT EXISTS `produto_favorito` (
  `id_produto_favorito` int(11) NOT NULL AUTO_INCREMENT,
  `id_produto` int(11) NOT NULL DEFAULT 0,
  `id_usuario` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id_produto_favorito`),
  KEY `fk_produto_favorito_produto` (`id_produto`),
  KEY `fk_produto_favorito_usuario` (`id_usuario`),
  CONSTRAINT `fk_produto_favorito_produto` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`),
  CONSTRAINT `fk_produto_favorito_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando estrutura para tabela test.produto_galeria
CREATE TABLE IF NOT EXISTS `produto_galeria` (
  `id_produto_galeria` int(11) NOT NULL AUTO_INCREMENT,
  `id_produto` int(11) NOT NULL DEFAULT 0,
  `txt_imagem` varchar(200) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_produto_galeria`),
  KEY `fk_produto_galeria_produto` (`id_produto`),
  CONSTRAINT `fk_produto_galeria_produto` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id_produto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Copiando estrutura para tabela test.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `txt_usuario` varchar(25) NOT NULL DEFAULT '0',
  `txt_senha` varchar(25) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
