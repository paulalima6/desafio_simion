package br.com.pcon.api.services;

import br.com.pcon.api.model.Dna;
import br.com.pcon.api.repository.DnaRepository;
import br.com.pcon.api.resource.DnaStripped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DnaService {


  @Autowired
  private DnaRepository dnaRepository;

  public List<DnaStripped> retrieveDnasAna() {

    List<Dna> dnaList = dnaRepository.findAll();

    List<DnaStripped> dnaStrippedList = new ArrayList<>();

    for(Dna dna:  dnaList) {
      DnaStripped dnaStripped = new DnaStripped();
      dnaStripped.setDna(dna.getDna());

      dnaStrippedList.add(dnaStripped);
    }

    return dnaStrippedList;


  }

  public <T> List<DnaStripped> retrieveDnasByDna(T dna){
   throw new RuntimeException("asdfasd");
    
  }


  public List<DnaStripped> retrieveDnas() {

    //() -> List<DnaStripped>
    //(string, int) -> List<DnaStripped> equivalente BiFunction<String, Int, List<DnaStripped>>
    // T -> List<DnaStripped>

    //(dna) -> dnaStripped


    //(U, Bifunction<U, Dna, U>, BinaryOperator<U>) -> U


    //U -> String

    //(String, Bifunction<String, Dna, String>, BinaryOperator<String>) -> String
    //(string, dna) -> string
    //(string, string) -> string

    //(Function <Dna, T>)
    //(dna) -> t

    this.dnaRepository.findAll().stream()
        .map(dna -> new DnaStripped(dna.getDna()));

    //transformar o objeto Dna em DnaStripped
    //colapsar/reduzir/coletar o resultado em uma nova lista DnaStripped



    return Collections.singletonList(new DnaStripped("DNA DA MINHA CABEÇA"));


  }


}
