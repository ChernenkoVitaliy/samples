package com.company.jaxb_samples.sample1;

import org.junit.jupiter.api.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlToProductTest {
    private Product product;

    @Test
    public void testXmlToObject() throws JAXBException {
        File file = new File("product.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        product = (Product) unmarshaller.unmarshal(file);
        System.out.println(product);
    }
}
