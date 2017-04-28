/**
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 */

package com.dell.cpsd.storage.capabilities;

import org.junit.Test;

import static com.dell.cpsd.common.json.utils.JsonSchemaValidation.validateSchema;
import static org.junit.Assert.assertNull;

/**
 * This test class validates the JSON message corresponding to the JSD.
 * <p>
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 * </p>
 *
 * @version 1.0
 * @since 1.0
 */
public class ValidateExamplesTest
{
    public static final String SCHEMA_DIR   = "/storage-capabilities-api/schema/json/";
    public static final String EXAMPLE_DIR  = "/storage-capabilities-api/schema/example/";
    public static final String INCLUDES_DIR = SCHEMA_DIR + "includes";

    @Test
    public void list_storage_request_message_validation() throws Exception
    {
        String jsdName = "ListStorageRequestMessage";
        String jsonName = "ListStorageRequestMessage";
        String errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", INCLUDES_DIR);
        assertNull(errors, errors);
    }

    @Test
    public void sio_node_remove_request_message_validation() throws Exception
    {
        String jsdName = "SIONodeRemoveRequestMessage";
        String jsonName = "SIONodeRemoveRequestMessage";
        String errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", INCLUDES_DIR);
        assertNull(errors, errors);
    }

    @Test
    public void sio_node_remove_response_message_validation() throws Exception
    {
        String jsdName = "SIONodeRemoveResponseMessage";
        String jsonName = "SIONodeRemoveResponseMessage";
        String errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", INCLUDES_DIR);
        assertNull(errors, errors);
    }
}

