/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_project2;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author SARK
 */
 class ButtonRenderer extends JButton implements TableCellRenderer {
     static int sz;
  public ButtonRenderer(int s) {
        sz = s;
        setOpaque(true);
  }

  public Component getTableCellRendererComponent(JTable table, Object value,
      boolean isSelected, boolean hasFocus, int row, int column) {
    if (isSelected) {
      setForeground(table.getSelectionForeground());
      setBackground(table.getSelectionBackground());
    } else {
      setForeground(table.getForeground());
      setBackground(UIManager.getColor("Button.background"));
    }
    //System.out.println(row+" "+column+" "+isSelected+" "+hasFocus);
    setText((value == null) ? "" : value.toString());
    /*if(row<sz)
        setText("Details");
    else setText("");*/
    
    return this;
  }
}