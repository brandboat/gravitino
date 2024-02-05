/*
 * Copyright 2024 Datastrato Pvt Ltd.
 * This software is licensed under the Apache License version 2.
 */
package com.datastrato.gravitino.catalog.sqlite;

import com.datastrato.gravitino.catalog.jdbc.JdbcCatalog;
import com.datastrato.gravitino.catalog.jdbc.converter.JdbcColumnDefaultValueConverter;
import com.datastrato.gravitino.catalog.jdbc.converter.JdbcExceptionConverter;
import com.datastrato.gravitino.catalog.jdbc.converter.JdbcTypeConverter;
import com.datastrato.gravitino.catalog.jdbc.operation.JdbcDatabaseOperations;
import com.datastrato.gravitino.catalog.jdbc.operation.JdbcTableOperations;
import com.datastrato.gravitino.catalog.sqlite.converter.SqliteColumnDefaultValueConverter;
import com.datastrato.gravitino.catalog.sqlite.converter.SqliteExceptionConverter;
import com.datastrato.gravitino.catalog.sqlite.converter.SqliteTypeConverter;
import com.datastrato.gravitino.catalog.sqlite.operation.SqliteDatabaseOperations;
import com.datastrato.gravitino.catalog.sqlite.operation.SqliteTableOperations;

public class SqliteCatalog extends JdbcCatalog {

    @Override
    public String shortName()
    {
        return "jdbc-sqlite";
    }

    @Override
    protected JdbcExceptionConverter createExceptionConverter() {
        return new SqliteExceptionConverter();
    }

    @Override
    protected JdbcTypeConverter<String> createJdbcTypeConverter()
    {
        return new SqliteTypeConverter();
    }

    @Override
    protected JdbcDatabaseOperations createJdbcDatabaseOperations()
    {
        return new SqliteDatabaseOperations();
    }

    @Override
    protected JdbcTableOperations createJdbcTableOperations()
    {
        return new SqliteTableOperations();
    }

    @Override
    protected JdbcColumnDefaultValueConverter createJdbcColumnDefaultValueConverter()
    {
        return new SqliteColumnDefaultValueConverter();
    }
}
