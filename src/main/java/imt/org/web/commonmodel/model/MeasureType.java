package imt.org.web.commonmodel.model;

import lombok.Getter;

/**
 * Sensor measure type
 */
@Getter
public enum MeasureType {
    TEMPERATURE("1"),
    ATM_PRESSURE("2"),
    WIND_SPEED("3"),
    WIND_DIRECTION("4");

    private final String value;

    MeasureType(String value) {
        this.value = value;
    }
}
