class project
{
    public static void main(String Args[])
    {
        String day="monday";
        String result ="";

        result = switch(day)
        {
            case"monday" : yield "6am";
            case"tuesday": yield"8am";
            default: yield"7am";
        };
        System.out.println(result);
    }
}