# SpringFaces

## Descrição
SpringFaces é um projeto que integra Spring Boot (versão 2.7.0) com Java 17 e PrimeFaces 13. É uma aplicação Java baseada em web que utiliza Spring Data JPA e JSF para a criação de interfaces de usuário ricas.

## Tecnologias Utilizadas
- Spring Boot 2.7.0
- Java 17
- PrimeFaces 13.0.4
- JSF 2.2.20
- JPA
- MySQL (Driver de conexão)
- Lombok
- TestContainers para testes

## Configuração

### Pré-Requisitos
- JDK 17
- Maven
- MySQL Database

### Passos para Configuração

1. **Clonar o Repositório:**
   ```bash
   git clone [URL do repositório]

2. **Banco de dados:**
    Banco de dados: `dbspringfaces`

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id` bigint(20) NOT NULL,
  `data_validade` datetime DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `quantidade` int(11) NOT NULL,
  `valor` decimal(19,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id`, `data_validade`, `descricao`, `nome`, `quantidade`, `valor`) VALUES
(1, '2024-01-02 15:10:00', 'teste 01', 'Teste', 10, '10.00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tipo_produto`
--

CREATE TABLE `tipo_produto` (
  `id` bigint(20) NOT NULL,
  `nome` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `tipo_produto`
--

INSERT INTO `tipo_produto` (`id`, `nome`) VALUES
(1, 'Produto 1');


   
