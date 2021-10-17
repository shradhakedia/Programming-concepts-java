package JavaBasics;

class Calc implements Calculator
{

    @Override
    public int add(int i, int j)
    {
        return i + j;
    }

    @Override
    public int subtract(int i, int j)
    {
        return i - j;
    }

    @Override
    public int multiply(int i, int j)
    {
        return i * j;
    }

    @Override
    public float division(float i, float j)
    {
        float result = 0.0f;
        try
        {
            if (j == 0) {
                throw new Exception("Zero Division Error.");
            }
            return i / j;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}
