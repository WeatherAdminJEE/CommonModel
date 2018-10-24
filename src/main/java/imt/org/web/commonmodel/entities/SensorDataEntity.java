package imt.org.web.commonmodel.entities;

import lombok.Getter;
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
public class SensorDataEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sensor_data", nullable = false)
    private int idSensorData;
    @ManyToOne
    private SensorEntity sensor;
    @Column(name = "measure_value", nullable = false)
    private double measureValue;
    @Column(name = "date", nullable = false)
    private Timestamp date;

    public SensorDataEntity(SensorEntity sensor, double measureValue, Timestamp date) {
        this.sensor = sensor;
        this.measureValue = measureValue;
        this.date = date;
    }

    @Override
    public String toString() {
        return "SensorDataEntity (idSensor=" + sensor.getIdSensor() + ")\n" +
                "\tmeasureValue=" + measureValue + "\n" +
                "\tdate=" + date + "\n";
    }
}
