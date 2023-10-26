<h2>Padrões de Design Patterns</h2>

<table>
    <tr>
        <th>Tipos de Padrões</th>
        <th>Anti-Padrões</th>
        <th>Definição dos Padrões</th>
        <th>O Problema Que Ele Resolve</th>
        <th>Funcionalidades na Arquitetura Java</th>
    </tr>
    <tr>
        <td>Strategy</td>
        <td> Herança e Declarações Switch, o uso excessivo de instruções para selecionar a estratégia a ser usada pode levar a um código difícil de manter.</td>
        <td> É um padrão comportamental que permite definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis.</td>
        <td>Esse padrão resolve o problema de escolher e trocar algoritmos de forma dinâmica.</td>
        <td> As interfaces javas são usadas para implementar o Padrão Strategy em Java. Elas permitem que você defina estratégias de comparação personalizadas para objetos.</td>
    </tr>
    <tr>
        <td>Observer</td>
        <td>Criar um grande número de observadores pode levar a uma complexidade excessiva e dificuldade em rastrear todas as dependências da classe.</td>
        <td>Esse é um padrão comportamental que define uma dependência (1-N) entre objetos, Quando um objeto sofre uma mudança de estado, todos os seus dependentes são notificados e atualizados.</td>
        <td>Ele lida com o problema de estabelecer uma comunicação eficaz entre objetos quando um muda de estado e vários outros objetos precisam ser notificados e atualizados.</td>
        <td>Manipulação de Eventos: A API de manipulação de eventos em Java, como o uso de listeners e a classe java.util.Observable, implementa Esse padrão.</td>
    </tr>
    <tr>
        <td>Composite</td>
        <td>Complexidade Não Intencional: Um erro comum é adicionar métodos que não fazem sentido em um componente composto.</td>
        <td>Esse é um padrão estrutural que permite que você componha objetos em uma estrutura de árvore para representar hierarquias de um todo</td>
        <td>Ele resolve o problema de criar estruturas de objetos hierárquicas e compostas. É útil quando você precisa tratar objetos individuais e composições de objetos de maneira uniforme.</td>
        <td>Componentes GUI Swing: A biblioteca Swing em Java usa o Padrão Composite para criar interfaces gráficas de usuário.</td>
    </tr>
    <tr>
        <td>Facade</td>
        <td>Classe Deus: O antipadrão "Classe Deus" ocorre quando a classe Facade se torna uma classe gigante que lida com quase todas as operações do sistema.</td>
        <td>O Padrão de Fachada é uma estrutura de design que disponibiliza uma interface simplificada para um conjunto mais abrangente de interfaces em um subsistema. Seu objetivo é mascarar a complexidade do sistema e oferecer um ponto de acesso único e amigável para os utilizadores.</td>
        <td>Esse padrão lida com a questão de simplificar interfaces complicadas ou subsistemas. Ele disponibiliza uma única e simplificada interface para um conjunto mais abrangente de interfaces em um subsistema, mascarando a complexidade do sistema subjacente. Isso simplifica a interação dos clientes com o sistema, sem a necessidade de compreender a sua complexidade interna.</td>
        <td>Java Database Connectivity: A API JDBC em Java fornece uma fachada para interagir com bancos de dados. Em vez de lidar diretamente com detalhes de conexão e gerenciamento de consultas.</td>
    </tr>
    <tr>
        <td>Singleton</td>
        <td>Estado Global: Ao usar o Singleton de forma excessiva, você pode criar um estado global compartilhado que dificulta a rastreabilidade das dependências e pode levar a problemas de concorrência em sistemas multi-threads.</td>
        <td>O Padrão Singleton é uma estrutura de criação que assegura que uma classe possua exclusivamente uma única instância, e disponibiliza um ponto de acesso global para essa instância. Ele se revela vantajoso quando o objetivo é compartilhar uma única instância de uma classe por todo o sistema e gerenciar o acesso a essa instância de forma centralizada.</td>
        <td>O Padrão Singleton soluciona a questão de assegurar que uma classe possua unicamente uma instância e oferece um ponto global para acessar essa instância. Ele se mostra benéfico quando se almeja supervisionar o acesso a uma única instância de uma classe em todo o sistema.</td>
        <td>Runtime Environment: O ambiente de execução Java (JVM) é uma implementação do Padrão Singleton. Garante que apenas uma instância da máquina virtual Java seja criada em um processo.</td>
    </tr>
</table>