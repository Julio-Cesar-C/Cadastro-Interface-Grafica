
package model;


import javax.swing.table.AbstractTableModel;
/*AbstractTableModel e uma classe abstrata que implementa a interface
 *TableModel. Ela fornece codigo padrao para disparar TableModelEvents 
 *com os metodos fireTableRowsDeleted(), fireTableCellUpdated() e 
 *fireTableChanged(). Ela tambem gerencia todos os TableModelListeners 
 *registrados em um EventListenerList.O metodo findColumn() procura o 
 *indice de uma coluna com um dado nome. Esta pesquisa e feita de modo 
 *linear e deve ser sobrescrita para modelos de tabelas enormes.Tres metodos 
 *devem ser implementados em subclasses concretas: getRowCount(), 
 *getColumnCount() e getValueAt(int row, int column).*/

public class TabelaModelo extends AbstractTableModel {
    //Atributos
    //Nomes das colunas a serem exibidos na tabela
    private String colunas[]; 
    private String dados[][];
    
    public TabelaModelo(String dados[][], String titColunas[])  {
      colunas=titColunas;
      this.dados=dados;
      fireTableStructureChanged();
    }

    public TabelaModelo() {
    }
    

    @Override
    public int getRowCount() {
        return dados.length;    }

    @Override
    public int getColumnCount() {
        return colunas.length; //retorna a qtde de elementos do array colunas
    }

     
    @Override
    public String getColumnName( int pos){
        return colunas[pos];
    }
    
  
  //Metodo que exclui a linha da tabela
   public void excluiLinha(int linha){
      fireTableRowsDeleted(linha,linha);//exclui a linha da tabela
   }
   
  
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return dados[rowIndex][columnIndex];
    }
    
}//fim da classe

