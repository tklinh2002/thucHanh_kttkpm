package org.example.decorator;

public class MenuChinese extends MenuDecorator{
    public MenuChinese(Menu menu) {
        super(menu);
    }

    @Override
    public void type() {
        super.type();
        System.out.println("chinese food");
    }
}
