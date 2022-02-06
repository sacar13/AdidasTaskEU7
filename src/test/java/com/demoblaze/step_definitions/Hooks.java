package com.demoblaze.step_definitions;

import com.demoblaze.utilities.Driver;
import org.junit.After;

public class Hooks {

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

}
