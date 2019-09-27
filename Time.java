public class Time
{
    void stdTimeHrs(int mhrs, int mmin)
    {
        int h=((mhrs+11)%12)+1;
        int m=mmin;
        String suffix=mhrs>=12?"pm":"am";
        System.out.println("Stdtime in minutes is "+h+":"+m+suffix);
    }
}