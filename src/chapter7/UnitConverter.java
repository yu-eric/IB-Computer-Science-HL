package chapter7;

public class UnitConverter {

    public static final String FL_OZ = "fl.oz";
    public static final String GAL = "gal";
    public static final String ML = "ML";
    public static final String OZ = "oz";
    public static final String LB = "lb";
    public static final String G = "g";
    public static final String KG = "kg";
    public static final String IN = "in";
    public static final String FT = "ft";
    public static final String MI = "mi";
    public static final String MM = "mm";
    public static final String CM = "cm";
    public static final String M = "m";
    public static final String KM = "km";
    public static final String L = "L";

    private String from;
    private String to;
    private double amount;

    //FLUID (fl.oz, gal, ml, l)
    public static final double FLOZ_ML = 29.5735;
    public static final double GAL_ML = 3785.41;
    public static final double FLOZ_L = 0.0295735;
    public static final double GAL_L = 3.78541;

    //WEIGHT (oz, lb, g, kg)

    public static final double OZ_G = 28.3495;
    public static final double LB_G = 453.592;
    public static final double OZ_KG = 0.0283495;
    public static final double LB_KG = 0.453592;

    //LENGTH(in, ft, mi, mm, cm, m, km)
    public static final double IN_MM = 25.4;
    public static final double FT_MM = 304.8;
    public static final double MI_MM = 1.609e+6;

    public static final double IN_CM = 2.54;
    public static final double FT_CM = 30.48;
    public static final double MI_CM = 160934;

    public static final double IN_M = 0.0254;
    public static final double FT_M = 0.3048;
    public static final double MI_M = 1609.34;

    public static final double IN_KM = 0.0000254;
    public static final double FT_KM = 0.0003048;
    public static final double MI_KM = 1.60934;

    /**
     * Creates an instance of a UnitConverter
     * @param from what we are converting from
     * @param to what we are converting to
     * @param amount the amount to convert
     */
    public UnitConverter(String from, String to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    /**
     * Converts imperial to metric
     * @return converted value
     */
    public double convert() {
        switch(from) {
            case FL_OZ:
            case GAL:
                return convertFluid();
            case OZ:
            case LB:
                return convertWeight();
            case IN:
            case FT:
            case MI:
                return convertLength();
            default:
                return -1;
        }
    }

    /**
     * converts fluid
     * @return converted value
     */
    private double convertFluid() {
        if(from.equals(FL_OZ)) {
            if(to.equals(ML)) {
                return amount * FLOZ_ML;
            } else if(to.equals(L)) {
                return amount * FLOZ_L;
            }
        } else {
            if(to.equals(ML)) {
                return amount * GAL_ML;
            } else if(to.equals(L)) {
                return amount * GAL_L;
            }
        }
        return -1;
    }

    /**
     * Converts weight
     * @return converted value
     */
    private double convertWeight() {
        double conversion = -1;
        if(from.equals(OZ)) {
            if(to.equals(G)) {
                conversion = amount * OZ_G;
            } else if(to.equals(KG)) {
                conversion = amount * OZ_KG;
            }
        } else {
            if(to.equals(G)) {
                conversion = amount * LB_G;
            } else if(to.equals(KG)) {
                conversion = amount * LB_KG;
            }
        }
        return conversion;
    }

    /**
     * Convert length
     * @return converted value
     */
    private double convertLength() {
        double conversion = -1;
        switch (from) {
            case IN:
                conversion = convertInches();
                break;
            case FT:
                conversion = convertFeet();
                break;
            case MI:
                conversion = convertMiles();
                break;
        }
        return conversion;
    }

    /**
     * Converts miles
     * @return converted value
     */
    private double convertMiles() {
        double conversion;
        switch (to) {
            case MM:
                conversion = amount * MI_MM;
                break;
            case CM:
                conversion = amount * MI_CM;
                break;
            case M:
                conversion = amount * MI_M;
                break;
            case KM:
                conversion = amount * MI_KM;
                break;
            default:
                conversion = -1;
                break;
        }
        return conversion;
    }

    /**
     * Converts feet
     * @return converted value
     */
    private double convertFeet() {
        double conversion;
        switch (to) {
            case MM:
                conversion = amount * FT_MM;
                break;
            case CM:
                conversion = amount * FT_CM;
                break;
            case M:
                conversion = amount * FT_M;
                break;
            case KM:
                conversion = amount * FT_KM;
                break;
            default:
                conversion = -1;
                break;
        }
        return conversion;
    }

    /**
     * Converts inches
     * @return converted value
     */
    private double convertInches() {
        double conversion;
        switch (to) {
            case MM:
                conversion = amount * IN_MM;
                break;
            case CM:
                conversion = amount * IN_CM;
                break;
            case M:
                conversion = amount * IN_M;
                break;
            case KM:
                conversion = amount * IN_KM;
                break;
            default:
                conversion = -1;
                break;
        }
        return conversion;
    }
}
