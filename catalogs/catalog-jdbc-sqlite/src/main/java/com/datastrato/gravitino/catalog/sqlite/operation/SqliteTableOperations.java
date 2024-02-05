/*
 * Copyright 2024 Datastrato Pvt Ltd.
 * This software is licensed under the Apache License version 2.
 */
package com.datastrato.gravitino.catalog.sqlite.operation;

import com.datastrato.gravitino.catalog.jdbc.JdbcColumn;
import com.datastrato.gravitino.catalog.jdbc.JdbcTable;
import com.datastrato.gravitino.catalog.jdbc.operation.JdbcTableOperations;
import com.datastrato.gravitino.rel.TableChange;
import com.datastrato.gravitino.rel.expressions.transforms.Transform;
import com.datastrato.gravitino.rel.indexes.Index;

import java.util.Map;

public class SqliteTableOperations extends JdbcTableOperations {
    @Override
    protected String generateCreateTableSql(
            String tableName,
            JdbcColumn[] columns,
            String comment,
            Map<String, String> properties,
            Transform[] partitioning,
            Index[] indexes)
    {
        return null;
    }

    @Override
    protected String generateRenameTableSql(String oldTableName, String newTableName)
    {
        return null;
    }

    @Override
    protected String generateDropTableSql(String tableName)
    {
        return null;
    }

    @Override
    protected String generatePurgeTableSql(String tableName)
    {
        return null;
    }

    @Override
    protected String generateAlterTableSql(String databaseName, String tableName, TableChange... changes)
    {
        return null;
    }

    @Override
    protected JdbcTable getOrCreateTable(String databaseName, String tableName, JdbcTable lazyLoadCreateTable)
    {
        return null;
    }
}
