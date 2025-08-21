# 🎨 Sistema de Gerenciamento de Galeria de Arte Digital

Projeto desenvolvido na disciplina de **Programação Orientada a Objetos (POO)** em Java.  
O sistema simula o gerenciamento de uma **galeria digital de obras de arte**, permitindo organizar diferentes tipos de obras, aplicar conceitos de POO e interagir por meio de uma **interface gráfica desenvolvida no NetBeans (Swing)**.

---

## 📚 Descrição
O sistema possui uma **classe mãe `ObraDeArte`** e três classes filhas que representam diferentes tipos de obras:

- 🖌️ **Pintura**  
- 📸 **Fotografia**  
- 🗿 **Escultura**  

Cada classe contém atributos e métodos específicos, demonstrando o uso de **herança** e **polimorfismo**.

---

## 🧩 Conceitos de POO aplicados
- **Herança** → `ObraDeArte` é a superclasse, enquanto `Pintura`, `Fotografia` e `Escultura` herdam seus atributos e métodos.  
- **Polimorfismo** → métodos sobrescritos permitem diferentes comportamentos para cada tipo de obra.  
- **Encapsulamento** → atributos privados com acesso via getters e setters.  
- **Composição** → classes auxiliares podem ser utilizadas para complementar informações.  

---

## 🖥️ Interface gráfica
- Desenvolvida no **NetBeans GUI Builder (Swing)**.  
- Permite que o usuário interaja de forma intuitiva para:  
  - Cadastrar novas obras (pintura, fotografia ou escultura).  
  - Visualizar as obras registradas.  
  - Editar ou excluir registros (se implementado).  

---

## 🚀 Funcionalidades principais
- Cadastro de novas obras com campos específicos para cada categoria.  
- Exibição das informações em interface gráfica.  
- Diferenciação de comportamentos entre tipos de obras por meio de polimorfismo.  
- Organização de dados com Programação Orientada a Objetos.  

---

## 🛠️ Tecnologias utilizadas
- **Java 17** 
- **Swing (NetBeans GUI Builder)**  
- Programação Orientada a Objetos (POO)  

---


---

## ▶️ Como executar no NetBeans
1. Clone este repositório:  
   ```bash
   git clone https://github.com/seu-usuario/galeria-poo.git

2. Abra o NetBeans.

3. Vá em File > Open Project e selecione a pasta galeria-poo.

4. Execute o projeto pelo botão Run Project (F6).

🎯 Possíveis melhorias futuras

Implementar persistência de dados (salvar em arquivo ou banco de dados).

Criar relatórios das obras cadastradas.

Adicionar novas categorias de obras.

Melhorar a interface gráfica com layouts mais modernos.

##👩‍💻 Autora

Mariana Gasparotto Palácios
Estudante de Engenharia de Software – UTFPR



## 📂 Estrutura do projeto
