package io.searchbox.client.http;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Dogukan Sonmez
 */
@RunWith(Parameterized.class)
public class JestHttpClientTest extends JestHttpClientTestBase {
    
    public JestHttpClientTest(JestHttpClient client) {
        super(client);
    }

    @Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][] {     
            { new JestHttpClient() }
        });
    }    
}
