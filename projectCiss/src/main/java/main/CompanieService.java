package main;

import model.Companies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CompanieService {

    List<Companies> companiesList = new ArrayList<Companies>(Arrays.asList(
            new Companies("1", "Contrabandos do Zé","DescriptionCompanie 1", "http://"),
            new Companies("2", "Lava-Bike 2 rodas","DescriptionCompanie 2", "http://")
    ));

    public List<Companies> getAllCompanies(){
        return companiesList;
    }

    public Companies getCompanie(String id){
        return companiesList.stream().filter(t -> t.getId().equals((id))).findFirst().get();
    }

    public void addCompanie(Companies companie) {

        companiesList.add(companie);
    }

    public void updateCompanie(Companies cest, String id) {

        for(int i = 0; i< companiesList.size(); i++){

            Companies companies = companiesList.get(i);

            if (companies.getId().equals(id)){
                companiesList.set(i, cest);
            }
        }
    }

    public void deleteCompanie(String id) {

        companiesList.removeIf(t->t.getId().equals(id));
    }
}
