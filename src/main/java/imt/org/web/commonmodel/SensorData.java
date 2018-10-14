package imt.org.web.commonmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
public class SensorData implements Serializable {

    private int idSensor;
    private String idCountry;
    private String idCity;
    private String gpsCoordinates;
    private MeasureType measureType;
    private double measureValue;
    private Timestamp date;
}
