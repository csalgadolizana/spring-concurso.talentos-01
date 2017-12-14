/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import concursantes.Concursante;
import concursantes.Malabarista;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author PC-Cristopher
 */
public class TestConcursoTalentos {

    Logger log = LogManager.getRootLogger();
    private Concursante malabarista1;

    @Before
    public void before() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        malabarista1 = (Concursante) ctx.getBean("solei");
    }

    @Test
    public void testMalabarista() {
        log.info("Inicio de ejecutar Malabarista");

        int noPelotas = 5;
        malabarista1.ejecutar();
        assertEquals(noPelotas, ((Malabarista) malabarista1).getPelotas());
        log.info("Fin de Ejecutar Malabarista");
    }

}
