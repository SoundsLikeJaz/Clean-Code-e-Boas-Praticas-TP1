# Questão 1:

## Explique três problemas estruturais neste código.

Um dos principais problemas estruturais presentes no código é o mau uso dos conceitos de orientação a objetos. A classe utiliza duas listas paralelas para armazenar contas e valores, quando o mais adequado seria criar uma classe específica que representasse uma conta, contendo seus atributos e comportamentos próprios. 
Essa abordagem atual aumenta o acoplamento e dificulta a manutenção, pois qualquer alteração na estrutura de dados exige mudanças em vários pontos do código. 
Outro problema perceptível é o uso excessivo de laços de repetição convencionais. A utilização de um for baseado em índices, em vez de um for-each ou de abordagens mais declarativas como a API de Streams, reduz a legibilidade e eleva a carga cognitiva, tornando o código menos intuitivo e mais sujeito a erros. 
Além disso, há uma falha lógica importante no método processarPagamentos, que aplica uma taxa a todas as contas de forma indiscriminada, sem considerar cenários onde apenas contas específicas deveriam ser processadas.

## Justifique por que esses problemas impactam a qualidade e manutenção do software.

Esses problemas impactam diretamente a qualidade e a manutenção do software, pois comprometem princípios 
fundamentais de design, como o da responsabilidade única e o open/closed. Um código estruturado dessa forma é mais 
difícil de entender, testar e estender, já que novas funcionalidades exigiriam modificações diretas na classe principal, aumentando o risco de introdução de erros. 
Em suma, a falta de encapsulamento, a baixa clareza estrutural e o comportamento rígido das operações tornam o sistema menos escalável e mais custoso de evoluir ao longo do tempo.