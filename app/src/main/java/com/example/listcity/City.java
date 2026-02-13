package com.example.listcity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 * It contains the name of the city and the province it belongs to.
 */
public class City implements Comparable<City> {
    /**
     * The name of the city.
     */
    private String city;
    /**
     * The name of the province the city is in.
     */
    private String province;

    /**
     * Constructor for the City class.
     * @param city
     *      The name of the city
     * @param province
     *      The name of the province
     */
    City(String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Getter for city name.
     * @return
     *      Returns the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Getter for province name.
     * @return
     *      Returns the province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * This compares this city to another city based on their names.
     * @param city
     *      This is the city to compare to
     * @return
     *      Returns the comparison result (negative integer, zero, or a positive integer)
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    /**
     * This checks if this city is equal to another object.
     * Two cities are considered equal if they have the same name and province.
     * @param o
     *      This is the object to compare to
     * @return
     *      Returns true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    /**
     * This returns the hash code of the city.
     * @return
     *      Returns the hash code based on city name and province
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
