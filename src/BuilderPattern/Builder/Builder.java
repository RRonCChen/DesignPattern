package BuilderPattern.Builder;

import BuilderPattern.Product.Product;

public interface Builder {
    Builder setName(String name);
    Builder setValue(int value);
    Builder setTag(String tag);
    Product build();
}
