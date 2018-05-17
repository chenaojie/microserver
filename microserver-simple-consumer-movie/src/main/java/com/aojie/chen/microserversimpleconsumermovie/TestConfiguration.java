package com.aojie.chen.microserversimpleconsumermovie;

import com.aojie.chen.microserversimpleconsumermovie.config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "microserver-simple-provider-user",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
