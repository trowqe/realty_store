package com.bsuir.realtystore.model.visitor;


import com.bsuir.realtystore.model.builder.Realty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class VisitorParameterizedTest {
    private Long costBefore;
    private Long costAfter;

    public VisitorParameterizedTest(Long costBefore, Long costAfter) {
        this.costBefore = costBefore;
        this.costAfter = costAfter;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1L, 11L},
                {2L, 12L},
                {30L, 40L},
                {99L, 109L}
        });
    }


    @Test
    public void test() {

        Visitor visitor = new PriceVisitor();
        Realty realty = new Realty.RealtyBuilder(1L)
                .cost(costBefore)
                .build();

        visitor.visit(realty);
        assertThat(realty.getCost(), is(costAfter));

    }
}
