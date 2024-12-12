package org.ormi.priv.tfa.orderflow.product.registry.aggregate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.command.RegisterProduct;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.event.ProductRemoved;
import org.ormi.priv.tfa.orderflow.lib.publishedlanguage.valueobject.ProductId;
import org.ormi.priv.tfa.orderflow.product.registry.aggregate.service.ProductRegistryService;

public class ProductRegistryTest {

    @Test
    public void testHandleRegisterProductCommandValid() {
        ProductRegistryService productRegistryService = new ProductRegistryService();
        ProductRegistry productRegistry = new ProductRegistry(productRegistryService);

        RegisterProduct registerCommand = new RegisterProduct("product1", "this is a product");
        productRegistry.handle(registerCommand);

        
    }
}
