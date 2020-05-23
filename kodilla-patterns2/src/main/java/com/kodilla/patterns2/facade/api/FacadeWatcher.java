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


    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent(){
        LOGGER.info("LAMIACA WIADOMOSC - PADA DESZCZ");
    }

   //@Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
     //       "&& args(orderFacade, userID) && target(object)")
    //public void logEvent(OrderFacade orderFacade, Long userID, Object object) {

      //  LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + orderFacade + userID);
   // }

}
