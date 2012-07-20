package com.it.iddl.idatasource;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang.ArrayUtils;

public class DataSourceConfigFinder extends ConfigFinder<LocalTxDataSourceConfig> {

    @Override
    protected File[] findConfigFiles(File currentPath) {
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith("-ds.xml");
            }
        };
        File[] files = currentPath.listFiles(filter);

        // try conf/*-ds.xml
        if (ArrayUtils.isEmpty(files)) {
            File configDir = new File(currentPath, "conf");
            if (configDir.isDirectory()) {
                files = configDir.listFiles(filter);
            }
        }

        return files;
    }

    @Override
    protected void parse(Map<String, LocalTxDataSourceConfig> result, File file) throws Exception {
        Collection<LocalTxDataSourceConfig> dss = DataSourceConfigParser.parse(file);
        for (LocalTxDataSourceConfig ds : dss) {
            result.put(ds.getJndiName(), ds);
        }
    }

    @Override
    protected String getTypeName() {
        return "Datasource";
    }

}
