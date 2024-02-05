/*
 * Copyright 2024 Datastrato Pvt Ltd.
 * This software is licensed under the Apache License version 2.
 */
package com.datastrato.gravitino.catalog.sqlite.converter;

import com.datastrato.gravitino.catalog.jdbc.converter.JdbcTypeConverter;
import com.datastrato.gravitino.rel.types.Type;

public class SqliteTypeConverter extends JdbcTypeConverter<String> {

    @Override
    public Type toGravitinoType(JdbcTypeBean type)
    {
        return null;
    }

    @Override
    public String fromGravitinoType(Type type)
    {
        return null;
    }
}
