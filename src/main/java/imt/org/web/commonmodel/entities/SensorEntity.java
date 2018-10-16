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
}
