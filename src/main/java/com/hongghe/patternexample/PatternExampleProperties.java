package com.hongghe.patternexample;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The properties of the project.
 *
 * @author hongghe 07/2018
 */
@Data
@ConfigurationProperties("pattern")
public class PatternExampleProperties {
}
