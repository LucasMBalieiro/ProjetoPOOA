<h1>
   <p> 
      <img src="https://user-images.githubusercontent.com/92659173/208775299-8a384f52-7cbe-4af6-8d11-2de7d61b3a1e.svg" width="100" align="center" />
      <img src="https://user-images.githubusercontent.com/92659173/208777593-0b0906f0-2e13-420f-a435-b78f0151671e.png" width="100" align="center" />
     
      Sistema de gerenciamento de comércio e serviços de bombas e motores d'água
   </p>
   <img src="https://img.shields.io/github/license/vinimrs/VinChat?color=black" align="center" />
</h1>

Projeto de arquitetura e implementação de uma aplicação web de um sistema para gerenciamento de clientes, serviços e vendas de uma empresa de comércio e serviços de bombas e motores d'água utilizando a tecnologia **Java**, com objetivo de contemplar os principais padrões de projeto orientado à objetos.

<p align="center">
   <img src="https://github.com/LucasMBalieiro/ProjetoPOOA/assets/92659173/ec8e15d0-c44e-481c-b934-28b97a925bda"  width="800"/>
   <p align="center">
      <i>Execução em linha de comando do projeto.
</i>
   </p>
</p>

Tal sistema foi projetado e desenvolvido durante o curso de _Programação Orientada à Objetos Avançada_ da _Universidade Federal de São Carlos (UFSCar)_, ministrado pelo Prof. Valter Vieira, cujo objetivos acadêmicos gerais são:

> Estimular o estudante a programar utilizando estruturas que facilitem a implementação, manutenção e evolução de software. Familiarizar o estudante com os princípios SOLID (responsabilidade única, aberto-fechado, substituição de Liskov, segregação de interface e inversão de dependência) da orientação a objetos. Capacitar o estudante a criar software orientado a objetos que utiliza os conceitos básicos da programação orientada a objetos (abstração, classes, objetos, atributos e métodos, encapsulamento/visibilidade, herança, composição/agregação, sobrecarga, polimorfismo de inclusão, classes abstratas, polimorfismo paramétrico, modularização, alocação dinâmica de objetos, tratamento de exceções) de forma a corretamente seguir os princípios SOLID.

## :classical_building: Arquitetura e Padrões de projeto

Neste projeto utilizamos a **arquitetura MVC (Model View Controller)** para melhor organizar as responsabilidades das entidades no sistema:

<p align="center">
   <img src="https://github.com/LucasMBalieiro/ProjetoPOOA/assets/92659173/730aad6b-9bef-49e1-b71b-d1ce6e605936"  width="800"/>
   <p align="center">
      <i>Visão geral.
</i>
   </p>
</p>

Além disso, utilizamos diversos **padrões de projeto** orientado à objetos no sistema. Os padrões de projeto (design patterns) são soluções típicas para problemas comuns em projeto de software. Cada padrão é como uma planta de construção que você pode customizar para resolver um problema de projeto particular em seu código (veja mais em [Refactoring Guru]). Nós utilizamos vários, como o padrão _state_, _decorator_, _strategy_, entre outros. Por exemplo, utilizamos o padrão _state_ para gerenciar as mudanças de estado da classe `Servico`:

<p align="center">
   <img src="https://github.com/LucasMBalieiro/ProjetoPOOA/assets/92659173/9f936dfb-ce7d-4b94-971d-81e164afeab1"  width="800"/>
   <p align="center">
      <i>Padrão state utilizado para gerenciar os estados da classe Servico
</i>
   </p>
</p>

<p align="center">
   <img src="https://github.com/LucasMBalieiro/ProjetoPOOA/assets/92659173/ce9093ee-391b-4ce5-b1ef-6ed86b75090f"  width="800"/>
   <p align="center">
      <i>Padrão singleton aplicado na classe Deposito.
</i>
   </p>
</p>

Todos os padrões aplicados, a arquitetura como um todo e as classes utilizadas podem ser visualizados no [Diagrama de classes] do projeto. 

## :hammer: Funcionalidades

- `Funcionalidade 1` `Gerenciamento de serviços`: O sistema permite o gerenciamento de um serviço em todo seu ciclo de vida na loja.
- `Funcionalidade 2` `Gerenciamento de clientes`: O sistema permite o gerenciamento dos clientes na loja.
- `Funcionalidade 3` `Venda de produtos e serviços`: O sistema suporta a venda de produtos no estoque e serviços fornecidos aos clientes.
- `Funcionalidade 4` `Impressão de documentos`: O sistema gera automaticamente os documentos necessários no momento em que são requisitados (recibo de pagamento ao ser efetuado o pagamento da venda).
- `Entre outras...`.

<p align="center">
   <img src="https://github.com/LucasMBalieiro/ProjetoPOOA/assets/92659173/03037533-7a8c-4898-a66f-8cf6f2de73b3"  width="500"/>
   <p align="center">
      <i>Recibo gerado automaticamente pelo sistema.
</i>
   </p>
</p>

<!--
<p align="center">
   <img src="https://user-images.githubusercontent.com/92659173/208769107-f9583f61-f9dd-45d7-bc2c-fbfdb548e14f.gif" width="300px" />
</p>
-->

## :zap: Tecnologias

- [Java]

<!--
## ✅ Melhorias

Ideias de melhorias para o projeto:
-->

[Java]: https://www.java.com/pt-BR/
[Refactoring Guru]: https://refactoring.guru/pt-br/design-patterns
[Diagrama de classes]: https://github.com/LucasMBalieiro/ProjetoPOOA/blob/main/diagrama.asta

