package com.company.jaxb_samples.sample1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "products")
public class Products {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    @XmlElement(name = "product")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void add(final Product product) {
        if (this.products == null) {
            this.products = new ArrayList<>();
        }

        this.products.add(product);
    }
}
