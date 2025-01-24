class Mother {
    public void show() {
        System.out.println("Mother's show()");
    }
}

class Child extends Mother {
    @Override
    public void show() {
        System.out.println("Child's show()");
    }
}
