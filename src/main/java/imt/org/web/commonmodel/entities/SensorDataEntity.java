package imt.org.web.commonmodel.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
@AllArgsConstructor
public class SensorDataEntity implements Serializable {

    @Id
    @Column(name = "sensor_id", nullable = false)
    private int idSensor;
    @Column(name = "id_country", nullable = false)
    private String idCountry;
    @Column(name = "id_city", nullable = false)
    private String idCity;
    @Column(name = "gps", nullable = false)
    private String gpsCoordinates;
    @Column(name = "measure_type", nullable = false)
    private int measureType;
    @Column(name = "measure_value", nullable = false)
    private double measureValue;
    @Column(name = "date_measure", nullable = false)
    private Timestamp date;
}
