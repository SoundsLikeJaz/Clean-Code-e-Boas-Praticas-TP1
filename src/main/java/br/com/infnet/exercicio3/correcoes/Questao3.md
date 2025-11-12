# Tarefa: Identifique problemas estruturais nesta classe.
# Explique como essas falhas afetam a manutenibilidade e a extensibilidade do código. 

O principal problema estrutural dessa classe está no mau uso dos princípios de orientação a objetos. O código faz 
uso de três listas paralelas para representar informações que deveriam estar encapsuladas em um único objeto, o que 
aumenta o acoplamento e reduz a coesão. Além disso, a iteração entre essas listas por meio de um loop for baseado em 
índices torna o código confuso e de difícil leitura, elevando a carga cognitiva necessária para compreendê-lo. A 
lógica de produtos, preços e quantidades concentrada dentro da própria classe também dificulta a extensão do sistema,
já que qualquer nova funcionalidade — como aplicar descontos, remover itens ou alterar a forma de exibir o total — 
exigiria modificações diretas no código existente, comprometendo sua manutenibilidade e violando o princípio 
aberto/fechado.

Na implementação proposta, o problema foi decomposto em partes menores e com responsabilidades bem definidas. A 
classe Produto passou a representar apenas os dados de um item individual, garantindo coesão e encapsulamento. Foi 
criada uma estrutura separada para gerenciar os itens dentro do carrinho e calcular o total da compra, permitindo 
que a lógica de negócios fique desacoplada de qualquer meio específico de saída. Com isso, o cálculo do total pode 
ser reutilizado ou testado independentemente, e a apresentação dos resultados pode ser feita por qualquer interface, 
como console, interface gráfica ou API, sem alterar o núcleo do sistema. As funções foram mantidas curtas, 
autoexplicativas e com um propósito único, tornando o código mais legível, modular e fácil de evoluir.