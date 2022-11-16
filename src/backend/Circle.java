/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author LENOVO
 */
public class Circle extends BaseShape implements Shape {
    
    int radius;
    
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
        this.fillColor = color;
    }
    
    @Override
    public Color getFillColor() {
        return this.fillColor;
    }
    
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw(Graphics canvas) {
        Color oldColor = canvas.getColor();
        canvas.setColor(this.color);
        canvas.drawOval(this.getPosition().x, this.getPosition().y, 2 * this.getRadius(), 2 * this.getRadius());
        canvas.setColor(oldColor);
    }
    
}
