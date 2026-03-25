package co.pragra.learning.spring_first_project.modal;

import lombok.Data;

@Data
public class ElectricEngine implements Engine{
    @Override
    public String getEngineType() {
        return "Electric";
    }
}
