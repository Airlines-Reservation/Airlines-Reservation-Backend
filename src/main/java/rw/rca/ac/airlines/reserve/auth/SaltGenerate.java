package rw.rca.ac.airlines.reserve.auth;

import java.security.SecureRandom;
import java.util.Random;

public class SaltGenerate
{
    private static final Random random = new SecureRandom();
    private static final String characterEnc = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int iterations =1000;
    private static final int finalLength = 25;
    private String getSaltValue (int length){
        StringBuilder finalVal = new StringBuilder(length);
        for(int i=0;i<length;i++){

        }
    }
}
