package org.example.decorator;

public abstract class MenuDecorator implements Menu{
    private Menu menu;

    public MenuDecorator(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void type() {
        menu.type();
    }
}
