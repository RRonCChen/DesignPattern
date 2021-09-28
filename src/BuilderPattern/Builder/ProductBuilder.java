package BuilderPattern.Builder;

import BuilderPattern.Product.Product;

public class ProductBuilder implements Builder{

    private Product product;

    public ProductBuilder(){
        product =  new Product();
    }

    @Override
    public Builder setName(String name) {
        product.setName(name);
        return this;
    }

    @Override
    public Builder setValue(int value) {
        product.setValue(value);
        return this;
    }

    @Override
    public Builder setTag(String tag) {
        product.setTag(tag);
        return this;
    }

    @Override
    public Product build() {
        return product;
    }
}
