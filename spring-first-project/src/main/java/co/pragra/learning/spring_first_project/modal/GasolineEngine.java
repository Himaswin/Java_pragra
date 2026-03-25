package co.pragra.learning.spring_first_project.modal;

import lombok.Data;

import java.util.List;

@Data
public class GasolineEngine implements Engine {

    private List<String> tags;
    @Override
    public String getEngineType() {
        return "Gasoline";
    }
}
