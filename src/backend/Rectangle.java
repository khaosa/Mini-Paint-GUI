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
public class Rectangle extends BaseShape implements Shape {

    private int height;
    private int width;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
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
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;

    }

    @Override
    public void draw(Graphics canvas) {
        Color oldColor = canvas.getColor();
        canvas.setColor(this.fillColor);
        canvas.fillRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getHeight());
        canvas.setColor(this.color);
        canvas.drawRect(this.getPosition().x, this.getPosition().y, this.getWidth(), this.getHeight());
        canvas.setColor(oldColor);

    }

}
