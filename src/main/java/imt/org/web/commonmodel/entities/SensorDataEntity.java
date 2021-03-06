package imt.org.web.commonmodel.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

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
    @ManyToOne
    @JoinColumn(name = "id_sensor", nullable = false)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorDataEntity that = (SensorDataEntity) o;
        return idSensorData == that.idSensorData &&
                Double.compare(that.measureValue, measureValue) == 0 &&
                sensor.equals( that.sensor) &&
                date.equals( that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSensorData, sensor, measureValue, date);
    }
}
