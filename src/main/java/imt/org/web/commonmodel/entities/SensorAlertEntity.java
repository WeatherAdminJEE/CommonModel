package imt.org.web.commonmodel.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Sensor alert entity
 */
@Entity
@Table(name = "SENSOR_ALERT")
@Getter
@Setter
public class SensorAlertEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sensor_alert", nullable = false)
    private int idSensorAlert;
    @ManyToOne
    @JoinColumn(name = "id_sensor", nullable = false)
    private SensorEntity sensor;
    @ManyToOne
    @JoinColumn(name = "id_sensor_alert_param", nullable = false)
    private SensorAlertParamEntity sensorAlertParam;
    @Column(name = "start_date", nullable = false)
    private Timestamp startDate;
    @Column(name = "end_date", nullable = false)
    private Timestamp endDate;

    public SensorAlertEntity(SensorEntity sensor, SensorAlertParamEntity sensorAlertParam, Timestamp startDate, Timestamp endDate) {
        this.sensor = sensor;
        this.sensorAlertParam = sensorAlertParam;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "SensorAlertEntity()\n" +
                "\tidSensorAlert=" + idSensorAlert + "\n" +
                "\tsensor='" + sensor + "\n" +
                "\tsensorAlertParam=" + sensorAlertParam + "\n" +
                "\tstartDate=" + startDate+ "\n" +
                "\tendDate=" + endDate + "\n";
    }
}
