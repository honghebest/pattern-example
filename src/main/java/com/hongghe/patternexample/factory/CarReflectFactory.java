package com.hongghe.patternexample.factory;

/**
 * 利用反射
 *
 * @author hongghe 21/07/2018
 */
public class CarReflectFactory {

    public static CarProduce produce(String classname) throws Exception {
        try {
            CarProduce carProduce = (CarProduce) Class.forName(classname).newInstance();
            return carProduce;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        throw new Exception("Sorry the produce is not exist");
    }
}
