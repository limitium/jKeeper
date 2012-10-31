package jKeeperTest;

import jKeeper.annotation.ColumnType;
import jKeeper.bean.BeanParser;
import jKeeperTest.model.Offer;
import jKeeperTest.model.Ololo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BeanParserTest {

    private BeanParser bpOffer;
    private BeanParser bpOlolo;

    @Before
    public void setUp() {
        bpOffer = new BeanParser(Offer.class);
        bpOlolo = new BeanParser(Ololo.class);
    }

    @Test
    public void getTableName() {
        assertEquals("Offer", bpOffer.getTable());
        assertEquals("Qwe", bpOlolo.getTable());
    }

    @Test
    public void getSetter() {
        assertEquals("setSSSString1", bpOlolo.getProps().get("string1").getSetter());
        assertEquals("setString2", bpOlolo.getProps().get("string2").getSetter());
    }

    @Test
    public void getGetter() {
        assertEquals("getSSSString1", bpOlolo.getProps().get("string1").getGetter());
        assertEquals("getString2", bpOlolo.getProps().get("string2").getGetter());
    }

    @Test
    public void getColumn() {
        assertEquals("Id", bpOlolo.getProps().get("superId").getColumnName());
        assertEquals("string2", bpOlolo.getProps().get("string2").getColumnName());
    }

    @Test
    public void isSkipped() {
        assertTrue(bpOlolo.getProps().get("skipped").isSkipped());
        assertTrue(!bpOlolo.getProps().get("string2").isSkipped());
    }

    @Test
    public void isId() {
        assertTrue(bpOlolo.getProps().get("superId").isId());
        assertTrue(!bpOlolo.getProps().get("string2").isId());
    }

    @Test
    public void isType() {
        assertEquals(ColumnType.VARCHAR, bpOlolo.getProps().get("string1").getColumnType());
        assertEquals(ColumnType.INT, bpOlolo.getProps().get("string2").getColumnType());
        assertEquals(ColumnType.DATE, bpOlolo.getProps().get("string3").getColumnType());
        assertEquals(ColumnType.INT, bpOlolo.getProps().get("superId").getColumnType());
    }
}
