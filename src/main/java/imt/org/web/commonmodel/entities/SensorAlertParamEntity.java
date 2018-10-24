package imt.org.web.commonmodel.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Sensor alert param entity
 */
@Entity
@Table(name = "SENSOR_ALERT_PARAM")
@Getter
@Setter
@NoArgsConstructor
public class SensorAlertParamEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sensor_alert_param", nullable = false)
    private int idSensorAlertParam;
    @Column(name = "alert_value", nullable = false)
    private double alertValue;
    @Column(name = "alert_range", nullable = false)
    private Timestamp alertRange;

    public SensorAlertParamEntity(double alertValue, Timestamp alertRange) {
        this.alertValue = alertValue;
        this.alertRange = alertRange;
    }

    @Override
    public String toString() {
        return "SensorAlertParamEntity()\n" +
                "\tidSensorAlertParam=" + idSensorAlertParam + "\n" +
                "\talertValue='" + alertValue + "\n" +
                "\talertRange=" + alertRange + "\n";
    }
}
