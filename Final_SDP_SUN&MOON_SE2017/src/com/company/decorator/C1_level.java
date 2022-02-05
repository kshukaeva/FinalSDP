//package com.company.decorator;
//
//public class C1_level extends Decorator{
//    public C1_level(){
//        super();
//    }
//
//    public String Description5(){
//        return "Learn produce clear, well-structured, detailed text on complex subjects, " +
//                "showing a controlled use of organisational patterns, connectors and cohesive devices.";
//    }
//
//    @Override
//    public void languageName() {
//
//    }
//
//    @Override
//    public String Description() {
//        return super.Description() + Description5();
//    }
//
//    @Override
//    public void cost() {
//
//    }
//}
package com.company.decorator;

import com.company.language.Language;

public class C1_level extends Decorator{
    private Language language;
    private String name;
    private String description;
    private int cost;



    public C1_level(Language language) {
        super(language);
        this.language = language;
        this.name="C1_level";
        this.description = "Learn produce clear, well-structured, detailed text on complex subjects,showing a controlled use of organisational patterns, connectors and cohesive devices.";
        this.cost = 150;
    }


    @Override
    public String getLanguageLevel() {
        return this.name;
    }
    @Override
    public String getLanguageLevelDescription() {
        return language.getLanguageLevelDescription() + this.description;
    }


    @Override
    public int getCost() {
        return language.getCost() + this.cost;
    }
    @Override
    public String getLanguageName() {
        return language.getLanguageName();
    }

    @Override
    public void notifySubject(String scheduleTemplate) {
        System.out.println("In "+getLanguageName()+ " lesson,level: "+getLanguageLevel()+", one student has achieved these days:\n"+scheduleTemplate);
        System.out.println("--------------------------------------------- \n");
    }

}