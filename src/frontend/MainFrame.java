/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LineButton = new javax.swing.JButton();
        SquareButton = new javax.swing.JButton();
        RectangleButton = new javax.swing.JButton();
        CircleButton = new javax.swing.JButton();
        drawingArea1 = new frontend.DrawingArea();
        SelectShapeLabel = new javax.swing.JLabel();
        ChooseShapeComboBox = new javax.swing.JComboBox<>();
        ColorizeButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vector Drawing Application");

        LineButton.setText("Line");
        LineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineButtonActionPerformed(evt);
            }
        });

        SquareButton.setText("Square");
        SquareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareButtonActionPerformed(evt);
            }
        });

        RectangleButton.setText("Rectangle");
        RectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleButtonActionPerformed(evt);
            }
        });

        CircleButton.setText("Circle");
        CircleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleButtonActionPerformed(evt);
            }
        });

        drawingArea1.setBackground(new java.awt.Color(255, 255, 255));
        drawingArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
        drawingArea1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout drawingArea1Layout = new javax.swing.GroupLayout(drawingArea1);
        drawingArea1.setLayout(drawingArea1Layout);
        drawingArea1Layout.setHorizontalGroup(
            drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        drawingArea1Layout.setVerticalGroup(
            drawingArea1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        SelectShapeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SelectShapeLabel.setText(" Select Shape");

        ChooseShapeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Shape" }));
        ChooseShapeComboBox.setName(""); // NOI18N
        ChooseShapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseShapeComboBoxActionPerformed(evt);
            }
        });

        ColorizeButton.setText("Colorize");
        ColorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorizeButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChooseShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SelectShapeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(74, 74, 74))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ColorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(drawingArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(LineButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CircleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(SquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RectangleButton)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LineButton)
                    .addComponent(SquareButton)
                    .addComponent(RectangleButton)
                    .addComponent(CircleButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(SelectShapeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChooseShapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColorizeButton)
                            .addComponent(DeleteButton))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drawingArea1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleButtonActionPerformed
        // TODO add your handling code here:
        Rectangle rectangle = new Rectangle();
        String x_startpoint, y_startpoint;
        String width, height;
        x_startpoint = JOptionPane.showInputDialog("Enter the x coordinate of the starting point: ");
        y_startpoint = JOptionPane.showInputDialog("Enter the y coordinate of the starting point: ");
        width = JOptionPane.showInputDialog("Enter the rectangle's width: ");
        height = JOptionPane.showInputDialog("Enter the rectangle's height:  ");
        try {
            rectangle.setPosition(new Point(Integer.parseInt(x_startpoint), Integer.parseInt(y_startpoint)));
            rectangle.setHeight(Integer.parseInt(height));
            rectangle.setWidth(Integer.parseInt(width));
            drawingArea1.addShape(rectangle);
            drawingArea1.repaint();
            drawingArea1.index++;
            ChooseShapeComboBox.addItem("Rectangle" + drawingArea1.index);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You should only enter numeric values.");
        }
    }//GEN-LAST:event_RectangleButtonActionPerformed

    private void SquareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareButtonActionPerformed
        // TODO add your handling code here:
        Rectangle rectangle = new Rectangle();
        String x_startpoint, y_startpoint;
        String sideLength;
        x_startpoint = JOptionPane.showInputDialog("Enter the x coordinate of the starting point: ");
        y_startpoint = JOptionPane.showInputDialog("Enter the y coordinate of the starting point: ");
        sideLength = JOptionPane.showInputDialog("Enter the square's side length:  ");
        try {
            rectangle.setPosition(new Point(Integer.parseInt(x_startpoint), Integer.parseInt(y_startpoint)));
            rectangle.setHeight(Integer.parseInt(sideLength));
            rectangle.setWidth(Integer.parseInt(sideLength));
            drawingArea1.addShape(rectangle);
            drawingArea1.repaint();
            drawingArea1.index++;
            ChooseShapeComboBox.addItem("Square" + drawingArea1.index);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You should only enter numeric values.");
        }
    }//GEN-LAST:event_SquareButtonActionPerformed

    private void LineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineButtonActionPerformed
        // TODO add your handling code here:
        Line line = new Line();
        String x_startpoint, y_startpoint;
        String x_endpoint, y_endpoint;
        x_startpoint = JOptionPane.showInputDialog("Enter the x coordinate of the starting point: ");
        y_startpoint = JOptionPane.showInputDialog("Enter the y coordinate of the starting point: ");
        x_endpoint = JOptionPane.showInputDialog("Enter the x coordinate of the end point: ");
        y_endpoint = JOptionPane.showInputDialog("Enter the y coordinate of the end point: ");
        try {
            line.setPosition(new Point(Integer.parseInt(x_startpoint), Integer.parseInt(y_startpoint)));
            line.setEndPoint(new Point(Integer.parseInt(x_endpoint), Integer.parseInt(y_endpoint)));
            drawingArea1.addShape(line);
            drawingArea1.repaint();
            drawingArea1.index++;
            ChooseShapeComboBox.addItem("Line" + drawingArea1.index);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You should only enter numeric values.");
        }


    }//GEN-LAST:event_LineButtonActionPerformed

    private void CircleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleButtonActionPerformed
        // TODO add your handling code here:
        Circle circle = new Circle();
        String radius, x_startpoint, y_startpoint;
        x_startpoint = JOptionPane.showInputDialog("Enter the x coordinate of the starting point: ");
        y_startpoint = JOptionPane.showInputDialog("Enter the y coordinate of the starting point: ");
        try {
            circle.setPosition(new Point(Integer.parseInt(x_startpoint), Integer.parseInt(y_startpoint)));
            radius = JOptionPane.showInputDialog("Enter the circle's radius: ");
            circle.setRadius(Integer.parseInt(radius));
            drawingArea1.addShape(circle);
            drawingArea1.repaint();
            drawingArea1.index++;
            ChooseShapeComboBox.addItem("Circle" + drawingArea1.index);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "You should only enter numeric values.");
        }
    }//GEN-LAST:event_CircleButtonActionPerformed

    private void ChooseShapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseShapeComboBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ChooseShapeComboBoxActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        if (ChooseShapeComboBox.getSelectedIndex() <= 0) {
        } else {
            drawingArea1.removeShape(drawingArea1.drawnShapes.get(ChooseShapeComboBox.getSelectedIndex() - 1));
            ChooseShapeComboBox.removeItemAt(ChooseShapeComboBox.getSelectedIndex());
            drawingArea1.removeAll();
            drawingArea1.repaint();
        }

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void ColorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorizeButtonActionPerformed
        // TODO add your handling code here:
        if (ChooseShapeComboBox.getSelectedIndex() <= 0) {
        } else {
            Color chosenColor = JColorChooser.showDialog(null, "Select a color", Color.white);
            Shape temp = drawingArea1.drawnShapes.get(ChooseShapeComboBox.getSelectedIndex() - 1);
            temp.setColor(chosenColor);
            drawingArea1.repaint();
        }
    }//GEN-LAST:event_ColorizeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ChooseShapeComboBox;
    private javax.swing.JButton CircleButton;
    private javax.swing.JButton ColorizeButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton LineButton;
    private javax.swing.JButton RectangleButton;
    private javax.swing.JLabel SelectShapeLabel;
    private javax.swing.JButton SquareButton;
    private frontend.DrawingArea drawingArea1;
    // End of variables declaration//GEN-END:variables
}