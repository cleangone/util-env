package xyz.cleangone.util.env;

public class EnvManager
{
    private static CleangoneEnv ENV = new CleangoneEnv();

    public static CleangoneEnv getEnv()
    {
        return ENV;
    }
    public static void setEnv(CleangoneEnv env)
    {
        ENV = env;
    }
}
