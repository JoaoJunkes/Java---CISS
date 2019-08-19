package main;

import model.Companies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CompanieService {

    List<Companies> companiesList = new ArrayList<Companies>(Arrays.asList(
            new Companies("1", "Contrabandos do Zé","Pediu, chegou!", "https://www.coladaweb.com/wp-content/uploads/2017/01/20170125-mercadoria1.jpg"),
            new Companies("2", "Lava-Bike 2 rodas","Lava-Bike 2 rodas com Lavagem personalisada.", "https://http2.mlstatic.com/lava-bike-e-corrente-bicicleta-desengraxante-5lt-no-agride-D_NQ_NP_605915-MLB25321471920_012017-F.jpg")
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
