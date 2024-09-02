# Chemist
# Autores: [Lucas Neves](https://github.com/lucasnvs), [Gabriel Umann](https://github.com/gabrielumann)
## Descrição
Desenvolvido para a disciplina de Química. Faz a resolução e apresenta informações sobre o Elemento do número atômico inserido.

- Kotlin
- JUnit - Testes Unitários Simples

## Exemplo de uso

Input:
- Número Atômico do elemento químico;

```kotlin
fun main() {
    val atomicNumber = 22
    val element = Element.getInstance(atomicNumber)
    println(element)
}
```
Output:
- Distribuição eletrônica;
- Camada de valência;
- Nº de elétrons na camada de valência;
- Subnível (orbital) mais energético;
- Nº de elétrons no orbital mais energético.

```
Elemento de número atômico: 22
Nome do Elemento: Titânio
Distribuição Eletrônica: 1s2 2s2 2p6 3s2 3p6 4s2 3d2
Camada de Valência: 4
Elétrons na camada de Valência: 2
Orbital mais energético: 3d
Número de elétrons no Orbital mais energético: 2
```
