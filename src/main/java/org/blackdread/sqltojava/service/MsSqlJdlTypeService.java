package org.blackdread.sqltojava.service;

import org.blackdread.sqltojava.entity.JdlFieldEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("sqlserver")
public class MsSqlJdlTypeService implements SqlJdlTypeService {
    private static final Logger log = LoggerFactory.getLogger(MsSqlJdlTypeService.class);

    @Override
    public JdlFieldEnum sqlTypeToJdlType(String sqlType) {
        throw new UnsupportedOperationException();
    }
}
