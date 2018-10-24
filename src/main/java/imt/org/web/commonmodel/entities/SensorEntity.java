package imt.org.web.commonmodel.entities;

import imt.org.web.commonmodel.model.MeasureType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Sensor entity
 */
@Entity
@Table(name = "SENSOR")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SensorEntity implements Serializable {

    @Id
    @Column(name = "id_sensor", nullable = false)
    private int idSensor;
    @Column(name = "name_sensor", nullable = false)
    private String nameSensor;
    @Column(name = "id_country", nullable = false)
    private String idCountry;
    @Column(name = "id_city", nullable = false)
    private String idCity;
    @Column(name = "gps_coordinates", nullable = false)
    private String gpsCoordinates;
    @Enumerated(EnumType.STRING)
    @Column(name = "measure_type", nullable = false)
    private MeasureType measureType;
    @ManyToOne
    @JoinColumn(name = "id_sensor_alert_param", nullable = false)
    private SensorAlertParamEntity sensorAlertParam;


    @Override
    public String toString() {
        return "SensorEntity()\n" +
                "\tidSensor=" + idSensor + "\n" +
                "\tnameSensor='" + nameSensor + "\n" +
                "\tidCountry=" + idCountry + "\n" +
                "\tidCity=" + idCity + "\n" +
                "\tgpsCoordinates=" + gpsCoordinates + "\n" +
                "\tmeasureType=" + measureType + "\n";
    }
}
