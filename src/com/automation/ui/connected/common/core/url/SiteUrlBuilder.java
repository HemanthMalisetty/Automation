package com.automation.ui.connected.common.core.url;

import com.automation.ui.base.common.core.configuration.Configuration;
import com.automation.ui.base.common.core.configuration.EnvType;
import com.automation.ui.base.common.core.url.BaseUrlBuilder;

public class SiteUrlBuilder extends BaseUrlBuilder {

    private static final String SITE_HOSTNAME = "sandbox-dev.com";
    private static final String ARTICLE_PATH = "articles";
    private static final String TOPICS_PATH = "topics";

    public SiteUrlBuilder() {
        super(Configuration.getEnv());
    }

    public String getSiteUrl() {
        return getSiteUrl(envType);
    }

    public String getSiteUrl(EnvType envType) {
        String hostname = SITE_HOSTNAME;
        if (!envType.equals(EnvType.PROD)) {
            hostname = env + "." + hostname;
        }

        return HTTP_PREFIX + hostname + "/";
    }

    public String getSitePageUrl(String path) {
        return addPathToUrl(getSiteUrl(), path);
    }

    public String getUrlForSiteArticlePage(String pageTitle) {
        return getSiteUrl() + ARTICLE_PATH + "/" + pageTitle;
    }

    public String getUrlForSiteTopic(String topic) {
        return getSiteUrl() + TOPICS_PATH + "/" + topic;
    }

    public String getUrlForSiteVideoPage(String videoPage) {
        return getSiteUrl() + videoPage;
    }
}