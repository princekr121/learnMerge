public class Application {
    private int duration ;
    private boolean working ;

    // changes added from feature branch to merge in main branch

    public int getDuration() {
        return duration;
    }

    public boolean isWorking() {
        return working;
    }

    // changes added to verify rebasing


    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
    // change done on main for mr conflict

    private int sum(){
        return 5 + 5 ;
    }

}
