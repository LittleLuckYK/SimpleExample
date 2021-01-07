package org.caesar.example.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.testng.annotations.Test;

public class CreateSign {

    public String sign(String param)
    {
        return DigestUtils.md5Hex(param);
    }

}
