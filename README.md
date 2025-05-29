
# Projeto de Sistema para Clínica Fonoaudiológica

Este é um projeto desenvolvido no curso de **Desenvolvedor Java** do **SENAI**. O sistema simula o cadastro e exibição de informações relacionadas a uma clínica fonoaudiológica, incluindo exercícios, profissionais, pacientes e clínicas.

## 💻 Tecnologias utilizadas

- Java
- Orientação a Objetos (POO)

## 📚 Descrição do projeto

O projeto implementa as seguintes classes principais:

### ✅ `Profissional`

Representa um profissional da área de fonoaudiologia.

**Atributos:**
- `id`: identificador.
- `nome`: nome do profissional.
- `telefone`: telefone de contato.

**Métodos principais:**
- Getters e Setters para nome e telefone.
- Construtor para inicialização dos dados.

---

### ✅ `Paciente`

Representa um paciente da clínica.

**Atributos:**
- `id`: identificador.
- `nome`: nome do paciente.
- `email`: e-mail de contato.

**Métodos principais:**
- Getters e Setters para nome e e-mail.
- Construtor para inicialização dos dados.

---

### ✅ `Exercicio`

Representa um exercício de fonoaudiologia.

**Atributos:**
- `id`: identificador.
- `nome`: nome do exercício.
- `descricao`: descrição do exercício.
- `som`: som relacionado ao exercício.
- `tempoMin`: tempo mínimo de execução.
- `exemplo`: exemplo prático.

**Métodos principais:**
- Getters para todos os atributos.
- Múltiplos construtores para diferentes cenários de inicialização.

---

### ✅ `Clinica`

Representa uma clínica de fonoaudiologia.

**Atributos:**
- `id`: identificador.
- `nome`: nome da clínica.
- `cnpj`: CNPJ da clínica.

**Métodos principais:**
- Getters para nome e CNPJ.
- Construtores para inicialização completa ou parcial.

---

### ✅ `App`

Classe principal que executa o programa:

- Cria instâncias de `Exercicio`, `Clinica`, `Paciente` e `Profissional`.
- Exibe os dados no console com `System.out.println`.

---

### 👨‍🎓 Autor
Projeto desenvolvido por Lucas dos Santos lima como parte das atividades do curso Desenvolvedor Java - SENAI.

---

### 📌 Observações
Este projeto foi feito para fins educacionais, com o objetivo de praticar conceitos de Programação Orientada a Objetos.

Melhorias futuras podem incluir armazenamento em banco de dados e interface gráfica.
