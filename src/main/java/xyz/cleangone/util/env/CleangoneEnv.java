package xyz.cleangone.util.env;

import com.amazonaws.regions.Regions;

public class CleangoneEnv
{
    public String getDefaultOrg()
    {
        return null;
    }

    // AWS
    public String getBucketName()
    {
        return "placeholder";
    }
    public Regions getRegion()
    {
        return Regions.US_WEST_2;
    }

    // Crypto
    public String getIvParamKey()
    {
        return "placeholder";
    }
    public String getSecretKey()
    {
        return "placeholder";
    }

}
