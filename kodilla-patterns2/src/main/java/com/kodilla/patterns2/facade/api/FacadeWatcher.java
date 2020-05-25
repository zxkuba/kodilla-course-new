package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FacadeWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(FacadeWatcher.class);


    //@Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
   // public void logEvent(){
     //   LOGGER.info("LAMIACA WIADOMOSC - PADA DESZCZ");
   // }

   @Before(value = "execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..)) && args(order, userID)", argNames = "order,userID")
    public void logEvent(OrderDto order, Long userID) {

        LOGGER.info("The order: "+ order + "of UserId: " + userID);
   }

}
