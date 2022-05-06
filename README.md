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





[![Instagram Badge](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lucasmperin/)
[![Linkedin](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/lucasmperin/)
<p align="center">Copyright © 2022 pRn1</p>
