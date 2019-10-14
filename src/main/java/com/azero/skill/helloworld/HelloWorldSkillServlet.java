package com.azero.skill.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.Skills;
import com.amazon.ask.servlet.SkillServlet;
import com.azero.skill.helloworld.handler.DefaultHandler;
import com.azero.skill.helloworld.handler.HelloWorldIntentHandler;

import javax.servlet.annotation.WebServlet;

@WebServlet(name = "HelloWorldSkillServlet")
public class HelloWorldSkillServlet extends SkillServlet {

    public HelloWorldSkillServlet() {
        super(getSkill());
    }

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers (
                        new HelloWorldIntentHandler(),
                        new DefaultHandler())
                // Add your skill id below
                .withSkillId("")
                .build();
    }
}
