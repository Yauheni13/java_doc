package us.va.yauheni.oop;

class Cat {
    int age;
    int birthday;

    // Инициализируем переменные явно
    Cat(int i, int j) {
        this.age = i;
        birthday = j;
    }

    // Инициализируем переменные одним и тем значением
    Cat(int i) {
        this(i,i);
    }

    // Присвоим значения по умолчанию 0
    Cat() {
        age = 0;
        birthday = 0;
    }

    @Override
    public String toString() {
        return "Cat{" + "age=" + age + ", birthday=" + birthday + '}';
    }

    public static void main(String[] args) {
        System.out.println(new Cat(1,2).toString());
        System.out.println(new Cat(1).toString());
        System.out.println(new Cat().toString());

    }
}
