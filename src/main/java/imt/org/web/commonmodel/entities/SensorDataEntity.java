package imt.org.web.commonmodel.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Sensor data entity
 */
@Entity
@Table(name = "SENSOR_DATA")
@Getter
@Setter
@NoArgsConstructor
public class SensorDataEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sensor_data", nullable = false)
    private int idSensorData;
    @Column(name = "id_sensor", nullable = false)
    private int idSensor;
    @Column(name = "id_country", nullable = false)
    private String idCountry;
    @Column(name = "id_city", nullable = false)
    private String idCity;
    @Column(name = "gps_coordinates", nullable = false)
    private String gpsCoordinates;
    @Column(name = "id_measure_type", nullable = false)
    private int idMeasureType;
    @Column(name = "measure_value", nullable = false)
    private double measureValue;
    @Column(name = "date", nullable = false)
    private Timestamp date;

    public SensorDataEntity(int idSensor, String idCountry, String idCity, String gpsCoordinates, int idMeasureType, double measureValue, Timestamp date) {
        this.idSensor = idSensor;
        this.idCountry = idCountry;
        this.idCity = idCity;
        this.gpsCoordinates = gpsCoordinates;
        this.idMeasureType = idMeasureType;
        this.measureValue = measureValue;
        this.date = date;
    }
}
