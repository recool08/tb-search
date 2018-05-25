package com.taotao.search.config;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Value("${SOLR.SERVER.URL}")
	private String SOLR_SERVER_URL;
	
    @Bean("solrServer")
    public SolrClient jedisPoolConfig() {
        return new HttpSolrServer(SOLR_SERVER_URL);
    }
	
}