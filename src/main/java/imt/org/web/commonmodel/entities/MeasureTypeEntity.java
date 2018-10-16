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
 * Sensor measure type entity
 */
@Entity
@Table(name = "MEASURE_TYPE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MeasureTypeEntity implements Serializable {

    @Id
    @Column(name = "id_measure_type", nullable = false)
    private int idMeasureType;
    @Column(name = "name_measure_type", nullable = false)
    private String nameMeasureType;

    @Override
    public String toString() {
        return "MeasureTypeEntity()\n" +
                "\tidMeasureType=" + idMeasureType + "\n" +
                "\tnameMeasureType=" + nameMeasureType + "\n";
    }
}
