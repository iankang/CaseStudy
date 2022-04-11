package com.queros.casestudy.model;

/** Represents the character Position Text Response.
 * @author Ian Kang'ethe
 * @version 1.0

 */
public class CharacterPositionResponse {

    private String key;
    private int value;

    /**
     * Character Position Constructor.
     * @param key
     * @param value
     */
    public CharacterPositionResponse(String key, int value) {
        this.key = key;
        this.value = value;
    }

    /**
     * Gets the Key Character
     * @return String
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets The Character Key
     * @param key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Gets counter value.
     * @return int
     */
    public int getValue() {
        return value;
    }

    /**
     * Sets Counter Value.
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * Returns the Key value formatted as Key - Value
     * @return String
     */
    @Override
    public String toString() {
        return key + "-" + value ;
    }
}
