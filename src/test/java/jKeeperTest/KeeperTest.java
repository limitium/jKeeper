package jKeeperTest;


import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import jKeeper.Keeper;
import jKeeperTest.model.ADVehicle;
import jKeeperTest.model.Offer;
import org.junit.*;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class KeeperTest {
    private Keeper k;

    @Before
    public void setUp() {
        Properties prop;
        prop = new Properties();
        InputStream in = KeeperTest.class.getResourceAsStream("db.properties");
        try {
            prop.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setURL("jdbc:sqlserver://"+prop.getProperty("dburl")+":1433;databasename="+prop.getProperty("dbname")+";selectmethod=cursor");
        ds.setUser(prop.getProperty("dbuser"));
        ds.setPassword(prop.getProperty("dbpassword"));

        k = new Keeper(ds);
    }

    @After
    public void tearDown() {
    }


    @Test
    public void getOne() throws SQLException {
        ADVehicle ad = k.one("select * from ADVehicle where Number = 8434211", ADVehicle.class);
        assertNotNull(ad);
        assertEquals("8434211",ad.setId());

        Offer o = k.one("select * from Offer where Number = 8377383", Offer.class);
        assertNotNull(o);
        assertEquals(8377383,o.getNumber());
    }

    @Test
    public void getList() throws SQLException {
        List<Offer> list = k.list("select top 10 * from Offer", Offer.class);
        assertEquals(10,list.size());
    }

    @Test
    public void insert() throws SQLException {
        ADVehicle ad = new ADVehicle();
        ad.setId(null);
        ad.setRegNumber("keeper");
        assertEquals(1, k.insert(ad));
    }

}
