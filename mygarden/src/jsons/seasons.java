package jsons;


public class seasons {
    
    private int duration;
    private int temperture;
    private int rain;
    private int sun;

    public seasons(int duration, int temperture, int rain, int sun){
        this.duration = duration;
        this.temperture = temperture;
        this.rain = rain;
        this.sun = sun;
    }


    /**
     * @return int return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return int return the temperture
     */
    public int getTemperture() {
        return temperture;
    }

    /**
     * @param temperture the temperture to set
     */
    public void setTemperture(int temperture) {
        this.temperture = temperture;
    }

    /**
     * @return int return the rain
     */
    public int getRain() {
        return rain;
    }

    /**
     * @param rain the rain to set
     */
    public void setRain(int rain) {
        this.rain = rain;
    }

    /**
     * @return int return the sun
     */
    public int getSun() {
        return sun;
    }

    /**
     * @param sun the sun to set
     */
    public void setSun(int sun) {
        this.sun = sun;
    }

    @Override
    public String toString() {
        return "{" +
            " duration='" + getDuration() + "'" +
            ", temperture='" + getTemperture() + "'" +
            ", rain='" + getRain() + "'" +
            ", sun='" + getSun() + "'" +
            "}";
    }

}