# Documentação | Desafios Academia Capgemini
<hr>

## 📃Propostas de Desafio


- Questão 01 </br>
Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
</br></br>

- Questão 02 </br>
Construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura. Regras da senha:</br>
☑Possui no mínimo 6 caracteres.</br>
☑Contém no mínimo 1 digito.</br>
☑Contém no mínimo 1 letra em minúsculo.</br>
☑Contém no mínimo 1 letra em maiúsculo.</br>
☑Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+</br>
</br>

- Questão 03 </br>
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

<hr>

## 👨‍💻Tecnologias utilizadas
#### Linguagem de programação
- Java (SDK 16.0.1)

### IDE
- IntelliJ IDEA 2021.1.2

<hr>

## ⚙Como executar os programas?

- Questão 1:
Abrir o pacote src\com\capgemini\firstQuestion e executar o arquivo .class <code>FirstQuestionMain</code>;</br>
Esta classe é responsável por executar a classe <code>TestFirstQuestion</code>(testes unitários) que testa o métodos da classe <code>FirstQuestion</code>.

<hr>

- Questão 2:
Abrir o pacote src\com\capgemini\secondQuestion e executar o arquivo .class <code>SecondQuestionMain</code>;</br>
Esta classe é responsável por executar a classe <code>TestSecondQuestion</code>(testes unitários) que testa os métodos da classe <code>SecondQuestion</code>, onde:

</br>
-> O método <code>validationLength()</code> é responsável por validar o tamanho do password que enviado como parâmetro para o construtor da classe SecondQuestion, retornando um boolean.
</br></br>
-> O método <code>validationIfContainsNumber()</code> é responsável por validar se existe ao menos 1(um) número no password que é enviado como parâmetro para o construtor da classe SecondQuestion, retornando um boolean.
</br></br>
-> O método <code>validationIfContainsUpperCase()</code> é responsável por validar se existe ao menos 1(uma) letra maiúscula no password que é enviado como parâmetro para o construtor da classe SecondQuestion, retornando um boolean.
</br></br>
-> O método <code>validationIfContainsLowerCase()</code> é responsável por validar se existe ao menos 1(uma) letra minúscula no password que é enviado como parâmetro para o construtor da classe SecondQuestion, retornando um boolean.
</br></br>
-> O método <code>validationIfCotainsEspecialChar()</code> é responsável por validar se existe ao menos 1(um) caracter especial no password que é enviado como parâmetro para o construtor da classe SecondQuestion, retornando um boolean.
</br></br>
-> O método <code>countPasswordLengthMissing()</code> é responsável por retornar a quantidade de caracteres ausentes no password que é enviado como parâmetro para o construtor da classe SecondQuestion, retornando um inteiro.
</br></br>
-> O método <code>passwordSuggestion()</code> é responsável por retornar uma sugestão de senha, caso exista, tomando como base os caracteres iniciais do password que é enviado como parâmetro para o construtor da classe SecondQuestion, retornando uma String.


<hr>

- Questão 3:Abrir o pacote src\com\capgemini\thirdQuestion e executar o arquivo .class <code>ThirdQuestionMain</code>;</br>
Esta classe é responsável por executar a classe <code>TestThirdQuestion</code>(testes unitários) que vai testar os métodos da classe <code>ThirdQuestion</code>, onde:
</br></br>
-> O método <code>countAnagrams()</code> é responsável por contar a quantidade de anagramas presentes na palavra(String), enviada como parâmetro para o construtor da classe ThirdQuestion, retornando um inteiro(int).
</br></br>
-> O método <code>isAnagrama()</code> compara 2(duas) Strings passadas como parâmetro do método. Este método é chamado durante a execução do countAnagrams().

</br></br>


