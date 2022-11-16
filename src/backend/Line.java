/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class Line extends BaseShape implements Shape{
    
    private Point endPoint;

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }
    
     @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor= color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }
    
    @Override
    public void draw(Graphics canvas) {
       Color oldColor = canvas.getColor();
       canvas.setColor(this.color);
       canvas.drawLine(this.getPosition().x, this.getPosition().y, this.getEndPoint().x, this.getEndPoint().y);
       canvas.setColor(oldColor);
    }
    
}
