package ir.ac.shirazu.cse.shimadollahi.homegym;


public class Body{
    private Sex sex;
    private Integer age;
    private Integer weight; //kg
    private Integer height; //cm
    private ActivityLevel activityLevel;
    private BodyException[] exceptions;

    public static Float BMI(Integer weight,Integer height){
        return  (weight).floatValue()/(((height.floatValue())/100)*((height.floatValue())/100));
    }

    public Float BMI(){
        return  (this.weight).floatValue()/(((this.height).floatValue()/100)*((this.height).floatValue()/100));
    }

    public static WeightState interpreteBMI(Integer weight,Integer height){
        Float bmi=BMI(weight,height);
        if(bmi< 15) return WeightState.EXTREMELY_COMPELEX_WEIGHT_LOSS;
        if(bmi>=15 & bmi<16) return WeightState.EXTREMELY_WEIGHT_LOSS;
        if(bmi>=16 & bmi<18.5) return WeightState.WEIGHT_LOSS;
        if(bmi>=18.5 & bmi<25) return WeightState.NORMAL;
        if(bmi>=25 & bmi<30) return WeightState.OVERWEIGHT;
        if(bmi>=30 & bmi<35) return WeightState.FAT_CLASS1;
        if(bmi>=35 & bmi<40) return WeightState.FAT_CLASS2;
        if(bmi>=40 & bmi<45) return WeightState.FAT_CLASS3;
        if(bmi>=45 & bmi<50) return WeightState.FAT_CLASS4;
        if(bmi>=50 & bmi<60) return WeightState.FAT_CLASS5;
        else return WeightState.FAT_CLASS6;
    }

    public WeightState interpreteBMI(){
        Float bmi=BMI();
        if(bmi< 15) return WeightState.EXTREMELY_COMPELEX_WEIGHT_LOSS;
        if(bmi>=15 & bmi<16) return WeightState.EXTREMELY_WEIGHT_LOSS;
        if(bmi>=16 & bmi<18.5) return WeightState.WEIGHT_LOSS;
        if(bmi>=18.5 & bmi<25) return WeightState.NORMAL;
        if(bmi>=25 & bmi<30) return WeightState.OVERWEIGHT;
        if(bmi>=30 & bmi<35) return WeightState.FAT_CLASS1;
        if(bmi>=35 & bmi<40) return WeightState.FAT_CLASS2;
        if(bmi>=40 & bmi<45) return WeightState.FAT_CLASS3;
        if(bmi>=45 & bmi<50) return WeightState.FAT_CLASS4;
        if(bmi>=50 & bmi<60) return WeightState.FAT_CLASS5;
        else return WeightState.FAT_CLASS6;
    }

    public Integer dailyNeededCalory(){
        Integer bmr=BMR();
        if(this.activityLevel.equals(ActivityLevel.INACTIVE)){
            return ((int) (bmr * 1.2));
        }
        if(this.activityLevel.equals(ActivityLevel.LIGHTLYACTIVE)){
            return ((int) (bmr * 1.375));
        }
        if(this.activityLevel.equals(ActivityLevel.MEDIUMACTIVE)){
            return ((int) (bmr * 1.55));
        }
        if(this.activityLevel.equals(ActivityLevel.HIGHLYACTIVE)){
            return ((int) (bmr * 1.725));
        }
        if(this.activityLevel.equals(ActivityLevel.EXTREMELYACTIVE)){
            return ((int) (bmr * 1.9));
        }
        return 0;
    }

    public Integer BMR(){
        if(this.sex.equals(Sex.FEMALE)){
            return (int)(447.593 + (9.247*(this.weight).floatValue()) + (3.098*(this.height).floatValue()) - (4.330 *(this.age).floatValue()));
        }
        else{
            return (int)(88.362 + (13.397*(this.weight).floatValue()) + (4.799*(this.height).floatValue()) - (5.677 *(this.age).floatValue()));
        }
    }

    public Integer dailyCaloryToFat(){
        return dailyNeededCalory()+500;
    }
    public Integer dailyCaloryToLossWeight(){
        return dailyNeededCalory()-500;
    }

    public static Integer BMR(Sex sex,Integer age,Integer height,Integer weight){
        if(sex.equals(Sex.FEMALE)){
            return (int)(447.593 + (9.247*(weight).floatValue()) + (3.098*(height).floatValue()) - (4.330 *(age).floatValue()));
        }
        else{
            return (int)(88.362 + (13.397*(weight).floatValue()) + (4.799*(height).floatValue()) - (5.677 *(age).floatValue()));
        }
    }

    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ActivityLevel getActivityLevel() {
        return activityLevel;
    }

    public void setActivityLevel(ActivityLevel activityLevel) {
        this.activityLevel = activityLevel;
    }

    public BodyException[] getExceptions() {
        return exceptions;
    }

    public void setExceptions(BodyException[] exceptions) {
        this.exceptions = exceptions;
    }
}
