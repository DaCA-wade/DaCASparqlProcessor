package com.wade.daca.sparql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("java", "-server -Xmx4g -jar blazegraph.jar");
        try {
            Process process = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        SpringApplication.run(Application.class, args);
    }

}
