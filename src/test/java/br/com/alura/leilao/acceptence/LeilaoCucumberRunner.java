package br.com.alura.leilao.acceptence;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", tags = "@leilao")
public class LeilaoCucumberRunner {

}
