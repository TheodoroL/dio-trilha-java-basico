package clock;

public non-sealed class USClock extends Clock{
    private  String periodIndicator;

    public void setHour(int hour) {
        if (hour >= 12 && hour <=23) {
            this.hour =  hour -12;
            setAfterMidday();
        }
        else if(hour >=24){
            this.hour =  0;
            setBeforeMidday();
        }
        else{
            this.hour = hour;
        }
    }

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday(){
        this.periodIndicator = "PM";
    }public void setBeforeMidday(){
        this.periodIndicator = "AM";
    }

    @Override
    public Clock convert(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock){
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator  = usClock.getPeriodIndicator();
            }
            case BRClock brClock -> this.setHour(brClock.getHour());
        }
        return this;
    }

    @Override
    public String getTime(){
        return super.getTime()+getPeriodIndicator();
    }

}
