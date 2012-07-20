package com.it.iddl.idatasource;

import java.io.File;
import java.util.Map;

import com.it.iddl.idatasource.resource.security.SecureIdentityLoginModule;

public class LoginConfigFinder extends ConfigFinder<SecureIdentityLoginModule> {

    @Override
    protected void parse(Map<String, SecureIdentityLoginModule> result, File file) throws Exception {
        Map<String, SecureIdentityLoginModule> modules = LoginConfigParser.parse(file);
        result.putAll(modules);
    }

    @Override
    protected File[] findConfigFiles(File currentPath) {
        File file = new File(currentPath, "conf/login-config.xml");
        if (file.isFile()) {
            return new File[] { file };
        } else {
            return new File[0];
        }
    }

    @Override
    protected String getTypeName() {
        return "Security domain";
    }

}
