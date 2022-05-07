# Desafio Warren

- O repositório em questão tem como objetivo mostrar soluções para os desafios propostos no Desafio de Programação - Warren Tech Academy;
- As soluções foram implementadas no aplicativo Sublime Text juntamente com o package Terminus;
- Os programas são executados utilizando Alt+1 no Sublime Text e inserindo a sintaxe "java nome-do-arquivo.java".

### Warren1.java:
- O arquivo Warren1, soluciona o desafio de mostrar todos os numeros n onde a soma de n + reverso(n) resultem em números ímpares que estão abaixo de 1 milhão;
- Para solucionar o desafio, a ideia foi implementar uma função **reverso** que ao ser chamada junto ao seu próprio número n, retorna-se o inverso;
- Seguindo, implementou-se uma função **verificaImpares** que pudesse verificar se a soma resultante de n + reverso(n) retornaria apenas dígitos ímpares;
- Para o programa principal foi realizado então um loop que apontasse os valores de 0 a 1000000 que cumprisse os requisitos do desafio: n e reverso(n) não podem iniciar com 0, e a soma precisa resultar em dígitos ímpares;
- Ao final da implementação, o programa retorna todos os números n que cumprem os requisitos, bem como a quantidade de números abaixo de 1000000 que satisfazem o desafio.

### Warren2.java:
- O arquivo Warren2, soluciona o desafio de construir um algoritmo que dado o tempo de chegada de cada aluno e o limite x de alunos presentes, determina se a classe vai ser cancelada ou não ("Aula cancelada” ou “Aula normal”);
- Como solução, foi implementada uma codificação que requisita, le e armazena a quantidade de alunos de determinada aula e o limite de atrasos para que a aula não seja cancelada;
- Armazenados os valores, é requisitado conforme número de alunos definido, que seja informado o tempo de chegada de cada aluno, com valores negativos para alunos adiantados, 0 para alunos no horário e valores positivos para alunos atrasados;
- Dessa forma se a quantidade de alunos com tempos em valores positivos for maior que o limite definido, a aula é cancelada e a mensagem "Aula cancelada" aparece, do contrário "Aula normal" aparece;

### Warren3.java:
- O arquivo Warren3, soluciona o desafio de determinar a soma com o menor número de elementos entre os números do vetor mais próxima de n e também mostre os elementos que compõem a soma;
- Como solução da problemática, foi implementado e pensado um código que primariamente, solicita um número n que será utilizado como o objetivo da soma dos dígitos do vetor, e solicitada a quantidade de números a serem utilizados para construir o vetor, bem como os respectivos valores;
- Com os dados de entrada alocados e dessa forma n e o vetor definido, é chamada uma função **solucao** que irá verificar todas as opções possíveis de se somar e alcançar o valor n;
- A função **solucao** funciona alocando o menor digito do vetor inicial em um vetor secundario até que a soma interna deste vetor secundário seja n ou próxima de n. Com o vetor secundario montado, o primeiro digito deste vetor é substituído pelo segundo dígito do vetor inicial até que este se aproxime do valor de n. E assim ocorre suscessivamente substituindo as posições no vetor secundário por valores maiores do vetor inicia;
-A alocação no vetor secundário é feita até que o vetor secundário seja composto apenas pelo maior valor do vetor inicial e a soma se apoxime de n, portanto um vetor inicial {2, 3, 4} terá a alocação terminada quando o vetor secundário for {4, 4, 4};
Ao final da alocação, a função **solucao** verifica e retorna apenas o vetor secundário que tiver o menor número de elementos e sua soma resulte em n, ou seja, um vetor {2, 3, 4} e um n igual a 10, retornará como dado de saída vetores {4, 3, 3} e {4, 4, 2} por estes serem de mesmo tamanho e terem soma igual a n.





[![Instagram Badge](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lucasmperin/)
[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/lucasmperin/)
<p align="center">Copyright © 2022 pRn1</p>
