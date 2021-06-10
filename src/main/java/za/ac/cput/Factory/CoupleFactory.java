/* CoupleFactory.java
   Factory for the CoupleFactory
   Author: Asive Madladla (217068332)
   Date: 07 June 2021
 */
package za.ac.cput.Factory;

import za.ac.cput.Entity.Couple;

public class CoupleFactory {
    public static Couple createCouple(String coupleSurname, String address, String gender, int age){
        Couple couple = new Couple.Builder()
                .setCoupleSurname(coupleSurname)
                .setAddress(address)
                .setGender(gender)
                .setAge(age)
                .build();
        return couple;
    }
    }

