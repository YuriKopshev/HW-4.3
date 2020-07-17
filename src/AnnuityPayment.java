public class AnnuityPayment {
    public double calculate(int sum,double rate,int period){
        double monthRate = (rate/12)/100;
        double x=1+monthRate;
        double y = Math.pow(x,period);
        double annuityRate= monthRate*y/(y-1);
        return (sum*annuityRate);
    }
}
