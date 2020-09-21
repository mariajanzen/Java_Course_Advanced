package com.company;

public class DateInterval {
    private Date start;
    private Date finish;
   // private Random rnd=new Random(System.currentTimeMillis());
    //private int days=0;

    public DateInterval(Date start, Date finish) {
        this.start = start;
        this.finish = finish;
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }


   /* public int getDays(){
        int min =1;
        int max=100;
        if(days==0){
            days=min+rnd.nextInt(max-min+1);
        }
        return days;
    }*/

    public int getAmountOfDays(){
        return finish.getDaysInCurrentYear()-start.getDaysInCurrentYear();
    }

    public int compareTo(){
        return getAmountOfDays();
    }

    public boolean isDateIntervalFree(Date start, Date finish){
        if((start.getDaysInCurrentYear()<this.start.getDaysInCurrentYear()
                &&finish.getDaysInCurrentYear()<=this.start.getDaysInCurrentYear())
                ||(start.getDaysInCurrentYear()>=this.finish.getDaysInCurrentYear())
                &&finish.getDaysInCurrentYear()>this.finish.getDaysInCurrentYear()){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + start +
                "; " + finish +
                "]";
    }
}
