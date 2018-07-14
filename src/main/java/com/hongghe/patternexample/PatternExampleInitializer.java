package com.hongghe.patternexample;

import com.zaxxer.hikari.HikariDataSource;
import com.zaxxer.hikari.metrics.prometheus.PrometheusMetricsTrackerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * The startup class of the project.
 *
 * @author hongghe 07/2018
 */
public class PatternExampleInitializer {

    @Autowired
    private DataSource dataSource;

    @PostConstruct
    public void init() {
        if (dataSource instanceof HikariDataSource) {
            ((HikariDataSource)this.dataSource).setMetricsTrackerFactory(new PrometheusMetricsTrackerFactory());
        }
    }
}
