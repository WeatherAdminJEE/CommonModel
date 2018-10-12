package imt.org.web.commonmodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Measure {

    private double temperature;
    private double windSpeed;
    private double pressure;
}
