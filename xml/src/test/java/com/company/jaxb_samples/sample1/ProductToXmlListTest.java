package com.company.jaxb_samples.sample1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.math.BigDecimal;

public class ProductToXmlListTest {
    private User user;
    private Product product;
    private Product product1;

    @BeforeEach
    public void setUp() {
        user = new User(1L, "Some Name", "test@some.com");
        product = createProduct(2L);
        product1 = createProduct(22L);
    }

    @Test
    public void testObjectToXml() throws JAXBException {
        final Products products = new Products();
        products.add(product);
        products.add(product1);

        JAXBContext jaxbContext = JAXBContext.newInstance(Products.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(products, new File("products.xml"));
        marshaller.marshal(products, System.out);
    }


    @Test
    private Product createProduct(final Long id) {
        return new Product("PO" + id,
                "Some product description" + id,
                "http://someUrlForImage.jpg",
                new BigDecimal(20.22),
                user);
    }
}
