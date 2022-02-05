package com.company.state;

public class Action{
    private State state;

    public Action(){
        this.state = null;
    }

    public void changeState(){
        if(this.state == null){
            this.setState(new ChooseCourse());
        } else if(this.state instanceof ChooseCourse){
            this.setState(new MakeSchedule());
        } else if(this.state instanceof MakeSchedule){
            this.setState(new PayForCourse());
        } else if(this.state instanceof PayForCourse){
            this.setState(new PaymentAccepted());
        } else if(this.state instanceof PaymentAccepted){
            this.setState(new NotifyTeacher());
        } else if(this.state instanceof NotifyTeacher){
            this.setState(null);
        }
    }
    protected void setState(State state){
        this.state = state;
    }
    public String getState(){
        return this.state.getAction();
    }
}
