package org.example.modules;

public class ExampleBeanV2 {
    private ExampleBeanV2(ExampleBean exampleBean) {
    }

    public static ExampleBeanV2 createInstance(ExampleBean exampleBean) {
        ExampleBeanV2 exampleBeanV2 = new ExampleBeanV2(exampleBean);
        return exampleBeanV2;
    }
}
