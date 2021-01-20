package com.company.jaxb_samples.sample1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.math.BigDecimal;

public class ProductToXmlTest {
    private final Long ID = 1L;
    private Product product;
    private User user;

    @BeforeEach
    public void sutUp() {
        user = new User(ID, "Test Name", "test@some.com");
        product = new Product("PO1", "Some product description",
                "http://some.image/url.jpg", new BigDecimal(18.95), user);
    }

    @Test
    public void testObjectToXML() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(product, new File("product.xml"));
        marshaller.marshal(product, System.out);
    }

}
