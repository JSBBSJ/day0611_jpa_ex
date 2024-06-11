package com.green.nowon.ssh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@Component
@ConfigurationProperties("spring.ssh.tunnel")
public class SSHTunnelingProperties {

	private String username;
	private String sshHost;
	private int sshPort;
	private String privateKey;
	private int localPort;
	private String rdsHost;
	private int rdsPort;
}
