package imt.org.web.commonmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
public class SensorData {

    private int idSensor;
    private String idCountry;
    private String idCity;
    private Measure measure;
    private Timestamp date;
}
