package ir.ac.shirazu.cse.shimadollahi.homegym;

import java.util.LinkedList;

public class Person {
    private final Integer id;
    private LinkedList<Body> bodyProgress;


    public void showProgress(){
        //show bodies progress in app
    }

    public Person(Integer id) {
        this.bodyProgress = new LinkedList<Body>();
        this.id=id;
    }

    public Person(Body body,Integer id) {
        this.bodyProgress = new LinkedList<Body>();
        this.addBody(body);
        this.id=id;
    }

    public Integer getId() {
        return id;
    }

    public void setBodyProgress(LinkedList<Body> bodyProgress) {
        this.bodyProgress = bodyProgress;
    }

    public LinkedList<Body> getBodyProgress() {
        return bodyProgress;
    }


    public void addBody(Body body){
        this.bodyProgress.add(body);
    }
}
