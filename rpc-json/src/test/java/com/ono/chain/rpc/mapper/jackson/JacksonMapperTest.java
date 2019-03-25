package com.ono.chain.rpc.mapper.jackson;

import com.ono.chain.rpc.mapper.CouldNotReadJsonException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JacksonMapperTest {

    private SimpleJacksonMapper classUnderTest = new SimpleJacksonMapperFactory().createMapper();

    @Test
    public void testReadFieldWhenFieldIsString() throws CouldNotReadJsonException {
        String json = "{\"field\": \"value\"}";

        final String dasd = classUnderTest.getFieldAsString(json, "field");
        assertThat(dasd, is("value"));
    }

    @Test
    public void testReadFieldWhenFieldIsNumber() throws CouldNotReadJsonException {
        String json = "{\"field\": 123}";

        final String dasd = classUnderTest.getFieldAsString(json, "field");
        assertThat(dasd, is("123"));
    }

    @Test
    public void testReadFieldWhenFieldIsObject() throws CouldNotReadJsonException {
        String json = "{\"field\": {\"nested_field\": 123}}";

        final String dasd = classUnderTest.getFieldAsString(json, "field");
        assertThat(dasd, is("{\"nested_field\":123}"));
    }

    @Test
    public void testReadFieldWhenFieldIsList() throws CouldNotReadJsonException {
        String json = "{\"field\": [{\"nested_field\": 123},{\"nested_field2\": 321}]}";

        final String dasd = classUnderTest.getFieldAsString(json, "field");
        assertThat(dasd, is("[{\"nested_field\":123},{\"nested_field2\":321}]"));
    }

}
