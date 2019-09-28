//Interest Rate
public interface IBaseRate {

    //function to return base rate
    default double getBaseRate() {
        return 3.5;
    }

}
