package imt.org.web.commonmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Measure implements Serializable {

    private double temperature;
    private double windSpeed;
    private double pressure;
}
