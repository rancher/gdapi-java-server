package io.github.ibuildthecloud.model.impl;

import io.github.ibuildthecloud.gdapi.context.ApiContext;
import io.github.ibuildthecloud.gdapi.model.ApiVersion;
import io.github.ibuildthecloud.url.UrlBuilder;

public class VersionImpl extends ResourceImpl implements ApiVersion {

    public VersionImpl(String version) {
        super();
        setId(version);
        setType("apiVersion");
        getLinks().put(UrlBuilder.SELF, ApiContext.getUrlBuilder().version(version));
    }

}
