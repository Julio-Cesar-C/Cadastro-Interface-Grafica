
package model;


public class Turma {

    private Aluno relacaoDeAlunos[];
    private int totAlunos;

    public Turma() {
        relacaoDeAlunos = new Aluno[20];
        totAlunos = 0;
    }

    public int getTotAlunosArmazenados() {
        return totAlunos;
    }

    public int adiciona(Aluno novoAluno){
        //implementar as condições para não permitir estouro e cadastros repetidos
        if(totAlunos < 20){
            if(!verifica(novoAluno)){
        relacaoDeAlunos[totAlunos]=novoAluno;
        totAlunos++;
           }
        }
        return 1;
    }
    
       public boolean verifica(Aluno novoAluno){
           for(int i = 0; i < totAlunos; i++){
               if(relacaoDeAlunos[i].getRA().equals(novoAluno.getRA())){
                   return true;
               }
           }
        return false;
       }
 
    
        public int excluir(Aluno removerAluno, int i){
        relacaoDeAlunos[i]= removerAluno;
        return 1;
    }
        
        public int editar(int i , String a , String b , int c , String d){
            relacaoDeAlunos[i].setNome(a);
            relacaoDeAlunos[i].setRA(b);
            relacaoDeAlunos[i].setIdade(c);
            relacaoDeAlunos[i].setTelefone(d);
         
         return 1;
        }
        
    
    public String[][] alunosToString() {
        String[][] alunos = new String[totAlunos][4];
        for (int i = 0; i < totAlunos; i++) {
            alunos[i][0] = relacaoDeAlunos[i].getNome();
            alunos[i][1] = relacaoDeAlunos[i].getRA();
            alunos[i][2] = String.valueOf(relacaoDeAlunos[i].getIdade());
            alunos[i][3] = relacaoDeAlunos[i].getTelefone();
        }

        return alunos;
    }

}
