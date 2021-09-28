package BuilderPattern;

import BuilderPattern.Builder.ProductBuilder;
import BuilderPattern.Person.Person;
import BuilderPattern.Product.Product;

public class main {

    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .setName("測試")
                .setValue(100)
                .setTag("新的")
                .build();

        System.out.println(product);


        Person person =  Person.getBuilder()
                .setName("Ron")
                .setAge(27)
                .setGender("male")
                .build();

        System.out.println(person);
    }
}
