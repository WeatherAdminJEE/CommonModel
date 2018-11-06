package imt.org.web.commonmodel.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * Sensor alert entity
 */
@Entity
@Table(name = "SENSOR_ALERT")
@Getter
@Setter
@NoArgsConstructor
public class SensorAlertEntity implements Serializable {

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
    @Column(name = "end_date")
    private Timestamp endDate;
    @Column(name = "sent")
    private int isSent =0;

    public SensorAlertEntity(SensorEntity sensor, SensorAlertParamEntity sensorAlertParam, Timestamp startDate, Timestamp endDate) {
        this.sensor = sensor;
        this.sensorAlertParam = sensorAlertParam;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isSent = 0;
    }

    @Override
    public String toString() {
        return "SensorAlertEntity()\n" +
                "\tidSensorAlert=" + idSensorAlert + "\n" +
                "\tsensor='" + sensor + "\n" +
                "\tsensorAlertParam=" + sensorAlertParam + "\n" +
                "\tstartDate=" + startDate+ "\n" +
                "\tendDate=" + endDate + "\n"+
                "\tisSent=" +isSent +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorAlertEntity that = (SensorAlertEntity) o;
        return idSensorAlert == that.idSensorAlert &&
                isSent == that.isSent &&
                sensor.equals(that.sensor) &&
                sensorAlertParam.equals( that.sensorAlertParam) &&
                startDate.equals( that.startDate) &&
                endDate.equals(that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSensorAlert, sensor, sensorAlertParam, startDate, endDate, isSent);
    }
}
