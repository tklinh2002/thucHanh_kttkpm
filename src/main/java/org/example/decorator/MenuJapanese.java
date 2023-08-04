package org.example.decorator;

public class MenuJapanese extends MenuDecorator{
    public MenuJapanese(Menu menu) {
        super(menu);
    }

    @Override
    public void type() {
        super.type();
        System.out.println("Japanese food");
    }
}
