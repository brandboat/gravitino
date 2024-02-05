/*
 * Copyright 2024 Datastrato Pvt Ltd.
 * This software is licensed under the Apache License version 2.
 */
package com.datastrato.gravitino.catalog.sqlite.operation;

import com.datastrato.gravitino.catalog.jdbc.JdbcSchema;
import com.datastrato.gravitino.catalog.jdbc.operation.JdbcDatabaseOperations;
import com.datastrato.gravitino.exceptions.NoSuchSchemaException;

import java.util.Map;

public class SqliteDatabaseOperations
        extends JdbcDatabaseOperations {
    @Override
    public JdbcSchema load(String databaseName)
            throws NoSuchSchemaException
    {
        return null;
    }

    @Override
    protected String generateCreateDatabaseSql(String databaseName, String comment, Map<String, String> properties)
    {
        return null;
    }

    @Override
    protected String generateDropDatabaseSql(String databaseName, boolean cascade)
    {
        return null;
    }
}
