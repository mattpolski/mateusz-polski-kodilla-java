package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
    Product bicycle = new Product("Bicycle");
    Product skateboard = new Product("Skateboard");
    Product rollers = new Product("Rollers");

    Item item1 = new Item(bicycle, new BigDecimal(689), 1);
    Item item2 = new Item(skateboard, new BigDecimal(79), 4);
    Item item3 = new Item(rollers, new BigDecimal(99), 2);

    Invoice invoice = new Invoice("172/2018");

    bicycle.getItems().add(item1);
    skateboard.getItems().add(item2);
    rollers.getItems().add(item3);

    invoice.getItems().add(item1);
    invoice.getItems().add(item2);
    invoice.getItems().add(item3);

    item1.setInvoice(invoice);
    item2.setInvoice(invoice);
    item3.setInvoice(invoice);

    invoiceDao.save(invoice);

    int invoiceId = invoice.getId();

    Assert.assertNotEquals(0, invoiceId);

    //CleanUp
        invoiceDao.deleteAll();

    }
}
