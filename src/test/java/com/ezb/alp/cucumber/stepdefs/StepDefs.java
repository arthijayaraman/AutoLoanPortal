package com.ezb.alp.cucumber.stepdefs;

import com.ezb.alp.AutoLoanPortalApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = AutoLoanPortalApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
